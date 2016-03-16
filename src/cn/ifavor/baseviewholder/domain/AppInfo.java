package cn.ifavor.baseviewholder.domain;

/**
 * AppInfo
 */
public class AppInfo {

	private int id;
	private String name;
	private String packagename;
	private String iconurl;
	private float stars;
	private int size;
	private String downloadurl;
	private String des;
	private String url;
	
	public AppInfo(String des, String url) {
		this.des = des;
		this.url = url;
	}

	public AppInfo() {
	}

	public AppInfo(int id, String name, String packagename, String iconurl,
			float stars, int size, String downloadurl, String des, String url) {
		this.id = id;
		this.name = name;
		this.packagename = packagename;
		this.iconurl = iconurl;
		this.stars = stars;
		this.size = size;
		this.downloadurl = downloadurl;
		this.des = des;
		this.url = url;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}

	public String getPackagename() {
		return packagename;
	}

	public void setIconurl(String iconurl) {
		this.iconurl = iconurl;
	}

	public String getIconurl() {
		return iconurl;
	}

	public void setStars(float stars) {
		this.stars = stars;
	}

	public float getStars() {
		return stars;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setDownloadurl(String downloadurl) {
		this.downloadurl = downloadurl;
	}

	public String getDownloadurl() {
		return downloadurl;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getDes() {
		return des;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	@Override
	public String toString() {
		return "AppInfo [id=" + id + ", name=" + name + ", packagename="
				+ packagename + ", iconurl=" + iconurl + ", stars=" + stars
				+ ", size=" + size + ", downloadurl=" + downloadurl + ", des="
				+ des + "]";
	}
}