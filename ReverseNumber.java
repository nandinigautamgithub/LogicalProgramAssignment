package com.logical;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int a,reverse=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		while(n!=0)
		{
		a=n%10;
		reverse=(reverse*10)+a;
		n=n/10;
		}
		System.out.println("reverse of a number is "+reverse);

	}

}
