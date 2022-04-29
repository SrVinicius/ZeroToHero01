import java.util.Scanner;

public class ValorFinal {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Favor informar o valor da compra: ");
        float valor = in.nextFloat();
        Scanner desc = new Scanner(System.in);
        System.out.println("Favor informar o percentual de desconto(entre 0 e 1): ");
        float desconto = in.nextFloat();
        if (desconto > 1 || desconto < 0){
            System.out.println("Erro! Para o desconto, favor inserir um valor entre 0 e 1");  
        }
            float valortotal = valor-(valor*desconto);
            System.out.println("O valor final, com os descontos aplicados eh de: " + valortotal); 
        in.close();
        desc.close();

        // o enunciado pede para considerar o desconto como um valor inteiro entre 0 e 1. Assim, esse codigo leva me consideracao o seguinte entendimento: 
        // 0.1 de desconto = 10%; 0.5 = 50%; 1 = 100%.

        // O idioma da maquina influencia no resultado. Em maquinas com lingua padrao pt-br, deve-se usar "," na aplicacao de desconto ---> 0,5
        // em maquinas com o idiona padrao em ingles, deve-se usar "." na aplicacao de desconto ---> 0.5

    }
}
