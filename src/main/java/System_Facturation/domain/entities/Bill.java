package System_Facturation.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bill")
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numBill;
    @Column(name = "date",  nullable = false)
    private Date date;
    //Relation with Client
    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;
    //Relation with Seller
    @ManyToOne
    @JoinColumn(name = "sellerId", nullable = false)
    private Seller seller;
    //Relation with Pay
    @ManyToOne
    @JoinColumn(name = "payId", nullable = false)
    private Pay pay;
    //Relation with Details
    @OneToMany(mappedBy = "bill", cascade = CascadeType.ALL)
    private List<Detail> details;

}
