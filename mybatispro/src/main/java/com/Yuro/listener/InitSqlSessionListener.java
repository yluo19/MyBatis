package com.Yuro.listener;


import com.Yuro.utils.SqlSessionFactoryUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitSqlSessionListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        System.out.println("容器加载中。。");
        // 初始化SqlSessionFactory

        SqlSessionFactoryUtils.initSqlSessionFactory();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("容器销毁中。。");
        SqlSessionFactoryUtils.close();
    }
}
