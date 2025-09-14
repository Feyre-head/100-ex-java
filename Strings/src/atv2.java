import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        //receber uma palavra e exibir cada letra separada (for)

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String fullWord = sc.nextLine();

        for(int i = 0 ; i< fullWord.length(); i++){
            //charAt(i) retorna cada letra de cada index da palavra
            char separate = fullWord.charAt(i);
            System.out.println(separate);
        }

        sc.close();

    }
}
