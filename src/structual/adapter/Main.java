package structual.adapter;

import structual.adapter.adapters.NotificationAdapter;
import structual.adapter.caching.DatabaseCache;
import structual.adapter.caching.FileCache;
import structual.adapter.services.CustomerService;
import structual.adapter.services.ICustomerService;

public class Main {
    public static void main(String[] args) {

        ICustomerService customerService = new CustomerService(new FileCache());
        customerService.add();

        System.out.println("***");

        ICustomerService customerService1 = new CustomerService(new DatabaseCache());
        customerService1.add();

        System.out.println("****");

        ICustomerService customerService2 = new CustomerService(new NotificationAdapter());
        customerService2.add();
    }
}
