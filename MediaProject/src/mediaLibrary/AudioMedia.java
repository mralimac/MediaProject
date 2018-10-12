package mediaLibrary;

public class AudioMedia extends Media
{
	String mFilePath;
	public AudioMedia(String mName, String mDesc,  String mFilePath) 
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
