package com.atguigu.gmall.user.service.impl;
import com.atguigu.gmall.bean.enums.UserAddress;
import com.atguigu.gmall.bean.enums.UserInfo;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.user.mapper.UserAddressMapper;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @create ${YEAT}-02-28 13:56
 */
@Service
public class UserInfoServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> getAllUser() {
        List<UserInfo> userInfos = userInfoMapper.selectAllUser();

        return userInfos;
    }

    @Override
    public List<UserAddress> getAllAddress() {

        List<UserAddress> userAddresses = userAddressMapper.selectAll();

        return userAddresses;
    }

    @Override
    public List<UserInfo> allUser() {

        return userInfoMapper.selectAll();
    }
}
