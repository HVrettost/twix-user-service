package twix.user.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import twix.user.model.dto.UserCredentialsDto;

@RequestMapping(value = "/api/users")
public interface UserRetrievalApi {

    @GetMapping(value = "/{username}/credentials",
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserCredentialsDto> getUserCredentials(@PathVariable("username") String username);
}
