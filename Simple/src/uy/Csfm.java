package uy;

import java.util.Scanner;

public class Csfm {
public static void main(String[]args) {
	int year = 2001;
	if ((year%4==0)&&(year%100!=0)){
		System.out.println("it is a leap year");
	}else{
		System.out.println("it is not a leap year");
	}
			
}
}
