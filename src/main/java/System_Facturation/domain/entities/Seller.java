package System_Facturation.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "seller")
@Data
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    @Column(name = "name_seller", nullable = false, length = 100)
    private String nameSeller;
    @Column(name = "lastname_seller",  nullable = false, length = 100)
    private String lastnameSeller;
    @Column(name = "phone",  nullable = false)
    private int phone;
    @Column(name = "dni",   nullable = false)
    private int  dni;

}
