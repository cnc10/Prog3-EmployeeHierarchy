/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog3;
//CSE 017
//Claudia Cohen
//CNC219
//Purpose of this assignment is to get experience creating and using inheritance hierarchy with employees.
//Program 3
/**
 *
 * @author Claudia
 */
public class HourlyEmployee extends Employee {
    private double wage;
    
    public HourlyEmployee(String nameIn, int hoursIn, double wageIn){
        super(nameIn, hoursIn); //create super class 1st, pass super class parameters
        this.wage = wageIn; //impose current class's attributes on super class
    }


    @Override
    public String getType() {
        return "HOURLY";
    }

    @Override
    public double totalPay() {
        return hours * wage;
    }
    
    
    
}
