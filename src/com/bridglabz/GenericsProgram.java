package com.bridglabz;

public class GenericsProgram<T extends Comparable<T>> {
    T x,y,z;
    public GenericsProgram(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T FindMax(){
        return GenericsProgram.FindMax(x,y,z);
    }
    public static <T extends Comparable<T>>T FindMax(T a, T b, T c){
        T max=a;
        if((b.compareTo(max))>0)
        {
            max=b;
        }
        if((c.compareTo(max))>0){
            max=c;
        }
        System.out.println("Maximum of "+a+ ", "+b+" and "+c+ " is: "+max);
        return max;
    }

    public static void main(String[] args) {
        Integer a=10,b=5,c=3;
        Float d = 10.5F ,e=5.5F,f=3.3F;
        String g="Ahubham",h="zhinde",i="tushar";
        System.out.println("******  Using generics  ******");
        new GenericsProgram<Integer>(a,b,c).FindMax();
        new GenericsProgram<Float>(d,e,f).FindMax();
        new GenericsProgram<String>(g,h,i).FindMax();
    }
}
