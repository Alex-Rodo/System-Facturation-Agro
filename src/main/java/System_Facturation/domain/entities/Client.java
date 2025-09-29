package System_Facturation.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "client")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_client", length = 100, nullable = false)
    private String nameClient;
    @Column(name = "lastname_client", length = 100, nullable = false)
    private String lastnameClient;
    @Column(name = "dni", nullable = false)
    private Long dni;
    @Column(name = "email", nullable = false, length = 80)
    private String email;
    @Column(name = "phone", nullable = false)
    private int  phone;
    @Column(name = "date_birth", nullable = false)
    private Date dateBirth;
    @Column(name = "address",  nullable = false, length = 100)
    private String address;

}
