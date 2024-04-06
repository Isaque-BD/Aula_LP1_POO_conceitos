public class Perifericos {
    private String mouse;
    private String teclado;
    private String monitor;
    private String headset;
    private String gabinete;

    public Perifericos(String mouse, String teclado, String monitor, String headset, String gabinete) {
        this.mouse = mouse;
        this.teclado = teclado;
        this.monitor = monitor;
        this.headset = headset;
        this.gabinete = gabinete;
    }
    public String getMouse() {
        return mouse;
    }
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
    public String getTeclado() {
        return teclado;
    }
    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }
    public String getMonitor() {
        return monitor;
    }
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
    public String getHeadset() {
        return headset;
    }
    public void setHeadset(String headset) {
        this.headset = headset;
    }
    public String getGabinete() {
        return gabinete;
    }
    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    
}
