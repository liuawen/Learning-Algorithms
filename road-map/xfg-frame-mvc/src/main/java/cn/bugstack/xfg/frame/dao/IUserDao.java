package cn.bugstack.xfg.frame.dao;

import cn.bugstack.xfg.frame.domain.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDao {

    List<User> queryUserList();

}
