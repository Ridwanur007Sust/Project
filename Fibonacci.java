/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author User
 */
public class Fibonacci {
    static int Fib (int n){
    if(n<=1){
        return n;
    }
    else{
    return Fib (n-1) + Fib (n-2);
    }
    }
    public static void main(String args[]){
        int n = 9;
        System.out.println(Fib(n));
    }
    
}
