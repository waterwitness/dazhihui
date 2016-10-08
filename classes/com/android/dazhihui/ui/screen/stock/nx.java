package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.dazhihui.d.i;
import com.android.dazhihui.d.k;
import com.android.dazhihui.ui.widget.PageLoadTip;
import java.io.File;

class nx
  extends AsyncTask<Context, Long, k>
{
  private i f;
  
  nx(PDFActivity paramPDFActivity, ProgressBar paramProgressBar, TextView paramTextView, String paramString, AlertDialog paramAlertDialog) {}
  
  protected k a(Context... paramVarArgs)
  {
    this.f = new i();
    this.f.a(new ny(this));
    return this.f.a(paramVarArgs[0], this.c);
  }
  
  protected void a(k paramk)
  {
    super.onCancelled(paramk);
    if (this.f != null) {
      this.f.a();
    }
  }
  
  protected void a(Long... paramVarArgs)
  {
    long l1 = paramVarArgs[0].longValue();
    long l2 = paramVarArgs[1].longValue();
    if (l1 != 0L)
    {
      l2 = l2 * 100L / l1;
      paramVarArgs = "已下载" + l2 + "%  (共" + l1 * 100L / 1024L / 100.0D + "KB)";
      this.a.setProgress((int)l2);
      this.a.setVisibility(0);
    }
    for (;;)
    {
      this.b.setText(paramVarArgs);
      return;
      paramVarArgs = "正在下载";
      this.a.setVisibility(4);
    }
  }
  
  protected void b(k paramk)
  {
    if (paramk.a) {
      PDFActivity.b(this.e).setPageError("文件加载失败!");
    }
    while (!paramk.c) {
      return;
    }
    try
    {
      this.d.dismiss();
      PDFActivity.a(this.e, paramk.d.getAbsolutePath());
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\nx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */