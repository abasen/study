import com.abasen.rabbitmq.RabbitmqFirstApplication;
import com.abasen.rabbitmq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author abasen
 * @Description: 消息测试
 * @date 2018-03-31 23:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitmqFirstApplication.class)
public class RabbitmqFirstApplicationTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() {
        sender.send();
    }
}
