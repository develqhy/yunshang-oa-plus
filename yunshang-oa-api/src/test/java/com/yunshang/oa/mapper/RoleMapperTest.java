package com.yunshang.oa.mapper;

import com.yunshang.oa.entity.Role;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

/**
 * @author qhy
 * @create 2024-03-03 13:53
 */
@SpringBootTest
@Slf4j
class RoleMapperTest {

    @Resource
    private RoleMapper roleMapper;

    @Test
    public void testQueryAll() {
        List<Role> list = roleMapper.selectList(null);
        log.info("*****查询出{}条记录",list.size());
        log.info("*****查询结果{}",list);
    }

}