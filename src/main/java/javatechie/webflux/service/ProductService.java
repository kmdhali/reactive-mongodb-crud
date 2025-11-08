package javatechie.webflux.service;

import javatechie.webflux.entity.ProductEntity;
import javatechie.webflux.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final ProductRepository repository;

    ProductService(ProductRepository productRepository){
        this.repository =productRepository;
    }

    public Flux<ProductEntity> getProducts(){
        return repository.findAll();
    }

    public Mono<ProductEntity> getProduct(String id){
        return repository.findById(id);
    }

    public Mono<ProductEntity> saveProduct(Mono<ProductEntity> product){
        return product.flatMap(repository::insert);

    }


}
