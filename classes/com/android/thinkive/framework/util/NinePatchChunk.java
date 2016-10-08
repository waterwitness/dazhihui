package com.android.thinkive.framework.util;

import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class NinePatchChunk
{
  public static final int NO_COLOR = 1;
  public static final int TRANSPARENT_COLOR = 0;
  public int[] mColor;
  public int[] mDivX;
  public int[] mDivY;
  public final Rect mPaddings = new Rect();
  
  private static void checkDivCount(int paramInt)
  {
    if ((paramInt == 0) || ((paramInt & 0x1) != 0)) {
      throw new RuntimeException("invalid nine-patch: " + paramInt);
    }
  }
  
  public static NinePatchChunk deserialize(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.nativeOrder());
    if (paramArrayOfByte.get() == 0) {
      return null;
    }
    NinePatchChunk localNinePatchChunk = new NinePatchChunk();
    localNinePatchChunk.mDivX = new int[paramArrayOfByte.get()];
    localNinePatchChunk.mDivY = new int[paramArrayOfByte.get()];
    localNinePatchChunk.mColor = new int[paramArrayOfByte.get()];
    checkDivCount(localNinePatchChunk.mDivX.length);
    checkDivCount(localNinePatchChunk.mDivY.length);
    paramArrayOfByte.getInt();
    paramArrayOfByte.getInt();
    localNinePatchChunk.mPaddings.left = paramArrayOfByte.getInt();
    localNinePatchChunk.mPaddings.right = paramArrayOfByte.getInt();
    localNinePatchChunk.mPaddings.top = paramArrayOfByte.getInt();
    localNinePatchChunk.mPaddings.bottom = paramArrayOfByte.getInt();
    paramArrayOfByte.getInt();
    readIntArray(localNinePatchChunk.mDivX, paramArrayOfByte);
    readIntArray(localNinePatchChunk.mDivY, paramArrayOfByte);
    readIntArray(localNinePatchChunk.mColor, paramArrayOfByte);
    return localNinePatchChunk;
  }
  
  private static void readIntArray(int[] paramArrayOfInt, ByteBuffer paramByteBuffer)
  {
    int i = 0;
    int j = paramArrayOfInt.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      paramArrayOfInt[i] = paramByteBuffer.getInt();
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\NinePatchChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */