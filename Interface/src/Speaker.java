/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author muham
 */
public interface Speaker {
    public abstract void speak();
}
class Lecturer implements Speaker{
    public void speak(){
        System.out.println("Lecturer Speaks");
    }
}
class Politics implements Speaker{
    public void speak(){
        System.out.println("Politics Tells Lie");
    }
}
class Coach implements Speaker{
    public void speak(){
        System.out.println("Coach Speaks");
    }
}

