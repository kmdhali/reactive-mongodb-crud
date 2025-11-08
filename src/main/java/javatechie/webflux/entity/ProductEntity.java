package javatechie.webflux.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "products")
public class ProductEntity {
    @Id
    private String id;
    private String name;
    private int qty;
    private double price;
}
