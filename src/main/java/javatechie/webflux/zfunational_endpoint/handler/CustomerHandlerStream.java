/*
package javatechie.webflux.zfunational_endpoint.handler;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerHandlerStream {

    private final CustomerDao customerDao;

    CustomerHandlerStream(CustomerDao customerDao){
        this.customerDao =  customerDao;
    }

    public Mono<ServerResponse> loadCustomersStream(ServerRequest serverResuest){
        Flux<Customer> customerStream =  customerDao.getCustomersStream();
        return ServerResponse.ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(customerStream, Customer.class);
    }
}

*/