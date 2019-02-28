package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.enums.UserAddress;
import com.atguigu.gmall.bean.enums.UserInfo;

import java.util.List;

/**
 * @author shkstart
 * @create ${YEAT}-02-28 14:19
 */
public interface UserService {

    List<UserInfo> getAllUser();

    List<UserAddress> getAllAddress();

    List<UserInfo> allUser();
}
