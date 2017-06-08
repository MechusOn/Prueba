/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.math.*;
/**
 *
 * @author usuario
 */
public class metodos {
    
   int a,b,c, x,y,z,re3;
   String nombre, apellido, cadenaI, cadenaI2, palabra;
   double hipotenusa;
   
   
      
    
    public metodos(){
    
        nombre = "Juan";
        apellido="Perez";
        cadenaI = "";
        cadenaI2 ="";
        
        a = 4;
        b =4;
        
    }
    
    public void invertir(){
     for(int i = nombre.length()-1; i>=0; i--)
     {
            cadenaI += nombre.charAt(i);
     }
    for (int j = apellido.length()-1; j>=0; j--)
    {
            cadenaI2 += apellido.charAt(j);
    }
        System.out.println(cadenaI +" "+ cadenaI2);
    
    }
    public void hipotenusa(){
    
       hipotenusa = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
        System.out.println("la hipotenusa es " +hipotenusa);
    }
    
    public void reglade3()
    {
        x =5;
        y =10;
        z =3;
        re3 =((z*y)/x);
        System.out.println("el resultado es: " + re3);
    }
    
    
}
