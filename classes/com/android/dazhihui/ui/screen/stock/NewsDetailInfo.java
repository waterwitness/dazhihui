package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.android.dazhihui.g;
import com.android.dazhihui.m;
import com.android.dazhihui.ui.screen.AdvertBaseActivity;
import com.android.dazhihui.ui.widget.MyViewPager;
import com.android.dazhihui.ui.widget.PopupMenu;

public class NewsDetailInfo
  extends AdvertBaseActivity
{
  lo a;
  MyViewPager b;
  private long c = SystemClock.uptimeMillis();
  private String d;
  
  private void a()
  {
    long l = SystemClock.uptimeMillis() - this.c;
    this.c = SystemClock.uptimeMillis();
    if ((l > 0L) && (!TextUtils.isEmpty(this.d))) {
      g.a().a(m.g, this.d, l);
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("url", paramString1);
    localBundle.putString("title", paramString4);
    localBundle.putString("source", paramString5);
    localBundle.putString("news_title", paramString3);
    localBundle.putString("summary", paramString6);
    localBundle.putString("stock", paramString7);
    localBundle.putString("newsId", paramString2);
    localBundle.putString("advTypeShare", paramString8);
    paramString1 = new Intent(paramContext, NewsDetailInfo.class);
    paramString1.putExtras(localBundle);
    paramContext.startActivity(paramString1);
  }
  
  public void a(int paramInt)
  {
    this.b.setCurrentItem(paramInt, true);
  }
  
  public void a(String paramString)
  {
    Fragment localFragment = this.a.a();
    if ((localFragment instanceof ju))
    {
      ((ju)localFragment).a(paramString);
      return;
    }
    ((ju)this.a.b(1)).a(paramString);
  }
  
  protected void init(Bundle paramBundle)
  {
    if ((getIntent() != null) && (getIntent().getExtras() != null)) {
      this.d = getIntent().getExtras().getString("newsId", "");
    }
    this.b = new MyViewPager(this);
    this.b.setId(this.b.hashCode());
    setContentView(this.b);
    this.a = new lo(getSupportFragmentManager(), getIntent().getExtras());
    this.b.setAdapter(this.a);
    this.b.setOnPageChangeListener(new ln(this));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      if ((this.a.a() instanceof kz))
      {
        kz localkz = (kz)this.a.a();
        if (localkz.b.a())
        {
          localkz.b.c();
          return true;
        }
      }
      else
      {
        a(0);
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    a();
  }
  
  public void onResume()
  {
    super.onResume();
    this.c = SystemClock.uptimeMillis();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\NewsDetailInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */