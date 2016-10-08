package com.tencent.imcore;

public final class TransFileType
{
  public static final TransFileType kPicFile = new TransFileType("kPicFile", internalJNI.kPicFile_get());
  public static final TransFileType kPicThumb = new TransFileType("kPicThumb");
  public static final TransFileType kTransFile = new TransFileType("kTransFile");
  public static final TransFileType kTransPtt = new TransFileType("kTransPtt");
  public static final TransFileType kTransVideoSnapshot = new TransFileType("kTransVideoSnapshot");
  private static int swigNext = 0;
  private static TransFileType[] swigValues = { kPicFile, kPicThumb, kTransFile, kTransPtt, kTransVideoSnapshot };
  private final String swigName;
  private final int swigValue;
  
  private TransFileType(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private TransFileType(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private TransFileType(String paramString, TransFileType paramTransFileType)
  {
    this.swigName = paramString;
    this.swigValue = paramTransFileType.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static TransFileType swigToEnum(int paramInt)
  {
    if ((paramInt < swigValues.length) && (paramInt >= 0) && (swigValues[paramInt].swigValue == paramInt)) {
      return swigValues[paramInt];
    }
    int i = 0;
    while (i < swigValues.length)
    {
      if (swigValues[i].swigValue == paramInt) {
        return swigValues[i];
      }
      i += 1;
    }
    throw new IllegalArgumentException("No enum " + TransFileType.class + " with value " + paramInt);
  }
  
  public final int swigValue()
  {
    return this.swigValue;
  }
  
  public final String toString()
  {
    return this.swigName;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\TransFileType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */