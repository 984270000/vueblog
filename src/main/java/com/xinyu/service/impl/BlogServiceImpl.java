package com.xinyu.service.impl;

import com.xinyu.entity.Blog;
import com.xinyu.mapper.BlogMapper;
import com.xinyu.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
