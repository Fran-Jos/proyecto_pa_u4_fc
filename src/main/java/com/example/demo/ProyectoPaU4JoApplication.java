package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Ciudadano;
import com.example.demo.modelo.Estudiante;
import com.example.demo.service.ICiudadanoService;

@SpringBootApplication
public class ProyectoPaU4JoApplication implements CommandLineRunner {

	@Autowired
	private ICiudadanoService ciudadanoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU4JoApplication.class, args);
	
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Ciudadano> myLista = new ArrayList<>();
		
		myLista = this.ciudadanoService.consultarTodos(1);
		
		System.out.println(myLista);
		
		Ciudadano c = this.ciudadanoService.consultar(3);
		
		Estudiante e = this.ciudadanoService.convertir(c);
		
		System.out.println(e);
		
	}
	
	

}
