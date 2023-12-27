/*
 * child class for regular hexagon
 */
package u2a3_rajshah;

import java.util.ArrayList;


public class Hexagon extends Shape {
    // define variables needed to calculate area
    private double side;

    // constructor methods
    // the one with no parameters can be helpful in getting the unitPrice from the abstract class

    public Hexagon () {
        
    }
    public Hexagon(double side) {
        // get dimensions
        this.side = side;

        // add the dimensions to the array list 
        dimensionsList.add(side);
    }
    
    // getters from the parent class 
    
    @Override // set the method specific to the circle child class
    public double getArea() {
        dimensionsList.get(0);
        
        double area = 1.5 * Math.sqrt(3) * Math.pow(side, 2); // area of regular hexagon = 3/2*sqrt(3) * a^2, where a = side of hexagon
        
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
        return "Regular Hexagon: {" + "side=" + side + "}";
    }
}
