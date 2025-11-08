package javatechie.webflux.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDto {
    private String id;
    private String name;
    private int qty;
    private double price;
}
