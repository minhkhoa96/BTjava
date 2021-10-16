/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author Khoa
 */
public class bai6 {
    public static Calendar a;
    public static int ngayA;
    public static int thangA;
    public static int namA;
    
    public static Calendar b;
    public static int ngayB;
    public static int thangB;
    public static int namB;
    
    public static int min=1;
    public static int max=0;
    

    //ham nhap a va b
    public static void nhapNgayA()
    {
                System.out.println("Nhap nam/thang/ ngay cho a :");
                kiemTraA();
        if(ngayA>max||thangA>12)
        {
           System.out.println("loi "); 
        }
        else{
        a= Calendar.getInstance();
        a.set(ngayA,thangA,namA);
        System.out.print("a: Ngay "+ngayA+"/Thang "+thangA+"/nam "+namA);
        System.out.println("");
        }
    }
     public static void nhapNgayB()
    {
                System.out.println("Nhap nam/thang/ ngay cho b :");
                kiemTraB();
        if(ngayB>max||thangB>12)
        {
           System.out.println("loi "); 
        }
        else{
        b= Calendar.getInstance();
        b.set(ngayB,thangB,namB);
        System.out.print("b: Ngay "+ngayB+"/Thang "+thangB+"/nam "+namB);
        System.out.println("");
        }
    }
     
    //1: so sanh hai ngay a va b
    public static void soSanh()
    {
        System.out.println("So sanh ngay a va b : ");
        if(namA<namB)
        {
            System.out.println("a<b");
        }
        else
        {
            if(namA>namB)
            {System.out.println("a>b");}
            else
            {
                if(thangA<thangB)
                {System.out.println("a<b");}
                else
                {
                    if(thangA>thangB)
                    {System.out.println("a>b");}
                    else
                    {
                        if(ngayA<ngayB)
                        {System.out.println("a<b");}
                        else
                        {
                            if(ngayA>ngayB)
                            {System.out.println("a>b");}
                            else{System.out.println("a=b");}
                        }
                    }
                }
                            
            }
        }
        
    }
    //kiem tra ngay a
    public static void kiemTraA()
    {
        Scanner sc = new Scanner (System.in);
        namA = sc.nextInt();        
        
        if(namA%400==0||(namA%4==0&&namA%100!=0))
        {
           
            System.out.println("Nam nhuan ");
            System.out.println("nhap thang : ");
            thangA=sc.nextInt();
            switch(thangA)
            {
                case 1,3,5,7,8,10,12:
                    max=max+31;
                    System.out.println("nhap ngay :");
                    ngayA=sc.nextInt();
                    break;
                     
                case 4,6,9,11:
                    max=max+30;
                    System.out.println("nhap ngay :");
                    ngayA=sc.nextInt();
                    break;
                    
                case 2:
                    max=max+29;
                    System.out.println("nhap ngay :");
                    ngayA=sc.nextInt();
                    
                    break;
            }
            
        
        }
        else{
            System.out.println("Nam khong nhuan ");
            System.out.println("nhap thang : ");
                thangA=sc.nextInt();
                switch(thangA)
            {
                case 1,3,5,7,8,10,12:
                    max=max+31;
                    System.out.println("nhap ngay :");
                    ngayA=sc.nextInt();
                    break;
                     
                case 4,6,9,11:
                    max=max+30;
                    System.out.println("nhap ngay :");
                    ngayA=sc.nextInt();
                    break;
                    
                case 2:
                    max=max+28;
                    System.out.println("nhap ngay :");
                    ngayA=sc.nextInt();
                    
                    break;
            }
            }
      
    }
    public static void kiemTraB()
    {
        Scanner sc = new Scanner (System.in);
        namB = sc.nextInt();        
        
        if(namB%400==0||(namB%4==0&&namB%100!=0))
        {
           
            System.out.println("Nam nhuan ");
            System.out.println("nhap thang : ");
            thangB=sc.nextInt();
            switch(thangB)
            {
                case 1,3,5,7,8,10,12:
                    max=max+31;
                    System.out.println("nhap ngay :");
                    ngayB=sc.nextInt();
                    break;
                     
                case 4,6,9,11:
                    max=max+30;
                    System.out.println("nhap ngay :");
                    ngayB=sc.nextInt();
                    break;
                    
                case 2:
                    max=max+29;
                    System.out.println("nhap ngay :");
                    ngayB=sc.nextInt();
                    break;
            }
            
        
        }
        else{
            System.out.println("Nam khong nhuan ");
            System.out.println("nhap thang : ");
                thangB=sc.nextInt();
                switch(thangB)
            {
                case 1,3,5,7,8,10,12:
                    max=max+31;
                    System.out.println("nhap ngay :");
                    ngayB=sc.nextInt();
                    break;
                     
                case 4,6,9,11:
                    max=max+30;
                    System.out.println("nhap ngay :");
                    ngayB=sc.nextInt();
                    break;
                    
                case 2:
                    max=max+28;
                    System.out.println("nhap ngay :");
                    ngayB=sc.nextInt();
                    break;
            }
            }
 
    }
    //2: in ra ngay truoc cua a
    public static void ngayTruoc()
    {
        int ngayTruoc=ngayA-1;
        int thangTruoc=thangA;
        int namTruoc=namA;
        
        if(namA%400==0||(namA%4==0&&namA%100!=0))
        {
           
            System.out.println("Nam nhuan ");
            
            if(ngayTruoc==0){
            switch(thangA)
            {
                case 2,4,6,8,9,11:
                    ngayTruoc=31;
                    thangTruoc=thangA-1;
                                      
                    break;
                     
                case 5,7,10,12:
                    ngayTruoc=30;
                    thangTruoc=thangA-1;
                    break;
                    
                case 1:
                    ngayTruoc=31;
                    thangTruoc=12;
                    namTruoc=namA-1;
                                      
                    break;
                case 3:
                    ngayTruoc=29;
                    thangTruoc=thangA-1;
                    break;
            }
            }
            else {}
            
        
        }
            
        else{
            System.out.println("Nam khong nhuan ");
                      
            if(ngayTruoc==0){
            switch(thangA)
            {
                case 2,4,6,8,9,11:
                    ngayTruoc=31;
                    thangTruoc=thangA-1;
                                      
                    break;
                     
                case 5,7,10,12:
                    ngayTruoc=30;
                    thangTruoc=thangA-1;
                    break;
                    
                case 1:
                    ngayTruoc=31;
                    thangTruoc=12;
                    namTruoc=namA-1;
                                      
                    break;
                case 3:
                    ngayTruoc=28;
                    thangTruoc=thangA-1;
                    break;
            }
        
          
        
                }
           
            }
        
         a.set(ngayTruoc,thangTruoc,namTruoc);
        System.out.print("Ngay truoc cua ngay a là : "+ngayTruoc+"/Thang "+thangTruoc+"/nam "+namTruoc);
        System.out.println(""); 
        
          
    }
    //2: in ra ngay sau cua a
    public static void ngaySau()
    {
        int ngaySau=ngayA+1;
        int thangSau=thangA;
        int namSau=namA;
        if(namA%400==0||(namA%4==0&&namA%100!=0))
        {
           
            System.out.println("Nam nhuan ");
            
            if(ngaySau>28){
            switch(thangSau)
            {
                case 1,3,5,7,8,10:
                    if(ngaySau>31)
                    {
                        ngaySau=1;
                        thangSau=thangA+1;
                    }
                                    
                    break;
                     
                case 4,6,9,11:
                    if(ngayA>30)
                    {
                        ngaySau=1;
                        thangSau=thangA+1;
                    }
                    
                    break;
                    
                case 12:
                    if(ngaySau>31)
                    {
                        ngaySau=1;
                        thangSau=1;
                        namSau=namA+1;
                    }
                                                     
                    break;
                case 2:
                    if(ngaySau>30)
                    {
                        ngaySau=1;
                        thangSau=thangA+1;
                    }
                
                    break;
            }
            }
            }
        
            
        else{
            System.out.println("Nam khong nhuan ");
                      
            if(ngaySau>=28){
            switch(thangA)
            {
                case 1,3,5,7,8,10:
                    if(ngaySau>31)
                    {
                        ngaySau=1;
                        thangSau=thangA+1;
                    }
                                    
                    break;
                     
                case 4,6,9,11:
                    if(ngaySau>30)
                    {
                        ngaySau=1;
                        thangSau=thangA+1;
                    }
                    
                    break;
                    
                case 12:
                    if(ngaySau>31)
                    {
                        ngaySau=1;
                        thangSau=1;
                        namSau=namA+1;
                    }
                                                     
                    break;
                case 2:
                    if(ngaySau>28)
                    {
                        ngaySau=1;
                        thangSau=thangA+1;
                    }
                
                    break;
                }
            }
        }
       
        a.set(ngaySau,thangSau,namSau);
        System.out.print("Ngay sau cua ngay a là : ngay "+ngaySau+"/Thang "+thangSau+"/nam "+namSau);
        System.out.println("");   
        
    }
    
    //3: ngay a la ngay thu ? trong nam
    public static void ngayTrongNam()
    {
        int thangTrongNam=thangA;
        int ngayTrongNam=ngayA;
        if(ngayTrongNam==1)
        {
            ngayTrongNam=ngayA;
        }
        else
        {
            thangTrongNam=thangA-1;
            ngayTrongNam=thangTrongNam*30+ngayA;
        }
        System.out.println("Ngay a la ngay thu "+ ngayTrongNam+" trong nam "+namA);
        
    }
    
    //4: thang a co chua ? ngay
     public static void ngayTrongThang()
    {
        
        int ngayTrongThang=0;
        switch (thangA)
        {
            case 1,3,5,7,8,10,12 :
                ngayTrongThang=31;
                break;
            case 4,6,9,11:
                ngayTrongThang=30;
                break;
            case 2:
                if(namA%400==0||(namA%4==0&&namA%100!=0))
                        {
                           ngayTrongThang=29; 
                        }
                else {ngayTrongThang=28;}
                break;
                
        }
        System.out.println("a: Ngay "+ ngayA+" thang "+thangA+" nam "+namA+",thang "+thangA+" co :"+ngayTrongThang+"ngay");
        
    }
     //kiem tra nam
     public static void kiemTraNam()
     {
         if(namA%400==0||(namA%4==0&&namA%100!=0))
                        {
                           System.out.println("Nam chua a la nam nhuan");
                        }
                else {System.out.println("Nam chua a khong phai nam nhuan");}
         
     }
    //ham main
    public static void main (String []args)
    {
        nhapNgayA();
        nhapNgayB();
        soSanh();
        ngayTruoc();
        ngaySau();
        ngayTrongNam();
        ngayTrongThang();
        kiemTraNam();
      
    }
    
}
