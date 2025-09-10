import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        //Escreva um programa que calcule a média aritmética de dois números.

        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular a Média de 2 Números");
        System.out.println("Informe o primeiro número");
        int numero1 = sc.nextInt();

        System.out.println("Informe o segundo número");
        int numero2 = sc.nextInt();

        int media = (numero1 + numero2) / 2;

        System.out.println("A média de " + numero1 + " e " + numero2 + " = " + media);
    }
}
