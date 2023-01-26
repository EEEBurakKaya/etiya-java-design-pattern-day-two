package structual.bridge.services;

import structual.bridge.pay.PayBase;

public class CustomerService implements ICustomerService{

    public PayBase payBase;

    @Override
    public void choice() {
        payBase.pay();
    }
}
