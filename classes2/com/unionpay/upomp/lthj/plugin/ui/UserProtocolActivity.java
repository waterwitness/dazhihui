package com.unionpay.upomp.lthj.plugin.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.f.a.a.bp;
import com.f.a.a.dt;

public class UserProtocolActivity
  extends BaseActivity
  implements AdapterView.OnItemClickListener
{
  private UserProtocolActivity.UserProtocalAdapter a;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getString(bp.j()), new dt(this));
    setContentView(bp.ao());
    this.a = new UserProtocolActivity.UserProtocalAdapter(this, this);
    paramBundle = (ListView)findViewById(bp.bR());
    paramBundle.setAdapter(this.a);
    paramBundle.setOnItemClickListener(this);
    paramBundle.setSelected(false);
    paramBundle.setCacheColorHint(0);
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.clickItem(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\UserProtocolActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */