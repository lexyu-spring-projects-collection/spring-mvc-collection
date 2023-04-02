package com.lex.dto;

/**
 * @author : LEX_YU
 * @date : 2023/4/2
 */
public class UserDTO {
    private String username = "default username";
    private String anothername = "default another name";

    public UserDTO() {
    }

    public UserDTO(String username, String anothername) {
        System.out.println("UserDTO Constructor called");
        this.username = username;
        this.anothername = anothername;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAnothername() {
        return anothername;
    }

    public void setAnothername(String anothername) {
        this.anothername = anothername;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", anothername='" + anothername + '\'' +
                '}';
    }
}
