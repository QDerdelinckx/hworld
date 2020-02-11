package be.derdelinckx.DAL.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Faction {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String faction_name;
    @Enumerated(EnumType.STRING)
    private Alignment faction_alignment;
    private String faction_skin;

//    @OneToMany(cascade = CascadeType.PERSIST)
//    private Set<Hero> heroes = new HashSet<Hero>();

    public Long getId() {
        return id;
    }

    public String getFaction_name() {
        return faction_name;
    }

    public void setFaction_name(String faction_name) {
        this.faction_name = faction_name;
    }

    public String getFaction_alignment() {
        return faction_alignment.getAlignment_name();
    }

    public String getFaction_skin() {
        return faction_skin;
    }

    public void setFaction_skin(String faction_skin) {
        this.faction_skin = faction_skin;
    }

//    public Set<Hero> getHeroes() {
//        return heroes;
//    }
//
//    public void setHeroes(Set<Hero> heroes) {
//        this.heroes = heroes;
//    }

    public Faction(String faction_name, String faction_skin){
        this.faction_name = faction_name;
        this.faction_skin = faction_skin;
    }

    public Faction() {
    }
}
