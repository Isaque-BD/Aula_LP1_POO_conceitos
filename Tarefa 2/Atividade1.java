import java.util.Scanner;

public class Atividade1{

    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);


        System.out.print("Digite a quantidade de anos vividos: ");
        int ano = idade.nextInt();

        System.out.print("Digite a quantidade de meses vividos: ");
        int mes = idade.nextInt();

        System.out.print("Digite a quantidade de dias vividos: ");
        int dia = idade.nextInt();

        int idadeDia = (ano * 365) + (mes * 30) + dia;
        
        System.out.println("Você tem ao todo " + idadeDia + " dias vividos");

        

    }


}