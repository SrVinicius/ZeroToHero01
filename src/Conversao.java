import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) throws Exception {
        Scanner re = new Scanner(System.in);
        System.out.println("Digite o valor desejado para a conversao de real X Dolar: ");
        float real = re.nextFloat();
        Scanner dol = new Scanner(System.in);
        System.out.println("Digite a cotacao do dolar atual: ");
        float cotacao = dol.nextFloat();
        System.out.println("O valor informado em reais" + "(" + real + "), " + "sera convertido em dolares, passando a valer: " + real/cotacao + " dolares");

    }
}
