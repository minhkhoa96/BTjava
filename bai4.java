/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;
import java.util.Scanner;
/**
 *
 * @author Khoa
 */
public class bai4 {
    //gan bien static cho so n;
     public static int n;
     //ham nhap n;
     public static void nhapn()
     {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so n :");
        n= sc.nextInt();
     }
     //1: ham liet ke uoc so cua n;
     public static void lietKe()
        {
           System.out.println("Uoc so cua so " +n+" : ");
           for(int i=1;i<=n;i++)
            {
            if(n%i==0)
                {
                System.out.println(i);
                }
            }
        } 
     //2: ham dem chu so cua n;
     public static void demSo(int n)
     {
        
        int temp =0;
        int x=n;
        while(n>0)
        {
            n=n/10;
            temp++;
        }
        System.out.println("So " +x+ " co "+temp+" chu so ");
         
     }
     //3: ham kiem tra so doi xung n;
     public static void SoDoiXung(int n)
     {
         int temp,r,SoDaoNguoc=0;
         for(temp=n;n!=0;n=n/10)
         {
             r=n%10;
             SoDaoNguoc=SoDaoNguoc*10+r;
         }
         if(temp==SoDaoNguoc)
         {
             System.out.println(temp + " la so doi xung");
         }
         else
         {
             System.out.println(temp +" khong la so doi xung");
         }
     }
     //4 : ham kiem tra so chinh phuong;
     public static void SoChinhPhuong(int n)
     {
      int temp= n;
      double x=0;
      x = x+(Math.sqrt(n));
      if(x*x==temp)
          {
              System.out.println(temp+ " la so chinh phuong.");
          }
          else
          {
              System.out.println(temp+ " khong phai so chinh phuong.");
          }
     }
     //ham main;
    public static void main(String[]args)
    {
          nhapn();
         lietKe();
         demSo(n);
         SoDoiXung(n);
         SoChinhPhuong(n);
       
    }
}
