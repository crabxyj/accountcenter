package cn.edu.zucc.accountcenter.dao;

import cn.edu.zucc.accountcenter.pojo.BeanPerson;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @author crabxyj
 * @date 2020/5/13 12:16
 */
@Repository("personDao")
public interface PersonDao extends BaseMapper<BeanPerson> {

}
