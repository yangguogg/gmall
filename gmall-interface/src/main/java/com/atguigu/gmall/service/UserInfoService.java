package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService  {

    /**
     * 获取全部员工信息
     */
    List<UserInfo> getAllList();

    /**
     * 根据员工id查询地址
     */
    List<UserAddress> getUserAddressById(String userId);
}
