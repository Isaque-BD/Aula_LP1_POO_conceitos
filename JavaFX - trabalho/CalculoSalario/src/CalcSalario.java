public class CalcSalario extends Pessoa {


    private float salario;
    private float comissao;
    private float desconto;

    public CalcSalario(String nome, int idade, int cpf, float salario, float comissao, float desconto) {
        
        super(nome, idade, cpf);
        this.salario = salario;
        this.comissao = comissao;
        this.desconto = desconto;
        
    }

    public void salarioTotal() {
        float total = this.salario + this.comissao;
        System.out.println(getNome() +" recebeu R$" + (total - (total * this.desconto)));
    }
    
    
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "CalcSalario [getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getCpf()=" + getCpf() + "]";
    }
    
    



    
    





   
    

    
    
}
