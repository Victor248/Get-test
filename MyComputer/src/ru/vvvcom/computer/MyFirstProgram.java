package ru.vvvcom.computer;

public class MyFirstProgram {

	public static void main(String[] args) {
	Computer comp=new Computer();
	comp.setName("IBM");
	comp.setRam(2048);
	comp.setHdd(350);
	comp.setWeight(5.500);
	
	  
	 
	comp.on();
	comp.load(); 
	comp.off();

	}

}
