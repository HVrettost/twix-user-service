package twix.user.mapper;

import org.springframework.stereotype.Component;

import twix.user.model.dto.UserCredentialsDto;

@Component
public class UserCredentialsMapper {

    public UserCredentialsDto toDto(String username, String password) {
        UserCredentialsDto userCredentialsDto = new UserCredentialsDto();
        userCredentialsDto.setUsername(username);
        userCredentialsDto.setPassword(password);
        return userCredentialsDto;
    }
}
