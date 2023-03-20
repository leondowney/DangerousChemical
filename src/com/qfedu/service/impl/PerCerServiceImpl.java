package com.qfedu.service.impl;

import com.qfedu.dao.PerCerDao;
import com.qfedu.dao.impl.PerCerDaoImpl;
import com.qfedu.entity.Certification;
import com.qfedu.entity.Result;
import com.qfedu.service.PerCerService;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/14 09:22
 * @describe：
 */
public class PerCerServiceImpl implements PerCerService {
    PerCerDao perCerDao=new PerCerDaoImpl();
    @Override
    public Result getAll(Integer id) {
        List<Certification> cerList = perCerDao.getAll(id);

        Result rs = new Result(0,"查询成功!",cerList);

        System.out.println(cerList);

        return rs;
    }

}
