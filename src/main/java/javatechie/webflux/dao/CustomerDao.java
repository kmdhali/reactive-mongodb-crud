package javatechie.webflux.dao;

import javatechie.webflux.dto.Customer;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class CustomerDao {

    public List<Customer> getCustomers(){
        return  IntStream.range(0, 10)
                .mapToObj(i-> new Customer(i, "Customer : "+i))
                .collect(Collectors.toList());

    }

    /**
     * create a stream of customer objects
     */
    public Flux<Customer> getCustomersStream(){
        return Flux.range(1, 50)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(i ->  System.out.println("processing count "+ i))
                .map(i -> new Customer(i, "customer "+i));
    }
}
