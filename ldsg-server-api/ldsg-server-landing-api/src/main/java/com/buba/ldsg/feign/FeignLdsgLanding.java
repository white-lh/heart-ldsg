package com.buba.ldsg.feign;

import com.buba.ldsg.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//通过@FeignClient来指定到要远程请求的服务，name里面就是远程服务的服务名
@FeignClient(name = "ldsg-landing")
public interface FeignLdsgLanding {
    //feign接口里面的方法定义：一定要跟调用的远程方法的返回值、参数、url地址保持一致
    //方法名可以保持一致，也可以改动

    @RequestMapping(value = "/toLogin")
    @ResponseBody
    String toLogin(@RequestBody User user);

    @RequestMapping(value = "/toRegister")
    @ResponseBody
    Boolean toRegister(@RequestBody User user);
}
