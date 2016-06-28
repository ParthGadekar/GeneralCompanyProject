package com.company.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.company.model.UserEntity;

import java.util.List;

/**
 * Created by Administrator on 2016/6/23.
 */
public class JsonUtil {
    public static String toJsonString(UserEntity userEntity) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("{");
//        sb.append("\"id\":");
//        sb.append("\"" + user.getId() + "\"");
//        sb.append(",\"username\":");
//        sb.append("\"" + user.getUsername() + "\"");
//        sb.append(",\"password\":");
//        sb.append("\"" + user.getPassword() + "\"");
//        sb.append(",\"hometown\":");
//        sb.append("\"" + user.getHometown() + "\"");
//        sb.append(",\"gender\":");
//        sb.append("\"" + user.getGender() + "\"");
//        sb.append(",\"birthday\":");
//        sb.append("\"" + user.getBirthday() + "\"");
//        sb.append(",\"inarmydate\":");
//        sb.append("\"" + user.getInarmydate() + "\"");
//        sb.append(",\"outarmydate\":");
//        sb.append("\"" + user.getOutarmydate() + "\"");
//        sb.append(",\"department\":");
//        sb.append("\"" + user.getDepartment() + "\"");
//        sb.append("}");
//        return sb.toString();
        JSONObject jo = new JSONObject();
        jo.put("id", userEntity.getId());
        jo.put("username", userEntity.getUsername());
        jo.put("password", userEntity.getPassword());
        jo.put("hometown", userEntity.getHometown());
        jo.put("gender", userEntity.getGender());
        jo.put("birthday", userEntity.getBirthday());
        jo.put("inarmydate", userEntity.getInarmydate());
        jo.put("outarmydate", userEntity.getOutarmydate());
        jo.put("department", userEntity.getDepartment());
        return jo.toString();
    }

    public static String listToJsonString(List<UserEntity> userEntities) {
        JSONArray json = new JSONArray();
        for (UserEntity userEntity : userEntities) {
            JSONObject jo = new JSONObject();
            jo.put("id", userEntity.getId());
            jo.put("username", userEntity.getUsername());
            jo.put("password", userEntity.getPassword());
            jo.put("hometown", userEntity.getHometown());
            jo.put("gender", userEntity.getGender());
            jo.put("birthday", userEntity.getBirthday());
            jo.put("inarmydate", userEntity.getInarmydate());
            jo.put("outarmydate", userEntity.getOutarmydate());
            jo.put("department", userEntity.getDepartment());
            json.add(jo);
        }
        return json.toString();
    }
}