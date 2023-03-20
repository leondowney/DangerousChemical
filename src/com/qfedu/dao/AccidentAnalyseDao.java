package com.qfedu.dao;

import com.qfedu.entity.Accident;
import com.qfedu.entity.AccidentAnalyse;
import com.qfedu.entity.AccidentCondition;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/16 14:53
 * @describe：
 */
public interface AccidentAnalyseDao {
    List<AccidentAnalyse> getAll(AccidentCondition ac);
}
