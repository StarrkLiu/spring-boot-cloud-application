package net.okair.springcloud.sysadmin.organization.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import net.okair.springcloud.sysadmin.organization.entity.po.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author starrk
 * Created on 2019/12/30
 */
@Mapper
@Repository
public interface MenuMapper extends BaseMapper<Menu> {
}
