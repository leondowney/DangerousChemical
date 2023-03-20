package com.qfedu.dao.impl;

import com.qfedu.dao.PerCerDao;
import com.qfedu.entity.Certification;
import com.qfedu.entity.Person;
import com.qfedu.util.DButil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/14 09:08
 * @describe：
 */
public class PerCerDaoImpl implements PerCerDao {
    @Override
    public List<Certification> getAll(Integer id) {

        QueryRunner runner = new QueryRunner(DButil.getDataSource());
        System.out.println(id);
        List<Certification> c = null;
        try {
            c= runner.query("SELECT name,url FROM certification c,percer pc WHERE pc.cid=c.id AND pc.pid= ? ", new BeanListHandler<Certification>(Certification.class),id);
            System.out.println("Dao:"+c);
            return c;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
