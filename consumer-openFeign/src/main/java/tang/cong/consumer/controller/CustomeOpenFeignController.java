package tang.cong.consumer.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tang.cong.consumer.interfaces.CustomeFeign;

import javax.annotation.Resource;

/**
 * @author tangtiancong
 */
@RestController
public class CustomeOpenFeignController {
    private static final Log log = LogFactory.getLog(CustomeOpenFeignController.class);
    @Autowired
    private CustomeFeign customeFeign;
    @GetMapping("/hello1/{flag}")
    public String cusSay(@PathVariable String flag){
        log.info("使用openfeign远程调用服务开始");
        return customeFeign.sayHello(flag);
    }

}
