/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cons;

/**
 *
 * @author KESKİN
 */
public class isci extends personel {

    public isci()
    {
        System.out.print("Parametresiz isci çalıştı...");
        
    }
    public isci(int a)
    {
        this();
        System.out.print("parametreli işci çalıştı...");
    }
    public static void main(String[] args) {
        isci ben=new isci(8);
    }
    
}
