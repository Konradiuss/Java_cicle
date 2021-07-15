package com.company;

public class Main {

    public static void main(String[] args) {
        ////////////////##////////////////
        double a, b, x, n;

        a = Math.round(Math.random() * 15);
        b = Math.round(Math.random() * 25);
        x = Math.round(Math.random() * 35);
        n = Math.round(Math.random() * 45);

        System.out.println(" A = " + a);
        System.out.println(" B = " + b);
        System.out.println(" X = " + x);
        System.out.println(" N = " + n);

        ////////////////#2////////////////
        System.out.println("////////////////#2////////////////");
        double res;

        for (x = 1; x <= 5; x+=0.5 ){

            res = a * (x*x) + b;
            System.out.println("Result = " + res);
        }
        ////////////////#3////////////////
        System.out.println("////////////////#3////////////////");

        int num1 = 0, num2 = 0;

        while(n>0)
        {   if(n%10==b) num1++;
            if(n%10==a) num2++;
            n/=10;}

        if(num1>num2){
        System.out.println("Да, верно.");
        }else{
            System.out.println("Нет, не верно");
        }
        ////////////////#7////////////////
        System.out.println("////////////////#7////////////////");

        num1 = 0;
        int ii = 100;
        while (num1 <= 15) {


            if(ii % 19 == 0){
                ++num1;
                System.out.println("На 19 делится: " + ii);
                           }
            ++ii;
        }

        ////////////////#8////////////////
        System.out.println("////////////////#8////////////////");

        num1 = 0;
        int jj = 500;
        while (num1 <= 20) {


            if(jj % 13 == 0 || jj % 17 == 0){
                ++num1;
                System.out.println("На 17 или 13 делится: " + jj);
            }
            ++jj;
        }

        ////////////////#10////////////////
        System.out.println("////////////////#10////////////////");

        num1 = 1;
        num2 = 0;

        for(num2 = 0; num2 <= 10; ){
            int prg = 1;
            while (num2 <= 10){

                System.out.println("Число прогрессии: " + prg);
                prg = prg + 4;
                num1 = num1 + prg;
                num2++;
            }

        }
        System.out.println("Финальная сумма: " + num1);

        ////////////////#11////////////////
        System.out.println("////////////////#11////////////////");
        int rectangle = 5;
        for (int i = 0; i <= rectangle; i++){

            //Левое пустое пространство
            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            //Левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++){
                System.out.print("+");
            }

            //Правая часть треугольника
            for (int j = 0; j < i; j++){
                System.out.print("+");
            }

            //Правое пустое пространство
            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            System.out.println(" ");
        }

    }
}
