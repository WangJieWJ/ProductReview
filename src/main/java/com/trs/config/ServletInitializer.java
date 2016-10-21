package com.trs.config;

import com.season.core.spring.SeasonServletInitializer;

/**
 * Created by wangjie on 2016/10/14 0014.
 */
public class ServletInitializer extends SeasonServletInitializer{
    @Override
    protected Class<?> getAppClass() {
        return App.class;
    }
}
