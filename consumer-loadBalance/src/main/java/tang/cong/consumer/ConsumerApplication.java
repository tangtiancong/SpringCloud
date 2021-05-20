package tang.cong.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tang.cong.consumer.base.CustomBalancer;
import tang.cong.consumer.config.CustomBalanceConfig;

/**
 * @author tangtiancong
 *
 */
@EnableEurekaClient
@SpringBootApplication
@LoadBalancerClient(name = "provider-server",configuration = CustomBalanceConfig.class)
public class ConsumerApplication {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
