package site.dunhanson.example.basic.pattern.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println(hungrySingleton.hashCode());
        System.out.println(hungrySingleton.hashCode());
    }
}
