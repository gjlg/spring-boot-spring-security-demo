package com.mori.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mori.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yun_kai
 * @date 2022年07月15日, 0015
 */
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(@Param("id") Long id);
}
