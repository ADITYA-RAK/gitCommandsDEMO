package com.demo;

public class Arithmetic {
    public int add(int a,int b){
        return a+b;
    }

    public int sub(int x,int y){
        return x-y;
    }
    public int mult(int m,int n) {
        return m*n;
    }
    public int div(int p,int q) {
        return p/q;
    }
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("Adding two number -"+ arithmetic.add(6,9));
        System.out.println("subtracting two numbers - "+ arithmetic.sub(9,5));
        System.out.println("multiplying two numbers - "+ arithmetic.mult(15,12));
        System.out.println("dividing two numbers - "+ arithmetic.div(225,15));
    }

}
