package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.android.dazhihui.g;
import com.android.dazhihui.service.DownloadService;

public class DialogActivity
  extends Activity
{
  private int a;
  private String b;
  private String c;
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      if (this.a == 11) {
        DownloadService.a(this, g.a().P());
      }
    }
    for (;;)
    {
      finish();
      overridePendingTransition(0, 0);
      return;
      if (this.a == 12)
      {
        DownloadService.a(this, g.a().P(), false, false);
        continue;
        if ((this.a == 11) || (this.a != 12)) {}
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    Object localObject = new FrameLayout(this);
    ((FrameLayout)localObject).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    ((FrameLayout)localObject).setBackgroundColor(0);
    setContentView((View)localObject);
    localObject = getIntent();
    if (localObject == null)
    {
      finish();
      overridePendingTransition(0, 0);
    }
    do
    {
      return;
      localObject = ((Intent)localObject).getExtras();
      if (localObject == null)
      {
        finish();
        overridePendingTransition(0, 0);
        return;
      }
      this.a = ((Bundle)localObject).getInt("screenId");
      this.b = ((Bundle)localObject).getString("title");
      this.c = ((Bundle)localObject).getString("message");
      if (this.a == 11)
      {
        if ((!TextUtils.isEmpty(g.a().R())) && (!TextUtils.isEmpty(g.a().r())) && (!TextUtils.isEmpty(g.a().S()))) {
          this.c = (this.c + "\n" + getString(2131166015) + g.a().r() + "\n" + getString(2131165996) + g.a().S() + "\n" + g.a().R());
        }
        if (g.a().L()) {
          this.c = (this.c + "\n" + "更新包下载位置: \n" + ((Bundle)localObject).getString("save_path"));
        }
      }
      if (this.b == null) {
        this.b = getString(2131165514);
      }
      if (this.c == null) {
        this.c = "";
      }
    } while (paramBundle != null);
    showDialog(this.a);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2;
    switch (paramInt)
    {
    default: 
      localObject2 = null;
    }
    for (;;)
    {
      localObject1 = new AlertDialog.Builder(this).setTitle(this.b).setMessage(this.c).setPositiveButton((CharSequence)localObject2, new bi(this)).setNegativeButton((CharSequence)localObject1, new bh(this)).setOnCancelListener(new bg(this)).create();
      ((AlertDialog)localObject1).setCancelable(true);
      ((AlertDialog)localObject1).setCanceledOnTouchOutside(true);
      return (Dialog)localObject1;
      localObject2 = "立即安装";
      localObject1 = "下次再说";
      continue;
      localObject2 = "继续";
      localObject1 = "暂停";
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\DialogActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */