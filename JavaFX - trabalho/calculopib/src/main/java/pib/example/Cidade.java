package pib.example;

public class Cidade extends DadosPadroes {

    public Cidade(String nomeRegiao, int qtdPessoas, float rendimento) {
        super(nomeRegiao, qtdPessoas, rendimento);
    }

    @Override
    public void calcularPib() {
        super.calcularPib();
    }

    public String getNomeRegiao() {
        return super.getNomeRegiao();
    }

    public int getQtdPessoas() {
        return super.getQtdPessoas();
    }

    public float getRendimento() {
        return super.getRendimento();
    }
}
