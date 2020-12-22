package com.xinyu.service.impl;

import com.xinyu.entity.User;
import com.xinyu.mapper.UserMapper;
import com.xinyu.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xinyu
 * @since 2020-09-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
