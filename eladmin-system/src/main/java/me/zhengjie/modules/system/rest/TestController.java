package me.zhengjie.modules.system.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import me.zhengjie.modules.system.service.TestService;
import me.zhengjie.modules.system.service.dto.TestQueryCriteria;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Api(tags = "测试: test")
@RequestMapping(value = "/api/test")
public class TestController {

    private final TestService testService;

    @ApiOperation("测试 test")
    @GetMapping
    public ResponseEntity<Object> query(TestQueryCriteria criteria, Pageable pageable){
        return new ResponseEntity<>(testService.queryAll(criteria, pageable), HttpStatus.OK);
    }

}
