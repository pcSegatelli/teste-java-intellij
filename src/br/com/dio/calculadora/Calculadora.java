package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        System.out.println("Digite o 1 numero:");
        a = scan.nextInt();
        System.out.println("Digite o 2 numero:");
        b = scan.nextInt();

        int soma = soma(a,b);
        int multiplicacao = multiplicacao(a,b);
        int divisao = divisao(a,b);
        int subtracao = subtracao(a,b);

        System.out.println(soma);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(subtracao);
    }

    public static int soma (int a,int b)
    {
        return a+b;
    }

    public static int subtracao (int a, int b)
    {
        return a-b;
    }

    public static int divisao (int a, int b)
    {
        return (a/b);
    }

    public static int multiplicacao (int a, int b)
    {
        return a * b;
    }
}

