package com.example.demo.funcional;

public interface IPersonaFunction<R ,T> {
/*
	Interfases funcionales Function 
	La función recibe un tipo de argumento lo procesa y devuelve otro tipo de dato. 
*/
	// Recomendacion , primer parametro el que retorno y T el que recibe 
	
	public R aplicar(T arg1);

}
