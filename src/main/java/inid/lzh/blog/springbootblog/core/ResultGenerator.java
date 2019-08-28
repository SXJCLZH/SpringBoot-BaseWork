package inid.lzh.blog.springbootblog.core;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "成功";

    public static Result genSuccessResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setCallbackflage(true);
    }

    public static <T> Result<T> genSuccessResult(T data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data)
                .setCallbackflage(true);
    }

    public static Result genFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message)
                .setCallbackflage(false);
    }
}
