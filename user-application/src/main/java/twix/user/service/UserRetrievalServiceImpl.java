package twix.user.service;

import org.springframework.stereotype.Service;
import twix.user.dao.UserRetrievalDao;
import twix.user.model.dto.UserAuthDto;

@Service
public class UserRetrievalServiceImpl implements UserRetrievalService {

    private final UserRetrievalDao userRetrievalDao;

    public UserRetrievalServiceImpl(UserRetrievalDao userRetrievalDao) {
        this.userRetrievalDao = userRetrievalDao;
    }

    @Override
    public UserAuthDto getUserByUsernameForAuthentication(String username) {
        return userRetrievalDao.getUserByUsernameForAuthentication(username);
    }
}
