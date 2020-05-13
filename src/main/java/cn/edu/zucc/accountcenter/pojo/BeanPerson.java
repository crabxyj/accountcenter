package cn.edu.zucc.accountcenter.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author crabxyj
 * @date 2020/5/12 16:57
 */
@Data
@Accessors(chain = true)
@TableName("person")
public class BeanPerson {
    @TableId(type = IdType.AUTO)
    private long personId;
    private String nickName;
    private String avatar;
}
