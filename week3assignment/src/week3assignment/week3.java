//Daisy Murillo July 4, 2020

package week3assignment;

import java.util.Arrays; //needed to use the Arrays.copyOf method


public class week3 {
//ARRAY OF INTS
	
	public static void main(String[] args) {
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//subtract 1st value from last value
		System.out.println(ages[ages.length-1] - ages[0]);
		
		//add new age & repeat previous step
	    ages = Arrays.copyOf(ages, ages.length + 1);
	    ages[ages.length - 1] = 21;  
	    System.out.println(ages[ages.length-1] - ages[0]);
	    
	    //iterate through array & calculate average age
	    int total = 0; 
	    for(int i = 0; i < ages.length; i++) {
	    	total += ages[i];
	    }
	    int average = total / ages.length;
	    System.out.println("Average age is " + average);
	    
	    
	    //take average number of letters per name    
	    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
	    int count =0;
		for(int i = 0; i < names.length; i++) {
			count += names[i].length();
		}
		int avgLen = count / names.length;
		System.out.println("Average length of name is " + avgLen);
		
		//concatenate all the names together
		String name = "";
		for(int i =0; i <names.length; i++) {
			name += names[i] + " ";
		}
		System.out.println(name);
		
		//add length of name to nameLengths array
		int[] nameLengths = new int[6];
		int sum = 0;
		for(int i=0; i <names.length; i++) {
			nameLengths[i] += names[i].length();
			sum += names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		System.out.println("The sum of name lengths is " + sum);
		
		//concatenated word to itself n number of times
		System.out.println(concatWords("Hello", 3));
		//returns Full Name
		System.out.println(fullName("Daisy", "Murillo"));
		//adds ages array & returns true if sum > 100
		System.out.println("Is the sum in ages greater than 100? " + sum(ages));
		//adds wins array & returns average
		System.out.println("What is the average in wins array? " + avg(wins));
		//takes 2 array of doubles, returns true if avg of 1st > avg of 2nd
		System.out.println("Is the average of 1st array more than the second array? " + twoArrays(wins, losses));
		//if moneyInPocket > 10.50 && isHotOutside = true, return true
		System.out.println("Will I buy a drink? " + willBuyDrink(true, 12.00));
		//my own method resolving decision to attend bootcamp
		System.out.println("Should I attend a software bootcamp? " + canAttendBootcamp(true, 3050.00));
	}
	
	public static String concatWords(String word, int n) {
		String input ="";
		for(int i =0; i < n; i++) {
			input += word; 
		}
		return input;
	}
	
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		
		return fullName;
	}
	
	public static boolean sum(int[] ages) {
		int total = 0;
	    for(int i = 0; i < ages.length; i++) {
	    	total += ages[i];
	    }
	    if (total > 100) {
	    	return true;
	    } else {
	    	return false;
	    }
	}
	
	static double[] wins = {2, 4, 6, 8, 10};
	static double[] losses = {12, 14, 16, 18, 20};
		
	public static boolean twoArrays(double[] wins, double[] losses) {
		double wins1 = avg(wins);
		double losses1 = avg(losses);
		
		return wins1 > losses1;
	}
	
	public static double avg(double[] wins) {
		int total = 0;
		for (int i = 0; i < wins.length; i++) {
			total += wins[i];
		}
		int average = total / wins.length;
		return average;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	//this problem solves my decision in taking a coding bootcamp. If I lack programming skills is true, & can afford bootcamp, attend is true
	
	public static boolean canAttendBootcamp(boolean lackProgrammingSkills, double canAfford) {
		if (lackProgrammingSkills = true && canAfford > 3000.00) {
			return true;
		} else {
			return false;
		}
	}
	
}



































