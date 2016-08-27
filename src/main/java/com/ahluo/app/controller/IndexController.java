package com.ahluo.app.controller;

import com.ahluo.app.bean.AhluoUser;
import com.ahluo.app.util.JsonUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 *      Index Controller
 * </pre>
 *
 * @author Ahluo on 2016-8-27.
 */
@RestController
@RequestMapping("start")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(@RequestParam(value = "type", required = false) String type) {
        if (type != null && "1".equals(type)) {
            return JsonUtil.getJson(getAhluoUserMap());
        }
        return JsonUtil.getJson(getAhluoUserList());
    }

    /**
     * get default user list info
     *
     * @return AhluoUser list
     */
    List<AhluoUser> getAhluoUserList() {

        List<AhluoUser> ahluoUserList = new ArrayList<>();
        AhluoUser user_1 = new AhluoUser();
        user_1.setUserName("Centos");
        user_1.setAge(102);
        AhluoUser user_2 = new AhluoUser();
        user_2.setUserName("Linux");
        user_2.setAge(101);
        AhluoUser user_3 = new AhluoUser();
        user_3.setUserName("Unix");
        user_3.setAge(103);
        ahluoUserList.add(user_1);
        ahluoUserList.add(user_2);
        ahluoUserList.add(user_3);
        return ahluoUserList;
    }

    Map<String, AhluoUser> getAhluoUserMap() {

        Map<String, AhluoUser> ahluoUserMap = new HashMap<>();
        AhluoUser user_1 = new AhluoUser();
        user_1.setUserName("Centos");
        user_1.setAge(102);
        AhluoUser user_2 = new AhluoUser();
        user_2.setUserName("Linux");
        user_2.setAge(101);
        AhluoUser user_3 = new AhluoUser();
        user_3.setUserName("Unix");
        user_3.setAge(103);
        ahluoUserMap.put("u1", user_1);
        ahluoUserMap.put("u2", user_2);
        ahluoUserMap.put("u3", user_3);
        return ahluoUserMap;
    }
}
