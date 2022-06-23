package com.suke.czx.modules;

import com.suke.czx.common.annotation.AuthIgnore;
import com.suke.czx.common.annotation.LoginUser;
import com.suke.czx.common.base.AbstractController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/app")
public class TestController extends AbstractController {

    /**
     * @Author czx
     * @Description //TODO 需要token
     * @Date 14:42 2019/4/19
     * @Param [userId]
     * @return java.lang.String
     **/
    @RequestMapping(value = "/getUserId")
    public String getUserId(@LoginUser String userId){
        log.debug("userId:" + userId);
        return "uid";
    }

    /**
     * @Author czx
     * @Description //TODO 不需要token
     * @Date 14:43 2019/4/19
     * @Param []
     * @return java.lang.String
     **/
    @AuthIgnore
    @RequestMapping(value = "/hello")
    public String hello(){
        return "--------------------hello";
    }

}
