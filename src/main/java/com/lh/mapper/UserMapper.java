package com.lh.mapper;

import com.lh.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @author LuoH
 * @date 2020/01/16
 */
@Mapper
public interface UserMapper {

    public List<User> queryUserList();
}
