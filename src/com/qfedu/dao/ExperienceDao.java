package com.qfedu.dao;

import com.qfedu.entity.Experience;
import com.qfedu.entity.ExperienceCondition;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/13 17:22
 * @describe：
 */
public interface ExperienceDao {
    List<Experience> getAll(ExperienceCondition ec);

}
