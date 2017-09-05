package com.jy.javacore.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("欢迎使用新安牌计算器");
		int result = divmethod();
		System.out.println("方法执行的返回值为：" + result);
		switch (result) {
		case 0:
			System.out.println("0---正常结束！ ");
			break;
		case 1:
			System.out.println("1---发生了 算术异常");
			break;
		case 2:
			System.out.println("2---发生了 输入不匹配异常");
			break;
		case 3:
			System.out.println("3---发生了其他异常");
			break;
		default:
			System.out.println("4---执行到finally语句块");
			break;
		}

		System.out.println("感谢使用本程序！");
	}

	private static int divmethod() {
		// TODO Auto-generated method stub
		return 0;
	}

}
