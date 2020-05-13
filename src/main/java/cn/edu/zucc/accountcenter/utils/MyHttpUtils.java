package cn.edu.zucc.accountcenter.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author crabxyj
 * @date 2020/5/12 18:32
 */
public class MyHttpUtils {
    public static JSONObject post(String url, MultiValueMap<String, String> map){
        RestTemplate client = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<MultiValueMap<String,String>> request = new HttpEntity<>(map, headers);
        JSONObject body = client.postForEntity(url, request, JSONObject.class).getBody();
        return body;
    }
    public static void get(){

    }
}
