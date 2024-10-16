public class Caneta {
    private float quantTinta;
    private int usos;
    private String marca;
    private String cor;

    public Caneta(String marca,String cor){
        this.quantTinta = 100f;
        this.usos = 0;
        this.marca = marca;
        this.cor = cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    public String getMarca(){
        return this.marca;
    }
}
