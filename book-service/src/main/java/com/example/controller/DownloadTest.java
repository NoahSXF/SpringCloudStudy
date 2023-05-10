package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;

/**
 * @BelongsProject: SpringCloudStudy
 * @BelongsPackage: com.example.controller
 * @Author: SXF
 * @CreateTime: 2023-05-08  19:07
 * @Description: TODO
 * @Version: 1.0
 */
@Controller
public class DownloadTest {
    @GetMapping("/t1")
    public void down1(HttpServletResponse response) throws Exception {
        response.reset();
        response.setContentType("application/octet-stream;charset=utf-8");
        response.setHeader(
                "Content-disposition",
                "attachment; filename=文本文档 (2).txt");
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\99451\\Desktop\\新建 文本文档 (2).txt"));
                // 输出流
                BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
        ) {
            byte[] buff = new byte[1024];
            int len = 0;
            while ((len = bis.read(buff)) > 0) {
                bos.write(buff, 0, len);
            }
        }
    }

//    @GetMapping("/t2")
//    public ResponseEntity<InputStreamResource> down2() throws Exception {
//        InputStreamResource isr = new InputStreamResource(new FileInputStream("E:\\desktop\\1.png"));
//        return ResponseEntity.ok()
//                .contentType(MediaType.APPLICATION_OCTET_STREAM)
//                .header("Content-disposition", "attachment; filename=test1.png")
//                .body(isr);
//    }
//
//    @GetMapping("/t3")
//    public ResponseEntity<ByteArrayResource> down3() throws Exception {
//        byte[] bytes = Files.readAllBytes(new File("E:\\desktop\\1.png").toPath());
//        ByteArrayResource bar = new ByteArrayResource(bytes);
//        return ResponseEntity.ok()
//                .contentType(MediaType.APPLICATION_OCTET_STREAM)
//                .header("Content-disposition", "attachment; filename=test2.png")
//                .body(bar);
//    }


}
