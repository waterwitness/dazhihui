package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager.ExtraObject;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.b.a;
import com.android.dazhihui.w;
import java.util.Vector;

public class SettingThirdScreen
  extends BaseActivity
  implements SeekBar.OnSeekBarChangeListener
{
  private View a;
  private int b = 0;
  private ListView c;
  private String[] d;
  private ut e;
  private TextView f;
  private d g;
  private EditText h;
  private SeekBar i;
  private SeekBar j;
  private SeekBar k;
  private SeekBar l;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private com.android.dazhihui.a.b.m q = null;
  private Handler r = new ug(this);
  private boolean s = false;
  
  private String a(Cursor paramCursor)
  {
    if (paramCursor.getInt(paramCursor.getColumnIndex("has_phone_number")) > 0)
    {
      paramCursor = paramCursor.getString(paramCursor.getColumnIndex("_id"));
      Cursor localCursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + paramCursor, null, null);
      if (localCursor.moveToFirst())
      {
        Object localObject;
        for (paramCursor = ""; !localCursor.isAfterLast(); paramCursor = (Cursor)localObject)
        {
          int i1 = localCursor.getColumnIndex("data1");
          int i2 = localCursor.getInt(localCursor.getColumnIndex("data2"));
          localObject = localCursor.getString(i1);
          switch (i2)
          {
          default: 
            localObject = paramCursor;
          }
          localCursor.moveToNext();
        }
        if (!localCursor.isClosed()) {
          localCursor.close();
        }
        return paramCursor;
      }
    }
    return "";
  }
  
  private void a(String paramString)
  {
    View localView = findViewById(2131560627);
    ((TextView)findViewById(2131558634)).setText(paramString);
    localView.setOnClickListener(new ui(this));
    this.a = findViewById(2131560185);
  }
  
  private void b()
  {
    setContentView(2130903388);
    a(getResources().getString(2131166185));
    this.i = ((SeekBar)findViewById(2131560238));
    this.j = ((SeekBar)findViewById(2131560241));
    this.k = ((SeekBar)findViewById(2131560244));
    this.l = ((SeekBar)findViewById(2131560247));
    this.m = ((TextView)findViewById(2131560237));
    this.n = ((TextView)findViewById(2131560240));
    this.o = ((TextView)findViewById(2131560243));
    this.p = ((TextView)findViewById(2131560246));
    com.android.dazhihui.ui.a.m.a().s(this.g.c("TIME_RANK"));
    this.g.g();
    com.android.dazhihui.ui.a.m.a().q(this.g.c("TIME_MINUTE"));
    this.g.g();
    com.android.dazhihui.ui.a.m.a().r(this.g.c("TIME_KLINE"));
    this.g.g();
    com.android.dazhihui.ui.a.m.a().a(this.g.c("TIME_STOCK_MINE"));
    this.g.g();
    if (com.android.dazhihui.ui.a.m.a().u() == 0) {
      com.android.dazhihui.ui.a.m.a().s(15);
    }
    if (com.android.dazhihui.ui.a.m.a().s() == 0) {
      com.android.dazhihui.ui.a.m.a().q(15);
    }
    if (com.android.dazhihui.ui.a.m.a().t() == 0) {
      com.android.dazhihui.ui.a.m.a().r(15);
    }
    if (com.android.dazhihui.ui.a.m.a().d() == 0) {
      com.android.dazhihui.ui.a.m.a().a(10);
    }
    this.i.setProgress(com.android.dazhihui.ui.a.m.a().u() - 5);
    this.j.setProgress(com.android.dazhihui.ui.a.m.a().s() - 5);
    this.k.setProgress(com.android.dazhihui.ui.a.m.a().t() - 5);
    this.l.setProgress(com.android.dazhihui.ui.a.m.a().d() - 5);
    this.m.setText(com.android.dazhihui.ui.a.m.a().u() + "秒");
    this.n.setText(com.android.dazhihui.ui.a.m.a().s() + "秒");
    this.o.setText(com.android.dazhihui.ui.a.m.a().t() + "秒");
    this.p.setText(com.android.dazhihui.ui.a.m.a().d() + "秒");
    this.i.setOnSeekBarChangeListener(this);
    this.j.setOnSeekBarChangeListener(this);
    this.k.setOnSeekBarChangeListener(this);
    this.l.setOnSeekBarChangeListener(this);
  }
  
  private void c()
  {
    setContentView(2130903429);
    a(getResources().getString(2131165874));
    this.d = getResources().getStringArray(2131361900);
    this.c = ((ListView)findViewById(2131560463));
    this.c.setAdapter(this.e);
    this.c.setOnItemClickListener(new uk(this));
  }
  
  private void d()
  {
    setContentView(2130903394);
    a(getResources().getString(2131165488));
    this.f = ((TextView)findViewById(2131560280));
    a();
  }
  
  private void e()
  {
    Object localObject = SelfSelectedStockManager.getInstance();
    ((SelfSelectedStockManager)localObject).clearBrowseStockVector();
    Vector localVector = new Vector();
    int i1 = 0;
    while (i1 < com.android.dazhihui.d.c.a.length)
    {
      localVector.add(com.android.dazhihui.d.c.a[i1]);
      i1 += 1;
    }
    localObject = ((SelfSelectedStockManager)localObject).requestSyncSelfStockToServerByType(2, localVector);
    SelfSelectedStockManager.ExtraObject localExtraObject = new SelfSelectedStockManager.ExtraObject();
    localExtraObject.subprotocol = 105;
    localExtraObject.action = 2;
    localExtraObject.obj = localVector;
    ((com.android.dazhihui.a.b.m)localObject).a(localExtraObject);
  }
  
  private void f()
  {
    com.android.dazhihui.ui.a.m.a().b().setNeedSynchro(2);
    d.a().a("SYNCHRO_AUTO", 2);
    d.a().g();
    w.a().r();
    w.a().f("");
    w.a().h("");
    w.a().b("");
    w.a().e("");
    w.a().d("");
    com.android.dazhihui.g.a().i("");
    w.a().a(-1);
    w.a().g("");
    w.a().b(0);
    w.a().c("");
    com.android.dazhihui.g.a().f(1);
    w.a().i("");
    SelfSelectedStockManager.getInstance().setSelfStockVersion(0L);
    com.android.dazhihui.a.g.a().a(0L);
    this.g.a("PHONE_NUMBER", w.a().k());
    this.g.g();
    this.g.a("USER_ID", w.a().n());
    this.g.g();
    this.g.a("USER_NAME", w.a().f());
    this.g.g();
    this.g.a("USER_PASSWORD", "");
    this.g.g();
    this.g.a("USER_RANID", com.android.dazhihui.g.a().Z());
    this.g.g();
    this.g.a("NICK_NAME", w.a().g());
    this.g.g();
    this.g.a("AUTO_LOGIN", com.android.dazhihui.g.a().p());
    this.g.g();
    this.g.a("USER_MD5_PWD", "");
    this.g.g();
    this.g.a("USER_RSA_PWD", "");
    this.g.g();
    w.a().a(0L);
    this.g.a("LIMITS", w.a().c());
    this.g.g();
    w.a().b(com.android.dazhihui.c.b);
  }
  
  public void a()
  {
    x localx = new x(2954);
    localx.c(0);
    localx.c(0);
    this.q = new com.android.dazhihui.a.b.m(localx);
    registRequestListener(this.q);
    sendRequest(this.q);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (uj.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.a == null);
      this.a.setBackgroundColor(getResources().getColor(2131493536));
      return;
    } while (this.a == null);
    this.a.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    paramh = ((o)paramj).h();
    if ((paramh != null) && (paramh.b != null))
    {
      paramj = new q(paramh.b);
      if (paramh.a == 2954)
      {
        paramj.e();
        paramj = paramj.l();
        paramh = new a(this);
        paramh.a(paramj.getBytes());
        paramj = paramh.a();
        paramh.b();
        this.r.sendMessage(this.r.obtainMessage(1, paramj));
      }
    }
  }
  
  public void handleTimeout(h paramh) {}
  
  public void init(Bundle paramBundle)
  {
    this.b = getIntent().getIntExtra("screenType", 0);
    this.e = new ut(this, null);
    this.g = d.a();
    if (this.b == 1) {
      b();
    }
    do
    {
      return;
      if (this.b == 2)
      {
        c();
        return;
      }
    } while (this.b != 3);
    d();
  }
  
  public void netException(h paramh, Exception paramException) {}
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    do
    {
      return;
    } while (paramInt2 != -1);
    paramIntent = managedQuery(paramIntent.getData(), null, null, null, null);
    paramIntent.moveToFirst();
    paramIntent = a(paramIntent);
    this.h.setText(paramIntent);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return super.onCreateDialog(paramInt);
    case 0: 
      return new AlertDialog.Builder(this).setTitle(2131166406).setMessage(getString(2131165870)).setPositiveButton(2131165363, new un(this)).setNegativeButton(2131165331, new um(this)).create();
    case 1: 
      return new AlertDialog.Builder(this).setTitle(2131166406).setMessage(getString(2131165871)).setPositiveButton(2131165363, new up(this)).setNegativeButton(2131165331, new uo(this)).create();
    case 2: 
      return new AlertDialog.Builder(this).setTitle(2131166406).setMessage(getString(2131165872)).setPositiveButton(2131165363, new ur(this)).setNegativeButton(2131165331, new uq(this)).create();
    }
    return new AlertDialog.Builder(this).setTitle(2131166406).setMessage(getString(2131165873)).setPositiveButton(2131165363, new uh(this)).setNegativeButton(2131165331, new us(this)).create();
  }
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    switch (paramSeekBar.getId())
    {
    default: 
      return;
    case 2131560238: 
      com.android.dazhihui.ui.a.m.a().s(paramInt + 5);
      this.m.setText(com.android.dazhihui.ui.a.m.a().u() + "秒");
      return;
    case 2131560241: 
      com.android.dazhihui.ui.a.m.a().q(paramInt + 5);
      this.n.setText(com.android.dazhihui.ui.a.m.a().s() + "秒");
      return;
    case 2131560244: 
      com.android.dazhihui.ui.a.m.a().r(paramInt + 5);
      this.o.setText(com.android.dazhihui.ui.a.m.a().t() + "秒");
      return;
    }
    com.android.dazhihui.ui.a.m.a().a(paramInt + 5);
    this.p.setText(com.android.dazhihui.ui.a.m.a().d() + "秒");
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    switch (paramSeekBar.getId())
    {
    default: 
      return;
    case 2131560238: 
      this.g.a("TIME_RANK", com.android.dazhihui.ui.a.m.a().u());
      this.g.g();
      return;
    case 2131560241: 
      this.g.a("TIME_MINUTE", com.android.dazhihui.ui.a.m.a().s());
      this.g.g();
      return;
    case 2131560244: 
      this.g.a("TIME_KLINE", com.android.dazhihui.ui.a.m.a().t());
      this.g.g();
      return;
    }
    this.g.a("TIME_STOCK_MINE", com.android.dazhihui.ui.a.m.a().d());
    this.g.g();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\SettingThirdScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */