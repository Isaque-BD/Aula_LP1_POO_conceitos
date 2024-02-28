import java.util.Scanner;

public class Atividade_5 {

    public static void main(String[] args){

        Scanner nota = new Scanner(System.in);

        System.out.println("Quantas notas você deseja colocar?: ");
        int qtd_Notas = nota.nextInt();

        int count = 0;
        int sum = 0;
        

        do{
            
            int n1 = nota.nextInt();
            sum += n1;
            n1 =+ n1;
            count++;

        }while(qtd_Notas > count);

        float media = sum / count;

        System.out.println("Média do aluno: " + media);

        
        

    }
    
}
