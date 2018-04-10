package pl.edu.ur.oopl6.zad1;

public class Figury {
    
    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }
    
    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        return (Math.round(100*(Math.PI*Math.pow(r,2))))/100;
    }
    
    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return Math.round(100*(2*Math.PI*r))/100;
    }
    
    public static double PoleKwadratu(double a)
    {
        return (Math.round(100*(Math.pow(a, 2))))/100;
    }
    
    public static double ObwodKwadratu(double a)
    {
        return Math.round(100*(4*a))/100;
    }
    
    public static double PoleProst(double a, double b)
    {
        return Math.round(100*(a*b))/100;
    }
    
    public static double ObwodProst(double a, double b)
    {
        return Math.round(100*(2*a+2*b))/100;
    }
    
    public static double PoleStozka(double r, double l)
    {
        return Math.round(100*(Math.PI*r*(r+l)))/100;
    }
    
    public static double ObjetoscStozka(double r, double H)
    {
        return Math.round(100*(Math.PI*Math.pow(r,2)*H)/3)/100;
    }
    
    public static double PoleWalca(double r, double h)
    {
        return Math.round(100*(2*Math.PI*r*(r+h)))/100;
    }
    
    public static double ObjetoscWalca(double r, double h)
    {
        return Math.round(100*(Math.PI*Math.pow(r,2)*h))/100;
    }
    
    
    
    
}
