import java.util.Random;
import java.util.Scanner;

public class App{   
    public static void main(String[] args){
    	MasterMind spel = new MasterMind();
    	
    	spel.start(); 	
    }   
}

class MasterMind{
	
	public void start() {
		//Generates random string from ASCII
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 4;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();

	    System.out.println(generatedString);
	    String code = generatedString;
	    
		System.out.println("Lets begin");
		Scanner scanner = new Scanner(System.in);
		for(int x = 0; x < 12; x++) {
			String answer = scanner.nextLine();
			
			char matchCharacter1 = code.charAt(0);
			char Answer1 = answer.charAt(0);
			char matchCharacter2 = code.charAt(1);
			char Answer2 = answer.charAt(1);
			char matchCharacter3 = code.charAt(2);
			char Answer3 = answer.charAt(2);
			char matchCharacter4 = code.charAt(3);
			char Answer4 = answer.charAt(3);
			
			if(answer.equals(generatedString)) {
				System.out.println("You Guessed all letters correctly");
				System.out.println();
			}
			else if(!answer.equals(generatedString)) {
				for(int i = 0; i < answer.length(); i++) {
					System.out.println(answer.charAt(i));
					if(answer.charAt(i) == code.charAt(i)) {
						System.out.println(" match");
					}
					
				}
						
			}
			else {
				System.out.println("Wrong");
			}
			System.out.println("You entered " + answer);
			if(answer.equals("q")) {
				break;
			}
		}
		System.out.println("Bedankt voor het spelen");
	}
}	
//	System.out.println(max(5, 6, 5));
//
//}
//
//public static int max(int num1, int num2, int num3) {
//	if(num1 >= num2 && num1 >3) {
//		return num1;
//	}
//	else if(num2 >= num1 && num2 >= num3) {
//		return num2;
//	}
//	else {
//		return num3;
//	}
//}
//String ingredient1 = "burger";
//String ingredient2 = "lettuce";
//String ingredient3 = "tomato";
//String ingredient4 = "bread";
//
//String[] ingredientsBurger = {ingredient1, ingredient2, ingredient3, ingredient4};
//
//
//String[] ingredients = {"union","burger","bread","lettuce"};
//System.out.println(ingredientsBurger[1]);
//System.out.println("You will need " + ingredients.length + " for this recipe");
//String[] ingredientsApplePie = new String[3];
//ingredientsApplePie[0] = "Apple";
//ingredientsApplePie[1] = "Dough";
//ingredientsApplePie[2] = "Cinnamon";
//
//System.out.println(ingredientsApplePie[2]);
//___________________________________________________________________________________
//String name = "Andrew";
//int age = 23;
//sayHi("William ", age);
//sayHi("Harry ", 15);
//sayHi("Tom " , 200);
//sayHi("Tom " + name , age);
//sayHi(name+" ", age);
//
//}
//
//public static void sayHi(String name, int age) {
////String name = "Andrew";
//System.out.println("Hello " + name + "you are " + age + " years old");
//

//Scanner keyboardInput = new Scanner(System.in);
//System.out.print("Enter a color: ");
//String color = keyboardInput.nextLine();
//System.out.println("Enter a plural noun: ");
//String pluralNoun = keyboardInput.nextLine();
//System.out.println("Enter a celebrity: ");
//String celebrity = keyboardInput.nextLine();
//System.out.println("Roses are "+ color + "\n "
//		+ pluralNoun +" are blue \n "
//		+ "I love " + celebrity);

/*
 * Simple calculator Scanner keyboardInput = new Scanner(System.in);
 * System.out.println("Enter first number"); double num1 =
 * keyboardInput.nextDouble(); System.out.println("Enter Second Number"); double
 * num2 = keyboardInput.nextDouble(); System.out.println(num1 + num2);
 */
//boolean answerCorrect = false;
//
//while(answerCorrect == false) {
//	Scanner keyboardInput = new Scanner(System.in);
//	System.out.print("Enter your name: ");
//	String userName = keyboardInput.nextLine();
//	System.out.print("Your name is " + userName + " Is that correct? "  );
//	String userAnswer = keyboardInput.nextLine();
//	
//	if(userAnswer.contains("yes") == true ) {
//		System.out.println("Welcome " + userName);
//		answerCorrect = true;
//	}
//	else {
//		System.out.println("Acces denied");
//	}
//}

/*
 * Student student1 = new Student(); student1.age = 26; student1.firstName =
 * "Harry"; student1.lastName = "Potter"; student1.Major = "potions";
 * 
 * System.out.println("helly my name is " + student1.firstName); // TODO
 * Auto-generated method stub
 * 
 * public class Student { String firstName; String lastName; double
 * averageGrade; String Major; int age; boolean lovesProgramming; } String
 * phrase = "Hogwarts School";
 * 
 * System.out.println(phrase.charAt(4)); //get the letter at this index
 * System.out.println(phrase.indexOf("o")); // get the index number of the first
 * instance of the inserted letter System.out.println(phrase.lastIndexOf("o"));
 * // get the index number of the last instance of the inserted letter
 * System.out.println(phrase.substring(9,12)); //grabs the 9th character until
 * the 12th character if the string System.out.println(phrase.substring(0,
 * phrase.indexOf(" "))); //Get first word in a string starting at index of 0
 * and ending at the index of the first space in a string
 * 
 * 
 * if(phrase.contains("School") == true ){
 * System.out.println("The phrase contains the word school"); //if the word
 * contains inserted word, return true or false } int myInt = 3; double myDouble
 * = -5.5; double myDouble2 = 5.5;
 * 
 * System.out.println(8 + 20); System.out.println(218 - 2813);
 * System.out.println(1700.5 / 36); System.out.println(29 % 5);
 * System.out.println(" "); System.out.println(5.40 + myInt);
 * System.out.println(5 + myDouble); System.out.println(myDouble + myInt );
 * System.out.println(Math.abs(myDouble)); System.out.println(Math.pow(myInt,
 * 3)); System.out.println(Math.sqrt(36)); System.out.println(Math.min(myInt,
 * myDouble)); //returns smallest of two numbers
 * System.out.println(Math.round(myDouble));
 * System.out.println(Math.round(myDouble2));
 */
