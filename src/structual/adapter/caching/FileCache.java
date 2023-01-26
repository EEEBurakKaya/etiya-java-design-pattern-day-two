package structual.adapter.caching;

public class FileCache implements ICache{

    @Override
    public void cache() {
        System.out.println("File'a cache.");
    }
}
