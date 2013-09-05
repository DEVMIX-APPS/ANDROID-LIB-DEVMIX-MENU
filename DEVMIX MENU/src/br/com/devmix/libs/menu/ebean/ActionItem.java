package br.com.devmix.libs.menu.ebean;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import com.googlecode.androidannotations.annotations.EBean;
@EBean
public class ActionItem {
	private Drawable icon;
	private Bitmap thumb;
	private String title;
	public Drawable getIcon() {
		return icon;
	}
	public void setIcon(Drawable icon) {
		this.icon = icon;
	}
	public Bitmap getThumb() {
		return thumb;
	}
	public void setThumb(Bitmap thumb) {
		this.thumb = thumb;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
