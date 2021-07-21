public class GcTest {
    public static void main(String[] args) {
        gctest();
    }

//    逃逸分析，降低gc频率
//-XX:+PrintGC -Xms5M -Xmn5M -XX:-DoEscapeAnalysis
//    public static void gctest() {
//        for (int i = 0; i < 5_000_000; i++) {
//            createObject();
//        }
//    }
//    public static void createObject() {
//        new Object();
//    }

//    逃逸分析，去除同步操作
//    -XX:+PrintGC -Xms500M -Xmn500M -XX:-DoEscapeAnalysis
    public static void gctest() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5_000_000; i++) {
            createObject();
        }
        System.out.println("cost = " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void createObject() {
        synchronized (new Object()) {

        }
    }
}
