package com.example.demo.funcional;

@FunctionalInterface
public interface IPersonaPredicate<T> {
	
	/*Interfases funcionales Predicate 
	La función recibe un argumento lo procesa y 
	devuelve un booleano 
*/
	public boolean evaluar(T arg1);
	
	
}
