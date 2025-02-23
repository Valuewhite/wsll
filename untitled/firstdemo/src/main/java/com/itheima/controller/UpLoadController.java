package com.itheima.controller;

import com.itheima.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RestController
public class UpLoadController {
    @PostMapping("/upload")
    public Result upLoad(MultipartFile image) throws IOException {
        String originalFilename = image.getOriginalFilename();
        originalFilename = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));
        log.info("{}",originalFilename);
        image.transferTo(new File("E:\\cf_code\\images\\" + originalFilename));
        return Result.success();
    }
}
