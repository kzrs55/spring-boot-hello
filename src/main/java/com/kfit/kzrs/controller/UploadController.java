package com.kfit.kzrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * Created by zjutK on 2018/7/26.
 */

@Controller
@RequestMapping("/user")
public class UploadController {

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public @ResponseBody
    String upload(HttpServletRequest httpServletRequest,MultipartFile file){
        try{
            //上传目录地址
            String uploadDir = httpServletRequest.getSession().getServletContext().getRealPath("/")+"upload/";
            File dir =  new File(uploadDir);
            if(!dir.exists()){
                dir.mkdir();
            }
            //文件后缀名
            String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            String filename = UUID.randomUUID()+suffix;
            File serverFile = new File(uploadDir+filename);
            file.transferTo(serverFile);
        }catch (Exception e) {
            e.printStackTrace();
            return "上传失败";
        }
        return "上传成功";
    }

    @RequestMapping(value = "/uploads",method = RequestMethod.POST)
    public @ResponseBody
    String uploads(HttpServletRequest httpServletRequest,@RequestParam MultipartFile []file){
        try{
            //上传目录地址
            String uploadDir = httpServletRequest.getSession().getServletContext().getRealPath("/")+"upload/";
            File dir =  new File(uploadDir);
            if(!dir.exists()){
                dir.mkdir();
            }
            for(int i = 0; i< file.length;i++){
                if(file[i]!=null){
                    excuteUpload(uploadDir,file[i]);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            return "上传失败";
        }
        return "上传成功";
    }

    private void excuteUpload(String uploadDir,MultipartFile multipartFile) throws Exception{
        String suffix = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf("."));
        String filename = UUID.randomUUID()+suffix;
        File serverFile = new File(uploadDir+filename);
        multipartFile.transferTo(serverFile);
    }
}
