package com.android.dazhihui.ui.screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.dazhihui.b.b;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.stock.MessageCenterList;
import com.android.dazhihui.ui.screen.stock.PublicMessageDialog;

public class NotificationActivity
  extends Activity
{
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Intent localIntent;
    if (paramInt1 == 19)
    {
      localIntent = new Intent(this, MainScreen.class);
      Bundle localBundle = new Bundle();
      localBundle.putInt("TAB_ID", q.b);
      localBundle.putInt("fragment_index", 0);
      localIntent.putExtras(localBundle);
      startActivity(localIntent);
      finish();
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      if (paramInt1 == 20)
      {
        localIntent = new Intent();
        localIntent.putExtra("type", (byte)2);
        localIntent.setClass(this, MessageCenterList.class);
        startActivity(localIntent);
        finish();
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      int i = paramBundle.getInt("notificationId");
      Object localObject = paramBundle.getString("code");
      String str = paramBundle.getString("name");
      if (i == 1)
      {
        i = paramBundle.getInt("BUNDLE_PUSH_ID");
        b.a().b(i);
        paramBundle = new Bundle();
        paramBundle.putString("code", (String)localObject);
        paramBundle.putString("name", str);
        paramBundle.putBoolean("isWarn", true);
        localObject = new StockVo(str, (String)localObject, -1, false);
        if (SelfSelectedStockManager.getInstance().getSelfStockVectorSize() <= 0) {
          SelfSelectedStockManager.getInstance().loadDataFromLocal();
        }
        r.a(this, (StockVo)localObject, paramBundle);
        b.a().a((byte)1);
        finish();
        return;
      }
      if ((i == 2) || (i == 4) || (i == 13))
      {
        str = paramBundle.getString("url");
        localObject = new Bundle();
        ((Bundle)localObject).putInt("type", 0);
        ((Bundle)localObject).putInt("notificationId", i);
        ((Bundle)localObject).putBoolean("isToMain", false);
        ((Bundle)localObject).putString("nexturl", str);
        i = paramBundle.getInt("BUNDLE_PUSH_ID");
        ((Bundle)localObject).putInt("BUNDLE_PUSH_ID", i);
        Log.d("xxx", "put id:" + i);
        paramBundle = new Intent();
        paramBundle.putExtras((Bundle)localObject);
        paramBundle.setClass(this, PublicMessageDialog.class);
        paramBundle.setFlags(268435456);
        startActivity(paramBundle);
        finish();
        return;
      }
      if (i == 12)
      {
        i = paramBundle.getInt("BUNDLE_PUSH_ID");
        paramBundle = new Intent(this, MainScreen.class);
        localObject = new Bundle();
        ((Bundle)localObject).putInt("TAB_ID", q.b);
        ((Bundle)localObject).putInt("fragment_index", 0);
        paramBundle.putExtras((Bundle)localObject);
        startActivity(paramBundle);
        b.a().c(i);
        b.a().a((byte)2);
        finish();
        return;
      }
      finish();
      return;
    }
    finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\NotificationActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */