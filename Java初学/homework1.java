package com.java;

public class homework1 {
    public static void main(String[] args){
        //企业发放的奖金根据利润提出。当利润低于或等于10万元时，奖金可提10%；
        // 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
        // 利润在20万元到40万元之间时，高于20万元的部分，可提成5%；
        // 利润在40万元到60万元之间时，高于40万元的部分，可提成3%；
        // 利润在60万元到100万元之间时，高于60万元的部分，可提成1.5%；
        // 高于100万元时，超过100万元的按1%提成。编写一个程序，从键盘输入利润，求应发奖金数目。

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("请输入利润(单位：万元)：");
        double profit = input.nextDouble();
        double bonus = 0;

        if(profit < 0){
            System.out.println("输入的数据有误");
            return;
        }

        if(0 <= profit && profit <= 10){
            bonus = profit * 0.1;
        }
        if(10 < profit && profit <= 20){
            bonus = profit * 0.1 + (profit - 10) * 0.075;
        }
        if(20 < profit && profit <= 40){
            bonus = 10 * 0.1 + 10 * 0.075 + (profit - 20) * 0.05;
        }
        if(40 < profit && profit <= 60){
            bonus = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (profit - 40) * 0.03;
        }
        if(60 < profit && profit <= 100){
            bonus = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (profit - 60) * 0.015;
        }
        if(profit > 100){
            bonus = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + 40 * 0.015 + (profit - 100) * 0.01;
        }
        System.out.print("企业发放的奖金为：" + bonus + "万元");
        }
    }
