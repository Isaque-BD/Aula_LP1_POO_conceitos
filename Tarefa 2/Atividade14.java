import java.util.Scanner;

public class Atividade14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora de início do jogo (hora inteira): ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite a hora de fim do jogo (hora inteira): ");
        int horaFim = scanner.nextInt();

        int duracao = calcularDuracaoJogo(horaInicio, horaFim);

        System.out.println("A duração do jogo é de " + duracao + " horas.");

        scanner.close();
    }

    public static int calcularDuracaoJogo(int horaInicio, int horaFim) {
        if (horaInicio <= horaFim) {
            return Math.min(horaFim - horaInicio, 24);
        } else {
            int duracaoAteMeiaNoite = 24 - horaInicio;
            int duracaoAposMeiaNoite = horaFim;
            return Math.min(duracaoAteMeiaNoite + duracaoAposMeiaNoite, 24);
        }
    }
}

