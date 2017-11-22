package MathematicalProgramming;
/*

 * busTicket.java

 *

 *  Created on: Jun 27, 2014

 *      Author: madona

 */

import java.util.Scanner;

import java.util.Date;



public class busTicket {



	private static int[] chair = new int[36];

	

	public busTicket(){

		

		System.out.printf("|================================|\n");

		System.out.println();

		System.out.printf("|===WELCOME TO MOMBASA RAHA======|\n");

		System.out.printf("|===PLEASE BOOK YOUR TICKET======|\n");

		System.out.println();

		System.out.printf("|================================|\n");

		System.out.println();

		



		

		for (int i = 0; i < 36; i++) {

			chair[i] = 0;

		}



		@SuppressWarnings("resource")

		Scanner input = new Scanner(System.in);

		int get = 1;



		System.out.printf("|Please Enter the Following to begin|\n");

		System.out.printf("|Enter 1 if you want the window     |\n");

		System.out.printf("|Enter 2 if you want the Aisle      |\n");

		System.out.printf("|Type 0 to EXIT                     |\n");

		get = input.nextInt();



		while (get != 0) {

			int chairnumber = 0;



			if (get == 1) {

				chairnumber = bookWindow();



				if (chairnumber == -1) {

					chairnumber = bookAisle();

				

					if (chairnumber!= -1) {

						System.out.printf("Sorry, we were not able to book a window seat.\n");

						System.out.printf("But do have an aisle seat.\n");

						printBoardingPass(chairnumber);

					}

				}

				else {

					

					System.out.printf("***** Window seat Available! *****\n");

					printBoardingPass(chairnumber);

				}

			}

			else if (get == 2) {



	

				chairnumber = bookAisle();

			

	

				if (chairnumber == -1) {

					chairnumber = bookWindow();



					if (chairnumber != -1) {

						System.out.printf("***Sorry, we were not able to book a aisle seat.****\n");

						System.out.printf("***But we have an window seat.****\n");

						printBoardingPass(chairnumber);

					}

				}

				else {

			

					System.out.printf("****Aisle seat available!****\n");

					printBoardingPass(chairnumber);

				}

			}

			else {

			

				System.out.println("*****Please try again!*****\n");

				get = 0;

			}





			 

			if (chairnumber == -1) {

				System.out.printf("We are sorry, there are no window or aisle seats available.\n");

				System.out.println();

			}



			System.out.printf("|Please Enter the Following to begin|\n");

			System.out.printf("|Enter 1 if you want the window     |\n");

			System.out.printf("|Enter 2 if you want the Aisle      |\n");

			System.out.printf("|Type 0 to EXIT                     |\n");

			get = input.nextInt();

		}	

	}

	private static int bookWindow() {

		for (int i = 0; i < 24; i++) {

			if (chair[i] == 0) {

				chair[i] = 1;

				return i + 1;

			}

		}

		return -1;

	}



	private static int bookAisle() {

		for (int i = 12; i < 36; i++) {

			if (chair[i] == 0) {

				chair[i] = 1;

				return i + 1;

			}

		}

		return -1;



	}



	private static void printBoardingPass(int seatnumber) {

		Date timenow = new Date();

		System.out.println();

		System.out.println("Date: " + timenow.toString());

		System.out.printf("Boarding pass for seat number: [%d]\n" , seatnumber);

		System.out.printf("The ticket is Non-Refundable \n");

		System.out.printf("Enjoy Your trip.\n");

		System.out.println();

		System.out.println();

		

	}



	public static void main(String args[]) {

		new busTicket();

	}

		

}
