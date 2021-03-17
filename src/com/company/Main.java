package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "Перевернутая строка";
        StringBuilder strB = new StringBuilder();
        strB.append(str);
        strB.reverse();
        System.out.println(strB);
    }
}
