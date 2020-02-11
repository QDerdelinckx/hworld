package be.derdelinckx.DAL.entities;

public enum Alignment {
    VIR("Vertueux"),
    CHA("Chaotique"),
    REB("Rebelle"),
    NEU( "Neutre");

    private String  alignment_name;

    public String getAlignment_name() {
        return alignment_name;
    }

    Alignment(String alignment_name) {
        this.alignment_name = alignment_name;
    }
}
