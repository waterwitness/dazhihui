package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.adapter.MinuteTitleGridAdpter;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.FundTitle;
import com.android.dazhihui.ui.widget.MenuItemView;
import com.android.dazhihui.ui.widget.MinuteDetailCtrl;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.dr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class FundStockChartScreen
  extends BaseActivity
  implements cp, cs, dr
{
  public static final int[] a = { 2130838518, 2130838522 };
  private DzhHeader b;
  private FundTitle c;
  private MenuItemView d;
  private e e;
  private String f;
  private String g;
  private String[] h;
  private AdapterView.OnItemClickListener i;
  private boolean j;
  private MinuteDetailCtrl k;
  private DzhHeader l;
  
  private void b(Class<? extends e> paramClass, Bundle paramBundle)
  {
    try
    {
      this.e = ((e)paramClass.newInstance());
      this.e.setArguments(paramBundle);
      paramClass = getSupportFragmentManager().a();
      paramBundle = (e)getSupportFragmentManager().a(2131558983);
      ((cs)this.e).getTitle(this.l);
      paramClass.b(2131558983, this.e);
      paramClass.a();
      return;
    }
    catch (InstantiationException paramClass)
    {
      paramClass.printStackTrace();
      return;
    }
    catch (IllegalAccessException paramClass)
    {
      paramClass.printStackTrace();
    }
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
      continue;
      if (this.e != null)
      {
        this.e.refresh();
        continue;
        startActivity(new Intent(this, SearchStockScreen.class));
      }
    }
  }
  
  public void a(int paramInt)
  {
    m localm = m.a();
    Vector localVector = localm.z();
    if ((localVector == null) || (localVector.size() == 0)) {
      return;
    }
    if (paramInt == 0) {
      localm.w((localm.A() + 1) % localVector.size());
    }
    for (;;)
    {
      Object localObject = (String[])localVector.elementAt(localm.A());
      localm = localObject[(localObject.length - 1)];
      localVector = localObject[0];
      String[] arrayOfString = new String[4];
      Arrays.fill(arrayOfString, "");
      System.arraycopy(localObject, 1, arrayOfString, 0, arrayOfString.length);
      localObject = new Bundle();
      ((Bundle)localObject).putString("code", localm);
      ((Bundle)localObject).putString("name", localVector);
      ((Bundle)localObject).putStringArray("values", arrayOfString);
      ((Bundle)localObject).putBoolean("is_currency", this.j);
      a(FundStockChartScreen.class, (Bundle)localObject);
      finish();
      return;
      localm.w((localm.A() + localVector.size() - 1) % localVector.size());
    }
  }
  
  public void a(Activity paramActivity, Class<?> paramClass, Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    if (paramBundle == null)
    {
      localIntent.setClass(paramActivity, paramClass);
      paramActivity.startActivity(localIntent);
      return;
    }
    localIntent.putExtras(paramBundle);
    localIntent.setClass(paramActivity, paramClass);
    paramActivity.startActivity(localIntent);
  }
  
  public void a(Class<?> paramClass)
  {
    a(this, paramClass, null);
  }
  
  public void a(Class<?> paramClass, Bundle paramBundle)
  {
    a(this, paramClass, paramBundle);
  }
  
  public void a(ArrayList<String> paramArrayList, ArrayList<Integer> paramArrayList1)
  {
    if (paramArrayList != null)
    {
      this.k.a(paramArrayList, paramArrayList1);
      this.k.setVisibility(0);
      this.k.postInvalidate();
      return;
    }
    this.k.setVisibility(8);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (dp.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.b == null);
      this.b.a(paramy);
      return;
    } while (this.b == null);
    this.b.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8744;
    if (this.f.trim().equals("")) {}
    for (paramct.d = this.g;; paramct.d = (this.f + "\n" + this.g))
    {
      paramct.m = new MinuteTitleGridAdpter(paramContext, null, a, paramContext.getResources().getStringArray(2131361916));
      paramct.k = paramContext.getResources().getDrawable(2130838135);
      this.b.setRightTextTag("查询");
      this.b.setMoreText("下单");
      paramct.n = this.i;
      return;
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.l = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    paramBundle = getIntent().getExtras();
    this.g = paramBundle.getString("code");
    this.f = paramBundle.getString("name");
    this.h = paramBundle.getStringArray("values");
    this.j = paramBundle.getBoolean("is_currency");
    setContentView(2130903128);
    this.b = ((DzhHeader)findViewById(2131558980));
    this.c = ((FundTitle)findViewById(2131558981));
    this.d = ((MenuItemView)findViewById(2131558982));
    this.k = ((MinuteDetailCtrl)findViewById(2131558984));
    this.k.setBackgroundResource(2130838370);
    if (this.j)
    {
      this.k.setType(2);
      this.c.setCurrency(true);
      this.i = new dm(this);
      this.b.a(this, this);
      if (!this.j) {
        break label258;
      }
      this.d.setType(14);
    }
    for (;;)
    {
      this.l.setOnHeaderButtonClickListener(this);
      this.c.setFundData(this.h);
      this.c.setCallback(new dn(this));
      this.d.setOnChangeListener(new do(this));
      b(dt.class, paramBundle);
      changeLookFace(this.mLookFace);
      return;
      this.k.setType(1);
      break;
      label258:
      this.d.setType(8);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return false;
      a(SearchStockScreen.class);
      continue;
      finish();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\FundStockChartScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */