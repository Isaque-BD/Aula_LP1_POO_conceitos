package pib.example;

public class Estado extends DadosPadroes {


    private int qtdCidades;

    public Estado(String nomeRegiao, int qtdPessoas, float rendimento, int qtdCidades) {
        super(nomeRegiao, qtdPessoas, rendimento);
        this.qtdCidades = qtdCidades;
        
    }

    public int getQtdCidades() {
        return qtdCidades;
    }

    public void setQtdCidades(int qtdCidades) {
        this.qtdCidades = qtdCidades;
    }

    @Override
    public void calcularPib() {
        
        System.out.println((this.qtdCidades * this.getQtdPessoas() * this.getRendimento() * 12)/12);

    }

    
    
}