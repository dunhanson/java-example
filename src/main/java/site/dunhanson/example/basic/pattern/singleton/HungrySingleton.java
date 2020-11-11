package site.dunhanson.example.basic.pattern.singleton;

/**
 * 饿汉单例模式（静态快初始化）
 */
public class HungrySingleton {

    // 私有构造函数
    private HungrySingleton() {

    }

    // 静态域
    private static HungrySingleton instance = null;

    // 静态代码块
    static {
        instance = new HungrySingleton();
    }

    // 静态的工厂方法
    public static HungrySingleton getInstance() {
        return instance;
    }

}
