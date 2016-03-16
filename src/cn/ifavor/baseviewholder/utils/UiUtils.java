package cn.ifavor.baseviewholder.utils;

import cn.ifavor.baseviewholder.base.BaseApplication;
import android.content.Context;
import android.view.View;

public class UiUtils {

	/** ��ȡȫ�������� */
	public static Context getContext(){
		return BaseApplication.getApplication();
	}
	
	/** ��ȡ ���ֶ��� */
	public static View inflate(int layoutId){
		View view = View.inflate(getContext(), layoutId, null);
		System.out.println("View_hsw:" + view);
		return view;
	}
}
