package javatechie.webflux.controller;

import javatechie.webflux.dto.Customer;
import javatechie.webflux.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

   private final CustomerService customerService;
   public CustomerController(CustomerService customerService){
       this.customerService=customerService;
   }

   @GetMapping("/traditional")
    public List<Customer> getCustomerList(){
       return customerService.loadAllCustomer();
    }

    @GetMapping(value = "/flux_stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Customer> getCustomerListFluxStream(){
        return customerService.loadAllCustomerStream();
    }

}
