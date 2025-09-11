import java.util.Scanner;

import static java.lang.Math.pow;

public class atv4 {
    public static void main(String[] args) {
        //Escreva um programa que calcule a média geométrica entre
        // três números informados pelo usuário

        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular a média Geometrica");

        System.out.println("Informe a primeira medida:");
        double num1 = sc.nextDouble();

        System.out.println("Informa segunda medida:");
        double num2 = sc.nextDouble();

        System.out.println("Informe a terceira medida");
        double num3 = sc.nextDouble();

        //calcula raiz cúbida
        double calcForm = Math.pow(num1 * num2 * num3, 1.0/3.0);

        System.out.println("Média Geométrica: " + calcForm);

        sc.close();
    }
}
