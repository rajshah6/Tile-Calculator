/*
 * child class for rectangle
 */
package u2a3_rajshah;

import java.util.ArrayList;


public class Rectangle extends Shape {
    
    // define variables needed to calculate area
    private double length;
    private double width;

    // constructor methods
    // the one with no parameters can be helpful in getting the unitPrice from the abstract class

    public Rectangle () {
        
    }
    public Rectangle(double length, double width) {
        // get dimensions
        this.length = length;
        this.width = width;

        // add the dimensions to the array list 
        dimensionsList.add(length);
        dimensionsList.add(width);
    }
    
    // getters from the parent class 
    
    @Override // set the method specific to the rectangle child class
    public double getArea() {
        dimensionsList.get(0);
        dimensionsList.get(1);
        
        double area = length * width; // area of rectangle = length * width
        
        area = Math.round(area*100); // round to nearest hundredth
        area /= 100;
                
        return area; 
    }

    @Override
    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public ArrayList<Double> getDimensionsList() {
        return dimensionsList;
    }

    //toString Method
    @Override
    public String toString() {
        return "Rectangle: {" + "length=" + length + ", width=" + width + "}";
    }

}
