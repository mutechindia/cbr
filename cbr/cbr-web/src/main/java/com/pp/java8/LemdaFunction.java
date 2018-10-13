package com.pp.java8;
//Function without having name is know as lambda expression
//enabling function programming in java use lambda expression
//Lambda having no name, no return type , no modifier
//Advantage :write concise code 
//Functional interface : if interface contain only one abstract method is known as 
//Functional interface 

// java 1.8 onwords we can take default and static method inside  
interface I {
	public void add();
	default void m() {
		System.out.println("default");
	}
	
}
public class LemdaFunction {

	public static void main(String[] args) {
		I i =()->System.out.println("lemda");
		i.m();
		i.add();
	}
}
