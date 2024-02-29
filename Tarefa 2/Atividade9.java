// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. 

import java.util.Scanner;

public class Atividade9 {

    public static void main(String[] args) {
        
        Scanner quantidade = new Scanner(System.in);
        System.out.print("Digite quantas maças foram compradas: ");
        float qtdMaca = quantidade.nextFloat();
        float preco = 0;

        if (qtdMaca >= 12)
        {
            preco = 1.00f;
        }
        else
        {
            preco = 1.30f;
        }

        System.out.println("O preço total é R$" + Math.round(qtdMaca * preco));



    }
}
