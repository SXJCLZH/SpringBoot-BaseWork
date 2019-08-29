package inid.lzh.blog.springbootblog.service.impl;

import inid.lzh.blog.springbootblog.dao.UserAdminMapper;
import inid.lzh.blog.springbootblog.model.UserAdmin;
import inid.lzh.blog.springbootblog.service.UserAdminService;
import inid.lzh.blog.springbootblog.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by CodeGenerator on 2019/08/29.
 */
@Service
@Transactional
public class UserAdminServiceImpl extends AbstractService<UserAdmin> implements UserAdminService {
    @Resource
    private UserAdminMapper userAdminMapper;

}
