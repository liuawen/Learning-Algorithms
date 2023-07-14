package cn.bugstack.xfg.frame.service;

import cn.bugstack.xfg.frame.domain.vo.UserVO;

import java.util.List;

public interface IUserService {

    List<UserVO> queryUserList();

    UserVO queryUserInfo(String uId);

}
