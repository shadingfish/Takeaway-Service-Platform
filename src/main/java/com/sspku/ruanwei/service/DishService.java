package com.sspku.ruanwei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sspku.ruanwei.dto.DishDto;
import com.sspku.ruanwei.entity.Dish;

public interface DishService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，操作两张表：dish, dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息和口味信息
    void updateWithFlavor(DishDto dishDto);
}
