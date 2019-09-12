package me.qixiaobo.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.junit.Test;


/**
 * @author qixiaobo
 */

public class NetJsonNullExample {



    @Test
    public void testNormal() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(new TestObject(null)));
    }

    @Test
    public void testAbNormal() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(JSONObject.fromObject(new TestObject(null))));
    }
}
