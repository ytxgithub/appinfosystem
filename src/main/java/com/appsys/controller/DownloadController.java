package com.appsys.controller;

import java.io.File;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DownloadController {
	
	@RequestMapping("/download")
	public ResponseEntity<byte[]> download(String filename,
			HttpServletRequest request) throws Exception{
		String path=request.getServletContext().getRealPath("/uploads");
		String downloadFile=path+File.separator+filename;
		File file=new File(downloadFile);
		//ok表示成功
		BodyBuilder builder=ResponseEntity.ok();
		//流类型
		builder.contentType(MediaType.APPLICATION_OCTET_STREAM);
		//内容大小
		builder.contentLength(file.length());
		filename=URLEncoder.encode(filename,"UTF-8");
		builder.header("Content-Disposition","attachment;filename"+filename);
		return builder.body(FileUtils.readFileToByteArray(file));
		
	}
}
