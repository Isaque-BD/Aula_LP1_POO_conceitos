public class App {
    public static void main(String[] args) throws Exception {
        Mochila m1 = new Mochila();

        m1.Mochila(200, "Viagem", "Couro", true);
        m1.LimparMochila();
        m1.ColocarObjeto();
        m1.CarregarMochila();
        m1.status();
        
    }
}
