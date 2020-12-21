package twix.user.mapper;

import org.springframework.stereotype.Component;

import twix.user.model.dto.UserAuthDto;

@Component
public class UserAuthMapper {

    public UserAuthDto toDto(String username, String password) {
        UserAuthDto userAuthDto = new UserAuthDto();
        userAuthDto.setUsername(username);
        userAuthDto.setPassword(password);
        return userAuthDto;
    }
}
