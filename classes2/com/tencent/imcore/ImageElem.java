package com.tencent.imcore;

public class ImageElem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public ImageElem()
  {
    this(internalJNI.new_ImageElem(), true);
  }
  
  protected ImageElem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(ImageElem paramImageElem)
  {
    if (paramImageElem == null) {
      return 0L;
    }
    return paramImageElem.swigCPtr;
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
          internalJNI.delete_ImageElem(this.swigCPtr);
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
  
  public String getFileid()
  {
    return internalJNI.ImageElem_fileid_get(this.swigCPtr, this);
  }
  
  public int getFormat()
  {
    return internalJNI.ImageElem_format_get(this.swigCPtr, this);
  }
  
  public String getLarge_url()
  {
    return internalJNI.ImageElem_large_url_get(this.swigCPtr, this);
  }
  
  public int getLevel()
  {
    return internalJNI.ImageElem_level_get(this.swigCPtr, this);
  }
  
  public String getOrig_url()
  {
    return internalJNI.ImageElem_orig_url_get(this.swigCPtr, this);
  }
  
  public int getPic_height()
  {
    return internalJNI.ImageElem_pic_height_get(this.swigCPtr, this);
  }
  
  public int getPic_large_height()
  {
    return internalJNI.ImageElem_pic_large_height_get(this.swigCPtr, this);
  }
  
  public int getPic_large_size()
  {
    return internalJNI.ImageElem_pic_large_size_get(this.swigCPtr, this);
  }
  
  public int getPic_large_width()
  {
    return internalJNI.ImageElem_pic_large_width_get(this.swigCPtr, this);
  }
  
  public int getPic_size()
  {
    return internalJNI.ImageElem_pic_size_get(this.swigCPtr, this);
  }
  
  public int getPic_thumb_height()
  {
    return internalJNI.ImageElem_pic_thumb_height_get(this.swigCPtr, this);
  }
  
  public int getPic_thumb_size()
  {
    return internalJNI.ImageElem_pic_thumb_size_get(this.swigCPtr, this);
  }
  
  public int getPic_thumb_width()
  {
    return internalJNI.ImageElem_pic_thumb_width_get(this.swigCPtr, this);
  }
  
  public int getPic_width()
  {
    return internalJNI.ImageElem_pic_width_get(this.swigCPtr, this);
  }
  
  public int getTaskid()
  {
    return internalJNI.ImageElem_taskid_get(this.swigCPtr, this);
  }
  
  public String getThumb_url()
  {
    return internalJNI.ImageElem_thumb_url_get(this.swigCPtr, this);
  }
  
  public void setFileid(String paramString)
  {
    internalJNI.ImageElem_fileid_set(this.swigCPtr, this, paramString);
  }
  
  public void setFormat(int paramInt)
  {
    internalJNI.ImageElem_format_set(this.swigCPtr, this, paramInt);
  }
  
  public void setLarge_url(String paramString)
  {
    internalJNI.ImageElem_large_url_set(this.swigCPtr, this, paramString);
  }
  
  public void setLevel(int paramInt)
  {
    internalJNI.ImageElem_level_set(this.swigCPtr, this, paramInt);
  }
  
  public void setOrig_url(String paramString)
  {
    internalJNI.ImageElem_orig_url_set(this.swigCPtr, this, paramString);
  }
  
  public void setPic_height(int paramInt)
  {
    internalJNI.ImageElem_pic_height_set(this.swigCPtr, this, paramInt);
  }
  
  public void setPic_large_height(int paramInt)
  {
    internalJNI.ImageElem_pic_large_height_set(this.swigCPtr, this, paramInt);
  }
  
  public void setPic_large_size(int paramInt)
  {
    internalJNI.ImageElem_pic_large_size_set(this.swigCPtr, this, paramInt);
  }
  
  public void setPic_large_width(int paramInt)
  {
    internalJNI.ImageElem_pic_large_width_set(this.swigCPtr, this, paramInt);
  }
  
  public void setPic_size(int paramInt)
  {
    internalJNI.ImageElem_pic_size_set(this.swigCPtr, this, paramInt);
  }
  
  public void setPic_thumb_height(int paramInt)
  {
    internalJNI.ImageElem_pic_thumb_height_set(this.swigCPtr, this, paramInt);
  }
  
  public void setPic_thumb_size(int paramInt)
  {
    internalJNI.ImageElem_pic_thumb_size_set(this.swigCPtr, this, paramInt);
  }
  
  public void setPic_thumb_width(int paramInt)
  {
    internalJNI.ImageElem_pic_thumb_width_set(this.swigCPtr, this, paramInt);
  }
  
  public void setPic_width(int paramInt)
  {
    internalJNI.ImageElem_pic_width_set(this.swigCPtr, this, paramInt);
  }
  
  public void setTaskid(int paramInt)
  {
    internalJNI.ImageElem_taskid_set(this.swigCPtr, this, paramInt);
  }
  
  public void setThumb_url(String paramString)
  {
    internalJNI.ImageElem_thumb_url_set(this.swigCPtr, this, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ImageElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */