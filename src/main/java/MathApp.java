import static java.lang.Math.sqrt;

public class MathApp {
    public static void main(String[] args) {

        // Question 1: find larger of two salaries

        double salaryBob = 35000;
        double salaryGary = 85000;
        double salaryHighest;

        salaryHighest = Math.max(salaryBob, salaryGary);

        System.out.println("The highest salary is $" + salaryHighest + ".");

        // Question 2: find smaller of two prices

        double priceCar = 5000;
        double priceTruck = 10000;
        double priceLowest = Math.min(priceCar, priceTruck);

        System.out.println("The lowest priced vehicle costs $" + priceLowest + ".");

        // Question 3: find area of circle

        double radius = 1.5;
        double pi = 3.141592653589;
        double areaCircle = pi * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + areaCircle + ".");

        // Question 4: find square root of variable = 5.0

        double varSqrt = 5.0;
        double Sqrt = Math.sqrt(varSqrt);
        System.out.println("The square root of " + varSqrt + " is " + Sqrt + ".");

        // Question 5: find distance between 2 points

        int[] point1 = {5, 10};
        int[] point2 = {85, 50};

        double distance;
        distance = Math.sqrt(
                Math.pow(point2[1] - point1[1], 2) + Math.pow(point2[0] - point1[0], 2)
        );
        System.out.println("The distance between the two points is " + distance + ".");

        // Question 6: find absolute value of variable = -3.8

        double varAbs = -3.8;
        double Abs = Math.abs(varAbs);
        System.out.println("The absolute value is " + Abs + ".");

        // Question 7: create variable with random value from 0-1

        double randNum = Math.random();
        System.out.println("Here is a random number between 0 and 1: " + randNum + ".");

        // Question 8: find number of minutes and milliseconds in 24 days

        int numDays = 24;
        int hoursPerDay = 24;
        int minsPerHour = 60;
        int secsPerMin = 60;
        int millisecsPerSec = 1000;

        int minsTotal = numDays * hoursPerDay * minsPerHour;
        int millisecsTotal = minsTotal * secsPerMin * millisecsPerSec;

        System.out.println("In " + numDays + " days, there are " + minsTotal + " minutes.");
        System.out.println("In " + numDays + " days, there are " + millisecsTotal + " milliseconds.");

    }

}
