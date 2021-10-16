/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Khoa
 */
public class bai7 {
    public static int m;
    public static int []a ={2,7,20,6,10,99};
    public static int []b;
    public static int []c;
    //mang a 
     public static void mangA()
     {
       
        Scanner sc = new Scanner (System.in);
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("Mang a = "+Arrays.toString(a));
        
     }
     //1+2 : nhap mang b va xuat mang b voi Arrays.toString()
     public static void mangB()
     {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so m :");
        m= sc.nextInt();
        //khoi tao mang B
        b= new int[m];
        //khoang random
        int min= 1;
        int max= 9999;
        int range= max-min +1;
        for(int i=0;i<m;i++)
        {
           
            b[i]=(int)(Math.random()*range)+min;
                     
        }
        System.out.println("Mang b = "+Arrays.toString(b));
     }
     
     //3 copyofRange de khoi tao mang c tu mang a
     public static void mangC1()
     {
        c =Arrays.copyOfRange(a, 0, a.length);
         System.out.println("Mang c ="+Arrays.toString(c));
     }
     //4 System.arraycopy() 3 phan tu cuoi cua mang b la 3 phan tu dau cua mang a
     public static void mangC2()
     {
        
         m=m-3;
         System.arraycopy(b,m, c,0,3);
         System.out.println("Mang c="+Arrays.toString(c));
     }
     //5 : sap xep mang c voi Arrays.sort()
     public static void sapXepMangC()
     {
       Arrays.sort(c);
       System.out.println("Mang c sap xep tang dan :" +Arrays.toString(c));
     }
     //ham main
      public static void main(String[]args)
    {
        mangA();
        mangB();
        mangC1();
        mangC2();
        sapXepMangC(); 
             
    }
    
}
