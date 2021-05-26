package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class result {
    public static void res(String s,int x,int y, int z){
        int r=0;
        String[] rom1=new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};//римскими 1,2,3.....9
        String[] rom10=new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};//римскими 10,20,30...100
        // поиск совпадение в строке
        Pattern patt=Pattern.compile("\\+|-|/|\\*");//для проверки введенного оператора
        Pattern pat1=Pattern.compile("\\+");
        Pattern pat2=Pattern.compile("-");
        Pattern pat3=Pattern.compile("\\*");
        Pattern pat4=Pattern.compile("/");
        Matcher matt= patt.matcher(s);
        Matcher mat1= pat1.matcher(s);
        Matcher mat2= pat2.matcher(s);
        Matcher mat3= pat3.matcher(s);
        Matcher mat4= pat4.matcher(s);
        if (mat1.find()) r=x+y;
        if (mat2.find()) r=x-y;
        if (mat3.find()) r=x*y;
        try {
            if (mat4.find()) r = x / y;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Ошибка. Деление на 0");
            return;
        }
        if (!matt.find()) {
            System.out.println("неверный формат ввода данных");
            return;
        }

        if (z==1) System.out.println("Результат=" + r);// для арабских
        if (z==2) {
            if (r > 0) System.out.println("Результат=" + rom10[r / 10] + rom1[r%10]);//римские >0
            if (r < 0) {
                r = -r;
                System.out.println("Результат=-" + rom10[r / 10] + rom1[r% 10]);
            }
            if (r == 0) System.out.println("Результат=0");
        }
    }
}
