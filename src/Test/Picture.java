package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import Decoder.BASE64Encoder;

public class Picture {
	
	
	public static void main(String[] args) {
	    //�����Ǳ���ͼƬת��Base64�ķ���
	    String imagePath = "D:\\eclipse\\test.png";
	    ImageToBase64(imagePath);
	}
	
	
	
	/**
     * ������ͼƬת����Base64�����ַ���
     *
     * @param imgFile ͼƬĿ¼·��
     * @return
     */
	private static void ImageToBase64(String imgPath) {
	    byte[] data = null;
	    // ��ȡͼƬ�ֽ�����
	    try {
	        InputStream in = new FileInputStream(imgPath);
	        data = new byte[in.available()];
	        in.read(data);
	        in.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    // ���ֽ�����Base64����
	    BASE64Encoder encoder = new BASE64Encoder();
	    // ����Base64��������ֽ������ַ���
	    System.out.println("����ͼƬת��Base64:" + encoder.encode(Objects.requireNonNull(data)));
	}
}
