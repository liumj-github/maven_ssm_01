package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author 鲲
 * @Date 2019/11/24 16:52
 */
public class ItemsTest {

    @Test
    public void findById(){
        //获取spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //测试dao层
        //ItemsDao itemsDao = context.getBean(ItemsDao.class);
        //Items items = itemsDao.findById(1);
        //System.out.println(items);

        //测试service层
        ItemsService itemsService = context.getBean(ItemsService.class);
        Items items = itemsService.findById(1);
        System.out.println(items);
    }
}
