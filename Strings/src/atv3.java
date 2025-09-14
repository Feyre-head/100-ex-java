import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        //Informar uma palavra, usar loop for para percorrer cada posição
        //Utilizar metodo charAt() para obter a letra em cada posição armazenando na var LETRA
        //exibir com SOUT;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String word = sc.nextLine();


        //Converter palavra para um Array de Char
        char[] letters = word.toCharArray();

          //tipo varAuxiliar temporaria que recebe cada item da coleção : estrutura que será percorrida
        for (char letter : letters) {
            System.out.println(letter);
        }
        sc.close();
    }
}
