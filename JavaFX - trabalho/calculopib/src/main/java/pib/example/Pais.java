package pib.example;

public class Pais extends DadosPadroes{

    private int qtdEstados;

    public Pais(String nomeRegiao, int qtdPessoas, float rendimento, int qtdEstados) {
        super(nomeRegiao, qtdPessoas, rendimento);
        this.qtdEstados = qtdEstados;
        
    }

    public int getQtdEstados() {
        return qtdEstados;
    }

    public void setQtdEstados(int qtdEstados) {
        this.qtdEstados = qtdEstados;
    }

    @Override
    public void calcularPib() {
        
        System.out.println((this.qtdEstados * this.getQtdPessoas() * this.getRendimento() * 12)/12);
    }
    

    
}
