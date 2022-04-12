package com.example.online_exam_and_question_manage.interfaces.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Exam APIs")
public class RoleCtrl {

    @GetMapping("/test")
    @ApiOperation("测试")
    public void test() {
        System.out.println("Hello World");
    }
}
