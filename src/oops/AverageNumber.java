package oops;

import java.util.*;
class Average
{
	double avg;
	Average(double a, double b, double c)
	{
	 avg= (a+b+c)/3;
 
	}
}
class AverageNumber
{
   public static void main(String args[]) 
    {   
      try(Scanner sc = new Scanner(System.in)){
System.out.println("Enter the value of first no");
      double a1= sc.nextDouble();   
System.out.println("Enter the value of Second No");
      double a2= sc.nextDouble();      
System.out.println("Enter the value of Third No");
      double a3= sc.nextDouble();      	  
      Average obj =new Average(a1, a2, a3);
	  System.out.println("Average of three number is :" + obj.avg);      
   }}
 }