import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Ola! por favor, insira o numero total de vendas do vendedor: ");
        int totalvendas = in.nextInt();
        System.out.println("O valor da comissao do vendedor, baseada em seu total de vendas eh: " + totalvendas/10 + " reais! ");
        in.close();
    }
}
