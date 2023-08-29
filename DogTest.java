//Kanemoto
//2.8.2023
//Dog Test class - to an array of our Dog objects
//  so that we can see some interesting things about them

package gdbDataProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DogTest {

	public static final int SIZE = 25;
	public static Dog[] dogs = new Dog[SIZE];

	public static void main(String[] args) {

		//read from file		
		Scanner input = null;

		try {
			input = new Scanner(new File("guideDogPhaseReport.csv"));
		} catch (FileNotFoundException e) {
			System.out.println("error opening that file");
			e.printStackTrace();
			System.exit(0);//stops the program
		}

		//read in the header and do nothing with it
		input.nextLine();
		int index = 0;
		while(input.hasNext()) {
			
			//Abbott,636H,LAB,"M",OR,2
			String[] fields= input.nextLine().split(",");
			
			//put the dog object reference
			dogs[index++] = new Dog(fields[0], 
					fields[1], 
					fields[2],
					fields[3].charAt(0),
					fields[4],
					fields[5].charAt(0));	
		}
		
		int[] counts = countPhases();
		
		System.out.println("Phase\tCount");
		for(int i = 0; i < 10; i++)
			System.out.println(i + "\t" + counts[i]);
		
		//print out the A-D phases
		for(int i = 10; i < 14; i++)
			System.out.println((char)(i + 55) + "\t" + counts[i]);
		
		//for(Dog d: dogs) 
			//System.out.println(d);

	}///end main
	
	public static int[] countPhases() {
		//java initializes all of the counts to 0 for us
		int[] counts = new int[14];
		//iterating through the array
		for(Dog dog: dogs) {
			char phase = dog.getPhase();
			int index = phase - '0';
			if(index >= 0 && index <= 9)
				counts[index]++;
			int index2 = phase - 55;
			//know you have a phase of an A, B, C or D
			if(index2 >= 10 && index2 <= 13)
				counts[index2]++;
		}		
		return counts;
	}
	
	//make a method that will return an array of Dog objects
	//that have a given phase
	public static Dog[] getDogs(char phaseLookingFor) {
		Dog[] dogsToReturn = new Dog[50];
		//fill in here for extra credit
		return dogsToReturn;
	}
}//end class
