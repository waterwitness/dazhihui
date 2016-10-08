package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.dazhihui.b.b;
import com.android.dazhihui.b.h;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.q;
import java.util.Iterator;
import java.util.List;

public class PublicMessageDialog
  extends BaseActivity
{
  private final int a = 1;
  private final int b = 2;
  private b c = b.a();
  private Bundle d;
  private int e;
  private String f;
  private int g;
  private List<h> h;
  
  protected void init(Bundle paramBundle)
  {
    this.d = getIntent().getExtras();
    this.e = this.d.getInt("notificationId", -1);
    this.f = this.d.getString("nexturl", "");
    this.g = this.d.getInt("BUNDLE_PUSH_ID");
    if ((this.e == 2) || (this.e == 4) || (this.e == 13))
    {
      showDialog(1);
      return;
    }
    finish();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 19)
    {
      Intent localIntent = new Intent(this, MainScreen.class);
      Bundle localBundle = new Bundle();
      localBundle.putInt("TAB_ID", q.b);
      localBundle.putInt("fragment_index", 0);
      localIntent.putExtras(localBundle);
      startActivity(localIntent);
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    int j = 0;
    int i;
    Object localObject;
    if (this.e == 4)
    {
      i = 1;
      this.h = this.c.d(i);
      if ((this.h == null) || (this.h.size() <= 0)) {
        break label291;
      }
      Iterator localIterator = this.h.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (h)localIterator.next();
      } while (((h)localObject).a != this.g);
    }
    for (;;)
    {
      if (localObject != null) {}
      label291:
      for (localObject = ((h)localObject).f;; localObject = "公告消息")
      {
        this.c.c(this.g);
        b.a().a((byte)2);
        if (paramInt == 2)
        {
          return new AlertDialog.Builder(this).setTitle("推送消息").setMessage((CharSequence)localObject).setPositiveButton(2131166139, new pv(this)).setNegativeButton(2131166137, new pu(this)).setOnCancelListener(new pt(this)).create();
          i = j;
          if (this.e == 2) {
            break;
          }
          if (this.e == 12)
          {
            i = 2;
            break;
          }
          i = j;
          if (this.e != 13) {
            break;
          }
          i = 3;
          break;
        }
        if (paramInt == 1) {
          return new AlertDialog.Builder(this).setTitle("推送消息").setMessage((CharSequence)localObject).setPositiveButton("详情", new py(this)).setNegativeButton(2131166137, new px(this)).setOnCancelListener(new pw(this)).create();
        }
        return super.onCreateDialog(paramInt);
      }
      localObject = null;
    }
  }
  
  protected void onFinish() {}
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.d = getIntent().getExtras();
    this.e = this.d.getInt("notificationId", -1);
    this.f = this.d.getString("url", "");
    this.g = this.d.getInt("BUNDLE_PUSH_ID");
    Log.d("xxx", "messageId id:" + this.g);
    if ((this.e == 2) || (this.e == 4) || (this.e == 13))
    {
      paramIntent = this.c.d(0);
      if ((paramIntent == null) || (paramIntent.size() == 0))
      {
        paramIntent = new Intent();
        paramIntent.putExtra("type", (byte)2);
        paramIntent.setClass(this, MessageCenterList.class);
        startActivity(paramIntent);
        finish();
        return;
      }
      showDialog(1);
      return;
    }
    finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\PublicMessageDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */