import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        //Crie um programa que leia um vetor de números inteiros e exiba a soma de todos os elementos.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Tamanho do vetor: ");
        int t = sc.nextInt();

        //Cria o vetor e armazena o tamnho nele
        int[] vetor = new int[t];

        System.out.println("Digite os elementos do vetor:");
        for (int c = 0 ; c < t ; c++){
            vetor[c] = sc.nextInt();
        }


        int soma = 0;
        for (int i = 0 ; i < t ; i++){
            soma = soma + vetor[i];
        }

        System.out.println("A soma dos elementos é: " + soma);
    }
}
