/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.to.find.number.is.odd.or.even;

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class ToFindNumberIsOddOrEven {

    int n=0;
    
    void cal(){
        if(n%2==0){
            System.out.println(n+" is Even...");
        }
        else{
            System.out.println(n+" is Even...");
        }
    }
    
    void get_data()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number :- ");
        n = sc.nextInt();
    }
    public static void main(String[] args) {
        ToFindNumberIsOddOrEven obj = new ToFindNumberIsOddOrEven();
        
        obj.get_data();
        obj.cal();
    }
    
}
