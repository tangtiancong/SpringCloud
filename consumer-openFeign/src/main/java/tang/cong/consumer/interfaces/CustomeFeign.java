package tang.cong.consumer.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * @author tangtiancong
 */
@FeignClient(value = "provider-server")
public interface CustomeFeign {
    @GetMapping("/sayHello/{flag}")
    String sayHello(@PathVariable String flag);

}
