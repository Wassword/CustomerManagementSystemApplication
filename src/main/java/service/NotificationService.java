package service;

import customer.Customer;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {


    public void sendEmailNotification(Customer customer){
        System.out.println("Notification sent to "+customer.getEmail());
    }
}
