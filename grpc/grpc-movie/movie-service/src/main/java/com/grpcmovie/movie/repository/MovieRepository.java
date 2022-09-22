package com.grpcmovie.movie.repository;

import com.grpcmovie.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class MovieRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;


    static class MovieRowMapper implements RowMapper<Movie> {
        @Override
        public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
            Movie movie = new Movie();
            movie.setId(rs.getInt("id"));
            movie.setTitle(rs.getString("title"));
            movie.setRel_year(rs.getInt("rel_year"));
            movie.setRating(rs.getDouble("rating"));
            movie.setGenre(rs.getString("genre"));

            return movie;
        }

    }

    public List<Movie> findAll() {
        return jdbcTemplate.query("select * from movie", new MovieRowMapper());
    }

    public Movie findById(int id) {
        return jdbcTemplate.queryForObject("select * from movie where id=?", new BeanPropertyRowMapper<>(Movie.class), id);
    }
    public boolean findByIdBoolean(int id) {
        String sql = "SELECT count(*) FROM movie WHERE id = ?";
        boolean result = false;

        int count = jdbcTemplate.queryForObject(
                sql, new Object[] { id }, Integer.class);

        if (count > 0) {
            result = true;
        }
        return result;

    }
    public List<Movie> findByGenre(String genre) {
        return jdbcTemplate.query("select * from movie where genre = ?", new MovieRowMapper(),genre);
    }

    public void deleteById(int id) {
        jdbcTemplate.update("delete from movie where id=?", id);
    }

    public int insert(Movie movie) {

        return jdbcTemplate.update("insert into movie( id, title, rel_year, rating, genre) " + "values(?, ?, ?, ?, ?)",
                movie.getId(),movie.getTitle(), movie.getRel_year(), movie.getRating(), movie.getGenre() );
    }

    public int update(Movie movie) {
        return jdbcTemplate.update("update movie " + " set title = ?, rel_year = ?, rating = ?, genre = ? " + " where id = ?",
                movie.getTitle(), movie.getRel_year(),movie.getRating(),movie.getGenre(), movie.getId());
    }

}
