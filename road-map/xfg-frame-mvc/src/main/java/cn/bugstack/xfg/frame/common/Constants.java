package cn.bugstack.xfg.frame.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class Constants {

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public enum ResponseCode {
        SUCCESS("0000", "成功"),
        UN_ERROR("0001", "未知失败"),
        ILLEGAL_PARAMETER("0002", "非法参数"),
        INDEX_DUP("0003", "主键冲突");

        private String code;
        private String info;

    }

}
