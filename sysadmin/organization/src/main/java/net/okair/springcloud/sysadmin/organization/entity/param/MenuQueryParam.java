package net.okair.springcloud.sysadmin.organization.entity.param;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.okair.springcloud.commom.web.entity.param.BaseParam;
import net.okair.springcloud.sysadmin.organization.entity.po.Menu;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuQueryParam extends BaseParam<Menu> {
    private String name;
}
