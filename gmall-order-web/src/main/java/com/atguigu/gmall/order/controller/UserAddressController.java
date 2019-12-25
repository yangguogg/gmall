package com.atguigu.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class UserAddressController {

    @Reference
    private UserInfoService userInfoService;

    @RequestMapping("trade")
    public List<UserAddress> trade(@PathParam("userId") String userId){

        return userInfoService.getUserAddressById(userId);

    }
}
