/*
 * child class for donut
 */
package u2a3_rajshah;

import java.util.ArrayList;


public class Donut extends Shape {
    // define variables needed to calculate area
    private double outer_radius, inner_radius;

    // constructor methods
    // the one with no parameters can be helpful in getting the unitPrice from the abstract class

    public Donut () {
        
    }
    public Donut(double outer_radius, double inner_radius) {
        // get dimensions
        this.outer_radius = outer_radius;
        this.inner_radius = inner_radius;

        // add the dimensions to the array list 
        dimensionsList.add(outer_radius);
        dimensionsList.add(inner_radius);
    }
    
    // getters from the parent class 
    
    @Override // set the method specific to the circle child class
    public double getArea() {
        dimensionsList.get(0);
        dimensionsList.get(1);
        
        double area = Math.abs(Math.PI * (Math.pow(outer_radius, 2) - Math.pow(inner_radius, 2))); // area of donut = pi * (R^2 - r^2), where R = outer radius of circle, r = inner radius
        // absolute value is done in case the user swaps the outer and inner radius
        
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
        return "Donut: {" + "outer radius=" + outer_radius + ", inner radius=" + inner_radius + "}";
    }
}
