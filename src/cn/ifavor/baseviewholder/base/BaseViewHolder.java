package cn.ifavor.baseviewholder.base;

import cn.ifavor.baseviewholder.utils.UiUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class BaseViewHolder<T> {
	private View contentView;
	private SparseArray<View> mViews;

	public BaseViewHolder(int layoutId) {
		contentView = UiUtils.inflate(layoutId);
		contentView.setTag(this);
		mViews = new SparseArray<View>();
	}

	public abstract void setData(T data);

	public View getContentView() {
		return contentView;
	}

	/** 设置文本 */
	public void setText(int resId, String content) {
		TextView textView = (TextView) mViews.get(resId);
		if (textView == null) {
			textView = (TextView) contentView.findViewById(resId);
			mViews.put(resId, textView);
		}

		textView.setText(content);
	}

	/** 设置图片 */
	public void setImage(int id, int resId) {
		ImageView imageView = (ImageView) mViews.get(id);
		if (imageView == null) {
			imageView = (ImageView) contentView.findViewById(id);
			mViews.put(id, imageView);
		}

		imageView.setImageResource(resId);
	}

	/** 获取 view 对象 */
	public View getView(int resId) {
		View view = mViews.get(resId);
		if (view == null) {
			view = contentView.findViewById(resId);
			mViews.put(resId, view);
		}

		return view;
	}
}