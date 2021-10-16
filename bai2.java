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
public class bai2 {
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap n");
        int n = sc.nextInt();
        
        System.out.println("Nhap x");
        int x = sc.nextInt();
        
        double S=0;
        int l =0;
        for(int i=1;i<=n;i++)
        {
            l=l+i;
            S=S+((Math.pow(x,i))/l);
        }
        System.out.println("S= "+S);
        
    }
    
}
