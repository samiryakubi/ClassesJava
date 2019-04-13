package com.class18;

public class Calculator {
	public int sum(int a, int b, int c) {
        return(a+b+c);
        
    }
    
    public int average(int a, int b, int c) {
        return(a+b+c)/3;
        
    }
    
    public int min(int a, int b, int c) {
        
        int min = a;
        
        if(b<a) {
            min = b;
        }
        if(c<min) {
            min = c;
        }
            
        return min;
        
    }
    
    public int max(int a, int b, int c) {
        int max = a;
        
        if(b>a) {
            max = b;
        }
        if(c>max) {
            max = c;
        }
            
        return max;
        
    }
    
    

}