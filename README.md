BMI Calculator

A Java console application that calculates Body Mass Index (BMI) from weight in pounds and height in meters, then displays the corresponding category.

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

## Implementation Details

- Variables and the `double` data type.
- User input with `Scanner` and `nextDouble()`.
- Arithmetic operators: multiplication and division.
- Assignment with `=` and comparisons with `<`.
- Conditional statements: `if`, `else if`, and `else`.
- Console output with `System.out.println()`.
- Closing the scanner after collecting input.

## How to Run

Requires a Java Development Kit (JDK), with `java` and `javac` available in your terminal. No external libraries are required.

From the directory containing `BMICalculator.java`, compile and run:

```sh
javac -d out BMICalculator.java
java -cp out day3.BMICalculator
```

The run command uses the package declared in the source file. Enter weight in pounds and height in meters when prompted, pressing Enter after each value. The program then displays the BMI and category.

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
- Applies the same category rules to every input without asking for age or other context.
