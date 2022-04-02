package org.base;
import java.util.Scanner;
public class floprn {
			public static void main(String[] args) {
					Scanner r =new Scanner(System.in);
				
					//SATRING reverse
//					 String s=r.nextLine();
//				     char[] c = s.toCharArray();
//				     String output=" ";
//				     for (int i = c.length-1;i>=0; i--) {
//						output=output+c[i];
//				     System.out.println(output);}
					//polindrome
//					int i =r.nextInt();
//					int sum=0;
//					int temp=i;
//					int count=0;
//					while(i>0) {
//						int a=i/10;
//						int b=i%10;
//						i=a;
//						sum=b+(sum*10);
//						count++;}
//					if(temp==sum) {
//					System.out.println("is a palindrome");	}
//					else
//						{System.out.println("not a polindrome");
//						}
					//prime number
					int num=r.nextInt();
					int i=r.nextInt();
					if(num%i==0) {
						System.out.println("the given number is prime number");
					} 
					else
					{
						System.out.println("this is not a prime number");
					}
			}}