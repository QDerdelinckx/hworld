package be.derdelinckx.DTO.User;

import be.derdelinckx.DAL.entities.User;

public class UserDTO {
    private Long id;
    private String nickname;
    private String email;
    private String password;

    public UserDTO(){};
    public UserDTO(User user){
        this.id = user.getId();
        this.nickname = user.getNickname();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
