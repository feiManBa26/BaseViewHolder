使用说明，请参见：http://blog.csdn.net/anydrew/article/details/50903168

##使用方法

自定义 MyAdapter 继承 DefaultAdapter（在 base 包下）

	
	// 定义适配器，需要传入：实体的泛型T
	private class MyAdapter extends DefaultAdapter<AppInfo> {
		// 实现构造方法，需要传入：List<T> 集合、布局文件的资源 id
		public MyAdapter(List<AppInfo> mDatas, int layoutId) {
			super(mDatas, layoutId);
		}

		// 将实体中的数据设置给布局中的控件
		@Override
		protected void setHolder(BaseViewHolder holder, AppInfo data) {
			holder.setImage(R.id.item_icon, R.drawable.ic_default);
			holder.setText(R.id.item_title, data.getName());
			holder.setText(R.id.item_size,
					Formatter.formatFileSize(MainActivity.this, data.getSize()));
			holder.setText(R.id.item_bottom, data.getDes());
		}
	}


