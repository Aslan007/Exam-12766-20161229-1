package lx.mapper;

import lx.po.Film;

public interface FilmMapper {
   public int insertFilm(Film film);
   
   int insertSelective(Film record);
}