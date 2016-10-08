package com.tencent;

import com.tencent.imcore.IMCoreUser;
import com.tencent.imsdk.QLog;
import java.util.ArrayList;

public class TIMImageElem
  extends TIMElem
{
  public static final int TIM_IMAGE_FORMAT_BMP = 4;
  public static final int TIM_IMAGE_FORMAT_GIF = 2;
  public static final int TIM_IMAGE_FORMAT_JPG = 1;
  public static final int TIM_IMAGE_FORMAT_PNG = 3;
  public static final int TIM_IMAGE_FORMAT_UNKNOWN = 255;
  private int imageFormat = 255;
  private ArrayList<TIMImage> imageList = new ArrayList();
  private int level = 1;
  private String path;
  private int taskId = 0;
  
  public TIMImageElem()
  {
    this.type = TIMElemType.Image;
  }
  
  public boolean cancelUploading()
  {
    if ((!IMCoreWrapper.get().isReady()) || (this.taskId == 0)) {
      return false;
    }
    QLog.e("MSF.C.TIMMessage", 1, "canceluploading: " + this.taskId);
    TIMManager.getInstance().getCoreUser().cancelTask(this.taskId);
    return true;
  }
  
  public int getImageFormat()
  {
    return this.imageFormat;
  }
  
  public ArrayList<TIMImage> getImageList()
  {
    return this.imageList;
  }
  
  public int getLevel()
  {
    return this.level;
  }
  
  public String getPath()
  {
    return this.path;
  }
  
  public int getTaskId()
  {
    return this.taskId;
  }
  
  public int getUploadingProgress()
  {
    if ((!IMCoreWrapper.get().isReady()) || (this.taskId == 0)) {
      return 0;
    }
    return TIMManager.getInstance().getCoreUser().getImageUploadProgrss(this.taskId);
  }
  
  void setImageFormat(int paramInt)
  {
    this.imageFormat = paramInt;
  }
  
  public void setLevel(int paramInt)
  {
    this.level = paramInt;
  }
  
  public void setPath(String paramString)
  {
    this.path = paramString;
  }
  
  void setTaskId(int paramInt)
  {
    this.taskId = paramInt;
  }
  
  public void setmageList(ArrayList<TIMImage> paramArrayList)
  {
    this.imageList = paramArrayList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMImageElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */