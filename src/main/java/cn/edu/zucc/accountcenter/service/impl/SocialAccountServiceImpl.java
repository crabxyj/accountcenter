package cn.edu.zucc.accountcenter.service.impl;

import cn.edu.zucc.accountcenter.dao.PersonDao;
import cn.edu.zucc.accountcenter.dao.SocialAccountDao;
import cn.edu.zucc.accountcenter.pojo.BeanPerson;
import cn.edu.zucc.accountcenter.pojo.BeanSocialAccount;
import cn.edu.zucc.accountcenter.service.SocialAccountService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author crabxyj
 * @date 2020/5/13 12:29
 */
@Service("socialAccountServiceImpl")
public class SocialAccountServiceImpl extends ServiceImpl<SocialAccountDao, BeanSocialAccount> implements SocialAccountService {
    @Resource(name = "socialAccountDao")
    private SocialAccountDao dao;
    @Resource(name = "personDao")
    private PersonDao personDao;
    @Override
    public BeanPerson login(@Valid BeanSocialAccount socialAccount,@Valid BeanPerson person){
        QueryWrapper<BeanSocialAccount> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .eq("platform",socialAccount.getPlatform())
                .eq("open_id",socialAccount.getOpenId());

        BeanSocialAccount one = dao.selectOne(queryWrapper);
        if (one != null){
            // 已注册账号
            return personDao.selectById(one.getPersonId());
        }
        personDao.insert(person);
        socialAccount.setPersonId(person.getPersonId());
        dao.insert(socialAccount);
        return person;
    }
}
