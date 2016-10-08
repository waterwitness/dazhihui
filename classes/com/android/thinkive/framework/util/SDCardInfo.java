package com.android.thinkive.framework.util;

public class SDCardInfo
{
  private String label;
  private String mountPoint;
  private boolean mounted;
  
  public String getLabel()
  {
    return this.label;
  }
  
  public String getMountPoint()
  {
    return this.mountPoint;
  }
  
  public boolean isMounted()
  {
    return this.mounted;
  }
  
  public void setLabel(String paramString)
  {
    this.label = paramString;
  }
  
  public void setMountPoint(String paramString)
  {
    this.mountPoint = paramString;
  }
  
  public void setMounted(boolean paramBoolean)
  {
    this.mounted = paramBoolean;
  }
  
  public String toString()
  {
    return "SDCardInfo [label=" + this.label + ", mountPoint=" + this.mountPoint + ", mounted=" + this.mounted + "]";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\SDCardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */