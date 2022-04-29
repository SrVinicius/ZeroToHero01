import java.util.Scanner;

public class Dobro {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero real");
        int valor = in.nextInt();
        System.out.println("O dobro de " + valor + " eh: " + valor*2);
        in.close();

    }
}
