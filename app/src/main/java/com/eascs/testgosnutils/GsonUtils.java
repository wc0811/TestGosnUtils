package com.eascs.testgosnutils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Create By chao.wang on 2017/10/11 09:48
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class GsonUtils {
    public static <T> T parseJsonWithGosn(String pStrJsonData, Class<T> type) {
        Gson gson = new Gson();
        T result = gson.fromJson(pStrJsonData, type);
        return result;
    }

    public static <T> List<T> parseJsonArrayWithGosn(String pStrJsonData, Class<T> type) {
        Gson gosn = new Gson();
        List<T> result = gosn.fromJson(pStrJsonData, new TypeToken<List<T>>() {
        }.getType());
        return result;
    }
}
