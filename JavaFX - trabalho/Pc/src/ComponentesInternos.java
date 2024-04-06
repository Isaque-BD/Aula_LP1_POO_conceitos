public class ComponentesInternos extends Perifericos {

    private String processador;
    private String placaMae;
    private int memoriaRam;
    private int sSD;
    private int fonte;

    public ComponentesInternos(String mouse, String teclado, String monitor, String headset, String gabinete, String processador, String placaMae, int memoriaRam, int sSD, int fonte) {

        super(mouse, teclado, monitor, headset, gabinete);
        this.processador = processador;
        this.placaMae = placaMae;
        this.memoriaRam = memoriaRam;
        this.sSD = sSD;
        this.fonte = fonte;
    }

    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public String getPlacaMae() {
        return placaMae;
    }
    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }
    public int getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public int getSSD() {
        return sSD;
    }
    public void setSSD(int sSD) {
        this.sSD = sSD;
    }
    public int getFonte() {
        return fonte;
    }
    public void setFonte(int fonte) {
        this.fonte = fonte;
    }
    
    public void comprarPecas(){
        System.out.println("Comprando as peças");
    }
    public void montarPc(){
        System.out.println("Pc montando");
    }

    
}
