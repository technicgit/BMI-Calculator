package day3;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your weight in Pounds");
		
		double weightInPounds = scanner.nextDouble();
		
		System.out.println("Enter your height in meters");
		
		double height = scanner.nextDouble();
		scanner.close();
		
		//To convert pounds to kgs
		double weightInKgs = weightInPounds*0.45359237;
		
		//BMI = weight (kg) / height (m)^2
		
		double bmi = weightInKgs/(height*height);
		System.out.println(bmi);
		
		if (bmi < 18.5)
		{
		    System.out.println("You are Underweight");
		}
		else if (bmi < 25)
		{
		    System.out.println("You are Normal");
		}
		else if (bmi < 30)
		{
		    System.out.println("You are Overweight");
		}
		else
		{
		    System.out.println("You are Obese");
		}
	}

}


