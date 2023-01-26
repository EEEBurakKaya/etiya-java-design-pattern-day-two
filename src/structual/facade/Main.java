package structual.facade;

import structual.facade.facades.CrossCuttingConcernsFacade;
import structual.facade.services.IProductService;
import structual.facade.services.ProductService;


public class Main {

    public static void main(String[] args) {
        IProductService productService = new ProductService(new CrossCuttingConcernsFacade());
        productService.save();
    }
}
