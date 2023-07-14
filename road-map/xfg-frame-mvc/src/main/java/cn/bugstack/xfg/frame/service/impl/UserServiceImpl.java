package cn.bugstack.xfg.frame.service.impl;

import cn.bugstack.xfg.frame.dao.IUserDao;
import cn.bugstack.xfg.frame.domain.po.User;
import cn.bugstack.xfg.frame.domain.vo.UserVO;
import cn.bugstack.xfg.frame.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public List<UserVO> queryUserList() {
        List<UserVO> userInfoList = new ArrayList<>();
        List<User> users = userDao.queryUserList();
        for (User user : users) {
            UserVO userInfo = UserVO.builder()
                    .userId(user.getUserId())
                    .userNickname(user.getUserNickname())
                    .createTime(user.getCreateTime())
                    .build();
            userInfoList.add(userInfo);
        }
        return userInfoList;
    }

    @Override
    public UserVO queryUserInfo(String uId) {
        log.info("查询用户信息：{}", uId);
        return new UserVO();
    }

}
