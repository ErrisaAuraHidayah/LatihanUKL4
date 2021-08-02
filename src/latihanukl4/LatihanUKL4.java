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
public class LatihanUKL4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Latihan A
        
        int sukuawal = 5; // mendeklerasikan variabel suku awal
        int selisih = 5; // mendeklarasikan selisih antar variabel
        int outputpertama; // mendeklarasikan output pertama
        
        for(int i = 0; i<5; i++){  // untuk bagian kebawahnya
            for(int j =0; i<5; j++){ // untuk bagian keatasnya
                if(i==j){ // jika i sama dengan j maka perulangan akan berhenti
                    break; 
                }
                outputpertama = sukuawal; // menentukan bahwa outputpertama sama dengan 5;
                sukuawal += selisih; // Operator untuk penambahan 5 setiap suku berikutnya
             
                System.out.print(outputpertama + " ");//menampilkan hasil dari outputpertama
                
            }
            System.out.println(" "); //memberi spasi antar baris
        }
    }
    
}
