package com.announce.dataentry.service.impl;

import com.announce.dataentry.entity.Emaillogs;
import com.announce.dataentry.mapper.EmaillogsMapper;
import com.announce.dataentry.service.EmaillogsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Service
public class EmaillogsServiceImpl extends ServiceImpl<EmaillogsMapper, Emaillogs> implements EmaillogsService {

}
