package pres.gx.ams.service;

import pres.gx.ams.dto.LockerBankDto;

/**
 * 功能描述：Asset Manager 相关服务
 *
 * @author gx
 * @since 2019-04-06
 */
public interface AmsService {

    /**
     * 功能描述：获取lockerBank数据
     *
     * @return lockerBank
     */
    LockerBankDto lockerBank();
}
