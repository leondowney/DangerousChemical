package com.qfedu.service;

import com.qfedu.entity.AccidentCondition;
import com.qfedu.entity.Result;

/**
 * @author Leon Downey
 * @date 2023/3/16 18:30
 * @describe：
 */
public interface AccidentAnalyseService {
    Result getAll(AccidentCondition ac);
}
