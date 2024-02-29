import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {

        Scanner h = new Scanner(System.in);

        System.out.print("Digite as horas trabalhadas no mês: ");
        int m = h.nextInt();
        System.out.print("Digite o salário por hora trabalhada: ");
        float s = h.nextFloat();

        

        if(m > 160){

            int hExtra = m - 160;
            float sExtra = 0;
            float soma = 0;
            
            for(int i = 0; i < hExtra; i++){

                soma = s * 1.5f;
                sExtra = sExtra + soma;

            }
            System.out.println("O salário total vai ser de:  R$" + (sExtra + (160 * s)));

        }else{
            System.out.println("O salário total vai ser de: R$" + (m * s));
        }


    }

}
