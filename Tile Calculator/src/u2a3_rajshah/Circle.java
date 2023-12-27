/*
 * child class for circle
 */
package u2a3_rajshah;

import java.util.ArrayList;


public class Circle extends Shape {
    // define variables needed to calculate area
    private double radius;

    // constructor methods
    // the one with no parameters can be helpful in getting the unitPrice from the abstract class

    public Circle () {
        
    }
    public Circle(double radius) {
        // get dimensions
        this.radius = radius;

        // add the dimensions to the array list 
        dimensionsList.add(radius);
    }
    
    // getters from the parent class 
    
    @Override // set the method specific to the circle child class
    public double getArea() {
        dimensionsList.get(0);
        
        double area = Math.PI * Math.pow(radius, 2); // area of circle = pi * r^2, where r = radius of circle
        
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
        return "Circle: {" + "radius=" + radius + "}";
    }
}
