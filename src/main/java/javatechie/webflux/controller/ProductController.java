package javatechie.webflux.controller;

import javatechie.webflux.entity.ProductEntity;
import javatechie.webflux.service.ProductService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductController {

    private final ProductService productService;

    ProductController(ProductService productService){
        this.productService =  productService;
    }

    @GetMapping(value = "/products", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ProductEntity> products(){
        return productService.getProducts();
    }

    @PostMapping(value = "product")
    public Mono<ProductEntity>  saveProduct(@RequestBody Mono<ProductEntity> product){
        return productService.saveProduct(product);
        //return product;
    }

}

