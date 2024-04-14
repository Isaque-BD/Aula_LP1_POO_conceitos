public class Celular{

    private String marca;
    private int armazenamento;
    private String cor;
    private boolean ligarCel;

    public void Celular(String marca, int armazenamento, String cor, boolean ligarCel){

        this.marca = marca;
        this.armazenamento = armazenamento;
        this.cor = cor;
        this.ligarCel = ligarCel;

    }

    public void FazerChamada(){

        if(ligarCel){

        System.out.println("Fazendo ligação");
        }else{
        System.out.println( "O celular está desligado");
        }
        
    }
    
    public void Fotografar(){
        if(ligarCel){
            System.out.println("Foto tirada");
        }
        else{
        System.out.println("Foto não tirada, pois o celular está desligado");
        }

    }
    public void Carregar(){
    System.out.println("Celular carregando");
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public boolean isLigarCel() {
        return ligarCel;
    }
    public void setLigarCel(boolean ligarCel) {
        this.ligarCel = ligarCel;
    }

    public void status(){
    System.out.println("A marca do celular é: " + getMarca());
System.out.println("O celular tem um armazenamento de: " + getArmazenamento() + "GB");
System.out.println("A cor do celular é " + getCor());
System.out.println("O celular está ligado?: " + isLigarCel());
    }



}