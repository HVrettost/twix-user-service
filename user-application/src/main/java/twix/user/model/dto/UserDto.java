package twix.user.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private String username;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
}
