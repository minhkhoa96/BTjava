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
public class bai5 {
public static String chuoiS1 ;
public static String chuoiS2 ;

//ham nhap chuoi  
public static void nhapChuoi()
{
    Scanner sc = new Scanner (System.in);
    System.out.println("Nhap chuoi S1 :");
        chuoiS1 = sc.nextLine();
    System.out.println("Nhap chuoi S2 :");
        chuoiS2 = sc.nextLine();
}
//1: ham tinh tong chieu dai
public static void tongChieuDai()
{
    int length=chuoiS1.length()+chuoiS2.length();
    System.out.println("Tong chieu dai chuoi S1 : "+chuoiS1.length());
    System.out.println("Tong chieu dai chuoi S2 : "+chuoiS2.length());
    System.out.println("Tong chieu dai 2 chuoi S1 va S2 : "+length);
}
 //2: lay 3 ki tu dau tien cua chuoi s1
public static void kyTuDauTien ()
{
    char kyTu1;
    System.out.println(" 3 ky tu dau tien cua chuoi S1: ");
    for(int i=0;i<chuoiS1.length();i++)
    {
     kyTu1=chuoiS1.charAt(i);
     
     if(i<3)
     {
         System.out.println(" "+kyTu1);
     }
     else{}
    }
}
//3: lay 3 ky tu cuoi cua chuoi S2
public static void kyTuCuoiCung ()
{
    char kyTu2;
    StringBuilder reverse= new StringBuilder(chuoiS2);
    reverse.reverse().toString();//dao nguoc chuoiS2

    System.out.println(" 3 ky tu cuoi cung cua chuoi S2: ");
    for(int i=0;i<reverse.length();i++)
    {
     kyTu2=reverse.charAt(i);
     
     if(i<3)
     {
         System.out.println(" "+kyTu2);
     }
     else{}
    }
}
 //4: lay ki tu thu 6 cua chuoi s1
public static void kyTuThuSau ()
{
    char kyTu1;
    System.out.println("Ky tu thu 6 cua chuoi S1: ");
    if(chuoiS1.length()<6)
    {System.out.println("not found");}
    else{
    for(int i=0;i<chuoiS1.length();i++)
    {
     kyTu1=chuoiS1.charAt(i);
     if(i==5)
     {
         System.out.println(" "+kyTu1);
     }
     else{System.out.println("");}
    }
    }
    
}
  //5 kiem tra chuoi S1 va S2 co bang nhau khong
public static void soSanh()
{
    if(chuoiS1.length()==chuoiS2.length())
    {
          System.out.println("S1 = S2");
    }
    else 
    {
        if(chuoiS1.length()>chuoiS2.length())
        {
            System.out.println("S1>S2");
        }
        else
            {
                System.out.println("S1<S2");
            }
    }
    
}
//6 S2 co xuat hien trong S1 khong? vi tri?
public static void kiemTraChuoi()
{
    if(chuoiS1.length()==chuoiS2.length())
    {
         if(chuoiS1.contains(chuoiS2))
         {
             System.out.println("2 chuoi bang nhau :"+chuoiS1);
         } else {}
    }
    else 
    {
        if(chuoiS1.length()>chuoiS2.length())
        {
            if(chuoiS1.contains(chuoiS2))
            { 
            System.out.println("co xuat hien");
            
            }
        }
        else
            {
                System.out.println("chuoi S2 khong xuat hien trong chuoi S1");
            }
    }
    
}
//ham main
    public static void main(String[]args)
    {
        nhapChuoi();
        tongChieuDai();
        kyTuDauTien();
        kyTuCuoiCung();
        kyTuThuSau();
        soSanh();
        kiemTraChuoi();
    }
    
}

