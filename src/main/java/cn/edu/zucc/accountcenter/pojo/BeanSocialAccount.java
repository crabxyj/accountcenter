package cn.edu.zucc.accountcenter.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

/**
 * @author crabxyj
 * @date 2020/5/12 17:03
 */
@Data
@Accessors(chain = true)
@TableName("social_account")
public class BeanSocialAccount {
    @TableId(type = IdType.AUTO)
    private long id;
    @NotNull
    private long personId;
    @NotNull
    private String platform;
    @NotNull
    private String openId;

    private String bindStatus;
}
