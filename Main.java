public class Main {
    public static void main(String[] args) {
        CacheManager cacheManager = CacheManager.getInstance();
        cacheManager.put("name", "somnath");
        System.out.println(cacheManager.get("name")); // Output: value1
        System.out.println(cacheManager.get("name")); 
        cacheManager.clear();
        cacheManager.put("name", "lokesh");
        System.out.println(cacheManager.get("name")); 
    }
    
}
