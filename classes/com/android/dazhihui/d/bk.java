package com.android.dazhihui.d;

import android.app.ProgressDialog;
import android.os.AsyncTask;

class bk
  extends AsyncTask<String, Void, Boolean>
{
  bk(bj parambj) {}
  
  protected Boolean a(String... paramVarArgs)
  {
    return Boolean.valueOf(bj.a(this.a, paramVarArgs[0]));
  }
  
  protected void a(Boolean paramBoolean)
  {
    bj.a(this.a).dismiss();
    if (bj.b(this.a) != null) {
      bj.b(this.a).a(paramBoolean.booleanValue());
    }
    if (paramBoolean.booleanValue())
    {
      this.a.a("头像上传成功!");
      return;
    }
    this.a.a("头像上传失败!");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */