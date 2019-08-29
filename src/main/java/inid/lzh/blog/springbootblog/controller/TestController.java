package inid.lzh.blog.springbootblog.controller;

import inid.lzh.blog.springbootblog.core.ApiVersion;
import inid.lzh.blog.springbootblog.core.Result;
import inid.lzh.blog.springbootblog.core.ResultGenerator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/{version}/web")
@Validated
@ApiVersion(1)
public class TestController {

    /**
     * 测试API 请求接口为 /v1/web/testapi
     * @return
     */
    @ApiVersion(1)
    @RequestMapping("/testapi")
    public Result testApi(){
        return ResultGenerator.genFailResult("这是测试API接口V1");
    }


    /**
     * 测试API 请求接口为 /v2/web/testapi
     * @return
     */
    @ApiVersion(2)
    @RequestMapping("/testapi")
    public Result testApiUpData(){
        return ResultGenerator.genFailResult("这是测试API接口V2");
    }


    /**
     * 验证参数
     */
    @RequestMapping("/verification")
    public Result testApiUpData(@NotNull Integer id){
        return ResultGenerator.genFailResult("您传来的参数id为"+id);
    }

}
