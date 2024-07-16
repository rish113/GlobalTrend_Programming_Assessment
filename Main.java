public class Main {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        //took the test cases from a similar leetcode question
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));

        cache.put(3, 3);
        System.out.println(cache.get(2));

        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));

        LRUCache cache2 = new LRUCache(2);
        System.out.println(cache2.get(2));
        cache2.put(2, 6);
        System.out.println(cache2.get(1));
        cache2.put(1, 5);
        cache2.put(1, 2);
        System.out.println(cache2.get(1));
        System.out.println(cache2.get(2));

        LRUCache cache3 = new LRUCache(1);
        cache3.put(2, 1);
        System.out.println(cache3.get(2));
        cache3.put(3, 2);
        System.out.println(cache3.get(2));
        System.out.println(cache3.get(3));
    }
}


