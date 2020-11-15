package com.company;

public class Calc {
    public int convert(int num){
        int numberSystem = 9;
        String resultNum = "";
        while (num > 0){
            resultNum = Integer.toString(num % numberSystem) + resultNum;
            num /= numberSystem;
        }
        return Integer.parseInt(resultNum);
    }
}
