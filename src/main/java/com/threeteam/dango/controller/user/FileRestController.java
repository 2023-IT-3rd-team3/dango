package com.threeteam.dango.controller.user;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileRestController {
	@PostMapping("/upload")
    public String upload(@RequestParam("upload") MultipartFile file) throws IOException {
        String userProfile;
        String path = "C:/upload";
        String uuid = UUID.randomUUID().toString();
        userProfile = uuid + "_" + file.getOriginalFilename();
        File fullPath = new File(path, userProfile);
        file.transferTo(fullPath);

        return userProfile;
    }
    @GetMapping("/display")
    public byte[] display(@RequestParam("userProfile") String userProfile) throws IOException{
       return FileCopyUtils.copyToByteArray(new File("C:/upload", userProfile));
    }
}
