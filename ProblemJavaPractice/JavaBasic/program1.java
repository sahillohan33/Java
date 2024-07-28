package JavaBasic;

import java.util.Scanner;

public class program1 {
    /*
            Write a Java program that takes a number as input and prints its multiplication table up to 10.
        Test Data:
        Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80

     */
    public static void main(String[] args) {


    Scanner input=new Scanner(System.in);
        System.out.print("Input a number : ");
    int num=input.nextInt();
    for(int i=1;i<=10;i++) {
        System.out.println(num+ " * "+i+ " = "+(num*i) );
    }

    /*
         Write a Java program to compute the specified expressions and print the output.
    Test Data:
    ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    Expected Output
    2.138888888888889

    */
        Double a=((25.5*3.5-3.5*3.5)/(40.5-4.5));
        System.out.println("Output : "+a);

    }
}
