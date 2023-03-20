package com.qfedu.service.impl.AccidentAnalyseServiceImpl;

import com.qfedu.dao.AccidentAnalyseDao;
import com.qfedu.dao.impl.AccidentAnalyseDaoImpl.LevelDaoImpl;
import com.qfedu.entity.Accident;
import com.qfedu.entity.AccidentAnalyse;
import com.qfedu.entity.AccidentCondition;
import com.qfedu.entity.Result;
import com.qfedu.service.AccidentAnalyseService;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/16 19:01
 * @describe：
 */
public class LevelServiceImpl implements AccidentAnalyseService {
    AccidentAnalyseDao accidentAnalyseDao=new LevelDaoImpl();
    @Override
    public Result getAll(AccidentCondition ac) {
        List<AccidentAnalyse> accidentList = accidentAnalyseDao.getAll(ac);

        Result rs = new Result(0,"查询成功!",accidentList);

        return rs;
    }
}
