package pres.gx.ams.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

/**
 * 功能描述：LockerBank 子对象
 *
 * @author gx
 * @since 2019-04-06
 */
@XStreamAlias("LockersColumn")
public class LockersColumn {

    @XStreamAlias("LockersList")
    private List<LockerInfo> lockersList;

    public List<LockerInfo> getLockersList() {
        return lockersList;
    }

    public void setLockersList(List<LockerInfo> lockersList) {
        this.lockersList = lockersList;
    }

    @Override
    public String toString() {
        return "LockersColumn{" +
                "lockersList=" + lockersList +
                '}';
    }
}
