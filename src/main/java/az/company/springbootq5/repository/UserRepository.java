package az.company.springbootq5.repository;

import az.company.springbootq5.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // select u from users where u.user_id = :id
//    Optional<User> findById(Integer id);

//    @Query(name = "select u from users where u.user_id = :id", nativeQuery = true)
//    UserEntity get(@Param("id") Integer id);
}
