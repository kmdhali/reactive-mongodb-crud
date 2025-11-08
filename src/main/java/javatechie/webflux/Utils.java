package javatechie.webflux;

import javatechie.webflux.dto.ProductDto;
import javatechie.webflux.entity.ProductEntity;
import org.springframework.beans.BeanUtils;

public class Utils {

    static void convertEntity2Dto(ProductEntity src, ProductDto dst){
        BeanUtils.copyProperties(src, dst);
    }

    static  void convertDto2Entity(ProductDto src, ProductEntity dst){
        BeanUtils.copyProperties(src, dst);
    }

}
