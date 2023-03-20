package com.qfedu.service.impl;

import com.qfedu.dao.PersonDao;
import com.qfedu.dao.impl.PersonDaoImpl;
import com.qfedu.entity.PersonCondition;
import com.qfedu.entity.Result;
import com.qfedu.entity.Person;
import com.qfedu.service.PersonService;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/12 10:09
 * @describe：
 */
public class PersonServiceImpl implements PersonService {
    @Override
    public Result getAll(PersonCondition cc) {
        PersonDao personDao = new PersonDaoImpl();

        List<Person> all = personDao.getAll(cc);


        return new Result(0,"",all);
    }

    @Override
    public Integer getCount() {
        PersonDao personDao = new PersonDaoImpl();

        return  personDao.getCount().intValue();
    }
}
