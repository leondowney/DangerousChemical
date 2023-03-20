package com.qfedu.dao.impl;

import com.qfedu.dao.AccidentOneDao;
import com.qfedu.entity.Accident;
import com.qfedu.entity.Person;
import com.qfedu.util.DButil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @author Leon Downey
 * @date 2023/3/16 10:13
 * @describe：
 */
public class AccidentOneDaoImpl implements AccidentOneDao {
    QueryRunner runner = new QueryRunner(DButil.getDataSource());
    @Override
    public Accident getOneById(String id) {
        String sql = "select * from accident where id = ?";
        try {
            return runner.query(sql,new BeanHandler<Accident>(Accident.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
