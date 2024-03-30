/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 *
 * @author krisz
 * TGL: 30-3-2024
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dtain = new BufferedReader (new InputStreamReader (System.in));
        
        Double luas;
        int a = 0;
        int t = 0;
        String alas ="";
        String tinggi="";
        
        System.out.println("Hitung Luas Segitiga");
        
        try{
            System.out.print("Input Nilai Alas: ");
            alas = dtain.readLine();
            System.out.print("Input Nilai Tinggi: ");
            tinggi = dtain.readLine();
        }catch(IOException e) {
            System.out.println("ERROR!");
        }
        a = Integer.parseInt(alas);
        t = Integer.parseInt(tinggi);
        
        // Proses hitungannya
        luas = 0.5 * a * t;
        
        //outputnya
        System.out.println("Hasil Dari Luas Segitiga: " + luas);
    }
    
}
