# BMI Calculator

A simple Java console program created as a Day 3 exercise for a QA Automation Bootcamp. It accepts weight in pounds and height in meters, calculates Body Mass Index (BMI), and displays a category using conditional statements.

## Features

- Reads decimal inputs using `Scanner`.
- Converts weight from pounds to kilograms.
- Calculates BMI using weight in kilograms and height in meters.
- Displays the calculated BMI followed by its category.

## Calculation

```java
double weightInKgs = weightInPounds * 0.45359237;
double bmi = weightInKgs / (height * height);
```

Enter height in meters, such as `1.75`, rather than centimeters or feet and inches.

The program uses the following conditions and output messages:

| BMI value | Output |
| --- | --- |
| Below 18.5 | `You are Underweight` |
| 18.5 up to, but not including, 25 | `You are Normal` |
| 25 up to, but not including, 30 | `You are Overweight` |
| 30 or above | `You are Obese` |

Each `else if` is checked only when the previous condition is false. This allows the code to check the upper limit of each range without repeating its lower limit.

## Java Concepts Practiced

- Variables and the `double` data type.
- User input with `Scanner` and `nextDouble()`.
- Arithmetic operators: multiplication and division.
- Assignment with `=` and comparisons with `<`.
- Conditional statements: `if`, `else if`, and `else`.
- Console output with `System.out.println()`.
- Closing the scanner after collecting input.

## How to Run in Eclipse

You need a Java Development Kit (JDK) configured in Eclipse IDE for Java Developers. No external libraries are required.

1. Open your Java project in Eclipse.
2. Create a package named `day3` under the source folder if it does not already exist.
3. Save the source code in that package as `BMICalculator.java`. The file must begin with `package day3;`.
4. Right-click `BMICalculator.java` and select **Run As > Java Application**.
5. Enter your weight in pounds and press Enter.
6. Enter your height in meters and press Enter.
7. Read the BMI value and category in the Console.

## Suggested Manual Checks

These are expected results to check when running the program. BMI values in this table are rounded to two decimal places for readability; the program prints the unformatted `double` value.

| Weight (pounds) | Height (meters) | Approximate BMI | Expected category output |
| --- | --- | --- | --- |
| 100 | 1.75 | 14.81 | `You are Underweight` |
| 150 | 1.75 | 22.22 | `You are Normal` |
| 200 | 1.75 | 29.62 | `You are Overweight` |
| 250 | 1.75 | 37.03 | `You are Obese` |

## Current Limitations

- Performs one calculation per run.
- Does not validate that weight and height are positive. Zero or negative inputs can produce invalid or misleading results.
- Expects numeric input. Text input causes an input mismatch exception.
- Prints BMI without a fixed number of decimal places.
- Applies the same category rules to every input without asking for age or other context. This project is a programming exercise.
