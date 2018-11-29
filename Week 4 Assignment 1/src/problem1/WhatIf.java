package problem1;

public class WhatIf {
	
	public static String whichRuler(int cats, int dogs, int people) {
		String ruler = "";
		
		//Evaluates which integer between cats and people is greater
		if (cats > people) {
			ruler = "Too many cats! The world is doomed!";
		}
		
		//Evaluates which integer between people and cats is greater
		if (people > cats) {
			ruler = "Too few cats! The world is saved for another day!";
		}
		
		//Evaluates which integer between dogs and people is greater
		if (dogs > people) {
			ruler = "The world is drooled on!";
		}
		
		//Evaluates which integer between people and dogs is greater
		if (people > dogs) {
			ruler = "The world is dry!";
		}
		
		return ruler;
	}
	
	public static void display(String Ruler) {
		System.out.println(Ruler + "\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int people, cats, dogs;
		String rueler = null;
//============================= Part 3 ===============================================		
		people = 1;
		cats = 10;
		dogs = 10;
		
		rueler = whichRuler(cats, dogs, people);
		display(rueler);
//============================= Part 3 ===============================================				
		people = 10;
		cats = 10;
		dogs = 1;
		
		rueler = whichRuler(cats, dogs, people);
		display(rueler);
//============================= Part 3 ===============================================		
		people = 10;
		cats = 10;
		dogs = 10;
		
		rueler = whichRuler(cats, dogs, people);
		display(rueler);
	}

}
