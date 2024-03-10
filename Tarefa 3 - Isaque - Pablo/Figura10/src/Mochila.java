public class Mochila {

    private int volume;
    private String tipo;
    private String material;
    private boolean abrirMoch;

    public void Mochila(int volume, String tipo, String material, boolean abrirMoch) {

        this.volume = volume;
        this.tipo = tipo;
        this.material = material;
        this.abrirMoch = abrirMoch;
    }

    public void ColocarObjeto() {
        if (abrirMoch) {
            System.out.println("Objetos foram adicionados a sua mochila");
        } else {
            System.out.println("A mochila está fechada, não será possível");
        }
    }

    public void CarregarMochila() {

        System.out.println("A mochila está sendo carregada");
    }

    public void LimparMochila() {
        System.out.println("A mochila foi limpada com sucesso");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isAbrirMoch() {
        return abrirMoch;
    }

    public void setAbrirMoch(boolean abrirMoch) {
        this.abrirMoch = abrirMoch;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void status() {
        System.out.println("A mochila tem um volume de " + getVolume() + " cm³");
        System.out.println("O tipo da mochila é: " + getTipo());
        System.out.println("O material da mochila é: " + getMaterial());
        System.out.println("A mochila está aberta?: " + isAbrirMoch());
        
    }

}