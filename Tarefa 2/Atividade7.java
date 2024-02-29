import java.util.Scanner;

public class Atividade7 {
    
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o número desejado: ");
        float desejo = numero.nextFloat();
        System.out.println(desejo);

        if (desejo > 10)
        {
            System.out.println("É MAIOR QUE 10!");
        }
        else
        {
            System.out.println("NÃO É MAIOR QUE 10! ");
        }
            
    
    }


}

