import java.util.Scanner;

public class Atividade13 {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = n.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = n.nextInt();

        if(n1 == n2 ){
            System.out.println("Digite novamente");
        }
        else{
            if(n1 > n2){
                System.out.println("Ordem crescente: " + n2 + "," + n1);
            }
            else{
                System.out.println("Ordem crescente " + n1 + "," + n2);
            }
        }
        

    }

}
