package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.f;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.bj;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.service.DownloadService;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.screen.gc;
import com.android.dazhihui.ui.model.stock.MenuManager;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.SlideableFrame;
import com.android.dazhihui.ui.widget.kw;
import com.android.dazhihui.w;
import com.tencent.avsdk.UserilvbManager;
import com.tencent.avsdk.widget.FloatingView;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainScreen
  extends BaseActivity
  implements wk, kw
{
  public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd");
  private g b = g.a();
  private Fragment c;
  private he d;
  private boolean e = false;
  private AlertDialog f;
  private FrameLayout g;
  private SlideableFrame h;
  private FloatingView i;
  private bj j;
  private BroadcastReceiver k = new hg(this);
  private Runnable l = new hm(this);
  private long m;
  private hv n;
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b.j(1);
      return;
    }
    this.b.j(0);
  }
  
  private void h()
  {
    ScrollView localScrollView;
    TextView localTextView1;
    TextView localTextView2;
    TextView localTextView3;
    View localView1;
    View localView2;
    CheckBox localCheckBox;
    if ((this.b.Q()) && (this.b.T() == 0))
    {
      localScrollView = (ScrollView)getLayoutView(2130903578);
      localTextView1 = (TextView)localScrollView.findViewById(2131561273);
      localTextView2 = (TextView)localScrollView.findViewById(2131561274);
      localTextView3 = (TextView)localScrollView.findViewById(2131561275);
      localView1 = localScrollView.findViewById(2131561278);
      localView2 = localScrollView.findViewById(2131561279);
      localCheckBox = (CheckBox)localScrollView.findViewById(2131561277);
      if (this.b.T() != 1) {
        break label276;
      }
      localCheckBox.setChecked(true);
    }
    for (;;)
    {
      localTextView1.setText(getString(2131166015) + this.b.r());
      localTextView2.setText(getString(2131165996) + this.b.S());
      localTextView3.setText(this.b.R());
      localView1.setOnClickListener(new hr(this, localCheckBox));
      localView2.setOnClickListener(new hs(this, localCheckBox));
      if (this.f != null) {
        this.f.dismiss();
      }
      this.f = new AlertDialog.Builder(new ContextThemeWrapper(this, 2131296289)).setView(localScrollView).setOnCancelListener(new ht(this, localCheckBox)).create();
      this.f.show();
      return;
      label276:
      localCheckBox.setChecked(false);
    }
  }
  
  private void i()
  {
    if ((!DownloadService.a(this, this.b.P(), false, true)) && (!TextUtils.isEmpty(this.b.P()))) {
      startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.b.P())));
    }
  }
  
  private void j()
  {
    if ((!isFinishing()) && (!TextUtils.isEmpty(this.b.M())))
    {
      int i1 = d.a().b("bullet_crc", -1);
      if ((this.b.O() == 0) || ((this.b.O() == 2) && (i1 != this.b.N())) || (this.b.O() == 1))
      {
        d.a().a("bullet_crc", this.b.N());
        if (this.b.O() == 1)
        {
          long l1 = new Date().getTime();
          String str = a.format(new Date(d.a().d("bullet_last_time")));
          if ((!a.format(new Date(l1)).equals(str)) || (i1 != this.b.N())) {
            d.a().a("bullet_last_time", l1);
          }
        }
        else
        {
          new AlertDialog.Builder(this).setTitle("公告").setMessage(this.b.M()).setPositiveButton("确定", new hu(this)).show();
        }
      }
      else
      {
        d.a().g();
      }
    }
    else
    {
      return;
    }
    d.a().g();
  }
  
  private void k()
  {
    int i1 = Integer.parseInt(getSharedPreferences("NoticeListRefreshTime", 0).getString("NoticeListRefreshTime", "0"));
    int i2 = m.a().p() * 10000 + m.a().n() * 100 + m.a().o();
    if ((a.N == null) || (i2 > i1)) {
      com.android.dazhihui.ui.a.e.a().b(new hj(this, this, i2));
    }
  }
  
  public SlideableFrame a()
  {
    return this.h;
  }
  
  public void a(int paramInt)
  {
    String str = n.z(w.a().f());
    str = String.format(f.k, new Object[] { str });
    if (this.j == null) {
      this.j = new bj(this);
    }
    if (paramInt == 0)
    {
      this.j.b(str, new hk(this));
      return;
    }
    this.j.a(str, new hl(this));
  }
  
  public void a(int paramInt1, Bundle paramBundle, int paramInt2, int paramInt3)
  {
    if (this.d != null) {
      this.d.a(paramInt1, null, paramInt2, paramInt3);
    }
  }
  
  public void a(hv paramhv)
  {
    this.n = paramhv;
  }
  
  public Fragment b()
  {
    return this.c;
  }
  
  public Fragment c()
  {
    return this.d;
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (this.d != null) {
      this.d.changeLookFace(g.a().b());
    }
    if (this.c != null) {
      ((fu)this.c).setLookFace();
    }
  }
  
  public he d()
  {
    return this.d;
  }
  
  public void e()
  {
    int i1 = 0;
    getWindow().findViewById(16908290);
    Rect localRect = new Rect();
    int i2 = localRect.top;
    getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    g.a().b(localRect.top);
    if (getWindow().findViewById(16908290) != null) {
      i1 = getWindow().findViewById(16908290).getTop();
    }
    if (i1 == 0) {}
    i1 = ((WindowManager)getSystemService("window")).getDefaultDisplay().getHeight() - localRect.bottom;
    g.a().c(i1);
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    g.a().a(localDisplayMetrics.density);
    g.a().d(localDisplayMetrics.widthPixels);
    g.a().e(localDisplayMetrics.heightPixels - localRect.top - i1);
  }
  
  public void f()
  {
    if (this.h.getCurrentItem() == 1)
    {
      this.h.setCurrentItem(0);
      return;
    }
    this.h.setCurrentItem(1);
  }
  
  public void g()
  {
    this.mLookFace = g.a().b();
    if (this.d != null) {
      this.d.changeLookFace(g.a().b());
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    int i2 = 0;
    this.b.f(true);
    MenuManager.getInstance().loadMenuConfig(this);
    UserilvbManager.getInstance();
    com.android.dazhihui.ui.widget.dzhrefresh.q.a().a(this);
    new Handler().postDelayed(new hn(this), 30000L);
    int i3;
    int i4;
    if (this.d == null)
    {
      this.d = ((he)getSupportFragmentManager().a(he.class.getSimpleName()));
      if (this.d == null)
      {
        i3 = com.android.dazhihui.ui.screen.q.a;
        paramBundle = getIntent().getExtras();
        if (paramBundle == null) {
          break label318;
        }
        i3 = paramBundle.getInt("TAB_ID", com.android.dazhihui.ui.screen.q.a);
        i1 = paramBundle.getInt("fragment_index", 0);
        i4 = paramBundle.getInt("fragment_sub_index", 0);
        i2 = i1;
      }
    }
    label318:
    for (int i1 = i4;; i1 = 0)
    {
      this.d = new he(i3, i2, i1);
      if (this.c == null)
      {
        this.c = new fu();
        ((fu)this.c).a(this);
      }
      setContentView(2130903252);
      this.h = ((SlideableFrame)findViewById(2131559724));
      this.h.setObserver(this);
      this.h.setScrollable(true);
      this.h.postDelayed(this.l, 2000L);
      this.h.postDelayed(new hp(this), 1000L);
      paramBundle = new IntentFilter();
      paramBundle.addAction("com.android.dazhihui.handleupgrade");
      paramBundle.addAction("com.android.dazhihui.bullet");
      registerReceiver(this.k, paramBundle);
      Log.i("GUH", "MainScreen init remind update=" + this.b.Q());
      return;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 13) || (paramInt1 == 14) || (paramInt1 == 15)) {
      if (this.j != null) {
        this.j.a(paramInt1, paramInt2, paramIntent);
      }
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      if (this.n != null) {
        this.n.a(paramInt1, paramInt2, paramIntent);
      }
    }
  }
  
  public void onBackPressed()
  {
    if ((this.d != null) && (!this.d.a())) {
      this.d.onBackPressed();
    }
    com.android.dazhihui.ui.screen.e locale;
    do
    {
      do
      {
        return;
      } while (isFinishing());
      if (this.d.c() != 805306368) {
        break;
      }
      locale = this.d.b();
    } while (((locale instanceof gc)) && (((gc)locale).g()));
    long l1 = System.currentTimeMillis();
    if (l1 - this.m <= 2500L) {
      try
      {
        if (this.i != null)
        {
          this.i.release();
          this.i = null;
        }
        super.onBackPressed();
        DzhApplication.a().i();
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
    }
    this.m = l1;
    showShortToast(2131165538);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((paramBundle != null) && (this.d != null))
    {
      int i1 = paramBundle.getInt("TAB_ID", com.android.dazhihui.ui.screen.q.a);
      int i2 = paramBundle.getInt("fragment_index", 0);
      int i3 = paramBundle.getInt("fragment_sub_index", 0);
      this.d.a(i1, null, i2, i3);
    }
    UserilvbManager.getInstance().addIlvbSoundModeListener(new hq(this));
    if (UserilvbManager.getInstance().getSavedRoomInfo() != null)
    {
      if (this.i == null) {
        this.i = new FloatingView(this);
      }
      this.i.show();
    }
  }
  
  protected void onDestroy()
  {
    if (this.i != null)
    {
      this.i.release();
      this.i = null;
    }
    unregisterReceiver(this.k);
    super.onDestroy();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    int i1 = 0;
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    paramIntent = paramIntent.getExtras();
    int i3 = com.android.dazhihui.ui.screen.q.a;
    int i2;
    if (paramIntent != null)
    {
      i3 = paramIntent.getInt("TAB_ID", com.android.dazhihui.ui.screen.q.a);
      i2 = paramIntent.getInt("fragment_index", 0);
      i1 = paramIntent.getInt("fragment_sub_index", 0);
    }
    for (;;)
    {
      a(i3, paramIntent, i2, i1);
      return;
      i2 = 0;
    }
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    if ((paramBundle != null) && (this.d != null))
    {
      int i1 = paramBundle.getInt("TAB_ID", com.android.dazhihui.ui.screen.q.a);
      int i2 = paramBundle.getInt("fragment_index", 0);
      int i3 = paramBundle.getInt("fragment_sub_index", 0);
      this.d.a(i1, null, i2, i3);
    }
  }
  
  public void onResume()
  {
    if ((this.h != null) && (this.h.getCurrentItem() == 0)) {
      this.h.setCurrentItem(1);
    }
    k();
    super.onResume();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    if (this.d != null)
    {
      paramBundle.putInt("TAB_ID", this.d.c());
      paramBundle.putInt("fragment_index", this.d.d());
      paramBundle.putInt("fragment_sub_index", this.d.e());
    }
  }
  
  public void onStop()
  {
    if (this.g != null) {
      this.g.removeCallbacks(this.l);
    }
    super.onStop();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\MainScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */