/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Quang
 */
public class bai8 {
    public static int doanSo(int t, int n, int hideNumber){
        Scanner sc = new Scanner(System.in);
        int a=0;
        while(true){
            System.out.println("So ban doan la : ");
            int x = sc.nextInt();
            a++;
            if(x == hideNumber){
                System.out.println("Ban da chien thang");
                break;
            }
            else if(x > n || x <t){
               System.out.println(" Nhap lai : ");
               return doanSo(t,n,hideNumber);
            }
            else if(x > hideNumber){
                n = x;
                System.out.println("too large \n"+"("+t+","+n+")");
            }
            else if(x < hideNumber){
                t=x;
                System.out.println("too small \n"+"("+t+","+n+")");    
            }
        }
        return a;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        int n = generator.nextInt(2000);
         int t=0;
        System.out.println("run: \n" +"["+t+","+n+"]");
        int hideNumber = generator.nextInt(n);
        int count=doanSo(t,n,hideNumber);
        System.out.println("Ban da doan  "+ count + " lan de chien thang");
    }
  
}
