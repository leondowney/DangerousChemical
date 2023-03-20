package com.qfedu.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Leon Downey
 * @date 2023/3/12 00:17
 * @describe：
 */
public class DButil {


    private static DruidDataSource ds;
    private static Properties pp=new Properties();
    static {
        InputStream is = DButil.class.getResourceAsStream("/database.properties");


        try {
            pp.load(is);
            ds =(DruidDataSource) DruidDataSourceFactory.createDataSource(pp);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static Connection getConnection(){

        try {
            return ds.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static  DataSource getDataSource(){
        return ds;
    }
}
