package com.tencent.imcore;

public class TextElem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public TextElem()
  {
    this(internalJNI.new_TextElem(), true);
  }
  
  protected TextElem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(TextElem paramTextElem)
  {
    if (paramTextElem == null) {
      return 0L;
    }
    return paramTextElem.swigCPtr;
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
          internalJNI.delete_TextElem(this.swigCPtr);
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
  
  public byte[] getContent()
  {
    return internalJNI.TextElem_content_get(this.swigCPtr, this);
  }
  
  public void setContent(byte[] paramArrayOfByte)
  {
    internalJNI.TextElem_content_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\TextElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */