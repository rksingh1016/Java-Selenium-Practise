//Creating a class - Calculator
//Developer: Rakesh K Singh - 24/4/19 5:25PM IST
public class Calculator {
	
	// Creating a Constructor
	public Calculator() {
		System.out.println("Calling constructor");
	}
	// method - Addition
	public void add() {
		System.out.println("Adding something");
	}
	// method - Susbstraction
	public void sub() {
		System.out.println("Substracting something");
	}
	// method - Multiplication
	public void mult() {
		System.out.println("Multiplyting something");
	}
	//method - Division
	public void div() {
		System.out.println("Dividing something");
	}
	// main Class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World! Rakesh here!");
		// creating an object to Class - Calculator
		Calculator calc = new Calculator();
		//Calling methods - add() of class - Calculator 
		calc.add();
	}

}
