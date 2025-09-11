import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        //Crie um programa que leia um vetor de números inteiros e exiba a soma de todos os elementos.

        Scanner sc = new Scanner(System.in);


        int[][] matriz = new int[3][3];
        //    0    1    2
        //0 { 1    2    3}
        //1 { 4    5    6}
        //2 { 7    8    9}

        System.out.println("Digite os Valores da matriz 3x3:");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Digite o valor para a posição: Linha [" + l + "] Coluna [" + c + "] ");
                matriz[l][c] = sc.nextInt();
            }
        }

        //Calculando a soma dos valores diagonal
        int somaDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonal = somaDiagonal + matriz[i][i];
        }

        //Calculando diagonal invertida
        int somaDiagonalInvertida = 0;
        for (int d = 0; d < 3; d++) {
            somaDiagonalInvertida = somaDiagonal + matriz[d][2 - d]; // 2 é o índice máximo
        }

        //Calculando a soma de todos os valores
        int somaTotalMatriz = 0;
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                somaTotalMatriz = somaTotalMatriz + matriz[l][c];
            }
        }

        System.out.println("Soma = " + somaDiagonal);
        System.out.println("Soma Diagonal Invertida" + somaDiagonalInvertida);
        System.out.println("Soma Total = " + somaTotalMatriz);

    }
}
