/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad3;
import java.util.Scanner;

/**
 *
 * @author Dominik
 */
public class Complex {
    
    public static double[] liczba1 = new double[2];
    public static double[] liczba2 = new double[2];
    Scanner odczyt = new Scanner(System.in);
    
    public Complex ()
    {
        System.out.println("Format podawania liczby - a + bi, gdzie a - pierwszy wspolczynnik, b - drugi wspolczynnik liczby zespolonej");
        System.out.println("Prosze podac wspolczynniki pierwszej liczby");
        liczba1[0] = odczyt.nextDouble();
        liczba1[1] = odczyt.nextDouble();
        
        System.out.println("Prosze podac wspolczynniki drugiej liczby");
        liczba2[0] = odczyt.nextDouble();
        liczba2[1] = odczyt.nextDouble();
    }
    
    public static void modul()
    {
        double wynik;
        wynik = Math.sqrt(Math.pow(liczba1[0],2)+Math.pow(liczba1[1],2));
        System.out.println("Modul pierwszej liczby : " + wynik);
        
        wynik = Math.sqrt(Math.pow(liczba2[0],2)+Math.pow(liczba2[1],2));
        System.out.println("Modul drugiej liczby : " + wynik);
    }
    
    public static void sprezenie()
    {
        double[] wynik = new double[2];
        wynik[0] = liczba1[0];
        wynik[1] = -1*liczba1[1];
        System.out.println("Sprezenie pierwszej liczby : " + wynik[0] + " + " + wynik[1] + "i");
        
        wynik[0] = liczba2[0];
        wynik[1] = -1*liczba2[1];
        System.out.println("Sprezenie pierwszej liczby : " + wynik[0] + " + " + wynik[1] + "i");
    }
    
    public static void postac_wykladnicza()
    {
        double modul = Math.sqrt(Math.pow(liczba1[0],2)+Math.pow(liczba1[1],2));
        double cos = Math.cos(liczba1[0]/modul);
        double sin = Math.sin(liczba1[1]/modul);
        modul = Math.abs(modul);
        
        double radians = Math.toRadians(sin);
        
        System.out.println(modul+"e^"+radians+"i");
    }
    
    public static void dod_alg()
    {
        double a = liczba1[0]+liczba2[0];
        double b = liczba1[1]+liczba2[1];
        
        System.out.println(a + " + " + b + "i");
    }
    
    public static void odejm_alg()
    {
        double a = liczba1[0]-liczba2[0];
        double b = liczba1[1]-liczba2[1];
        
        System.out.println(a + " + " + b + "i");
    }
    
    public static void mnoz_alg()
    {
        double a = liczba1[0]*liczba1[1]-liczba2[0]*liczba2[1];
        double b = liczba1[0]*liczba2[1]+liczba1[1]*liczba2[0];
        
        System.out.println(a + " + " + b + "i");
    }
    
    public static void dziel_alg()
    {
        if(liczba1[1]!=0 && liczba2[1]!=0)
        {
        double a = (liczba1[0]*liczba1[1]+liczba2[0]*liczba2[1])/(Math.pow(liczba1[1],2)+Math.pow(liczba2[1],2));
        double b = (liczba2[0]*liczba1[1]-liczba1[0]*liczba2[1])/(Math.pow(liczba1[1],2)+Math.pow(liczba2[1],2));
  
        System.out.println(a + " + " + b + "i");
        }
        else
            System.out.println("Proba dzielenia przez 0");
        
    }
    
    
}
