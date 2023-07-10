/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author yaso
 */

class student{
    private int rollnumber;
    private String name;
    
    student(int rollnumber,String name)
    {
        this.rollnumber=rollnumber;
        this.name = name;
    }
    public void display()
    {
        System.out.println(this.rollnumber);
        System.out.println(this.name);
    }
    
    public void modify(int rollnumber)
    {
        this.rollnumber=rollnumber;
    }
    public void modify(String name)
    {
        this.name = name;
    }
}
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student obj1 = new student(125,"keerthana");
        obj1.display();
        obj1.modify("yaso");
        obj1.modify(144);
        obj1.display();
    }
}
