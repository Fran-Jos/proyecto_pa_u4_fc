package com.example.demo.funcional;

@FunctionalInterface
public interface IPersonaConsumer<T> {
	
	/*Interfases funcionales consumer 
	La función recibe una variable genérica, realiza una operación con ella 
	y no retorna ningún resultado. 
*/
	public void accept(T arg1);
	
}
