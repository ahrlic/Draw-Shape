
package assignment;

import simpleIO.Console;

/**
 * 
 * @author Ariana Hrlic 
 * Date: March 6, 2023 
 * DrawShape.java
 * DrawShape
 */

public class DrawShape {

	public static void main(String[] args) {
			
			while (0 < 5) {
			int shapeUs = Console.readInt("Please select a shape: 1- Square  2-Rectangle  3-Triangle ");

			if (shapeUs == 1) {
				//creating the square
				int input1 = Console.readInt("Please designate the length of the square:");
				int input2 = Console.readInt("Please designate the width of the square (This should be the same as the length):");

				for (int i = 0; i <= input1; i++) {
					for (int j = 0; j <= input2; j++) {
						if (i == 0 || i == input1) {
							System.out.print("*");
						} else if (j == 0 || j == input2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					//printing empty line to separate from other shapes when continuing in the while loop
					System.out.println();
				}}
						
				 if (shapeUs == 2) {

					 	//creating the rectangle
					 	//prompting the user for the size of the rectangle
						int rectIn = Console.readInt("Please designate the length of the rectangle: ");
						int rectIn2 = Console.readInt(
								"Please designate the width of the rectangle (this should be less  or more then the length): ");

						for (int a = 0; a <= rectIn; a++) {
							for (int b = 0; b <= rectIn2; b++) {
								if (a == 0 || a == rectIn) {
									System.out.print("*");
								} else if (b == 0 || b == rectIn2) {
									System.out.print("*");
								} else {
									System.out.print(" ");
								}
							}
							//empty line for clarity between shapes, again
							System.out.println();
							
						}}	
				 
						if (shapeUs == 3) {
							//creating the triangle
							//prompting user for the size of the triangle
							int userInput = Console.readInt("How many rows would you like the Triangle to be: ");
							int j;
							int i; 
							
							for(i = 1; i <= userInput; i++) {
								for(j = 1; j < i; j++) {
									
									for (j = 1; j < i; j++) {
										
									
									System.out.print("*");
								}
								//empty line again
								System.out.println();
							}}}}
						}

						

						
					}
			
		
	
