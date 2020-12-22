package twix.user.dao;

import twix.user.model.dto.UserCredentialsDto;

public interface UserRetrievalDao {

    UserCredentialsDto getUserCredentials(String username);
}
