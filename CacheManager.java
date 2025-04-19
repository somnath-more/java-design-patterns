
import java.util.HashMap;
import java.util.Map;

class CacheManager{
    private static CacheManager instance;
    private Map<String, Object> cache;

    private CacheManager() {
        cache = new HashMap<>();
        System.out.println("CacheManager instance created.");
    }

    public static synchronized CacheManager getInstance() {
        if (instance == null) {
            instance = new CacheManager();
        }
        return instance;
    }

    public void put(String key, Object value) {
        cache.put(key, value);
    }

    public Object get(String key) {
        return cache.get(key);
    }

    public void clear() {
        cache.clear();
    }
}
