import org.junit.Test;
import site.dunhanson.example.basic.basic.MonitorPushMode;

public class EnumTest {
    @Test
    public void test() {
        MonitorPushMode pushMode = MonitorPushMode.EMAIL;
        System.out.println(pushMode.getValue());
    }
}
