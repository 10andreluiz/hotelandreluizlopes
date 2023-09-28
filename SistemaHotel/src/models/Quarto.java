package models;

public class Quarto {

    private int id;
    private String setor;
    private int andar;
    private boolean ar;

    public Quarto(int id, String setor, int andar, boolean ar) {
        this.id = id;
        this.setor = setor;
        this.andar = andar;
        this.ar = ar;
    }

    public int getNumero() {
        return id;
    }

    public void setNumero(int numero) {
        this.id = numero;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public boolean isAr() {
        return ar;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

}
