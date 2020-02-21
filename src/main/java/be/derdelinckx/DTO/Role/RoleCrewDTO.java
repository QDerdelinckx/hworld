package be.derdelinckx.DTO.Role;

import be.derdelinckx.DAL.entities.RoleCrew;

public class RoleCrewDTO {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleCrewDTO() {
    }

    public RoleCrewDTO(RoleCrew roleCrew) {
        this.name = roleCrew.getName();
    }
}
