import java.util.Scanner;

public class Atividade8 {
    
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite seu valor desejado: " );
        float desejo = numero.nextFloat();

        if (desejo >= 0)
        {
            System.out.println("Positivo!!!!");
        }
        else
        {
            System.out.println("Negativo!!!!!!");
        }
        
    }
}
