package pres.gx.ams.service.impl;

import com.thoughtworks.xstream.XStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import pres.gx.ams.constant.AmsConstant;
import pres.gx.ams.dto.LockerBankDto;
import pres.gx.ams.service.AmsService;
import pres.gx.ams.utils.XStreamUtil;

@Service
public class AmsServiceImpl implements AmsService {
    public static final Logger LOGGER = LoggerFactory.getLogger(AmsServiceImpl.class);

    /**
     * 功能描述：获取lockerBank数据
     *
     * @return lockerBank
     */
    @Override
    public LockerBankDto lockerBank() {
        LockerBankDto result = null;
        try {
            // 获取LockerBank 原始XML数据
            Resource resource = new ClassPathResource(AmsConstant.DATA_PATH);
            // 使用XStream，解析XML，转换成java bean
            XStream xstream = XStreamUtil.getXStream();
            xstream.processAnnotations(LockerBankDto.class);
            result = (LockerBankDto) xstream.fromXML(resource.getInputStream());

        } catch (Exception e) {
            LOGGER.error("lockerBank error , e={}", e);
        }
        return result;
    }
}
