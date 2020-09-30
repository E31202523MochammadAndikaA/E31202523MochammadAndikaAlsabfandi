
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDIKA
 */
public class LuasSegitiga {
   public static BufferedReader Stdin = new BufferedReader (new InputStreamReader (System.in));
   public static void main(String[] args) throws IOException
   {
       System.out.println ("===Menghitung Luas Segitiga===");
       System.out.println ("Masukkan Alas : ");
       String input = Stdin.readLine();
       int a = Integer.parseInt (input);
       System.out.println ("Masukkan Tinggi : ");
       input = Stdin.readLine ();
       int b = Integer.parseInt (input);
       System.out.println ("Luas" +" = "+(a*b/2));
}
}