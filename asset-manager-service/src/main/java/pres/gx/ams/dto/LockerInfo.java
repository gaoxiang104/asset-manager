package pres.gx.ams.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 功能描述：LockerBank 子对象
 *
 * @author gx
 * @since 2019-04-06
 */
@XStreamAlias("LockerInfo")
public class LockerInfo {
    @XStreamAlias("Name")
    private String name;
    @XStreamAlias("Size")
    private String size;
    @XStreamAlias("Terminal")
    private Boolean terminal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getTerminal() {
        return terminal;
    }

    public void setTerminal(Boolean terminal) {
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        return "LockerInfo{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", terminal=" + terminal +
                '}';
    }
}
