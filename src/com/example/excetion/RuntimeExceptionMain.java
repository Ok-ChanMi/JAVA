package com.example.excetion;

public class RuntimeExceptionMain {
    public static void main(String[] args){
        try{
            makeExceptions();
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }


    }
    public static void makeExceptions(){
        makeException1(10);
        makeException2();
        makeException3();
        makeException4();
        makeException5();
        makeException6();
        makeException7();
        makeException8();

    }
    public static int makeException1(int input){
        int div = input / 0; //java.lang.ArithmeticException: / by zero
        return div;
    }
    public static void makeException2(){
        String a="a";
        System.out.println(a.charAt(1));   // java.lang.StringIndexOutOfBoundsException: String index out of range: 1
    }
    public static void makeException3(){
        int [] a={1,2,3,4,5};
        System.out.println(a[5]);  // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
    public static void makeException4(){
        String nothing=null;
        System.out.println(nothing.split("")); // java.lang.NullPointerException: Cannot invoke "String.split(String)" because "nothing" is null
    }
    public static void makeException5(){
        String str = "abc";
        int a = Integer.parseInt(str); // java.lang.NumberFormatException: For input string: "abc"
    }
    public static void makeException6(){
        for(int i=0; i<Integer.MAX_VALUE; i++){
            makeException6(); // RuntimeExceptionMain.makeException6(RuntimeExceptionMain.java:36)
        }
    }
    public static void makeException7(){
        Object[] objArr = new String[2];
        objArr[0] = 0;  // java.lang.ArrayStoreException: java.lang.Integer
    }
    public static void makeException8(){
        Object[] ObjArr = new String[2];
        ObjArr[0] = "abc";
        Integer i = (Integer) ObjArr[0];  // ClassCastException
    }
}

