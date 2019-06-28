package cn.codemao.service.impl;

import cn.codemao.entity.User;
import cn.codemao.mapper.UserMapper;
import cn.codemao.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaozhi
 * @since 2019-06-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
