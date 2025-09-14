import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {

        //Ler 2 palavras e concatenar Scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String firstWord = sc.nextLine();

        System.out.println("Digite a segunda palavra:Te");
        String secondWord = sc.nextLine();

        String result = firstWord + " " + secondWord;

        System.out.println("Concatenação: " + result);


        sc.close();
    }
}
