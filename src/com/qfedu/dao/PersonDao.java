package com.qfedu.dao;

import com.qfedu.entity.Person;
import com.qfedu.entity.PersonCondition;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/12 00:31
 * @describe：
 */
public interface PersonDao {
    List<Person> getAll(PersonCondition cc);

    Long getCount();
}
