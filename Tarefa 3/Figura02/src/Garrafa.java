public class Garrafa {

    private boolean tampa;
    private float litros;
    private String tipoLiquido;


    public void Garrafa(boolean tampa, float litros, String tipoLiquido){

        this.tampa = tampa;
        this.litros = litros;
        this.tipoLiquido = tipoLiquido;

    }
    

    public void beber(){
        if(tampa){
            System.out.println("Bebendo " + getTipoLiquido());

        }else{  
            System.out.println("A garrafa está tampada");
        }
    }

    public void girarGarrafa(){
        System.out.println("Girando a garrafa");
    }

    public void esvaziar(){
        if(tampa){
            System.out.println("Garrafa esvaziada com sucesso");

        }
        else{
            System.out.println("A garrafa está tampada");
        }
    }

    public float getLitros() {
        return litros;
    }
    public void setLitros(float volume) {
        this.litros = volume;
    }
    public boolean isTampa() {
        return tampa;
    }
    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }
    public String getTipoLiquido() {
        return tipoLiquido;
    }
    public void setTipoLiquido(String tipoLiquido) {
        this.tipoLiquido = tipoLiquido;
    }

    public void status(){
        System.out.println("A garrafa está tampada? " + isTampa());
        System.out.println("A quantidade de litros que a garrafa pode armazenar é de: " + getLitros() + "L");
        System.out.println("O líquido da garrafa é: " + getTipoLiquido());
    }
    
    
}
