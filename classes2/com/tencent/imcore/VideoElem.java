package com.tencent.imcore;

public class VideoElem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public VideoElem()
  {
    this(internalJNI.new_VideoElem(), true);
  }
  
  protected VideoElem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(VideoElem paramVideoElem)
  {
    if (paramVideoElem == null) {
      return 0L;
    }
    return paramVideoElem.swigCPtr;
  }
  
  public void delete()
  {
    try
    {
      if (this.swigCPtr != 0L)
      {
        if (this.swigCMemOwn)
        {
          this.swigCMemOwn = false;
          internalJNI.delete_VideoElem(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public byte[] getImageId()
  {
    return internalJNI.VideoElem_imageId_get(this.swigCPtr, this);
  }
  
  public long getImage_height()
  {
    return internalJNI.VideoElem_image_height_get(this.swigCPtr, this);
  }
  
  public byte[] getImage_path()
  {
    return internalJNI.VideoElem_image_path_get(this.swigCPtr, this);
  }
  
  public long getImage_size()
  {
    return internalJNI.VideoElem_image_size_get(this.swigCPtr, this);
  }
  
  public byte[] getImage_type()
  {
    return internalJNI.VideoElem_image_type_get(this.swigCPtr, this);
  }
  
  public long getImage_width()
  {
    return internalJNI.VideoElem_image_width_get(this.swigCPtr, this);
  }
  
  public long getTaskid()
  {
    return internalJNI.VideoElem_taskid_get(this.swigCPtr, this);
  }
  
  public byte[] getVideoId()
  {
    return internalJNI.VideoElem_videoId_get(this.swigCPtr, this);
  }
  
  public long getVideo_duration()
  {
    return internalJNI.VideoElem_video_duration_get(this.swigCPtr, this);
  }
  
  public byte[] getVideo_path()
  {
    return internalJNI.VideoElem_video_path_get(this.swigCPtr, this);
  }
  
  public long getVideo_size()
  {
    return internalJNI.VideoElem_video_size_get(this.swigCPtr, this);
  }
  
  public byte[] getVideo_type()
  {
    return internalJNI.VideoElem_video_type_get(this.swigCPtr, this);
  }
  
  public void setImageId(byte[] paramArrayOfByte)
  {
    internalJNI.VideoElem_imageId_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setImage_height(long paramLong)
  {
    internalJNI.VideoElem_image_height_set(this.swigCPtr, this, paramLong);
  }
  
  public void setImage_path(byte[] paramArrayOfByte)
  {
    internalJNI.VideoElem_image_path_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setImage_size(long paramLong)
  {
    internalJNI.VideoElem_image_size_set(this.swigCPtr, this, paramLong);
  }
  
  public void setImage_type(byte[] paramArrayOfByte)
  {
    internalJNI.VideoElem_image_type_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setImage_width(long paramLong)
  {
    internalJNI.VideoElem_image_width_set(this.swigCPtr, this, paramLong);
  }
  
  public void setTaskid(long paramLong)
  {
    internalJNI.VideoElem_taskid_set(this.swigCPtr, this, paramLong);
  }
  
  public void setVideoId(byte[] paramArrayOfByte)
  {
    internalJNI.VideoElem_videoId_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setVideo_duration(long paramLong)
  {
    internalJNI.VideoElem_video_duration_set(this.swigCPtr, this, paramLong);
  }
  
  public void setVideo_path(byte[] paramArrayOfByte)
  {
    internalJNI.VideoElem_video_path_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setVideo_size(long paramLong)
  {
    internalJNI.VideoElem_video_size_set(this.swigCPtr, this, paramLong);
  }
  
  public void setVideo_type(byte[] paramArrayOfByte)
  {
    internalJNI.VideoElem_video_type_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\VideoElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */