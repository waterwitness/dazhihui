package com.tencent.imcore;

public class FaceElem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FaceElem()
  {
    this(internalJNI.new_FaceElem(), true);
  }
  
  protected FaceElem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FaceElem paramFaceElem)
  {
    if (paramFaceElem == null) {
      return 0L;
    }
    return paramFaceElem.swigCPtr;
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
          internalJNI.delete_FaceElem(this.swigCPtr);
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
  
  public byte[] getBuf()
  {
    return internalJNI.FaceElem_buf_get(this.swigCPtr, this);
  }
  
  public int getIndex()
  {
    return internalJNI.FaceElem_index_get(this.swigCPtr, this);
  }
  
  public void setBuf(byte[] paramArrayOfByte)
  {
    internalJNI.FaceElem_buf_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setIndex(int paramInt)
  {
    internalJNI.FaceElem_index_set(this.swigCPtr, this, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FaceElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */