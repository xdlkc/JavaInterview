public class ClassTest {
    public static void main(String[] args) {
        // 获取类对象的方法
        String s = new String("s");
        // 方法1：通过类的getClass()方法
        Class<?> stringClass = s.getClass();
        // 方法2：通过类的静态成员class
        Class<?> stringClass2 = String.class;
        // 方法3：通过Class的静态方法forName传入限定名生成
        try {
            Class<?> stringClass3 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
