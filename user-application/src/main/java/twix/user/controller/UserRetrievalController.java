package twix.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import twix.user.api.UserRetrievalApi;
import twix.user.model.dto.UserCredentialsDto;
import twix.user.service.UserRetrievalService;

@RestController
public class UserRetrievalController implements UserRetrievalApi {

    private final UserRetrievalService userRetrievalService;

    public UserRetrievalController(UserRetrievalService userRetrievalService) {
        this.userRetrievalService = userRetrievalService;
    }

    @Override
    public ResponseEntity<UserCredentialsDto> getUserCredentials(String username) {
        UserCredentialsDto userCredentials = userRetrievalService.getUserCredentials(username);
        return new ResponseEntity<>(userCredentials, HttpStatus.OK);
    }
}
