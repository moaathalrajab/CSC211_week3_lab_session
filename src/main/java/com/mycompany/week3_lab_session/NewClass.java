
package com.mycompany.week3_lab_session;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewClass {
    
    
    boolean isPrime(int n){
       
        for(int i=2; i<n; i++){
            if(n%i == 0) 
            {
                return false;
            }  
        }
        return true;
    }

    int getPrimeSum(int[] nums){
        int sm=0;
        for(int i=0; i<nums.length; i++){
            if(isPrime(nums[i])){
                sm+=nums[i];
            }
        }
        return sm;
    }
    
    int[] getArrayFromFile(String fl) throws FileNotFoundException{
        Scanner sc=new Scanner(new File(fl));
        while(sc.hasNext()){
            
        }
        int[] arr=new int[10];
        
        return arr;
    }
    
    public static void main(String[] args) {
        NewClass nc= new NewClass();
        int[] arr={3,4,8,7,9,10,12,5,11};
        
        int sum= nc.getPrimeSum(arr);
        System.out.println("The sum of the primes in the array is "+ sum ); 
    }
}
