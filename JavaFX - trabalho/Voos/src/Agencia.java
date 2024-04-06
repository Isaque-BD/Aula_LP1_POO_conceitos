public class Agencia extends Pessoa{


    private String empresa;
    private String local;
    private String idaVolta;

    public Agencia(int cpf, String nome, int nAssento, String empresa, String local, String idaVolta) {
        super(cpf, nome, nAssento);
        this.empresa = empresa;
        this.local = local;
        this.idaVolta = idaVolta;
    }


    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getIdaVolta() {
        return idaVolta;
    }
    public void setIdaVolta(String idaVolta) {
        this.idaVolta = idaVolta;
    }

    public void comprarPassagem(){
        System.out.println(getNome() + " comprou passagem para " + getLocal());

    }

    public void irParaOLocal(){
        System.out.println(getNome() + " foi para " + getLocal());

    }

    public void voltar(){
        System.out.println(getNome() + " voltou para sua cidade natal");
    }



    
}
