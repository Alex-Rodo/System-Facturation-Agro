package System_Facturation.domain.mapper;
import System_Facturation.domain.dto.*;
import System_Facturation.domain.entities.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface Mapp {

    Mapp INSTANCE = Mappers.getMapper(Mapp.class);
    //Client
    ClientDto toDto(Client client);
    Client toEntity(ClientDto client);
    List<ClientDto> toDtoCl(List<Client> clients);

    //Category
    CategoryDto toDto(Category category);
    Category toEntity(CategoryDto category);
    List<CategoryDto> toDtoCa(List<Category> categories);

    //Bill
    BillDto toDto(Bill bill);
    Bill toEntity(BillDto billes);
    List<BillDto> toDtoB(List<Bill> bills);

    //Detail
    DetailDto toDto(Detail detail);
    Detail toEntity(DetailDto detail);
    List<DetailDto> toDtoD(List<Detail> details);

    //Login
    LoginDto toDto(Users users);
    Users toEntity(LoginDto login);
    List<LoginDto> toDtoL(List<Users> users);

    //Pay
    PayDto toDto(Pay pay);
    Pay toEntity(PayDto pay);
    List<PayDto> toDtoP(List<Pay> pays);

    //Product
    ProductDto toDto(Product product);
    Product toEntity(ProductDto productDto);
    List<ProductDto> toDtoPro(List<Product> products);

    //Roles
    RolesDto toDto(RolesDto rolesDto);
    Roles toEntity(RolesDto rolesDto);
    List<RolesDto> toDtoR(List<Roles> roles);

    //Seller
    SellerDto toDto(SellerDto sellerDto);
    Seller toEntity(SellerDto sellerDto);
    List<SellerDto> toDtoS(List<Seller> sellers);



}
