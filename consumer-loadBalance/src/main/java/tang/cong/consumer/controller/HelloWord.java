package tang.cong.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author tangtiancong
 */
@RestController
public class HelloWord {
    @Resource
    RestTemplate restTemplate;
    @RequestMapping(value = "/hello/{flag}",method = RequestMethod.GET)
    public String sayHello(@PathVariable String flag){
        return restTemplate.getForEntity("http://provider-server/sayHello/"+flag,String.class).getBody();
    }

}
