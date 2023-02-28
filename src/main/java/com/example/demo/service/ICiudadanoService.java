package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Ciudadano;
import com.example.demo.modelo.Estudiante;

public interface ICiudadanoService {

	public Estudiante convertir (Ciudadano ciud);
	public List<Ciudadano> consultarTodos(Integer id);
	public Ciudadano consultar(Integer id);
}
