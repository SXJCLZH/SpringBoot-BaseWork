package inid.lzh.blog.springbootblog.web;
import inid.lzh.blog.springbootblog.core.Result;
import inid.lzh.blog.springbootblog.core.ResultGenerator;
import inid.lzh.blog.springbootblog.model.UserAdmin;
import inid.lzh.blog.springbootblog.service.UserAdminService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/08/29.
*/
@RestController
@RequestMapping("/user/admin")
public class UserAdminController {
    @Resource
    private UserAdminService userAdminService;

    @PostMapping("/add")
    public Result add(UserAdmin userAdmin) {
        userAdminService.save(userAdmin);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userAdminService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UserAdmin userAdmin) {
        userAdminService.update(userAdmin);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        UserAdmin userAdmin = userAdminService.findById(id);
        return ResultGenerator.genSuccessResult(userAdmin);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserAdmin> list = userAdminService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
