package com.grevox;

import java.util.Scanner;

class calculator {

    public static float caccamo(){
        float n1;
        float n2;
        System.out.println("Here, put 2 numbers");
        Scanner turetta = new Scanner(System.in);
        n1 = turetta.nextFloat();
        System.out.println("\n");
        n2 = turetta.nextFloat();
        System.out.println("\n now chose an operation:\n[+] [-] [/] [*]\n");
        String wht;
        turetta.nextLine();
        wht = turetta.nextLine();
        turetta.close();
        if(wht.equals("+")){
            return n1+n2;
        }else if (wht.equals("-")){
            if(n1 > n2){
                return n1 - n2;
            }
            return n2-n1;
        }else if (wht.equals("*")){
            return n1*n2;
        }else if (wht.equals("/")){
            if (n1 > n2){
                return n1/n2;
            }
            return n2/n1;
        }else {
            System.out.println("ERROR " + wht);
        }
        return 0;
    }
}
public class Main{
    public static void main (String[] args){
     calculator calc = new calculator();
     float lol = calc.caccamo();
     System.out.println(lol);

    }

}