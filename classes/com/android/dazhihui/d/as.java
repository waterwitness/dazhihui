package com.android.dazhihui.d;

import android.os.AsyncTask;

final class as
  extends AsyncTask<String, String, Integer>
{
  protected Integer a(String... paramVarArgs)
  {
    int[] arrayOfInt = aq.a(paramVarArgs[0]);
    int i = arrayOfInt[0];
    if (i == 0) {
      return Integer.valueOf(aq.a(paramVarArgs[1] + "\r\n", paramVarArgs[0], arrayOfInt[1]));
    }
    if (i == 1) {
      return Integer.valueOf(aq.a(paramVarArgs[1] + "\r\n", paramVarArgs[0], 0));
    }
    if (i == 2) {}
    return Integer.valueOf(-1);
  }
  
  protected void a(Integer paramInteger) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */