package tang.cong.provider.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangtiancong
 */
@RestController
public class SimpleRequestDemo {
    @Value("${provider.name}")
    private String hostname;
    @RequestMapping(value = "/sayHello/{falg}",method = RequestMethod.GET)
    public String filterSay(@PathVariable String falg){
        System.out.println(hostname);
        if(null!=falg && ("true".equals(falg))){
            return "weblocme~";
        }else {
            return "sorry~";
        }
    }
}
