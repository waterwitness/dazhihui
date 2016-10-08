package com.tencent.imsdk;

import com.tencent.qalsdk.QALLogListener;

final class ʽ
  implements QALLogListener
{
  ʽ(IMMsfCoreProxy paramIMMsfCoreProxy) {}
  
  public final void log(int paramInt, String paramString1, String paramString2)
  {
    switch (paramInt)
    {
    default: 
      QLog.dfile(paramString1, 1, paramString2);
      return;
    case 1: 
      QLog.efile(paramString1, 1, paramString2);
      return;
    case 2: 
      QLog.wfile(paramString1, 1, paramString2);
      return;
    }
    QLog.ifile(paramString1, 1, paramString2);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ʽ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */