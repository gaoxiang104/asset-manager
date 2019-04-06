package pres.gx.ams.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * 功能描述：用于承载LockerBank数据的DTO
 *
 * @author gx
 * @since 2019-04-06
 */
@XStreamAlias("LockerBank")
public class LockerBankDto {

    @XStreamAlias("ColumnList")
    private List<LockersColumn> columnList;

    public List<LockersColumn> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<LockersColumn> columnList) {
        this.columnList = columnList;
    }

    @Override
    public String toString() {
        return "LockerBankDto{" +
                "columnList=" + columnList +
                '}';
    }
}
