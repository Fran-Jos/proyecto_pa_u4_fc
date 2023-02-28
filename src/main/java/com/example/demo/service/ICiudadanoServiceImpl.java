package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Ciudadano;
import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.ICiudadanoRepo;

@Service
public class ICiudadanoServiceImpl implements ICiudadanoService {

	@Autowired
	private ICiudadanoRepo ciudadanoRepo;
	
	
	@Override
	public Estudiante convertir(Ciudadano ciud) {
		// TODO Auto-generated method stub
		
		ICiudadanoFunction<Estudiante, Ciudadano>canvertir1 =
				ciu -> {
					Estudiante estudiante = new Estudiante();
					estudiante.setNombreCompleto(ciu.getNombre()+" "+ciu.getApellido());
					estudiante.setEdad("12");
					
					return estudiante;
				};
				
		Estudiante estudiante = (Estudiante) canvertir1;
		
		return  estudiante;
	}

	@Override
	public List<Ciudadano> consultarTodos(Integer id) {
		// TODO Auto-generated method stub
	
		List<Ciudadano>idEstudiante= new ArrayList<>();
		for(int i=1; i<=96;i++ ) {
			Ciudadano ciudadano = this.ciudadanoRepo.consultar(i);
			idEstudiante.add(ciudadano);
}
		idEstudiante.forEach(numero->System.out.println("Estudiante: "+numero));
	
		return idEstudiante;
		
	}

	@Override
	public Ciudadano consultar(Integer id) {
		// TODO Auto-generated method stub
		
		return this.ciudadanoRepo.consultar(id);
	}

}
