package dados.bean;

public class Quartos {

    private int numero;
    private String setor;
    private int andar;
    private boolean ar;

    public Quartos(int numero, String setor, int andar, boolean ar) {
        this.numero = numero;
        this.setor = setor;
        this.andar = andar;
        this.ar = ar;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
