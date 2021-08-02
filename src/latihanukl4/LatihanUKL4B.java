/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl4;

/**
 *
 * @author erisa
 */
public class LatihanUKL4B {
    public static void main (String [] args){
        
        int sukuawal = 5;
        int selisih = 5;
        int outputpertama;
        
        for(int a = 6; a > 1; a--){ // untuk baris kebawahnya
            for(int b=1; b < a; b++){ // untuk baris kesampingnya
                
                
                outputpertama = sukuawal;
                sukuawal += selisih;
                System.out.print(outputpertama + " ");
            }
            System.out.println(" ");
        }
    }
    
}
