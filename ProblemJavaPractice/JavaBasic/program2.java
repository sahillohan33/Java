package JavaBasic;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        /*
   3. Write a Java program to compute a specified formula.
    Specified Formula :
    4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
    Expected Output
    2.9760461760461765
         */
        Double a=4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
        System.out.println("Output : "+a);

        /*
    4.  Write a Java program to print the area and perimeter of a circle.
    Test Data:
    Radius = 7.5
    Expected Output
    Perimeter is = 47.12388980384689
    Area is = 176.71458676442586
         */
        double Radius=7.5;
        System.out.println("Perimeter is: "+2*Math.PI*Radius);
        System.out.println("Area of Cricle : "+Math.PI*Radius*Radius);
/*
      5.  Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

 */
        Scanner input=new Scanner(System.in);
        System.out.print("Input first number : ");
        int num1=input.nextInt();
        System.out.print("Input second number : ");
        int num2=input.nextInt();
        System.out.print("Input third number : ");
        int num3=input.nextInt();
        System.out.println("Average is :"+(num1+num2+num3)/3);
        /*
            6. Write a Java program to print the area and perimeter of a rectangle.
    Test Data:
    Width = 5.6 Height = 8.5


    Expected Output
    Area is 5.6 * 8.5 = 47.60
    Perimeter is 2 * (5.6 + 8.5) = 28.20
         */
        double Width=5.6;
        double Height=8.5;
        System.out.println("Area of rectangle is :"+Width+" * "+Height+" = "+(Width*Height));
        System.out.println("Perimeter of rectangle is :"+"2 "+" * ("+Width+" + "+Height+") = "+2*(Width+Height));


    }
}
