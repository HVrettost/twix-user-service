package twix.user.dao;

import org.springframework.stereotype.Component;

import twix.user.mapper.UserCredentialsMapper;
import twix.user.model.dto.UserCredentialsDto;
import twix.user.model.entity.User;
import twix.user.repository.UserRetrievalRepository;

@Component
public class UserRetrievalDaoImpl implements UserRetrievalDao {

    private final UserRetrievalRepository userRetrievalRepository;
    private final UserCredentialsMapper userCredentialsMapper;

    public UserRetrievalDaoImpl(UserRetrievalRepository userRetrievalRepository,
                                UserCredentialsMapper userCredentialsMapper) {
        this.userRetrievalRepository = userRetrievalRepository;
        this.userCredentialsMapper = userCredentialsMapper;
    }

    @Override
    public UserCredentialsDto getUserCredentials(String username) {
        User user = userRetrievalRepository.findByUsername(username).get(); // if not found throw exception
        return userCredentialsMapper.toDto(user.getUsername(), user.getPassword());
    }
}
