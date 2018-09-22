/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog3;

/**
 *
 * @author Claudia
 * /CSE 017
//Claudia Cohen
//CNC219
//Purpose of this assignment is to get experience creating and using inheritance hierarchy with employees.
//Program 3
 */
public abstract class Employee {
    protected String name;
    protected int hours; 
    
    public Employee(String nameIn, int hoursIn){ //constructor
        this.name = nameIn;
        this.hours = hoursIn;        
    }
    
    
    public String getName(){ //getter for names
        return this.name;
    }
    public int getHours(){ //getter for hours
        return this.hours;
    }
    public abstract String getType(); //imperative to direct sub classes to include this method
    public abstract double totalPay();
    
    public static Employee factory(String name, String type, int hours, double wage, double salary){
        Employee result = null;
        if(type.equalsIgnoreCase("HOURLY")){
            result = new HourlyEmployee(name, hours, wage); 
        }
        if(type.equalsIgnoreCase("SALARIED")){
            result = new SalariedEmployee(name, hours, salary);
        }
        return result;
    }
    
    
}
