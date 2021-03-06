package com.lpgxp.chapter.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 努力常态化
 * date 2018/4/16  7:30
 */
@Component
public class BlogProperties {

    @Value("${com.lp.name}")
    private String name;
    @Value("${com.lp.title}")
    private String title;
    @Value("${com.lp.desc}")
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
