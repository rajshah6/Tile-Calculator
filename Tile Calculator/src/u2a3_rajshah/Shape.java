/*
 * Shape parent class
 */
package u2a3_rajshah;

import java.util.ArrayList;
import java.util.Scanner;

// create abstract parent class
public abstract class Shape {
    
    // declare protected variables
    protected double unitPrice;
    protected ArrayList<Double> dimensionsList = new ArrayList<>();
    
    // declare abstract methods that will be used in child classes
    public abstract double getArea();
    
    public abstract double getUnitPrice(); 

    public abstract ArrayList<Double> getDimensionsList();
    
    // declare a non-abstract class to set the same unitPrice for all the shapes 
    public void setUnitPrice () {
        Scanner scanner = new Scanner(System.in); // this will be called from the main function to get user input and store it in the variable
        unitPrice = scanner.nextDouble();
    } 
}
