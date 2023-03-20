package com.qfedu.dao.impl;

import com.qfedu.dao.AccidentDao;
import com.qfedu.entity.Accident;
import com.qfedu.entity.AccidentCondition;
import com.qfedu.entity.Person;
import com.qfedu.util.DButil;
import com.qfedu.util.StringUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/15 19:22
 * @describe：
 */
public class AccidentDaoImpl implements AccidentDao {
    @Override
    public List<Accident> getAll(AccidentCondition ac) {
        String sql="";
        String type = ac.getType();
        String date = ac.getDate();
        QueryRunner runner = new QueryRunner(DButil.getDataSource());
//        System.out.println(ac);
        List<Accident> a=null;

        try {


            if(StringUtil.isNull(type)){

                if(StringUtil.isNull(date)){//身份证参数 公司参数都没有的情况
                    sql="select  id,name,type,company,date,level,count,property,person,addr,solution,weight,reason,oper from accident where name like ?";
                    System.out.println("dddd");
                    a= runner.query(sql,new BeanListHandler<Accident>(Accident.class),"%"+ac.getName()+"%");
                    System.out.println("AccDao:"+a);
                    return a;
                }else{//没有身份证参数 有公司参数
                    sql="select  id,name,type,company,date,level,count,property,person,addr,solution,weight,reason,oper from accident where  date=? and name  like ?";
                    return runner.query(sql,new BeanListHandler<Accident>(Accident.class),date,"%"+ac.getName()+"%");
                }


            }else{//身份证参数是有的

                if(StringUtil.isNull(date)){
                    sql="select  id,name,type,company,date,level,count,property,person,addr,solution,weight,reason,oper from accident where  type=? and name  like ?";
                    return runner.query(sql,new BeanListHandler<Accident>(Accident.class),type,"%"+ac.getName()+"%");
                }else{
                    sql="select  id,name,type,company,date,level,count,property,person,addr,solution,weight,reason,oper from person where  type=? and  date=? and name  like ?";
                    return runner.query(sql,new BeanListHandler<Accident>(Accident.class),type,date,"%"+ac.getName()+"%");
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
            return runner.query("select count(*) from accident",new ScalarHandler<Long>());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
