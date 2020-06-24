package csdn;

import java.awt.Frame;

public class demo01 {
	public static void main(String[] args) {
		Frame f = new Frame("窗口标题");
		f.setLocation(20, 20);
		//距离上边20,左边20,左上角位置
		f.setSize(800,600);
		f.setVisible(true);//设置可视
	}
	
}
