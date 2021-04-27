package com.zarowoks;

import java.util.Scanner;

public class Parameter {
	
	public static int param;
			
	public static int setParam() {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter count of password ");
		//param = scan.nextInt();
		param = 2;
		scan.close();
		return param;
	}


}
