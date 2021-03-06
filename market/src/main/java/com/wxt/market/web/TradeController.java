package com.wxt.market.web;

import com.wxt.common.constant.ErrorCode;
import com.wxt.common.exception.BusinessRuntimeException;
import com.wxt.common.model.MarketPayRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @Auther: ThomasWu
 * @Date: 2021/6/9 15:54
 * @Description:账户交易相关
 */
@RestController
@RequestMapping(value = "/market")
public class TradeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TradeController.class);


    @PostMapping(value = "/tryPay")
    public boolean tryPay(@RequestBody MarketPayRequest request) {
        return Boolean.TRUE;
    }

    @PostMapping(value = "/comfirmPay")
    public boolean comfirmPay(@RequestBody MarketPayRequest request) {
        return Boolean.TRUE;
    }

    @PostMapping(value = "/cancelPay")
    public boolean cancelPay(@RequestBody MarketPayRequest request) {
        return Boolean.TRUE;
    }
}
