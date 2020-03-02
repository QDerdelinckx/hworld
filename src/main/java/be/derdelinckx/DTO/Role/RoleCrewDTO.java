package be.derdelinckx.DTO.Role;

import be.derdelinckx.DAL.entities.RoleCrew;
import be.derdelinckx.DTO.BonusDTO.BonusDTO;

import java.util.List;
import java.util.stream.Collectors;

public class RoleCrewDTO {

    private String name;
    private boolean singled;
    private Integer alignmentBonus;
    private List<BonusDTO> bonuses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSingled() { return singled; }

    public void setSingled(boolean singled) { this.singled = singled; }

    public Integer getAlignmentBonus() {
        return alignmentBonus;
    }

    public void setAlignmentBonus(Integer alignmentBonus) {
        this.alignmentBonus = alignmentBonus;
    }

    public List<BonusDTO> getBonuses() {
        return bonuses;
    }

    public void setBonuses(List<BonusDTO> bonuses) {
        this.bonuses = bonuses;
    }

    public RoleCrewDTO() {
    }

    public RoleCrewDTO(RoleCrew roleCrew) {
        this.name = roleCrew.getName();
        this.singled = roleCrew.isSingled();
        this.alignmentBonus = roleCrew.getAlignmentBonus();
        this.bonuses = roleCrew.getBonus().stream().map(BonusDTO::new).collect(Collectors.toList());
    }
}
