package personal.bankAPI.repository;

import org.springframework.stereotype.Repository;
import personal.bankAPI.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
    private final List<Customer> customerList = new ArrayList<>();
    private Customer addCustomer(Customer customer) {
        customer.setId(customerList.size());
        customerList.add(customer);
        return customer;
    }

    private Customer getCustomerById(Integer id) {
        return customerList.get(id);
    }

    private List<Customer> getCustomerList() {
        return customerList;
    }
}
