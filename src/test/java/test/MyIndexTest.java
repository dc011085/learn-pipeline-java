package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import util.HttpClientUtil;

import static org.junit.Assert.assertTrue;

public class MyIndexTest {
    /**
     * 测试代码
     */
    public static void main (String[] args){
        String url ="https://pay.qunar.com/mobile/h5/personalcenter/newIndexImprove.htm";
        String responseStr = HttpClientUtil.doPost(url);
        JSONObject obj = JSON.parseObject(responseStr);
        String status = obj.getString("status");
        System.out.println(responseStr);
        System.out.println(status);
    }

    /**
     * 我的页面，newIndexProver接口测试-未登录
     */
    @Test
    public void newIndex(){
        String url ="https://pay.qunar.com/mobile/h5/personalcenter/newIndexImprove.htm";
        String responseStr = HttpClientUtil.doPost(url);
        JSONObject obj = JSON.parseObject(responseStr);
        String status = obj.getString("status");
        System.out.println(responseStr);
        System.out.println(status);
        assertTrue("22032".equals(obj.getString("status")));
    }
}
