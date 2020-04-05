package com.warehouse.common;

import com.warehouse.pojo.Users;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

public class UserMap {

    private static Map<String, HttpSession> maps = new HashMap<>();

    public static void addUser(String key, HttpSession value){
        maps.put(key, value);
    }

    public static Users getUser(HttpServletRequest request){

        HttpSession session = maps.get(request.getHeader("token"));

        return (Users) session.getAttribute("users");
    }

    public Map<String, HttpSession> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, HttpSession> maps) {
        this.maps = maps;
    }
}
