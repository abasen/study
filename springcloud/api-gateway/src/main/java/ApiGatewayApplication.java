import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author abasen
 * @Description: 应用主程序
 * @date 2018-03-31 17:24
 */
@EnableZuulProxy
public class ApiGatewayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGatewayApplication.class).web(true).run(args);
    }
}
