import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Scanner ing = new Scanner(System.in);
        Scanner med = new Scanner(System.in);
        System.out.println("Salve seres humanos! Por favor, insira as medidas do comodo (comprimento e largura):");
        int comprimento = in.nextInt();
        int largura = ing.nextInt();
        System.out.println("Ok! Para finalizar... qual a grandeza de medida utilizada para medir os tamanhos? (metros, centimetros, etc...)");
        String medida = med.next();
        System.out.println("Hm... A area, baseada no comprimento e na largura dados eh de: " + comprimento*largura + " " + medida);
        in.close();
        ing.close();
        med.close();
    }
}
