import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());


        if (idade >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not an adult");
        }
    }

    public static String input(String msgDisplay) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msgDisplay);
        return scanner.nextLine().trim();
    }
}
