package ioc.util;

public class BeanLoaderException extends Exception {

	public BeanLoaderException(String msg) {
		super(msg);
	}

	public BeanLoaderException(String msg, BeanDataLoaderException e) {
		super(msg, e);
	}
}
