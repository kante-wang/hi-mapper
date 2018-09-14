package wang.kante.himapper.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wcw_2007@163.com
 * @Date: 2018/9/14 13:34
 * @Description:
 */
public class ResultUtil {
    /**
     * 状态码
     */
    public final static String STATE_KEY = "status";

    /**
     * 返回的描述信息
     */
    public final static String DATA_KEY = "data";

    /**
     * 成功状态码
     */
    public final static String STATE_OK_1 = "1";
    /**
     * 参数错误
     */
    public final static String ERR_2 = "2";


    public static Map<String, Object> put(String state, Object data) {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put(STATE_KEY, state);
        dataMap.put(DATA_KEY, data);
        return dataMap;
    }

}
