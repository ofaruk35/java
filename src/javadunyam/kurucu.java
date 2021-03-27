/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadunyam;

/**
 *
 * @author KESKİN
 */
public class kurucu {
    int d1,d2;
    public kurucu()
    {
        d1=0;
        d2=0;
    }
    public kurucu(int a,int b)
    {
        d1=a;
        d2=b;
    }
    public void yaz()
    {
        System.out.print("ilk sayı"+d1);
        System.out.print("ikinci sayı"+d2);
        
    }
    
}
