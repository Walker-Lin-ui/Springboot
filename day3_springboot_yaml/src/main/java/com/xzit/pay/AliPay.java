package com.xzit.pay;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Walker
 * @date 2025/11/1
 * @project springboot_xzit
 */
@Component
@Profile("dev")//如果你的开发环境是在dev，则使用支付宝进行支付
public class AliPay implements PayMent{
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
