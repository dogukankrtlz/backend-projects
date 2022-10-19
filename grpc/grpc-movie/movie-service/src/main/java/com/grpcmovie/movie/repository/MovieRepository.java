package com.grpcmovie.movie.repository;
import com.google.protobuf.Timestamp;

import com.grpcmovie.movie.entity.CommentDto;
import com.grpcmovie.movie.entity.Favorite;
import com.grpcmovie.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
            movie.setImage_url(rs.getString("image_url"));
            movie.setSummary(rs.getString("summary"));

            return movie;
        }

    }
    static class FavoriteRowMapper implements RowMapper<Favorite> {
        @Override
        public Favorite mapRow(ResultSet rs, int rowNum) throws SQLException {
            Favorite favorite = new Favorite();
            favorite.setId(rs.getInt("id"));
            favorite.setUserId(rs.getInt("userId"));
            favorite.setMovieId(rs.getInt("movieId"));


            return favorite;
        }

    } static class CommentRowMapper implements RowMapper<CommentDto> {
        @Override
        public CommentDto mapRow(ResultSet rs, int rowNum) throws SQLException {


            CommentDto commentDto = new CommentDto();
            commentDto.setUserId(rs.getInt("userId"));
            commentDto.setMovieId(rs.getInt("movieId"));
            commentDto.setMessage(rs.getString("message"));
            commentDto.setDate(rs.getString("date"));


            return commentDto;
        }

    }


    //Comment

    public int insertComment(CommentDto commentDto) {

        return jdbcTemplate.update("insert into comments( userId, message, date, movieId) " + "values(?, ?, ?, ?)",
                commentDto.getUserId(), commentDto.getMessage(), commentDto.getDate().toString(), commentDto.getMovieId());
    }


    public List<CommentDto> findByMovieId(int movieId) {
        return jdbcTemplate.query("select * from comments where movieId=? ORDER BY date DESC", new CommentRowMapper(), movieId);
    }




//Favori

    public int deleteFavMovie(int userId, int movieId) {
        return jdbcTemplate.update("delete favorite where userId = ? and movieId = ?",
                userId,movieId);

    }


public List<Favorite> findByUserIdFavList(int userId) {
    return jdbcTemplate.query("select * from favorite where userId = ?", new FavoriteRowMapper(), userId);
}

    public List<Movie> findFavMoviesByUserId(int userId) {
        return jdbcTemplate.query("select * " +
                "from movie " +
                "inner join" +
                " favorite " +
                "on " +
                "movie.id = favorite.movieId " +
                "where " +
                "favorite.userId = ?" , new MovieRowMapper(), userId);
    }
    public int insertFav(Favorite favorite) {

        return jdbcTemplate.update("insert into favorite( id, userId, movieId) " + "values(?, ?, ?)",
                favorite.getId(), favorite.getUserId(), favorite.getMovieId());
    }

    public int deleteFav(int id) {
        return jdbcTemplate.update("delete favorite where id = ?",
             id);
    }
    public Favorite findByIdFav(int id) {
        return jdbcTemplate.queryForObject("select * from favorite where id=?", new BeanPropertyRowMapper<>(Favorite.class), id);
    }
    public Favorite findByUserIdMovieIdFav(int userId, int movieId)throws DataAccessException {

        List<Favorite> results =jdbcTemplate.query("select * from favorite where userId=? and movieId=?", new BeanPropertyRowMapper<>(Favorite.class), userId,movieId);


        if (results == null || results.isEmpty()) {
            return null;
        }
        else if (results.size() > 1) {
            throw new IncorrectResultSizeDataAccessException(1, results.size());
        }
        else{
            return results.iterator().next();
        }

    }

    public boolean findByIdBooleanFav(int id) {
        String sql = "SELECT count(*) FROM favorite WHERE id = ?";
        boolean result = false;

        int count = jdbcTemplate.queryForObject(
                sql, new Object[] { id }, Integer.class);

        if (count > 0) {
            result = true;
        }
        return result;

    }




//Movie
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

        return jdbcTemplate.update("insert into movie( id, title, rel_year, rating, genre, image_url, summary) " + "values(?, ?, ?, ?, ?, ?, ?)",
                movie.getId(),movie.getTitle(), movie.getRel_year(), movie.getRating(), movie.getGenre(), movie.getImage_url(), movie.getSummary());
    }

    public int update(Movie movie) {
        return jdbcTemplate.update("update movie " + " set title = ?, rel_year = ?, rating = ?, genre = ?, image_url = ?, summary= ? " + " where id = ?",
                movie.getTitle(), movie.getRel_year(),movie.getRating(),movie.getGenre(),movie.getImage_url(), movie.getSummary(), movie.getId());
    }

}
