package System_Facturation.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class DetailDto {
    private Long id;
    private int quantity;
    private int price;
}
