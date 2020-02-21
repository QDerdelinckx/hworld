package be.derdelinckx.DAL.entities;

import javax.persistence.*;

@Entity
@Table(name = "role_crew")
public class RoleCrew {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_role")
    private Long id;
    @Column (name = "name",nullable = false)
    private String name;

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
}
