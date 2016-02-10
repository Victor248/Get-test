package ru.vvvcom.computer;

public class Computer {
	private String name;
	private int ram;
	private int hdd;
	private double weight;
	
	public String getName(){
		return name;	
	}
	public void setName(String name){
		this.name=name;
	}
	public int getRan(){
		return ram;
	}
	public void setRam(int ram){
		if(ram>0){
		this.ram=ram;
		}else{
			System.out.print("Переданное значение" +ram+"не может быть отрицательным!");
		}
	}
	public int getHdd(){
		return hdd;
	}
	public void setHdd(int hdd){
		this.hdd=hdd;
	}
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	
	public void on(){
		print("Я включился , мое имя : "+name+" мой вес "+weight+" кг.");
	}
	public void load(){
		print("Моя память составляет: " +ram+" Mb и обьем диска: "+hdd+" Gb");
	}
	public void off(){
		print("Компьютер выключен!");
	}
	private void print(String str){
		System.out.println(str);
	}
}
