package cn.ifavor.baseviewholder.base;

import java.util.List;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class DefaultAdapter<T> extends BaseAdapter {

	private List<T> mDatas;
	private int mLayoutId;

	public DefaultAdapter(List<T> mDatas, int layoutId) {
		this.mDatas = mDatas;
		this.mLayoutId = layoutId;
	}

	@Override
	public int getCount() {
		return mDatas == null ? 0 : mDatas.size();
	}

	@Override
	public Object getItem(int position) {
		return mDatas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		BaseViewHolder holder = null;
		if (convertView == null) {
			holder = new BaseViewHolder<T>(mLayoutId) {

				@Override
				public void setData(T data) {
					setHolder(this, data);
				}
			};
		} else {
			holder = (BaseViewHolder) convertView.getTag();
		}

		T info = mDatas.get(position);
		holder.setData(info);
		return holder.getContentView();
	}

	protected abstract void setHolder(BaseViewHolder holder, T data);

}
