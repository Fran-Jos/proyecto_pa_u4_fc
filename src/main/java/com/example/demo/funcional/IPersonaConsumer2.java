package com.example.demo.funcional;

@FunctionalInterface
public interface IPersonaConsumer2<T , R> {
	
	/*Interfases funcionales consumer 
	La función recibe una variable genérica, realiza una operación con ella 
	y no retorna ningún resultado. 
*/
	public void accept(T arg1 , R arg2);
	
}
