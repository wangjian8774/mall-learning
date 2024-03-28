package com.jian.mall.tiny.test;

import cn.hutool.crypto.digest.BCrypt;
import com.jian.mall.tiny.dao.UmsAdminDao;
import com.jian.mall.tiny.dao.UmsResourceCategoryDao;
import com.jian.mall.tiny.dao.UmsResourceDao;
import com.jian.mall.tiny.domain.UmsResourceExt;
import com.jian.mall.tiny.model.UmsAdmin;
import com.jian.mall.tiny.model.UmsResourceCategory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class MyBatisBaseTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisBaseTest.class);

    @Autowired
    private UmsAdminDao umsAdminDao;

    @Autowired
    private UmsResourceDao umsResourceDao;

    @Autowired
    private UmsResourceCategoryDao umsResourceCategoryDao;

    @Test
    void testSelectByIdSimple() {
        UmsAdmin umsAdmin = umsAdminDao.selectByIdSimple(3L);
        LOGGER.info("testSelectByIdSimple result={}", umsAdmin);
    }

    @Test
    void testSelectById() {
        UmsAdmin umsAdmin = umsAdminDao.selectById(1L);
        LOGGER.info("testSelectById result={}", umsAdmin);
    }

    @Test
    void testSelectByUsernameAndEmailLike() {
        List<UmsAdmin> adminList = umsAdminDao.selectByUsernameAndEmailLike("", "");
        LOGGER.info("testSelectByUsernameAndEmailLike result={}", adminList);
    }

    @Test
    void testSelectByUsernameAndEmailLike2() {
        List<UmsAdmin> adminList = umsAdminDao.selectByUsernameAndEmailLike2("", "");
        LOGGER.info("testSelectByUsernameAndEmailLike2 result={}", adminList);
    }

    @Test
    void testSelectByUsernameAndEmailLike3() {
        List<UmsAdmin> adminList = umsAdminDao.selectByUsernameAndEmailLike3("", "");
        LOGGER.info("testSelectByUsernameAndEmailLike3 result={}", adminList);
    }

    @Test
    void testInsert() {
        UmsAdmin admin = new UmsAdmin();
        admin.setUsername("newTest");
        admin.setPassword(BCrypt.hashpw("123456"));
        admin.setEmail("newTest@qq.com");
        admin.setNickName("tester");
        admin.setCreateTime(new Date());
        admin.setStatus(1);
        int result = umsAdminDao.insert(admin);
        LOGGER.info("testInsert id={},result={}", admin.getId(), result);
    }

    @Test
    void testUpdateById() {
        UmsAdmin admin = new UmsAdmin();
        admin.setId(1L);
        admin.setUsername("test666");
        admin.setPassword(BCrypt.hashpw("123456"));
        admin.setEmail("test666@qq.com");
        admin.setNickName("tester");
        admin.setCreateTime(new Date());
        admin.setStatus(1);
        int result = umsAdminDao.updateById(admin);
        LOGGER.info("testUpdateById result={}", result);
    }


    @Test
    void testUpdateByIdSelective() {
        UmsAdmin admin = new UmsAdmin();
        admin.setId(1L);
        admin.setUsername("test777");
        admin.setPassword(BCrypt.hashpw("123456"));
        admin.setEmail("test666@qq.com");
        admin.setNickName("tester");
        admin.setCreateTime(new Date());
        admin.setStatus(1);
        int result = umsAdminDao.updateByIdSelective(admin);
        LOGGER.info("testUpdateByIdSelective result={}", result);
    }

    @Test
    void testDeleteById() {
        int result = umsAdminDao.deleteById(15L);
        LOGGER.info("testDeleteById result={}", result);
    }

    @Test
    void testInsertBatch() {
        UmsAdmin admin = new UmsAdmin();
        admin.setUsername("newTest");
        admin.setPassword(BCrypt.hashpw("123456"));
        admin.setEmail("newTest@qq.com");
        admin.setNickName("tester");
        admin.setCreateTime(new Date());
        admin.setStatus(1);
        List<UmsAdmin> adminList = new ArrayList<>();
        adminList.add(admin);
        int result = umsAdminDao.insertBatch(adminList);
        LOGGER.info("testInsertBatch id={},result={}", admin.getId(), result);
    }

    @Test
    void testSelectByIds() {
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);

        List<UmsAdmin> umsAdmins = umsAdminDao.selectByIds(ids);
        LOGGER.info("testSelectByIds result={}", umsAdmins);
    }

    @Test
    void testSelectResourceWithCategory() {
        UmsResourceExt resourceExt = umsResourceDao.selectResourceWithCategory(1L);
        LOGGER.info("testSelectResourceWithCategory result={}", resourceExt);
    }

    @Test
    void testSelectResourceWithCategory2() {
        UmsResourceExt resourceExt = umsResourceDao.selectResourceWithCategory2(1L);
        LOGGER.info("testSelectResourceWithCategory2 result={}", resourceExt);
    }

    @Test
    void testSelectCategoryWithResource() {
        UmsResourceCategory resourceCategory = umsResourceCategoryDao.selectCategoryWithResource(1L);
        LOGGER.info("testSelectCategoryWithResource result={}", resourceCategory);
    }
}
