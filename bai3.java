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
public class bai3 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        int a,b,c;
        System.out.println("Nhap canh a : ");
        a = sc.nextInt();
        System.out.println("Nhap canh b : ");
        b = sc.nextInt();
        System.out.println("Nhap canh c : ");
        c = sc.nextInt();
        double p = (a+b+c)/2;//p la nua chu vi
        double ChuVi =(a+b+c);
        double DienTich = (Math.sqrt((p+a)+(p+b)+(p+c)));
        System.out.println("Chu vi tam giac : "+ChuVi);
        System.out.println("Dien tich tam giac : "+DienTich);
    }
}
