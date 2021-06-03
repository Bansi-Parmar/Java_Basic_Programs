/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic_operation;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Arithmetic_operation {

    int n1,n2;
   void getdata(){
 		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value 1 :-  ");
        n1 = sc.nextInt();
        
        System.out.print("Enter value 2 :-  ");
        n2 = sc.nextInt();
 		
 	}
 	void showdata(){
        System.out.println("Addition of "+n1+" + "+n2+" is :- "+(n1+n2));
        System.out.println("Subtraction "+n1+" - "+n2+" is :- "+(n1-n2));
        System.out.println("Multiplications "+n1+" * "+n2+" is :- "+(n1*n2));
        System.out.println("Division "+n1+" / "+n2+" is :- "+(n1/n2));
    }
 	public static void main (String[] args) {
 		Arithmetic_operation s1=new Arithmetic_operation();
 		s1.getdata();
 		s1.showdata();
}
    
}
