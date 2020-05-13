package cn.edu.zucc.accountcenter.dao;

import cn.edu.zucc.accountcenter.pojo.BeanSocialAccount;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @author crabxyj
 * @date 2020/5/13 12:18
 */
@Repository
public interface SocialAccountDao extends BaseMapper<BeanSocialAccount> {
}
