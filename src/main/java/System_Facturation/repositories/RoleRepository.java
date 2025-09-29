package System_Facturation.repositories;

import System_Facturation.domain.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Roles, Long>{
    Optional<Roles> findByName(String nameRole);

}
