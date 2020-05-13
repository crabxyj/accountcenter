package cn.edu.zucc.accountcenter.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author crabxyj
 * @date 2020/5/12 17:54
 */
@Data
@TableName("person_extra")
public class BeanPersonExtra {
    @TableId
    private long id;
    private String extraKey;
    private String extraValue;
}
