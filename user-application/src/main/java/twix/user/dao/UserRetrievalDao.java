package twix.user.dao;

import twix.user.model.dto.UserAuthDto;

public interface UserRetrievalDao {

    UserAuthDto getUserByUsernameForAuthentication(String username);
}
