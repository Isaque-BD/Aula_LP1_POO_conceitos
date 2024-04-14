public class App {
    public static void main(String[] args) throws Exception {
        Celular c1 = new Celular();

        c1.Celular("Xiaomi", 128, "Ciano", true);

        c1.FazerChamada();
        c1.Fotografar();
        c1.Carregar();
        c1.status();
    }
}
