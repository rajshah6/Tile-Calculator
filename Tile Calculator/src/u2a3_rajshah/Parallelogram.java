/*
 * child class for parellelogram
 */
package u2a3_rajshah;

import java.util.ArrayList;


public class Parallelogram extends Shape {
    // define variables needed to calculate area
    private double base, height;

    // constructor methods
    // the one with no parameters can be helpful in getting the unitPrice from the abstract class

    public Parallelogram () {
        
    }
    public Parallelogram(double base, double height) {
        // get dimensions
        this.base = base;
        this.height = height;

        // add the dimensions to the array list 
        dimensionsList.add(base);
        dimensionsList.add(height);
    }
    
    // getters from the parent class 
    
    @Override // set the method specific to the circle child class
    public double getArea() {
        dimensionsList.get(0);
        dimensionsList.get(1);
        
        double area = base * height; // area of Parallelogram = base * height
        
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
        return "Parallelogram: {" + "base=" + base + ", height=" + height + "}";
    }
}
