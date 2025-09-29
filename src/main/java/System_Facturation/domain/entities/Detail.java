package System_Facturation.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "detail")
@Data
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @Column(name = "price", nullable = false)
    private double price;
    //Relation with Bill
    @ManyToOne
    @JoinColumn(name = "billId", nullable = false)
    private Bill bill;
    //Relation with Product
    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    private Product product;

}
