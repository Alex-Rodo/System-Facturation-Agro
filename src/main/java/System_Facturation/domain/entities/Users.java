package System_Facturation.domain.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "login")
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user", nullable = false, length = 100)
    private String user;
    @Column(name = "password", nullable = false, length = 25)
    private String password;
    //Relation with Role
    @ManyToOne
    @JoinColumn(name = "roleId", nullable = false)
    private Roles role;

}
