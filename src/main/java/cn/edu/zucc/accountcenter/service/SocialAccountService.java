package cn.edu.zucc.accountcenter.service;

import cn.edu.zucc.accountcenter.pojo.BeanPerson;
import cn.edu.zucc.accountcenter.pojo.BeanSocialAccount;

import javax.validation.Valid;

/**
 * @author crabxyj
 * @date 2020/5/13 12:29
 */
public interface SocialAccountService {
    BeanPerson login(@Valid BeanSocialAccount socialAccount, @Valid BeanPerson person);
}
