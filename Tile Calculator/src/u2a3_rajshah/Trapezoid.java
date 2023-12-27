/*
 * child class for trapezoid
 */
package u2a3_rajshah;

import java.util.ArrayList;


public class Trapezoid extends Shape {
    // define variables needed to calculate area
    private double big_base, small_base, height;

    // constructor methods
    // the one with no parameters can be helpful in getting the unitPrice from the abstract class

    public Trapezoid () {
        
    }
    public Trapezoid(double big_base, double small_base, double height) {
        // get dimensions
        this.big_base = big_base;
        this.small_base = small_base;
        this.height = height;

        // add the dimensions to the array list 
        dimensionsList.add(big_base);
        dimensionsList.add(small_base);
        dimensionsList.add(height);
    }
    
    // getters from the parent class 
    
    @Override // set the method specific to the circle child class
    public double getArea() {
        dimensionsList.get(0);
        dimensionsList.get(1);
        dimensionsList.get(2);
        
       double area = (big_base + small_base)/2 * height; // area of Trapezoid = (a+b)/2 * h, where a = big base, b = small base, h = height
        
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
        return "Trapezoid: {" + "bottom base=" + big_base + ", top base=" + small_base +", height=" + height + "}";
    }
}
