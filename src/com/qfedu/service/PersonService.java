package com.qfedu.service;

import com.qfedu.entity.PersonCondition;
import com.qfedu.entity.Result;

/**
 * @author Leon Downey
 * @date 2023/3/12 10:08
 * @describe：
 */
public interface PersonService {

    Result getAll(PersonCondition cc);
    Integer getCount();
}
