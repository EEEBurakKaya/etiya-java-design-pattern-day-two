package structual.facade.services;

import structual.facade.facades.CrossCuttingConcernsFacade;

public class ProductService implements IProductService{

    CrossCuttingConcernsFacade crossCuttingConcernsFacade;

    public ProductService(CrossCuttingConcernsFacade crossCuttingConcernsFacade) {
        this.crossCuttingConcernsFacade = crossCuttingConcernsFacade;
    }

    @Override
    public void save() {
        // authorization
        // caching
        // logging
        crossCuttingConcernsFacade.authorization.authorize();
        crossCuttingConcernsFacade.caching.cache();
        crossCuttingConcernsFacade.logger.log();
        System.out.println("Product saved");
    }
}
