package com.example.ex;

public class Q11 {
    public static void main(String[] args) {
        String st = "a:b:c:d";
        String[] temp = st.split(":");
        System.out.println(String.join("#", temp));
    }
}
