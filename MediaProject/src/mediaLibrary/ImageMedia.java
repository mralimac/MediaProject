package mediaLibrary;

import java.util.Vector;

public class ImageMedia extends Media
{
	private String mFilePath;
	private Vector mCategories;
	
	public ImageMedia(String mName, String mDesc, String mFilePath) 
	{
		super(mName, mDesc);
		this.mFilePath = mFilePath;
		// TODO Auto-generated constructor stub
	}

	
	public void setFilePath(String mFilePath)
	{
		this.mFilePath = mFilePath;
	}
	
	public String getFilePath()
	{
		return this.mFilePath;
	}
}
