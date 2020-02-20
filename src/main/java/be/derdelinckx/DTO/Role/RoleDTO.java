package be.derdelinckx.DTO.Role;

import be.derdelinckx.DAL.entities.Role;

public class RoleDTO {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleDTO() {
    }

    public RoleDTO(Role role) {
        this.name = role.getName();
    }
}
