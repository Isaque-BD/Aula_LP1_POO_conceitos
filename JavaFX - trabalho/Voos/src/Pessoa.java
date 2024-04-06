public class Pessoa {

    private int cpf;
    private String nome;
    private int nAssento;
    
    
    public Pessoa(int cpf, String nome, int nAssento) {
        this.cpf = cpf;
        this.nome = nome;
        this.nAssento = nAssento;
    }


    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnAssento() {
        return nAssento;
    }
    public void setnAssento(int nAssento) {
        this.nAssento = nAssento;
    }


    
}
