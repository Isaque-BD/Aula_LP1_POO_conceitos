package pib.example;

public class DadosPadroes {


    private String nomeRegiao;
    private int qtdPessoas;
    private float rendimento;


    public DadosPadroes(String nomeRegiao, int qtdPessoas, float rendimento) {
        this.nomeRegiao = nomeRegiao;
        this.qtdPessoas = qtdPessoas;
        this.rendimento = rendimento;
    }

    public String getNomeRegiao() {
        return nomeRegiao;
    }
    public void setNomeRegiao(String nomeRegiao) {
        this.nomeRegiao = nomeRegiao;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public float getRendimento() {
        return rendimento;
    }
    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }


    public void calcularPib(){
        
        System.out.println((this.qtdPessoas * rendimento * 12)/12); //o número 12 significa que são dozes meses e iremos fazer uma média a partir disso
    }

    

    



    

    
    
}
