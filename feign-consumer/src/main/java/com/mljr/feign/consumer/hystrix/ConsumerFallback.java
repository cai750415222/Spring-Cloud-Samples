package com.mljr.feign.consumer.hystrix;

import com.mljr.feign.consumer.depend.RemoteClient;
import org.springframework.stereotype.Component;

/**
 * Author:daoyuanXiong
 * Description: 熔断器
 * Date:Created in 下午9:26 2017/8/8
 * Copyright (c)  daoyuan.xiong@mljr.com All Rights Reserved.
 */
@Component
public class ConsumerFallback implements RemoteClient {

    @Override
    public String index() {
        return "Feign客户端访问失败!";
    }
}
