package twix.user.service;

import twix.user.model.dto.UserCredentialsDto;

public interface UserRetrievalService {

    UserCredentialsDto getUserCredentials(String username);
}
