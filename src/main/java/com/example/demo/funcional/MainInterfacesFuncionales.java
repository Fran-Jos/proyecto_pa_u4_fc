package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MainInterfacesFuncionales {

	private static final Logger LOG = LoggerFactory.getLogger(MainInterfacesFuncionales.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SUPPLIER
//      Clase
		
		// 1) SUPPLIER
		LOG.info("1. SUPPLIER");
		
		IPersonaSupplier<String> supplier1 = new PersonaSuppierImpl();
		LOG.info("Supplier clase:" + supplier1.getNombre());
	
//		Lambdas
		
		IPersonaSupplier<String> supplier2 = () ->"Francisco2";
		LOG.info("Supplier lambda:" + supplier2.getNombre());

		IPersonaSupplier<Integer> supplier3 = () -> new Integer(5);
		LOG.info("Supplier lambda:" + supplier3.getNombre());
	
		IPersonaSupplier<Persona> supplier4 = () -> {
			Persona per = new Persona();
			per.setApellido("Chanataxi");
			per.setNombre("Francisco");
			
			return per;
		} ;
		LOG.info("Supplier lambda:" + supplier4.getNombre());
	
		
		//IPersonaSupplier<Persona> supplier5 = () -> new PersonaSupplier2Impl();
		//LOG.info("Supplier lambda:" + supplier5.getNombre());
	
		// 2) CONSUMER
		LOG.info("2) CONSUMER");
		
//		CLASE
		IPersonaConsumer<String> consumer1 = new PersonaConsumerImpl();
		
		consumer1.accept("Procesa este dato");
		
		
//		LAMBDA
		
		IPersonaConsumer<String> consumer2 = cadena -> LOG.info("__MENSAJE__:" + cadena);
		consumer2.accept("procesa este dato 2");
	
		
		IPersonaConsumer<String> consumer3 = cadena ->{
			LOG.info("__MENSAJE__a:" + cadena);
			LOG.info("__MENSAJE__b:" + cadena);

		};
		consumer3.accept("procesa este dato 3");
	
		IPersonaConsumer2<Integer, Integer> consumer4 = (valor1 , valor2)->{
			Integer valor3 = valor1.intValue()+valor2.intValue();
			LOG.info("valor3 = " + valor3);
		};
		
		consumer4.accept(Integer.valueOf(5), Integer.valueOf(10));
	
		// 2) PREDICATE
		LOG.info("3) PREDICATE");
		
//		LAMBDAS
		
		IPersonaPredicate<String> predicate1 = cadena -> cadena.contains("Z");
		
		LOG.info("Predicate1 : " + predicate1.evaluar("Francisco"));
		
	
		IPersonaPredicate<Integer> predicate2= numero -> {
			
			if (numero.intValue() > 10) {
				return true;
			}else return false;
			
			
		};

		LOG.info("Predicate2 : " + predicate2.evaluar(Integer.valueOf(11)));

		// 4) FUNCTION
				LOG.info("4) FUNCTION");
		
				IPersonaFunction<String, Integer>function1 = numero -> "Francisco";
				LOG.info(function1.aplicar(10));
				
				
				IPersonaFunction<String, Integer>function2 = numero -> "Valor: " + numero.toString();
				LOG.info(function2.aplicar(10));
				
				IPersonaFunction<Ciudadano, Persona>function3 = per ->{
					Ciudadano ciu = new Ciudadano();
					ciu.setNombreCompleto(per.getNombre()+" "+per.getApellido());
					ciu.setCiudad("Quito");
					
					return ciu ;
				};
				
				Persona p = new Persona();
				p.setApellido("Mancheno");
				p.setNombre("Jose");
				Ciudadano ciudadanoConvertido = function3.aplicar(p);
				
				LOG.info("Ciudadano Convertido : " + ciudadanoConvertido);
	
				// 4) UNARYOPERATOR
				LOG.info("5) UNARYOPERATOR");
				
				IPersonaUnaryOperator<String>unaryOperator = cadena -> {
					
					String cadenaFinal = cadena.concat("-sufijo");
					
					return cadenaFinal;
					
				};
				
				LOG.info(unaryOperator.aplicar("Fran"));
		
	
	}

}
