/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key?");
        if(scanner.next().equalsIgnoreCase("y"))
        {
            System.out.println("Are the battery terminals corroded?");

            if(scanner.next().equalsIgnoreCase("y"))
                System.out.println("Clean terminals and try starting again.");
            else
                System.out.println("Replace cables and try again.");

            System.exit(0);
        }
        else
        {
            System.out.println("Does the car make a slicking noise?");
            if(scanner.next().equalsIgnoreCase("y"))
            {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else
            {
                System.out.println("Does the car crank up but fail to start?");
                if(scanner.next().equalsIgnoreCase("y"))
                {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Does the engine start and then die?");
                    if(scanner.next().equalsIgnoreCase("y"))
                    {
                        System.out.println("Does your car have fuel injection?");
                        if(scanner.next().equalsIgnoreCase("y"))
                        {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }
}