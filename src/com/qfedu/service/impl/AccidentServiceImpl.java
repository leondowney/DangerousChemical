package com.qfedu.service.impl;

import com.qfedu.dao.AccidentDao;
import com.qfedu.dao.PersonDao;
import com.qfedu.dao.impl.AccidentDaoImpl;
import com.qfedu.dao.impl.PersonDaoImpl;
import com.qfedu.entity.Accident;
import com.qfedu.entity.AccidentCondition;
import com.qfedu.entity.Person;
import com.qfedu.entity.Result;
import com.qfedu.service.AccidentService;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/15 19:29
 * @describe：
 */
public class AccidentServiceImpl implements AccidentService {
    @Override
    public Result getAll(AccidentCondition ac) {
        AccidentDao accidentDao = new AccidentDaoImpl();

        List<Accident> all = accidentDao.getAll(ac);


        return new Result(0,"",all);
    }

    @Override
    public Integer getCount() {
        AccidentDao accidentDao = new AccidentDaoImpl();

        return  accidentDao.getCount().intValue();
    }
}
