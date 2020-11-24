package com.whz.handler;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 卫宏哲
 * 业务异常可以捕获的
 */
@Data
///所有有参数构造
@AllArgsConstructor
@NoArgsConstructor
public class BusinessException extends RuntimeException{

    @ApiModelProperty(value = "状态码")
    private Integer code;

    @ApiModelProperty(value = "错误信息")
    private String errMsg;
}
