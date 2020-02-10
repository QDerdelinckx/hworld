package be.derdelinckx.DAL.entities;

public enum Archetypes {

    Diplomatie("Diplomatie"),
    CombatCC("Combat au corps à corps"),
    CombatAD("Combat à distance"),
    Intimidation("Intimidation"),
    MagieElementaire("Magie Élémentaire"),
    Illusions("Illusionisme"),
    Courage("Courage"),
    Inspiration("Inspiration"),
    MagieAugmentee( "Magie Augmentée");

    private String archetype_id;

    public String getArchetype_id() {
        return archetype_id;
    }

    Archetypes(String archetype_id) {
        this.archetype_id = archetype_id;
    }
}
