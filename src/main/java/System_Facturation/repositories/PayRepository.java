package System_Facturation.repositories;

import System_Facturation.domain.entities.Pay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PayRepository extends JpaRepository<Pay, Long> {
    Optional<Pay> findByMethodPay(String paymentMethod);
}
