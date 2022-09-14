package com.bridgelabz;

import java.util.Scanner;

public class LineCompare2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first-line x1 axis");
        int x1 = scan.nextInt();
        System.out.println("Enter first-line x2 axis");
        int x2 =scan.nextInt();
        System.out.println("Enter first-line y1 axis");
        int y1 = scan.nextInt();
        System.out.println("Enter first-line y2 axis");
        int y2 = scan.nextInt();
        System.out.println("Enter second-line x1 axis");
        int a1 = scan.nextInt();
        System.out.println("Enter second-line x2 axis");
        int a2 =scan.nextInt();
        System.out.println("Enter second-line y1 axis");
        int b1 = scan.nextInt();
        System.out.println("Enter second-line y2 axis");
        int b2 = scan.nextInt();

        double line1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        double line2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));

        if(line1 == line2)
        {
            System.out.println("lines are equal");
        }
        else
            System.out.println("lines are not equal");
    }
}
