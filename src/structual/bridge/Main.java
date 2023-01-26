package structual.bridge;

import structual.bridge.pay.cardPay;
import structual.bridge.pay.cashPay;
import structual.bridge.services.CustomerService;

public class Main {
    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        customerService.payBase = new cardPay();
        customerService.choice();

        customerService.payBase = new cashPay();
        customerService.choice();

    }
}
