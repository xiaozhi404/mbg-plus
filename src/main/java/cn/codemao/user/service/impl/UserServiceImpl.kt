package cn.codemao.user.service.impl;

import cn.codemao.user.entity.User;
import cn.codemao.user.mapper.UserMapper;
import cn.codemao.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaozhi
 * @since 2019-03-22
 */
@Service
open class UserServiceImpl : ServiceImpl<UserMapper, User>(), UserService {

}
