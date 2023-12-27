/*
 * Name: Raj Shah
 * Date: Aug 10, 2023
 * Course: ICS4UE
 * Description: This program will take in shapes and their lengths inputted by the
 * user and calculate their areas. It will then allow the user to remove the shapes 
 * or list them. The program will calculate the price for flooring if these shapes are
 * used. You can also clear the console of this program.
 */

package u2a3_rajshah;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;


public class TileCalculator {

    // method of type void will output the menu where the user can access different features of the program
    // the method will be called from the main method and print the menu inside the console
    public static void menu() {
        System.out.println("\n-------------------------------------------------------- "); // divider
        System.out.println("\nHOME PAGE: Please choose one of the following options: ");
        System.out.println("[1] Create a new shape");
        System.out.println("[2] Delete an existing shape");
        System.out.println("[3] Display existing shapes");
        System.out.println("[4] Calculate total cost of the floor");
        System.out.println("[5] Calculate total area of the floor");
        System.out.println("[6] Clear the list of shapes");
        System.out.println("[7] Clear the console");
        System.out.println("[8] Exit");
        
        System.out.print("\nEnter the number corresponding to your choice: "); // the user will input their number when the method is called
        
    }
    
    // method of type void will clear the console using the imported Robot class
    // the method will be called from the main method
    public static void consoleClear() {
        
        // try catch any error
        try {
            
            Robot robot = new Robot(); // create object of Robot class

            // control-L to clear the screen 
            // press the keys 
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            
            // release the key
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
            
        } catch (AWTException e) {
            e.printStackTrace(); 
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create input object
        
        // title message 
        System.out.println("Tile Price Calculator!\n");
        
        // get input for price per square unit
        System.out.print("Enter the price per square unit: ");
        Rectangle rectangle_ = new Rectangle(); // create temporary Rectangle object to get the user input
        rectangle_.setUnitPrice(); // since unit price doesn't change, we can initialize it for one object only
        
        int menuChoice = 0; // initialize choice variable
        ArrayList<Shape> shapes = new ArrayList<>(); // initialize array list of type Shape
        
        boolean exitLoop = false; // infinite loop that will break only when the user wants to exit
        while (!exitLoop) { 
            
            // call menu method to output home page where user can use features of the program
            menu();
            
            try { // check for correct user input
                
                menuChoice = input.nextInt(); // get user input for user's number choice
                System.out.println("-------------------------------------------------------- "); // divider

                switch (menuChoice) { // switch case method for the home page

                    case 1: // if the user creates a new shape
                        int shapeChoice = 0; // initialize choice variable

                        System.out.println("A new shape will be created!\n");

                        System.out.println("[1] Rectangle \n[2] Circle \n[3] Donut \n[4] Parallelogram \n[5] Trapezoid \n[6] Triangle \n[7] Regular Hexagon"); // print all options
                        System.out.print("\nEnter the number corresponding to the shape you want to create: ");

                        shapeChoice = input.nextInt(); // get user input

                        switch (shapeChoice) { // another switch case method for each shape

                            case 1: // rectangle

                                // get dimensions for the rectangle
                                System.out.print("Enter a length for the rectangle: ");
                                double length = input.nextDouble();

                                System.out.print("Enter a width for the rectangle: ");
                                double width = input.nextDouble();

                                Rectangle rectangle = new Rectangle(length, width); // create rectangle object

                                shapes.add(rectangle); // add rectangle to array of shapes
                                System.out.println("\nRectangle was created! " + rectangle); // print the toString override to tell the user what they inputted

                                break; // exit the switch case method

                            case 2: // circle

                                // get dimensions for the circle
                                System.out.print("Enter a radius for the circle: ");
                                double radius = input.nextDouble();

                                Circle circle = new Circle(radius); // create circle object

                                shapes.add(circle); // add circle to array of shapes
                                System.out.println("\nCircle was created! " + circle); // print the toString override to tell the user what they inputted

                                break; // exit the switch case method

                            case 3: // donut

                                // get dimensions for the donut
                                System.out.print("Enter an outer radius for the donut: ");
                                double outer_radius = input.nextDouble();

                                System.out.print("Enter an inner radius for the donut: ");
                                double inner_radius = input.nextDouble();

                                Donut donut = new Donut(outer_radius, inner_radius); // create donut object

                                shapes.add(donut); // add donut to array of shapes
                                System.out.println("\nDonut was created! " + donut); // print the toString override to tell the user what they inputted

                                break; // exit the switch case method

                            case 4: // parallelogram

                                // get dimensions for the parallelogram
                                System.out.print("Enter a base for the parallelogram: ");
                                double parrelogram_base = input.nextDouble();

                                System.out.print("Enter a height for the parallelogram: ");
                                double parrelogram_height = input.nextDouble();

                                Parallelogram parallelogram = new Parallelogram(parrelogram_base, parrelogram_height); // create parallelogram object

                                shapes.add(parallelogram); // add parallelogram to array of shapes
                                System.out.println("\nParallelogram was created! " + parallelogram); // print the toString override to tell the user what they inputted

                                break; // exit the switch case method

                            case 5: // trapezoid

                                // get dimensions for the trapezoid
                                System.out.print("Enter the bottom base of the trapezoid: ");
                                double big_base = input.nextDouble();

                                System.out.print("Enter the top base of the trapezoid: ");
                                double small_base = input.nextDouble();

                                System.out.print("Enter the height of the trapezoid: ");
                                double trapezoid_height = input.nextDouble();

                                Trapezoid trapezoid = new Trapezoid(big_base, small_base, trapezoid_height); // create trapezoid object

                                shapes.add(trapezoid); // add trapezoid to array of shapes
                                System.out.println("\nTrapezoid was created! " + trapezoid); // print the toString override to tell the user what they inputted

                                break; // exit the switch case method

                            case 6: // triangle

                                // get dimensions for the triangle
                                System.out.print("Enter the base of the triangle: ");
                                double triangle_base = input.nextDouble();

                                System.out.print("Enter the height of the triangle: ");
                                double triangle_height = input.nextDouble();

                                Triangle triangle = new Triangle(triangle_base, triangle_height); // create triangle object

                                shapes.add(triangle); // add triangle to array of shapes
                                System.out.println("\nTriangle was created! " + triangle); // print the toString override to tell the user what they inputted

                                break; // exit the switch case method

                            case 7: // hexagon

                                // get dimensions for the hexagon
                                System.out.print("Enter the side length of the regular hexagon: ");
                                double sideLength = input.nextDouble();

                                Hexagon hexagon = new Hexagon(sideLength); // create hexagon object

                                shapes.add(hexagon); // add hexagon to array of shapes
                                System.out.println("\nRegular hexagon was created! " + hexagon); // print the toString override to tell the user what they inputted

                                break; // exit the switch case method

                            default: // wrong input
                                System.out.println("Incorrect input. Please try again.");
                                break; // exit the switch case method

                        }

                        break; // exit the main switch case method

                    case 2: // if the user removes a shape

                        System.out.println("A shape will be removed.\n");

                        // check if there ate existing shapes
                        if (shapes.isEmpty()) {
                            System.out.println("There are no existing shapes!");
                            break; // exit the switch case method 

                        } // note: else isn't needed since break will cause the below code to not run

                        // output all existing shapes in a viewable way
                        for (int i = 0; i < shapes.size(); i++) { // iterate through array

                            // make the output user friendly so user can tell which index is which
                            System.out.println("[" + i + "] " + shapes.get(i));
                        }

                        // ask the user to remove a shape
                        System.out.print("\nEnter the number corresponding to the shape you want to remove: ");
                        int removeShape = input.nextInt(); // get user input

                        shapes.remove(removeShape);
                        System.out.println("\nShape was removed!");

                        break; // exit the switch case method

                    case 3: // if the user wants to list all shapes
                        System.out.println("All shapes will be listed, along with their corresponding index:\n");

                        // check if there ate existing shapes
                        if (shapes.isEmpty()) {
                            System.out.println("There are no existing shapes!");
                            break; // exit the switch case method 
                        }

                        for (int i = 0; i < shapes.size(); i++) { // iterate through array

                            // make the output user friendly so user can tell which index is which
                            System.out.println("[" + i + "] " + shapes.get(i));
                        }

                        break; // exit the switch case method

                    case 4: // if the user wants to calculate the total cost

                        double totalArea = 0; // initialize total area

                        for (int i = 0; i < shapes.size(); i++) { // iterate through array

                            totalArea += shapes.get(i).getArea(); // calls area getter and adds each area to total area
                        }

                        double totalCost = totalArea * rectangle_.getUnitPrice(); // multiplies total area by the user inputted square unit price to get the total cost

                        totalCost = Math.round(totalCost*100); // round to nearest hundredth
                        totalCost /= 100;

                        System.out.println("The total cost is: $" + totalCost);

                        break; // exit the switch case method

                    case 5: // if the user wants to calculate the total area
                        System.out.println("The total area will be listed.\n");
                        totalArea = 0; // reset total area

                        for (int i = 0; i < shapes.size(); i++) { // iterate through array

                            totalArea += shapes.get(i).getArea(); // calls area getter and adds each area to total area
                            System.out.println(shapes.get(i) + ". The area is " + shapes.get(i).getArea()); // output each individual area
                        }

                        totalArea = Math.round(totalArea*100); // round to nearest hundredth
                        totalArea /= 100;

                        System.out.println("\nThe total area is: " + totalArea + " square units");

                        break; // exit the switch case method

                    case 6: // if the user wants to clear the list of shapes
                        shapes.clear();
                        System.out.println("\nAll existing shapes have been removed!");

                        break; // exit the switch case method

                    case 7: // if the user wants to clear the console
                        consoleClear(); // call the void method defined earlier

                        break; // exit the switch case method

                    case 8: // if the user wants to exit the program

                        exitLoop = true; // tell program to exit loop
                        break; // exit the switch case method

                    default: // wrong input
                        System.out.println("Incorrect input. Please try again.");
                        break; // exit the switch case method
                } 

            } catch (Exception e) { // inform user about incorrect input
                System.out.println("Incorrect input. Please try again.");
                input.nextLine();
            
            }
        
        }
              
    }
    
}
