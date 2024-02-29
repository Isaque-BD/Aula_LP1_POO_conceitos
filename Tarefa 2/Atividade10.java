// Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada. 

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        
        Scanner valorNota = new Scanner(System.in);
        System.out.print("Digite o valor da primeira avaliação: ");
        float nota1 = valorNota.nextFloat();
        System.out.print("Digite o valor da segunda avaliação: ");
        float nota2 = valorNota.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.println(nota1 + " + " + nota2 + " + " + "/ 2");
        
        if (media >= 6)
        {
            System.out.println("A média do aluno foi: " + media + " Sendo assim ele passou");
        }
        else
        {
            System.out.println("A média do aluno foi: " + media + " Sendo assim ele não passou");
        }



        

    }
}
