package WEB.Connexion.model;

import lombok.Data;

@Data
public class UserDTO extends User {

    private String actualPassword;
    private String passwordConfirm;
}
