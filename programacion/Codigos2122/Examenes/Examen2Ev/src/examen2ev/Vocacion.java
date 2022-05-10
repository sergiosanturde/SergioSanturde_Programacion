package examen2ev;

public enum Vocacion {

    defensivo,ofensivo,generico("ofensivo","defensivo");

    String ofensiva,defensiva;

    Vocacion(){}

    Vocacion(String ofensiva, String defensiva) {
        this.ofensiva = ofensiva;
        this.defensiva = defensiva;
    }

    public String getOfensiva() {
        return ofensiva;
    }

    public void setOfensiva(String ofensiva) {
        this.ofensiva = ofensiva;
    }

    public String getDefensiva() {
        return defensiva;
    }

    public void setDefensiva(String defensiva) {
        this.defensiva = defensiva;
    }
}
