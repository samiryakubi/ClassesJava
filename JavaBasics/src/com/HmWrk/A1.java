package com.HmWrk;
class A1{

public int i;

protected int j;

}

class B1 extends A1{

void display(){

super.j = super.i + 1;

System.out.println(super.i + " " + super.j);

}

}

class Inheritance {

public static void main(String args[]){

B1 obj = new B1();

obj.i=1;

obj.j=2;

obj.display();

}

}