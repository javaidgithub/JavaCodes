/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author muham
 */
public abstract class Shape {
    
    public abstract void calculateArea();
            
    public void print(){
        
    }
}

class Circle extends Shape{
    int x;
    int y;
    int radius;
    
    public void Circle(){
        x = 5;
        y = 7;
        radius = 2;
    }
    public void calculateArea(){
        double area = 3.14 * (radius*radius);
        System.out.println("Area is "+ area);
    }
}
