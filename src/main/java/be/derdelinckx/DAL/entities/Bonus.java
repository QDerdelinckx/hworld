package be.derdelinckx.DAL.entities;

import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.*;

@Entity
public class Bonus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Archetypes affected;
    private int bonus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAffected() {
        return affected.getArchetype_name();
    }

    public void setAffected(Archetypes affected) {
        this.affected = affected;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Bonus(Archetypes affected, int bonus) {
        this.affected = affected;
        this.bonus = bonus;
    }

    public Bonus() {
    }
}
