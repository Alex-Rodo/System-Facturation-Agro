package System_Facturation.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class SellerDto {
    private Long id;
    private String nameSeller;
    private String lastnameSeller;
    private int phone;
    private int dni;
}
