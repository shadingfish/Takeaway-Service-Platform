package com.sspku.ruanwei.dto;

import com.sspku.ruanwei.entity.Setmeal;
import com.sspku.ruanwei.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
