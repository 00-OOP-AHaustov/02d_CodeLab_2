package com.cc.java;

public class App {

	public static void main(String[] args) {
		Mitarbeiter[] office = { new Mitarbeiter("Pan", "Peter", "CEO", 2010),
				new Mitarbeiter("Django", "null", "Headhunter", 2012),
				new Mitarbeiter("Deville", "Cruella", "Marketing", 2015) };

				output(office[2].getInfo("familyName"));
				output(office[1].getInfo("role"));
				output(office[0].getInfo("position"));
	}

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
