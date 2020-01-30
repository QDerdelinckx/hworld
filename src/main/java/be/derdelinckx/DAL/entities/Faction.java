package be.derdelinckx.DAL.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Faction {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String faction_name;
    private String faction_alignment;
    private String faction_skin;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Hero> heroes = new HashSet<Hero>();

    public Faction(String faction_name, String faction_alignment, String faction_skin){
        this.faction_name = faction_name;
        this.faction_alignment = faction_alignment;
        this.faction_skin = faction_skin;
    }

    public Faction() {
    }
}
