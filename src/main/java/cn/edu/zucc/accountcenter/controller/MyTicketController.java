package cn.edu.zucc.accountcenter.controller;

import cn.edu.zucc.accountcenter.pojo.BeanPerson;
import cn.edu.zucc.accountcenter.pojo.BeanSocialAccount;
import cn.edu.zucc.accountcenter.service.SocialAccountService;
import cn.edu.zucc.accountcenter.utils.MyHttpUtils;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author crabxyj
 * @date 2020/5/12 18:30
 */
@CrossOrigin
@RestController
@RequestMapping("/user/ticket")
public class MyTicketController {
    @Resource(name = "socialAccountServiceImpl")
    private SocialAccountService service;


    private static final String loginMod = "http://192.168.52.60:8080/thirdlogin/ticketLogin";

    @RequestMapping("/login")
    public JSONObject login(String platform,String ticket){
        MultiValueMap<String, String> data = new LinkedMultiValueMap<>();

        data.add("token","token");
        data.add("ticket",ticket);
        System.out.println(platform);
        System.out.println(ticket);
        JSONObject body = MyHttpUtils.post(loginMod, data);
        JSONObject result = new JSONObject();
        if (body.getIntValue("code")!=0){
            result.put("code",-1);
            result.put("msg","登录认证失败");
            return result;
        }

        System.out.println(body.toJSONString());

        body = body.getJSONObject("r");
        BeanSocialAccount account = new BeanSocialAccount()
                .setOpenId(body.getString("id"))
                .setPlatform(platform);
        BeanPerson person = new BeanPerson().setNickName(body.getString("account"));
        person = service.login(account,person);

        result.put("code",0);
        result.put("r",person);
        return result;
    }

    @RequestMapping("/logout")
    public void logout(long personId){

        // get session
        // login mod logout

    }

    public void verify(){

    }
}
