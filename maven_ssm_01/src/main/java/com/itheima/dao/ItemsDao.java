package com.itheima.dao;

import com.itheima.domain.Items;

/**
 * @Description:
 * @Author 鲲
 * @Date 2019/11/24 15:15
 */
public interface ItemsDao {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Items findById(Integer id);
}
