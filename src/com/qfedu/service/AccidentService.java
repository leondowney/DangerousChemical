package com.qfedu.service;

import com.qfedu.entity.Accident;
import com.qfedu.entity.AccidentCondition;
import com.qfedu.entity.PersonCondition;
import com.qfedu.entity.Result;

/**
 * @author Leon Downey
 * @date 2023/3/15 19:29
 * @describe：
 */
public interface AccidentService {
    Result getAll(AccidentCondition ac);
    Integer getCount();
}
