package cn.asiainfo.exception;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/5 14:13
 * @Version 1.0
 */

public class MyException extends Exception {

	private String message;

	public MyException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
