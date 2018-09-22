/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//CSE 017
//Claudia Cohen
//CNC219
//Purpose of this assignment is to get experience creating and using inheritance hierarchy with employees.
//Program 3

package prog3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/**
 *
 * @author Claudia
 */
public class Prog3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //insert text file name here 
      //  String[] textFile = new String[] textFile[0]; name of your text file from the buffered reader
       //System.out.println(readFile(args[0]));
       List<Employee> employees = new ArrayList<>();
       employees = readFile(args[0], employees);
       System.out.println("Name \t Type \t\t Hours \t Total Pay");
       for(Employee currentEmployee : employees){ //enhanced for loop
         //  System.out.println(currentEmployee.getName() + " " + currentEmployee.getType());
         //printf function that prints out the get name get type and get hours for currentEmployee
         System.out.printf( "%s \t %s \t %5d \t %9.2f", currentEmployee.getName(), currentEmployee.getType(), currentEmployee.getHours(), currentEmployee.totalPay());
         System.out.println();
       }
    }
     public static List<Employee> readFile(String fileName, List<Employee> employees){ 
       BufferedReader fin = null; //buffered reader called Fin
       String line = null;
       try{
           fin = new BufferedReader(new FileReader(fileName)); //from file reader read in.txt into buffered reader
           while ((line = fin.readLine()) != null) { //while when we read next line from fin and its not nothing
               line = line.replaceAll("\\s+", " ");

                String[] split = line.split(" ");
        
                employees.add(Employee.factory(split[0], split[1], Integer.parseInt(split[2]), Double.parseDouble(split[3]), Double.parseDouble(split[4]))); //creates a new employee and stores it in "employees"


               
           }
           fin.close();
       } catch (IOException ex) { //will discuss on Friday
            ex.printStackTrace();
        } 
       
       return employees;
    }
    // public Employees[] employees = new Employees[(args)];
     //use the static factory method to create the salaries 
    
}
