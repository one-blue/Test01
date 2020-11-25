package com.lxy.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	@GetMapping("/toUpload")
	public String toUplaoad() {
		return "upload";
	}
	
	
	@ResponseBody
	@PostMapping("/uploadFile")
	public Map<String, Object> uploadFile(@RequestParam("file") MultipartFile[] fileUpload,Model model) {
		System.out.println("dirPath");
		String fileNamelist="";
		Map< String, Object> map=new HashMap();
		for(MultipartFile file:fileUpload){
			String fileName=file.getOriginalFilename();
			//UUID对名字随机加密
			//fileName=UUID.randomUUID()+"_"+fileName;
			
			String dirPath="";
			String os=System.getProperty("os.name");
			if(os.toLowerCase().startsWith("win")) {
				dirPath="E:"+File.separator+"/stswork/marking/src/main/resources/static"+File.separator+"touxiang"+File.separator;
			}else {
				dirPath="E:/stswork/marking/src/main/resources/static/touxiang";
			}
			System.out.println(dirPath);
			File filePath=new File(dirPath);
			if(!filePath.exists()) {
				filePath.mkdirs();

			}
			try {
				fileNamelist=fileNamelist+fileName+"#";
				file.transferTo(new File(dirPath+fileName));
				map.put("fileName", fileName);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				map.put("msg", "上传失败");
			}
			
		}
		return map;
	}
	

}

