import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        //Escreva um programa que solicite ao usuário dois números e exiba a soma,
        // subtração, multiplicação e divisão entre eles.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        int numero1 = sc.nextInt();

        System.out.println("Informe o segundo número:");
        int numero2 = sc.nextInt();

        int somaAdicao = numero1 + numero2;
        int somaSubtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println("Soma: " + numero1 + " + " + numero2 + " = " + somaAdicao);
        System.out.println("Subtração: " + numero1 + " - " + numero2 + " = " + somaSubtracao);
        System.out.println("Multiplicação: " + numero1 + " * " + numero2 + " = " + multiplicacao);
        System.out.println("Divisão: " + numero1 + " / " + numero2 + " = " + divisao);
        System.out.println("Resto da Divisão: " + numero1 + " / " + numero2 + " = " + resto);

    }
}


