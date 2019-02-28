package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.enums.UserInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author shkstart
 * @create ${YEAT}-02-28 13:58
 */
public interface UserInfoMapper extends Mapper<UserInfo> {
    List<UserInfo> selectAllUser();
}
