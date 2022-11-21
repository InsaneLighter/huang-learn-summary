package com.huang.producer;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Time 2022-11-14 11:09
 * Created by Huang
 * className: KafkaController
 * Description:
 */
@RestController
public class KafkaController {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @RequestMapping("/kafka/send/01")
    public JSONObject send1(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key1","value1");
        jsonObject.put("key2","value2");
        kafkaTemplate.send("topic1", jsonObject.toJSONString());
        return jsonObject;
    }
}
