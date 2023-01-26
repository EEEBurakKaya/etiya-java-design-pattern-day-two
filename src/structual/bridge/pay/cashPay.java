package structual.bridge.pay;

public class cashPay extends PayBase {
    @Override
    public void pay() {
        System.out.println("Nakit Ödendi");
    }
}
