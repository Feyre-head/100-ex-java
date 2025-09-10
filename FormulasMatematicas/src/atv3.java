import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        //Crie um programa que calcule e exiba a média aritmética de três notas informadas pelo usuário.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.println("Informe a segunda nota: ");
        int nota2 = sc.nextInt();

        System.out.println("Informe a terceira nota: ");
        int nota3 = sc.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é: " + media);

    }
}
