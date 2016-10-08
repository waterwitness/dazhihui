package com.android.thinkive.framework.download;

public class DownloadItemBean
{
  private long downloadSpeed;
  private long finishedSize = 0L;
  private String mimeType;
  private String name;
  private String savePath;
  private DownloadStatus status = DownloadStatus.STATUS_PENDDING;
  private String taskId;
  private long totalSize = 0L;
  private String url;
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      do
      {
        return false;
      } while (!(paramObject instanceof DownloadItemBean));
      paramObject = (DownloadItemBean)paramObject;
      if ((this.name == null) || (this.savePath == null)) {
        return this.url.equals(((DownloadItemBean)paramObject).url);
      }
    } while ((!this.name.equals(((DownloadItemBean)paramObject).name)) || (!this.url.equals(((DownloadItemBean)paramObject).url)) || (!this.savePath.equals(((DownloadItemBean)paramObject).savePath)));
    return true;
  }
  
  public long getDownloadSpeed()
  {
    return this.downloadSpeed;
  }
  
  public long getFinishedSize()
  {
    return this.finishedSize;
  }
  
  public String getMimeType()
  {
    return this.mimeType;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getSavePath()
  {
    return this.savePath;
  }
  
  public DownloadStatus getStatus()
  {
    return this.status;
  }
  
  public String getTaskId()
  {
    return this.taskId;
  }
  
  public long getTotalSize()
  {
    return this.totalSize;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public int hashCode()
  {
    if (this.name == null) {}
    for (int i = 0;; i = this.name.hashCode()) {
      return i + this.url.hashCode();
    }
  }
  
  public void setDownloadSpeed(long paramLong)
  {
    this.downloadSpeed = paramLong;
  }
  
  public void setFinishedSize(long paramLong)
  {
    this.finishedSize = paramLong;
  }
  
  public void setMimeType(String paramString)
  {
    this.mimeType = paramString;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setSavePath(String paramString)
  {
    this.savePath = paramString;
  }
  
  public void setStatus(DownloadStatus paramDownloadStatus)
  {
    this.status = paramDownloadStatus;
  }
  
  public void setTaskId(String paramString)
  {
    this.taskId = paramString;
  }
  
  public void setTotalSize(long paramLong)
  {
    this.totalSize = paramLong;
  }
  
  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\download\DownloadItemBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */