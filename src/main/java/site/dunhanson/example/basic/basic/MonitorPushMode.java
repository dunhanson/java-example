package site.dunhanson.example.basic.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum MonitorPushMode {
    /**
     * 微信
     */
    WEI_XIN("WEI_XIN"),
    /**
     * 邮件
     */
    EMAIL("EMAIL"),
    /**
     * 短信
     */
    MESSAGE("MESSAGE");

    private String value;

    public String valueOf() {
        return this.getValue();
    }
}
