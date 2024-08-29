package service;

import customer.Customer;

public interface CustomerService {
    void addCustomer(Customer customer);
    Customer getCustomer(int id);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
}
