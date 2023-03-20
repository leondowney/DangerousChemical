package com.qfedu.service;

import com.qfedu.entity.ExperienceCondition;
import com.qfedu.entity.Result;

/**
 * @author Leon Downey
 * @date 2023/3/13 17:35
 * @describe：
 */
public interface ExperienceService {
    Result getAll(ExperienceCondition ec);
}
