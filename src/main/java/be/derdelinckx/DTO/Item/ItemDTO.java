package be.derdelinckx.DTO.Item;

import be.derdelinckx.DAL.entities.Bonus;
import be.derdelinckx.DAL.entities.Item;
import be.derdelinckx.DTO.BonusDTO.BonusDTO;

import java.util.List;
import java.util.stream.Collectors;

public class ItemDTO {
    private Long id;
    private String name;
    private String skin;
    private List<BonusDTO> bonuses;

    public ItemDTO() {}
    public ItemDTO(Item item){
        this.id = item.getId();
        this.name = item.getName();
        this.skin = item.getSkin();
        this.bonuses = item.getBonus().stream().map(BonusDTO::new).collect(Collectors.toList());
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

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public List<BonusDTO> getBonuses() {
        return bonuses;
    }

    public void setBonuses(List<BonusDTO> bonuses) {
        this.bonuses = bonuses;
    }
}
