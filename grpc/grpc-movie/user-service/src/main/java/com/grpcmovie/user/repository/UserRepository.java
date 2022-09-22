package com.grpcmovie.user.repository;

import com.dk.grpcmovie.user.UserGenreUpdateRequest;
import com.grpcmovie.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    static class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setLoginId(rs.getInt("login_id"));
            user.setGenre(rs.getString("genre"));
            user.setName(rs.getString("name"));


            return user;
        }

    }

    public List<User> findAll() {
        return jdbcTemplate.query("select * from users", new UserRowMapper());
    }

    public User findById(int login_id) {
        return jdbcTemplate.queryForObject("select * from users where login_id = ?", new BeanPropertyRowMapper<>(User.class), login_id);
    }
    public boolean findByIdBoolean(int login_id) {
        String sql = "SELECT count(*) FROM USERS WHERE login_id = ?";
        boolean result = false;

        int count = jdbcTemplate.queryForObject(
                sql, new Object[] { login_id }, Integer.class);

        if (count > 0) {
            result = true;
        }
        return result;

    }

    public void deleteById(int login_id) {
        jdbcTemplate.update("delete from users where login_id = ?", login_id);
    }

    public int insert(User user) {
        return jdbcTemplate.update("insert into users( login_id, genre, name) " + "values(?, ?, ?)",
                user.getLoginId(),user.getGenre(),user.getName());
    }

    public int update(User user) {
        return jdbcTemplate.update("update users " + " set genre = ?, name = ? " + " where login_id = ?",
                user.getGenre(),user.getName(),user.getLoginId());
    }
    public int updateGenre(UserGenreUpdateRequest request) {
        return jdbcTemplate.update("update users " + " set genre = ? " + " where login_id = ?",
                request.getGenre().toString(),request.getLoginId());
    }

}
