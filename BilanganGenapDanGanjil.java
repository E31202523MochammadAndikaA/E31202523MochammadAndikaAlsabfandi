/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangangenapdanganjil;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;


/**
 *
 * @author ANDIKA
 */
public class BilanganGenapDanGanjil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        System.out.println ("===Menampilkan Bilangan Genap dan Ganjil===");
        System.out.println ("===========================================");
        System.out.println("Masukkan Sebuah Bilangan : ");
        int bil;
        bil = input.nextInt();
        
        if (bil%2==0){
        System.out.println ("Bilangan "+bil+" Adalah Bilangan Genap");
        }else{
            System.out.println ("Bilangan "+bil+" Adalah Bilangan Ganjil");
    }
    }
}
