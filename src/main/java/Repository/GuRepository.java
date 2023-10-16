package Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import domain.User;

@Repository
public interface GuRepository extends JpaRepository<User, Long>{

	Optional<User> findById(Integer id);

}
