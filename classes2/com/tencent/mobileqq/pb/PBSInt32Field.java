package com.tencent.mobileqq.pb;

public final class PBSInt32Field
  extends PBPrimitiveField<Integer>
{
  public static final PBSInt32Field __repeatHelper__ = new PBSInt32Field(0, false);
  private int value = 0;
  
  public PBSInt32Field(int paramInt, boolean paramBoolean)
  {
    set(paramInt, paramBoolean);
  }
  
  public void clear(Object paramObject)
  {
    if ((paramObject instanceof Integer)) {}
    for (this.value = ((Integer)paramObject).intValue();; this.value = 0)
    {
      setHasFlag(false);
      return;
    }
  }
  
  public int computeSize(int paramInt)
  {
    if (has()) {
      return CodedOutputStreamMicro.computeSInt32Size(paramInt, this.value);
    }
    return 0;
  }
  
  protected int computeSizeDirectly(int paramInt, Integer paramInteger)
  {
    return CodedOutputStreamMicro.computeSInt32Size(paramInt, paramInteger.intValue());
  }
  
  protected void copyFrom(PBField<Integer> paramPBField)
  {
    paramPBField = (PBSInt32Field)paramPBField;
    set(paramPBField.value, paramPBField.has());
  }
  
  public int get()
  {
    return this.value;
  }
  
  public void readFrom(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    this.value = paramCodedInputStreamMicro.readSInt32();
    setHasFlag(true);
  }
  
  protected Integer readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    return Integer.valueOf(paramCodedInputStreamMicro.readSInt32());
  }
  
  public void set(int paramInt)
  {
    set(paramInt, true);
  }
  
  public void set(int paramInt, boolean paramBoolean)
  {
    this.value = paramInt;
    setHasFlag(paramBoolean);
  }
  
  public void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt)
  {
    if (has()) {
      paramCodedOutputStreamMicro.writeSInt32(paramInt, this.value);
    }
  }
  
  protected void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, Integer paramInteger)
  {
    paramCodedOutputStreamMicro.writeSInt32(paramInt, paramInteger.intValue());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mobileqq\pb\PBSInt32Field.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */