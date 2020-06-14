package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import Decoder.BASE64Encoder;

public class Picture {
	
	
	public static void main(String[] args) {
	    //下面是本地图片转换Base64的方法
	    String imagePath = "D:\\eclipse\\test.png";
	    ImageToBase64(imagePath);
	}
	
	
	
	/**
     * 将本地图片转换成Base64编码字符串
     *
     * @param imgFile 图片目录路径
     * @return
     */
	private static void ImageToBase64(String imgPath) {
	    byte[] data = null;
	    // 读取图片字节数组
	    try {
	        InputStream in = new FileInputStream(imgPath);
	        data = new byte[in.available()];
	        in.read(data);
	        in.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    // 对字节数组Base64编码
	    BASE64Encoder encoder = new BASE64Encoder();
	    // 返回Base64编码过的字节数组字符串
	    System.out.println("本地图片转换Base64:" + encoder.encode(Objects.requireNonNull(data)));
	}
}
