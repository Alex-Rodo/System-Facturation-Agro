package System_Facturation.repositories;

import System_Facturation.domain.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    Optional<Seller> findByDni(Long dni);
}
