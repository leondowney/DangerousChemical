package com.qfedu.service.impl;

import com.qfedu.dao.PersonOneDao;
import com.qfedu.dao.impl.PersonOneDaoImpl;
import com.qfedu.entity.Person;
import com.qfedu.entity.Result;
import com.qfedu.service.PersonOneService;

/**
 * @author Leon Downey
 * @date 2023/3/13 14:25
 * @describe：
 */
public class PersonOneServiceImpl implements PersonOneService {
    private PersonOneDao personOneDao = new PersonOneDaoImpl();
    @Override
    public Result getOne(String id) {
        Person person = personOneDao.getOneById(id);
        return new Result(200,"发送成功",person);
    }
}
