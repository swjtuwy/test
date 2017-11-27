package java8;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestLamba01 {

    static Map<Integer, Integer> cache = new ConcurrentHashMap<Integer, Integer>();

    private static final String TEMPLATE_ONLINE_PATH = "/online/%s";

    public static void main(String[] args) {
        String deviceId ="e2e-uk-device-13.us.roaddb.ygomi.com";
        String test =String.format(TEMPLATE_ONLINE_PATH, deviceId);
        System.out.println(test);
//        for (int i = 0; i < 10; i++) {
//            System.out.println("f(" + i + ") = " + fibonacci1(i));
//        }
    }

    static int fibonacci(int i) {
        if (i == 0) {
            return i;
        }
        if (i == 1) {
            return 1;
        }
        System.out.println("calculating f(" + i + ")");
        return fibonacci(i - 2) + fibonacci(i - 1);
    }

    static int fibonacci1(int i) {

        if (i == 0) {
            return i;
        }
        if (i == 1) {
            return 1;
        }
        return cache.computeIfAbsent(i, (key) -> {
                    System.out.println("the key" + key);
                    return fibonacci1(i - 2) + fibonacci1(i - 1);
                }
        );
    }
}
