package structual.adapter.caching;

public class DatabaseCache implements ICache{
    @Override
    public void cache() {
        System.out.println("DataBase cache.");
    }
}
