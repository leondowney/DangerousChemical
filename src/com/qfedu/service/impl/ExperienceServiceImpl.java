package com.qfedu.service.impl;

import com.qfedu.dao.ExperienceDao;
import com.qfedu.dao.impl.ExperienceDaoImpl;
import com.qfedu.entity.Experience;
import com.qfedu.entity.ExperienceCondition;
import com.qfedu.entity.Result;
import com.qfedu.service.ExperienceService;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/13 17:36
 * @describe：
 */
public class ExperienceServiceImpl implements ExperienceService {
    ExperienceDao experienceDao = new ExperienceDaoImpl();
    @Override
    public Result getAll(ExperienceCondition ec) {
        List<Experience> experienceList = experienceDao.getAll(ec);

        Result rs = new Result(0,"查询成功!",experienceList);

        return rs;

    }

}
