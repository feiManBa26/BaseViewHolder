package cn.ifavor.baseviewholder;

import java.util.ArrayList;
import java.util.List;

import cn.ifavor.baseviewholder.base.BaseViewHolder;
import cn.ifavor.baseviewholder.base.DefaultAdapter;
import cn.ifavor.baseviewholder.domain.AppInfo;

import android.app.Activity;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView mList;
	private List<AppInfo> mDataSet;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		init();
	}

	private void init() {
		mList = (ListView) findViewById(R.id.list);
		mDataSet = new ArrayList<AppInfo>();
		
		for (int i = 0; i < 10; i++){
			AppInfo info = new AppInfo();
			info.setDes("ÃèÊö" + i);
			info.setDownloadurl("http://www.baidu.com");
			info.setName("Ãû³Æ" + i);
			info.setIconurl("");
			info.setPackagename("cn.ifavor.baseviewholder");
			info.setSize(10000);
			info.setStars(3.5f);
			info.setUrl("http://www.baidu.com");

			mDataSet.add(info);
		}
		
		mList.setAdapter(new MyAdapter(mDataSet, R.layout.item_appinfo));
	}

	private class MyAdapter extends DefaultAdapter<AppInfo> {
		public MyAdapter(List<AppInfo> mDatas, int layoutId) {
			super(mDatas, layoutId);
		}

		@Override
		protected void setHolder(BaseViewHolder holder, AppInfo data) {
			holder.setImage(R.id.item_icon, R.drawable.ic_default);
			holder.setText(R.id.item_title, data.getName());
			holder.setText(R.id.item_size,
					Formatter.formatFileSize(MainActivity.this, data.getSize()));
			holder.setText(R.id.item_bottom, data.getDes());
		}
	}
	
}
