package cn.edu.zucc.accountcenter.service.impl;

import cn.edu.zucc.accountcenter.dao.PersonDao;
import cn.edu.zucc.accountcenter.pojo.BeanPerson;
import cn.edu.zucc.accountcenter.service.PersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author crabxyj
 * @date 2020/5/13 12:26
 */
@Service("personServiceImpl")
public class PersonServiceImpl extends ServiceImpl<PersonDao, BeanPerson> implements PersonService {

}
