package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0,b=0, a1=-1, b1=-1;

        System.out.println("введите выражение в одну строку:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.trim(); //удаляет пробельные символы с начала и конца строки

        String [] v = str.split("[\\+-/\\*.,]");  //разделяю строку по символам оператора
        try {
            if (v.length!=2)
                throw new Exception("неверный формат ввода данных");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return;
        }
        // проверка что введены цифры
        if (v[0].matches("\\d+")&& v[1].matches("\\d+")) {
            a=Integer.parseInt(v[0]);//преобразование String в Int
            b=Integer.parseInt(v[1]);
            try {
                if (a>=0&&a<=10&&b>=0&&b<=10)
                {
                    result.res(str,a,b,1);// 1 значит арабские
                    return;
                }
                else
                    throw new Exception("не верный диапазон значений");

            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                return;
            }


        }

        //перевод римских в арабские
        if (romeToarab.rta(v[0])>=0){
            a1=romeToarab.rta(v[0]) ;
        }
        if (romeToarab.rta(v[1])>=0) {
            b1=romeToarab.rta(v[1]) ;
        }

        try {
            if (a1>=0&&b1>=0)
            {
                result.res(str,a1,b1,2);//2 значит римские
                return;
            }
            else
                throw new Exception("не верный диапазон значений");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return;
        }
    }
}

