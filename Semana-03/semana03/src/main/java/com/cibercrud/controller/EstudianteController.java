package com.cibercrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibercrud.models.dao.IMPEstudianteDao;
import com.cibercrud.models.entity.Estudiante;

@Controller
public class EstudianteController {

	@Autowired
	private IMPEstudianteDao dao;
	
	@GetMapping("/listado")
		public String listado(Model modelo) {
			List<Estudiante> lista = dao.listar();
			modelo.addAttribute("listarEstudiantes",lista);
			return "listado";
		}
		
	}
	

