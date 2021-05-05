package com.ptit.commmercialptit.singleton;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
    private static volatile Connection connection;

    @Value("${spring.datasource.url}")
    private static String url;
    @Value("${spring.datasource.username}")
    private static String username;
    @Value("${spring.datasource.password}")
    private static String password;

    private BaseDao(){

    }

    public static Connection getInstance(){
        if(connection == null){
            synchronized (BaseDao.class){
                if(connection == null){
                    try {
                        connection = DriverManager.getConnection(url, username, password);
                    } catch (SQLException throwable) {
                        throwable.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }
}
