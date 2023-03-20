package com.qfedu.dao;

import com.qfedu.entity.Certification;
import com.qfedu.entity.Experience;
import com.qfedu.entity.ExperienceCondition;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/14 09:05
 * @describe：
 */
public interface PerCerDao {

    List<Certification> getAll(Integer id);
}
