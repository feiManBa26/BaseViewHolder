package cn.ifavor.baseviewholder.base;

import android.app.Application;
import android.os.Handler;

public class BaseApplication extends Application{
	public static Application mApplication;
	public static long mainTid;
	public static Handler mHandler;
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		// ��ȡȫ�� Context
		mApplication = this;
		
		// ��ȡ���߳� id
		mainTid = Thread.currentThread().getId();
		
		// �������̵߳� handler
		mHandler = new Handler();
	}

	/** ��ȡ Application ���� */
	public static Application getApplication() {
		return mApplication;
	}

	public static long getMainTid() {
		return mainTid;
	}

	public static Handler getHandler() {
		return mHandler;
	}
	
}
