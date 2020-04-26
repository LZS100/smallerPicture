package com.linzs.smallerPicture;

import java.io.File;
import java.io.IOException;

import net.coobird.thumbnailator.Thumbnails;

public class SmallerTool {
	public static Object smaller(File orign,File destination,int width, int height) throws IOException {
		
	//	File image = new File("G:\\图片\\OET.jpg");
		
		Thumbnails.of(orign)
		.size(width, height)
		.toFile(destination);
		System.out.println("压缩图片已保存");
		return "压缩成功";
	}
}

