package be.derdelinckx.DAL.entities;

public enum Alignment {
    VERTUEUX("Vertueux"),
    CHAOTIQUE("Chaotique"),
    REBELLE("Rebelle"),
    NEUTRE( "Neutre");

    private String  alignment_id;

    Alignment(String alignment_id) {
        this.alignment_id = alignment_id;
    }
}
