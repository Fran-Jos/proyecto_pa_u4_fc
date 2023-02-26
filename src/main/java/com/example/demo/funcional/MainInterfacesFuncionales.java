package com.example.demo.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MainInterfacesFuncionales {

	private static final Logger LOG = LoggerFactory.getLogger(MainInterfacesFuncionales.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SUPPLIER

		//----JAVA-----
		// crea las implementaciones mediantes lambdas
		
		// cuando un metodo recibe como argumento de entrada una interfase funcional ese metodo 
		
		// adquiere un nombre que se los conoce como Metodo hideOrder
		
		LOG.info("JAVA SUPPLIER");
		
		Stream<String>lista= Stream.generate( () ->"Francisco2").limit(10);
		lista.forEach(cadena -> LOG.info(cadena));
		
		
		// 2) CONSUMER

		//----JAVA-----
		LOG.info("2) Java CONSUMER");
		
		List<Integer> listaNumeros = Arrays.asList(1,2,3,4,323,21,222,311,24);
		listaNumeros.forEach(numero -> LOG.info("valor : " + numero));
		
		
		//manera tradicional
		
		for (Integer integer : listaNumeros) {
			LOG.info("valor: " + integer);
		}
		
		// 3) PREDICATE
		LOG.info("3) PREDICATE");
		// ---Java---
		LOG.info("JAVA PREDICATE");
		
		// a partir de la listaNumeros de arriba 
		
		Stream<Integer>listaFiltrada= listaNumeros.stream().filter(numero -> numero>=3);
		listaFiltrada.forEach(numero -> LOG.info("Valor: " + numero));
		
         // 4) FUNCTION
		LOG.info("JAVA FUNCTION");
		Stream<String>listaCambiada = listaNumeros.stream().map(numeroLista -> {
		Integer valorFinal = numeroLista+1;
		String cadena = "num : " + valorFinal.toString();
		return cadena;
		});
		
		listaCambiada.forEach(cadena -> LOG.info(cadena));
		
				// 4) UNARYOPERATOR

	}

}
