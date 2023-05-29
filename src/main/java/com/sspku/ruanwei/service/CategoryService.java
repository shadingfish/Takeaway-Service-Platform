package com.sspku.ruanwei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sspku.ruanwei.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);

}
