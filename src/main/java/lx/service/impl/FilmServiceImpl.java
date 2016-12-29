package lx.service.impl;

import javax.annotation.Resource;

import lx.mapper.FilmMapper;
import lx.po.Film;
import lx.service.FilmService;

public class FilmServiceImpl implements FilmService{

	@Resource(name="filmMapper")
	private FilmMapper filmMapper;
	
	@Override
	public void insertFilm(Film film) {
		 filmMapper.insertSelective(film);
	}

}
