package structual.bridge.pay;

public class cardPay extends PayBase {
    @Override
    public void pay() {
        System.out.println("Kart ile ödendi.");
    }
}
