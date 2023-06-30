package uz.pdp.ecommerce.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.ecommerce.domain.entity.ProductEntity;
import uz.pdp.ecommerce.domain.entity.UserEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BasketCreateDto {

    private UserEntity user;

    private ProductEntity product;

    private Integer amount;

    private Double totalPrice;

}
