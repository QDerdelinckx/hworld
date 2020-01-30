package be.derdelinckx.hectorsworld.models;

public enum Archetypes {

    Diplomacy(0),
    CombatCC(1),
    CombatAD(2),
    Intimidation(3),
    Blackmagic(4),
    Illusions(5),
    Courage(6),
    Inspiration(7);

    private int archetype_id;

    Archetypes(int archetype_id) {
        this.archetype_id = archetype_id;
    }
}
