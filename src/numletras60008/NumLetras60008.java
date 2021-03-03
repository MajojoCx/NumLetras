/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numletras60008;

import java.util.Scanner;

/**
 *
 * @author 60008
 */
public class NumLetras60008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        System.out.println("Ejecute la acción introduciendo un número");
        int num = entrada.nextInt();
        
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        
        String[] decimos = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve", "veinte"};
        
        String[] decenas = {"veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        
        if(num >= 0 && num <= 9){
            
            System.out.println(unidades[num]);
            
        } else if(num >= 10 && num <= 20) {
            
            System.out.println(decimos[num - 10]);
            
        } else if(num >= 21 && num <= 30){
            
            if(num < 30){
            
                System.out.println(decenas[0] + unidades[num - 20]);
            
            } else{
                
                System.out.println(decenas[1]);
                
            }
            
        }  else if(num >= 31 && num <= 40){
            
            if(num < 40){
            
                System.out.println(decenas[1] + " y " + unidades[num - 30]);
            
            } else{
                
                System.out.println(decenas[2]);
                
            }
            
        } else if(num >= 41 && num <= 50){
            
            if(num < 50){
            
                System.out.println(decenas[2] + " y " + unidades[num - 40]);
            
            } else{
                
                System.out.println(decenas[3]);
                
            }
            
        } else if(num >= 51 && num <= 60){
            
            if(num < 60){
            
                System.out.println(decenas[3] + " y " + unidades[num - 50]);
            
            } else{
                
                System.out.println(decenas[4]);
                
            }
            
        } else if(num >= 61 && num <= 70){
            
            if(num < 70){
            
                System.out.println(decenas[4] + " y " + unidades[num - 60]);
            
            } else{
                
                System.out.println(decenas[5]);
                
            }
            
        } else if(num >= 71 && num <= 80){
            
            if(num < 80){
            
                System.out.println(decenas[5] + " y " + unidades[num - 70]);
            
            } else{
                
                System.out.println(decenas[6]);
                
            }
            
        } else if(num >= 81 && num <= 90){
            
            if(num < 90){
            
                System.out.println(decenas[6] + " y " + unidades[num - 80]);
            
            } else{
                
                System.out.println(decenas[7]);
                
            }
            
        } else if(num >= 91 && num <= 99){

            System.out.println(decenas[7] + " y " + unidades[num - 90]);
    }
  }  
}