package com.qfedu.dao;

import com.qfedu.entity.Accident;
import com.qfedu.entity.AccidentCondition;
import com.qfedu.entity.Person;
import com.qfedu.entity.PersonCondition;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/15 19:21
 * @describe：
 */
public interface AccidentDao {
    List<Accident> getAll(AccidentCondition ac);

    Long getCount();
}
