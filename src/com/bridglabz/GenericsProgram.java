package com.bridglabz;

public class GenericsProgram {
    public void FindMaxInt(Integer a, Integer b, Integer c) {
        int max = a;
        if ((b.compareTo(max)) > 0) {
            max = b;
        }
        if ((c.compareTo(max)) > 0) {
            max = c;
        }
        System.out.println("Maximum of " + a + "," + b + " and " + c + " is: " + max);

    }

    public static void main(String[] args) {
        GenericsProgram genericsProgram = new GenericsProgram();
        Integer a = 10, b = 5, c = 3;
        System.out.println("********  Integer values  ********");
        // test case 1 :- Given Max Number at 1st Position return the Same Number
        genericsProgram.FindMaxInt(a, b, c);
        // test case 2 :- Given Max Number at 2nd Position return the Same Number
        genericsProgram.FindMaxInt(b, a, c);
        // test case 3 :- Given Max Number at 3rd Position return the Same Number
        genericsProgram.FindMaxInt(c, b, a);

    }
}
