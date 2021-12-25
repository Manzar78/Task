/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Rectangle implements Shape {
    Scanner sc = new Scanner(System.in);

    @Override
    public void Shape() {
        System.out.println("I am Rectangle");
    }
    
    void perameter(){
        System.out.println("I have length and width");
    
    }
    void Calculation(){
        System.out.println("Enter Length");
        int a = sc.nextInt();
        System.out.println("Enter Width");
        int b = sc.nextInt();
        System.out.println(2*(a*b));
        
    }
    
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.Shape();
        obj.perameter();
        obj.Calculation();
    }
}
