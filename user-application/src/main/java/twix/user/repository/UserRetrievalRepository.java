package twix.user.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import twix.user.model.entity.User;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRetrievalRepository extends CrudRepository<User, UUID> {

    @Query(value = "SELECT * " +
                   "FROM \"user\".user_data " +
                   "WHERE username=:username", nativeQuery = true)
    Optional<User> findUserByUsername(@Param("username") String username);
}
