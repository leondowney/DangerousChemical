package com.qfedu.dao.impl.AccidentAnalyseDaoImpl;

import com.qfedu.dao.AccidentAnalyseDao;
import com.qfedu.entity.AccidentAnalyse;
import com.qfedu.entity.AccidentCondition;
import com.qfedu.util.DButil;
import com.qfedu.util.StringUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/16 14:57
 * @describe：
 */
public class ReasonDaoImpl implements AccidentAnalyseDao {
    @Override
    public List<AccidentAnalyse> getAll(AccidentCondition ac) {
        QueryRunner queryRunner = new QueryRunner(DButil.getDataSource());

        List<AccidentAnalyse> accidentAnalyses =null;
        String type = ac.getType();
        String begin = ac.getBegin();
        String end = ac.getEnd();

        boolean bType = StringUtil.isNull(type);
        boolean bBegin = StringUtil.isNull(begin);
        boolean bEnd = StringUtil.isNull(end);

        String sql1 = "select reason as 'name',count(*) as 'value' from accident";
        String sql2 = " where";
        String sql3 = " and";
        String sql4 = " type = ?";
        String sql5 = " time > ?";
        String sql6 = " time < ?";
        String sql7 = " group by reason";

        try {
            if (bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql7,new BeanListHandler<>(AccidentAnalyse.class));
            }
            if (!bType && bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql7,new BeanListHandler<>(AccidentAnalyse.class),type);
            }
            if (bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql7,new BeanListHandler<>(AccidentAnalyse.class),begin);
            }
            if (bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql6+sql7,new BeanListHandler<>(AccidentAnalyse.class),end);
            }
            if (!bType && !bBegin && bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql7,new BeanListHandler<>(AccidentAnalyse.class),type,begin);
            }
            if (!bType && bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql6+sql7,new BeanListHandler<>(AccidentAnalyse.class),type,end);
            }
            if (bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql5+sql3+sql6+sql7,new BeanListHandler<>(AccidentAnalyse.class),begin,end);
            }
            if (!bType && !bBegin && !bEnd) {
                return queryRunner.query(sql1+sql2+sql4+sql3+sql5+sql3+sql6+sql7,
                        new BeanListHandler<>(AccidentAnalyse.class),type,begin,end);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
