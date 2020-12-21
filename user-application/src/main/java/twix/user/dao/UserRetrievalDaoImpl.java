package twix.user.dao;

import org.springframework.stereotype.Component;

import twix.user.mapper.UserAuthMapper;
import twix.user.mapper.UserMapper;
import twix.user.model.dto.UserAuthDto;
import twix.user.model.dto.UserDto;
import twix.user.model.entity.User;
import twix.user.repository.UserRetrievalRepository;

@Component
public class UserRetrievalDaoImpl implements UserRetrievalDao {

    private final UserRetrievalRepository userRetrievalRepository;
    private final UserAuthMapper userAuthMapper;

    public UserRetrievalDaoImpl(UserRetrievalRepository userRetrievalRepository,
                                UserAuthMapper userAuthMapper) {
        this.userRetrievalRepository = userRetrievalRepository;
        this.userAuthMapper = userAuthMapper;
    }

    @Override
    public UserAuthDto getUserByUsernameForAuthentication(String username) {
        User user = userRetrievalRepository.findUserByUsername(username).get(); // if not found throw exception
        return userAuthMapper.toDto(user.getUsername(), user.getPassword());
    }
}
