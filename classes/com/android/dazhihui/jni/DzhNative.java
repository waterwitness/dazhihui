package com.android.dazhihui.jni;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class DzhNative
{
  private static Map<Integer, DzhNative.IDispatchReceive> mReceiverMap;
  private static DzhNative s_Instance = null;
  
  static
  {
    mReceiverMap = new ConcurrentHashMap();
    System.loadLibrary("dzhconnection");
    System.loadLibrary("dzhjni");
  }
  
  private DzhNative()
  {
    mReceiverMap.clear();
    initNativeApi();
  }
  
  public static void exception(int paramInt1, int paramInt2)
  {
    Iterator localIterator = mReceiverMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((Integer)localEntry.getKey()).intValue() == paramInt2) {
        ((DzhNative.IDispatchReceive)localEntry.getValue()).exception(paramInt1);
      }
    }
  }
  
  public static DzhNative getInstance()
  {
    if (s_Instance == null) {}
    synchronized ("dzhnative".intern())
    {
      if (s_Instance == null) {
        s_Instance = new DzhNative();
      }
      return s_Instance;
    }
  }
  
  protected static native void initNativeApi();
  
  public static void receive(byte[] paramArrayOfByte, int paramInt)
  {
    Iterator localIterator = mReceiverMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((Integer)localEntry.getKey()).intValue() == paramInt) {
        ((DzhNative.IDispatchReceive)localEntry.getValue()).receiveData(paramArrayOfByte);
      }
    }
  }
  
  public native void clipLeftImage(Bitmap paramBitmap1, Bitmap paramBitmap2, float paramFloat);
  
  public native void closeAllRoutine();
  
  public void closeConnection(int paramInt)
  {
    Iterator localIterator = mReceiverMap.entrySet().iterator();
    while (localIterator.hasNext()) {
      if (((Integer)((Map.Entry)localIterator.next()).getKey()).intValue() == paramInt) {
        mReceiverMap.remove(Integer.valueOf(paramInt));
      }
    }
    closeRoutine(paramInt);
  }
  
  public native int closeRoutine(int paramInt);
  
  public native int createConnection(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3);
  
  public void registDispatchReceive(DzhNative.IDispatchReceive paramIDispatchReceive, int paramInt)
  {
    mReceiverMap.put(Integer.valueOf(paramInt), paramIDispatchReceive);
  }
  
  public native int send(byte[] paramArrayOfByte, int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\jni\DzhNative.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */