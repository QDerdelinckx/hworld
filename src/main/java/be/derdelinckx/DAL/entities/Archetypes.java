package be.derdelinckx.DAL.entities;

public enum Archetypes {

    DPC("Diplomatie"),
    CCC("Combat au corps à corps"),
    CAD("Combat à distance"),
    IMD("Intimidation"),
    EMG("Magie Élémentaire"),
    ILL("Illusionisme"),
    COU("Courage"),
    INP("Inspiration"),
    AUT("Autorité"),
    AMG("Magie Augmentée"),
    LGE("Langues étrangères");

    private String archetype_name;

    public String getArchetype_name() {
        return archetype_name;
    }

    Archetypes(String archetype_name) {
        this.archetype_name = archetype_name;
    }
}
