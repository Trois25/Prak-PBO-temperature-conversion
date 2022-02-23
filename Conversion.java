/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123200139;

public class Conversion {
    
    public float Faren(float C){
        float F = (9 * C )/5 + 32;   
        return F;
    }
    
    public float Kelvin(float C){
        float K = (float) (C + 273.15);
        return K;
    }
     
        
    public float Reamure(float C){
        float R = (4 * C)/5;
        return R;
    }
    
    public void status(float C){
        if(C <= 0){
            System.out.print("Freeze");
            //status = "Freeze";
        }else if(C >= 100){
            System.out.print("Boilling");
            //status = "Boilling";
        }else{
            System.out.print("Normal");
            //status = "Normal";
        }
    }
}


