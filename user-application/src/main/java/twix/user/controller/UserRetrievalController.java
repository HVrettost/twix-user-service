package twix.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import twix.user.api.UserRetrievalApi;
import twix.user.model.dto.UserAuthDto;
import twix.user.service.UserRetrievalService;

@RestController
public class UserRetrievalController implements UserRetrievalApi {

    private final UserRetrievalService userRetrievalService;

    public UserRetrievalController(UserRetrievalService userRetrievalService) {
        this.userRetrievalService = userRetrievalService;
    }

    @Override
    public ResponseEntity<UserAuthDto> getUserByUsernameForAuthentication(String username) {
        UserAuthDto authUser = userRetrievalService.getUserByUsernameForAuthentication(username);
        return new ResponseEntity<>(authUser, HttpStatus.OK);
    }
}
