package structual.adapter.services;

import structual.adapter.caching.ICache;

public class CustomerService implements ICustomerService{

    private ICache iCache;

    public CustomerService(ICache iCache){
        this.iCache=iCache;
    }

    @Override
    public void add() {
        iCache.cache();
        System.out.println("Customer cache.");
    }
}
