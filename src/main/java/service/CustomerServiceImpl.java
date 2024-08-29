package service;
import customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private List<Customer> customers = new ArrayList<>();

    private NotificationService notificationService;

    @Autowired
    public CustomerServiceImpl(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
        notificationService.sendEmailNotification(customer);
        System.out.println("Customer added: " + customer.getName());
    }

    @Override
    public Customer getCustomer(int id) {
        return customers.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void updateCustomer(Customer customer) {
        int index = customers.indexOf(getCustomer(customer.getId()));
        if (index != -1) {
            customers.set(index, customer);
            System.out.println("Customer updated: " + customer.getName());
        } else {
            System.out.println("Customer not found: " + customer.getName());
        }
    }

    @Override
    public void deleteCustomer(int id) {
        Customer customer = getCustomer(id);
        if (customer != null) {
            customers.remove(customer);
            System.out.println("Customer deleted: " + customer.getName());
        } else {
            System.out.println("Customer not found with ID: " + id);
        }
    }
}