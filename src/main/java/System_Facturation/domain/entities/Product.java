package System_Facturation.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name_product",  nullable = false, length = 100)
    private String nameProduct;
    @Column(name = "stock",   nullable = false)
    private int stock;
    @Column(name = "price",   nullable = false)
    private double price;
    //Relation with Category
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;


}
