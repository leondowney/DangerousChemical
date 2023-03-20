package com.qfedu.dao;

import com.qfedu.entity.Accident;
import com.qfedu.entity.Person;

/**
 * @author Leon Downey
 * @date 2023/3/16 10:12
 * @describe：
 */
public interface AccidentOneDao {

    Accident getOneById(String id);
}
