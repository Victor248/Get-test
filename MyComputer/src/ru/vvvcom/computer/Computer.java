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
			System.out.print("���������� ��������" +ram+"�� ����� ���� �������������!");
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
		print("� ��������� , ��� ��� : "+name+" ��� ��� "+weight+" ��.");
	}
	public void load(){
		print("��� ������ ����������: " +ram+" Mb � ����� �����: "+hdd+" Gb");
	}
	public void off(){
		print("��������� ��������!");
	}
	private void print(String str){
		System.out.println(str);
	}
}
