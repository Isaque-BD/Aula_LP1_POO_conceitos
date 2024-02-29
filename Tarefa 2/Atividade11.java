import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        
        Scanner ano = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = ano.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = ano.nextInt();
        int idade = anoAtual - anoNascimento;

        if (idade >= 16)
        {
            System.out.println("Este individuo está pronto para votar");
        }
        else
        {
            System.out.println("Este individuo terá de esperar");
        }


    }
}
