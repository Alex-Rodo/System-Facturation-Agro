package System_Facturation.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pay")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100, name = "payment_method")
    private String paymentMethod;

}
