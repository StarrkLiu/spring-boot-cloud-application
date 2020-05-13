package net.okair.springcloud.sysadmin.organization.service;



import net.okair.springcloud.sysadmin.organization.entity.param.GroupQueryParam;
import net.okair.springcloud.sysadmin.organization.entity.po.Group;

import java.util.List;

/**
 * @author starrk
 * Created on 2019/12/30
 */
public interface IGroupService {

    /**
     * 获取用户组
     *
     * @param id
     * @return
     */
    Group get(String id);

    /**
     * 新增用户组
     *
     * @param group
     * @return true为新增成功
     */
    boolean add(Group group);

    /**
     * 查询用户组
     *
     * @return
     */
    List<Group> query(GroupQueryParam groupQueryParam);

    /**
     * 根据父id查询用户组
     *
     * @return
     */
    List<Group> queryByParentId(String id);

    /**
     * 更新用户组信息
     *
     * @param group
     */
    boolean update(Group group);

    /**
     * 根据id删除用户组
     *
     * @param id
     */
    boolean delete(String id);



}
