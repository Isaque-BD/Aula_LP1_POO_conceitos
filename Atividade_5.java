import java.util.Scanner;


public class Atividade_5 {

    public static void main(String[] args){

        Scanner nota = new Scanner(System.in);

        public static void main(String[] args){

        Scanner nota = new Scanner(System.in);

        float p1;
        float e1;
        float e2;
        float api;
        float sub;
        float x;
        float lp1; 
        
        

        System.out.print("Digite a nota da prova: ");
        p1 = nota.nextFloat();
        System.out.print("Digite a nota da Atividade 1: ");
        e1 = nota.nextFloat();
        System.out.print("Digite a nota da Atividade 2: ");
        e2 = nota.nextFloat();
        System.out.print("Digite a nota da API: ");
        api = nota.nextFloat();
        System.out.print("Digite a nota da prova substitutiva: ");
        sub = nota.nextFloat();
        System.out.println("Digite os pontos a mais X: ");
        x = nota.nextFloat();
        
        lp1 = (float)((p1*0.6+(((e1+e2)/2)* 0.4)) * 0.5 + (Math.max(((p1*0.6+((e1+e2)/2)*0.4)-5.9), 0)/((p1*0.6+((e1+e2)/2)*0.4)-5.9))*(api*0.5)+x+(sub*0.2));
        
        if(lp1 > 10){
            System.out.println("Digite novamente as notas");
        }else{
            System.out.println("Sua média é " + lp1);
        }
        
        

    }   
    
}
