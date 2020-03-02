package be.derdelinckx.DAL.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role_crew")
public class RoleCrew {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private Long id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    private boolean singled;
    private Integer alignmentBonus;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Bonus> bonus = new HashSet<Bonus>();

    public RoleCrew() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSingled() { return singled; }

    public void setSingled(boolean singled) { this.singled = singled; }

    public Integer getAlignmentBonus() { return alignmentBonus; }

    public void setAlignmentBonus(Integer alignmentBonus) { this.alignmentBonus = alignmentBonus; }

    public Set<Bonus> getBonus() {
        return bonus;
    }

    public void setBonus(Set<Bonus> bonus) {
        this.bonus = bonus;
    }
}
