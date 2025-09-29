package System_Facturation.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class ProductDto {
    private Long id;
    private String product_name;
    private int  stock;
    private double price;
}
