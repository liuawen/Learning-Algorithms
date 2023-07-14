package cn.bugstack.xfg.frame.domain.res;

import cn.bugstack.xfg.frame.common.Result;
import cn.bugstack.xfg.frame.domain.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRes {

    private Result result;
    private List<UserVO> userVOList;

}
