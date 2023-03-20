package com.qfedu.service.impl;

import com.qfedu.dao.AccidentOneDao;
import com.qfedu.dao.PersonOneDao;
import com.qfedu.dao.impl.AccidentOneDaoImpl;
import com.qfedu.dao.impl.PersonOneDaoImpl;
import com.qfedu.entity.Accident;
import com.qfedu.entity.Person;
import com.qfedu.entity.Result;
import com.qfedu.service.AccidentOneService;

/**
 * @author Leon Downey
 * @date 2023/3/16 10:14
 * @describe：
 */
public class AccidentOneServiceImpl implements AccidentOneService {
    private AccidentOneDao accidentOneDao = new AccidentOneDaoImpl();

    @Override
    public Result getOne(String id) {
        Accident accident = accidentOneDao.getOneById(id);
        return new Result(200,"发送成功",accident);
    }
}
