package pres.gx.ams.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pres.gx.ams.dto.LockerBankDto;
import pres.gx.ams.service.AmsService;

/**
 * 功能描述：Asset Manager 相关接口
 *
 * @author gx
 * @since 2019-04-06
 */
@RequestMapping("/ams")
@RestController
public class AmsController {

    public static final Logger LOGGER = LoggerFactory.getLogger(AmsController.class);

    @Autowired
    private AmsService amsService;

    /**
     * 功能描述：获取lockerBank数据
     *
     * @return lockerBank
     */
    @GetMapping("/lockerBank.do")
    public LockerBankDto lockerBank() {
        return amsService.lockerBank();
    }
}
