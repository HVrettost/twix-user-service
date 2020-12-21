package twix.user.service;

import twix.user.model.dto.UserAuthDto;

public interface UserRetrievalService {

    UserAuthDto getUserByUsernameForAuthentication(String username);
}
