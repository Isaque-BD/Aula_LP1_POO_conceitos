//Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        
        Scanner celsius = new Scanner(System.in);
        System.out.print("Digite o valor da temperatura fahrenheit: ");
        float fahrenheit  = celsius.nextFloat();
        float conversao = (fahrenheit - 32) * 5/9;
        System.out.println("O valor convertido é: " + conversao + "°C");


    }


}
