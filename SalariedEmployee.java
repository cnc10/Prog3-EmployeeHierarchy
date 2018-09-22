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
public class SalariedEmployee extends Employee {
    private double salary;
    
    public SalariedEmployee(String nameIn, int hoursIn, double salaryIn){
        super(nameIn, hoursIn);
        this.salary = salaryIn;
    }

    @Override
    public String getType() {
        return "SALARIED";
       
    }
    public double getWage(){
        return this.salary;
    }

    @Override
    public double totalPay() {
        return this.salary/52;
        
    }
    
}
