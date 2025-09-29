package System_Facturation.repositories;

import System_Facturation.domain.entities.Bill;
import System_Facturation.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillRepository extends JpaRepository<Bill, Long> {
    List<Bill> findByClient(Client client);
}
