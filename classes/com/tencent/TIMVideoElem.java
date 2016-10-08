package com.tencent;

import com.tencent.imcore.IMCoreUser;

public class TIMVideoElem
  extends TIMElem
{
  private TIMSnapshot snapshot;
  private String snapshotPath = "";
  private long taskId = 0L;
  private TIMVideo video;
  private String videoPath = "";
  
  public TIMVideoElem()
  {
    this.type = TIMElemType.Video;
  }
  
  public TIMSnapshot getSnapshotInfo()
  {
    return this.snapshot;
  }
  
  public String getSnapshotPath()
  {
    return this.snapshotPath;
  }
  
  public long getTaskId()
  {
    return this.taskId;
  }
  
  public int getUploadingProgress()
  {
    if ((!IMCoreWrapper.get().isReady()) || (this.taskId == 0L)) {
      return 0;
    }
    return TIMManager.getInstance().getCoreUser().getImageUploadProgrss(this.taskId);
  }
  
  public TIMVideo getVideoInfo()
  {
    return this.video;
  }
  
  public String getVideoPath()
  {
    return this.videoPath;
  }
  
  public void setSnapshot(TIMSnapshot paramTIMSnapshot)
  {
    this.snapshot = paramTIMSnapshot;
  }
  
  public void setSnapshotPath(String paramString)
  {
    this.snapshotPath = paramString;
  }
  
  void setTaskId(long paramLong)
  {
    this.taskId = paramLong;
  }
  
  public void setVideo(TIMVideo paramTIMVideo)
  {
    this.video = paramTIMVideo;
  }
  
  public void setVideoPath(String paramString)
  {
    this.videoPath = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMVideoElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */