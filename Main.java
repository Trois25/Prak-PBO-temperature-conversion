/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123200139;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class Main {
    public static void main(String[] args) {
        float C;
        int choose;
        Conversion convert = new Conversion();
        
        System.out.println("+--------------------------------------+");
        System.out.println("| WATER TEMPERATURE CONVERSION PROGRAM |");
        System.out.println("+--------------------------------------+");
        do{
            System.out.println("\nData Entry");
            System.out.println("----------");
            Scanner input = new Scanner(System.in);

            System.out.print("Temperature in Celcius : ");
            C = input.nextInt();
            do{
                System.out.println("\nOption");
                System.out.println("------");
                System.out.println("1. View Conversion Data");
                System.out.println("2. Edit Conversion Data");
                System.out.println("3. Exit");
                System.out.print("Choose : ");
                choose = input.nextInt();

                if(choose == 1){
                    System.out.println("Temperature In Celsius : " + C + "°C");
                    System.out.println("In Fahrenheit : " + convert.Faren(C) + "°F");
                    
                    System.out.println("In Reamur : " + convert.Reamure(C) + "°R");
                    System.out.println("In Kelvin : " + convert.Kelvin(C) + "°K");
                    
                    System.out.print("Water Condition ");
                    convert.status(C);
                    System.out.print(".\n");
                    
                }else if(choose != 2 && choose != 3){
                    System.out.println("\nOption does not exist. Please enter the options correctly!\n");
                }
            }while(choose == 1);
        }while(choose == 2 || choose != 3);
    }
    
}
