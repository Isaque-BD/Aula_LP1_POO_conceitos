import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner salar = new Scanner(System.in);

        System.out.print("Digite o salário mensal: ");
        float salario = salar.nextFloat();
        System.out.print("Digite o reajuste do salário: ");
        float reajuste = salar.nextFloat();

        if(salario < reajuste){

            float p = (reajuste/salario) * 100;

            System.out.println("Seu salário teve um aumento de: " + p + "%");
        }else{
            float p = (reajuste/salario) * 100;
            System.out.println("Seu salário teve uma diminuição de: " + p + "%");
        }


        

    }   
    
}
