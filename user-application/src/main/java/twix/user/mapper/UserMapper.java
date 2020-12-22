package twix.user.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import twix.user.model.dto.UserDto;
import twix.user.model.entity.User;

@Component
public class UserMapper implements DtoMapper<UserDto, User>, EntityMapper<User, UserDto> {

    private final ModelMapper modelMapper;

    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDto toDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }



    @Override
    public User toEntity(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }
}
