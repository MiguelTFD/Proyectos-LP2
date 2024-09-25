package com.cibercrud.models.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cibercrud.models.entity.Estudiante;

@Repository
public class IMPEstudianteDao implements IEstudianteDao {
	
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<Estudiante> listar() {
		String sql = "select * from estudiante";
		List<Estudiante> listado = jdbc.query(sql, BeanPropertyRowMapper.newInstance(Estudiante.class));
		return listado;
	}

}
