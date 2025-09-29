package System_Facturation.repositories;

import System_Facturation.domain.entities.Bill;
import System_Facturation.domain.entities.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetailRepository extends JpaRepository<Detail, Long> {
    List<Detail> findByBill(Bill numBill);
}
