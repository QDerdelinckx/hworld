package be.derdelinckx.DTO.BonusDTO;

import be.derdelinckx.DAL.entities.Archetypes;
import be.derdelinckx.DAL.entities.Bonus;

public class BonusDTO {
    private Long id;
    private String affected;
    private int bonus;

    public BonusDTO() {}
    public BonusDTO(Bonus bonus){
        this.id = bonus.getId();
        this.affected = bonus.getAffected();
        this.bonus = bonus.getBonus();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAffected() {
        return affected;
    }

    public void setAffected(String affected) {
        this.affected = affected;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
