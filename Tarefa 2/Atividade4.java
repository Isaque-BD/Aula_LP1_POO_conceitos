
import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        Scanner preco = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica: ");
        float custo = preco.nextFloat();
        float equacao = custo + (custo * 0.28f) + (custo * 0.45f);
        System.out.print("O total do carro vai ser de: R$" + equacao);

    }
}
