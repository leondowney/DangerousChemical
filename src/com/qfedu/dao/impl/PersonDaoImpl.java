package com.qfedu.dao.impl;

import com.qfedu.dao.PersonDao;
import com.qfedu.entity.Person;
import com.qfedu.entity.PersonCondition;
import com.qfedu.util.DButil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/12 09:58
 * @describe：
 */
public class PersonDaoImpl implements PersonDao {
    @Override
    public List<Person> getAll(PersonCondition cc) {
        String sql="";
        String num = cc.getNum();
        String company = cc.getCompany();
        QueryRunner runner = new QueryRunner(DButil.getDataSource());


        try {


            if(num==null||"".equals(num)){

                if(company==null||"".equals(company)){//身份证参数 公司参数都没有的情况
                    sql="select * from person where name like ?";
//                    System.out.println("dddd");
                    return runner.query(sql,new BeanListHandler<Person>(Person.class),"%"+cc.getName()+"%");
                }else{//没有身份证参数 有公司参数
                    sql="select * from person where  company=? and name  like ?";
                    return runner.query(sql,new BeanListHandler<Person>(Person.class),company,"%"+cc.getName()+"%");
                }


            }else{//身份证参数是有的

                if(company==null||"".equals(company)){
                    sql="select * from person where  num=? and name  like ?";
                    return runner.query(sql,new BeanListHandler<Person>(Person.class),num,"%"+cc.getName()+"%");
                }else{
                    sql="select * from person where  num=? and  company=? and name  like ?";
                    return runner.query(sql,new BeanListHandler<Person>(Person.class),num,company,"%"+cc.getName()+"%");
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public Long getCount() {
        QueryRunner runner = new QueryRunner(DButil.getDataSource());
        try {
            return runner.query("select count(*) from person",new ScalarHandler<Long>());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}
