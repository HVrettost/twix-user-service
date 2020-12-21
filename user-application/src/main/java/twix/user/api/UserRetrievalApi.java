package twix.user.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import twix.user.model.dto.UserAuthDto;

@RequestMapping(value = "/api/users")
public interface UserRetrievalApi {

    @GetMapping(value = "auth/{username}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserAuthDto> getUserByUsernameForAuthentication(@PathVariable("username") String username);
}
