package javatechie.webflux.service;

import javatechie.webflux.dao.CustomerDao;
import javatechie.webflux.dto.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerDao customerDao;

    CustomerService(CustomerDao customerDao){
        this.customerDao=customerDao;
    }

    //traditional
    public List<Customer> loadAllCustomer(){
        return customerDao.getCustomers();
    }

    //Flux Stream
    public Flux<Customer> loadAllCustomerStream(){
        return customerDao.getCustomersStream();
    }


}
