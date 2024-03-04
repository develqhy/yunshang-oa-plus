package com.yunshang.oa.controller;

import com.yunshang.oa.entity.Role;
import com.yunshang.oa.result.CommonResult;
import com.yunshang.oa.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: qhy
 * @date: 2024-03-03 15:42
 */
@RestController
@RequestMapping("/role")
@Api(value = "角色管理接口提供role表的所有操作",tags = "角色管理")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @ApiOperation("查询所有角色")
    @GetMapping("/get/all")
    public CommonResult queryAll() {

        List<Role> list = roleService.list();
        return CommonResult.ok(list);
    }
}
