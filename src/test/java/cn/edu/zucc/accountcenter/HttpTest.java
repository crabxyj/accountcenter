package cn.edu.zucc.accountcenter;

import cn.edu.zucc.accountcenter.utils.MyHttpUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author crabxyj
 * @date 2020/5/13 12:57
 */
@SpringBootTest
public class HttpTest {

    public void testPost(){
        JSONObject d = new JSONObject();
        d.put("token","token");
        d.put("ticket","fc8666bc-07eb-4e12-a7b9-06a8789fbe1f");
        String url = "http://localhost:8080/thirdlogin/ticketLogin";

        RestTemplate client = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("token","token");
        map.add("ticket","fc8666bc-07eb-4e12-a7b9-06a8789fbe1f");

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
        JSONObject body = client.postForEntity(url, request, JSONObject.class).getBody();



        System.out.println(body.toJSONString());
    }


    public void testPost2(){
//        JSONObject d = new JSONObject();
//        d.put("token","token");
//        d.put("ticket","fc8666bc-07eb-4e12-a7b9-06a8789fbe1f");
        String url = "http://localhost:8080/thirdlogin/ticketLogin";
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

        map.add("token","token");
        map.add("ticket","fc8666bc-07eb-4e12-a7b9-06a8789fbe1f");

        JSONObject body = MyHttpUtils.post(url, map);
        System.out.println(body.toJSONString());
    }
}
