package android.support.v4.app;

import android.os.Bundle;

class cz
{
  static Bundle a(cx paramcx)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("resultKey", paramcx.a());
    localBundle.putCharSequence("label", paramcx.b());
    localBundle.putCharSequenceArray("choices", paramcx.c());
    localBundle.putBoolean("allowFreeFormInput", paramcx.d());
    localBundle.putBundle("extras", paramcx.e());
    return localBundle;
  }
  
  static Bundle[] a(cx[] paramArrayOfcx)
  {
    if (paramArrayOfcx == null) {
      return null;
    }
    Bundle[] arrayOfBundle = new Bundle[paramArrayOfcx.length];
    int i = 0;
    while (i < paramArrayOfcx.length)
    {
      arrayOfBundle[i] = a(paramArrayOfcx[i]);
      i += 1;
    }
    return arrayOfBundle;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */