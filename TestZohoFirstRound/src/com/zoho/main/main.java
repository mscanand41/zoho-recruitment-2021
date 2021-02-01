package com.zoho.main;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your row number");

		int row = myObj.nextInt();

		int column = row;
		int k = column - 1;
		int count = 0, val = 1, range = 1;

		while (column > 0) {
			for (int i = 0; i < k; i++) {
				System.out.print(" ");
			}
			k = k - 1;
			if (count == 0) {
				for (int j = range; j < (row + range); j++) {
					System.out.print(j + " ");
					val += 1;
				}
				count = 1;
				range = val - 1;
			} else {
				for (int m = (range + row); m > (range); m--) {
					System.out.print(m + " ");
				}
				val = val + row;
				range = val;
				count = 0;
			}

			column = column - 1;
			System.out.println("");

		}
	}

}
