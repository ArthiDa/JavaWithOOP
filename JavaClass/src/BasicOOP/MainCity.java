/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicOOP;

/**
 *
 * @author ARTHI
 */
public class MainCity {
    public static void main(String[] args) {
        City Ctg = new City("Chittagong",5000,2444);
        City Dha = new City("Dhaka", 5933, 2995);
        //Ctg.SetInformation("Chittagong",5000,2444);
        //Dha.SetInformation("Dhaka", 5933, 2995);
        //System.out.println("Details of Ctg");
        //Ctg.InputDetails();
        //System.out.println("Details of Dha");
        //Dha.InputDetails();
        Ctg.OutDetails();
        Dha.OutDetails();
        City Raj = new City();
        Raj.OutDetails();
    }
    
}
