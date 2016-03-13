package com.Session6.Assignment2;

public class MainClass {

	public static void main(String[] args) {
		/*
		 *  Create an abstract class, called Instrument which will contains a field name and a method called play, that must be implemented by a sub-class.
			You need to define a sub-class called StringedInstrument that extends the Instrument class and adds an extra field called numberOfStrings.
 			Then you add two more classes "ElectricGuitar and ElectricBassGuitar" that implements the functionality of a StringedIntrument.
		 * 
		 */
		ElectricGuitar elec = new ElectricGuitar();
		elec.play();
		
		ElectricBassGuitar base = new ElectricBassGuitar();
		base.play();
		
	}
}


abstract class Instrument
{
	public String name;
	public abstract void play() ;
}

class StringedInstrument extends Instrument
{

	public int numberOfStrings = 0;
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
}

class ElectricGuitar extends StringedInstrument
{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Electric Guitar is playing ");
	}
}

class ElectricBassGuitar extends StringedInstrument
{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Electric Bass Guitar is playing ");
		
	}
}