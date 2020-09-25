package com.data.exception;

import com.data.common.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = -5847672356528343616L;

    private Integer code;

    public GlobalException(Throwable cause) {
        super(cause);
    }

    public GlobalException(ResultEnum re) {
        super(re.getMsg());
        this.code = re.getCode();
    }
}
