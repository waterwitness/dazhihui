package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.c;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.android.dazhihui.ui.model.stock.LeftMenuVo.LeftMenuItem;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager.SynchroType;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.PopupMenu;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SystemSetingScreen
  extends BaseActivity
  implements View.OnClickListener, cs
{
  public static int a = 0;
  public static int b = 1;
  public static ArrayList<wl> c = new ArrayList();
  private static SelfSelectedStockManager.SynchroType t = m.a().b().getNeedSynchroType();
  private com.android.dazhihui.g d = com.android.dazhihui.g.a();
  private d e = d.a();
  private View f;
  private View g;
  private View h;
  private View i;
  private CheckBox j;
  private CheckBox k;
  private CheckBox l;
  private CheckBox m;
  private CheckBox n;
  private View o;
  private TextView p;
  private PopupMenu q;
  private CheckBox r;
  private Button s;
  private boolean u = false;
  private View v;
  private View w;
  private DzhHeader x;
  
  public static void a()
  {
    w.a().r();
    b();
    w.a().b(c.b);
  }
  
  public static void a(wl paramwl)
  {
    if ((paramwl != null) && (!c.contains(paramwl))) {
      c.add(paramwl);
    }
  }
  
  public static void a(String paramString, Activity paramActivity, CheckBox paramCheckBox, boolean paramBoolean)
  {
    if ((paramActivity == null) || (paramActivity.isFinishing())) {
      return;
    }
    ScrollView localScrollView = new ScrollView(paramActivity);
    localScrollView.setLayoutParams(new TableRow.LayoutParams(-2, -2));
    LinearLayout localLinearLayout = new LinearLayout(paramActivity);
    localLinearLayout.setLayoutParams(new TableRow.LayoutParams(-2, -2));
    localLinearLayout.setOrientation(1);
    RadioGroup localRadioGroup = new RadioGroup(paramActivity);
    localRadioGroup.setLayoutParams(new TableRow.LayoutParams(-2, -2));
    String[] arrayOfString = paramActivity.getResources().getStringArray(2131361898);
    if (paramBoolean) {
      arrayOfString = paramActivity.getResources().getStringArray(2131361899);
    }
    RadioButton[] arrayOfRadioButton = new RadioButton[arrayOfString.length];
    int i1 = 0;
    while (i1 < arrayOfString.length)
    {
      arrayOfRadioButton[i1] = new RadioButton(paramActivity);
      arrayOfRadioButton[i1].setLayoutParams(new TableRow.LayoutParams(-1, -2));
      arrayOfRadioButton[i1].setText(arrayOfString[i1]);
      arrayOfRadioButton[i1].setId(i1 + 1);
      localRadioGroup.addView(arrayOfRadioButton[i1]);
      i1 += 1;
    }
    localLinearLayout.addView(localRadioGroup);
    t = m.a().b().getNeedSynchroType();
    if (t == SelfSelectedStockManager.SynchroType.LOCAL_COVER_SERVER) {
      arrayOfRadioButton[0].setChecked(true);
    }
    for (;;)
    {
      localRadioGroup.setOnCheckedChangeListener(new vt());
      localScrollView.addView(localLinearLayout);
      new AlertDialog.Builder(paramActivity).setTitle(paramString).setView(localScrollView).setPositiveButton(paramActivity.getString(2131165363), new vw(paramActivity)).setNegativeButton(paramActivity.getString(2131165331), new vv(paramCheckBox, paramActivity)).setOnCancelListener(new vu(paramCheckBox, paramActivity)).create().show();
      return;
      if (t == SelfSelectedStockManager.SynchroType.SERVER_COVER_LOCAL) {
        arrayOfRadioButton[1].setChecked(true);
      } else if (t == SelfSelectedStockManager.SynchroType.LOCAL_MERGE_SERVER) {
        arrayOfRadioButton[2].setChecked(true);
      }
    }
  }
  
  public static void b()
  {
    m.a().b().setNeedSynchro(2);
    d.a().a("SYNCHRO_AUTO", 2);
    d.a().g();
    com.android.dazhihui.g localg = com.android.dazhihui.g.a();
    w.a().f("");
    w.a().h("");
    w.a().b("");
    com.android.dazhihui.g.a().i("");
    w.a().a(-1);
    w.a().e("");
    w.a().d("");
    com.android.dazhihui.a.g.a().a(0L);
    w.a().i("");
    SelfSelectedStockManager.getInstance().setSelfStockVersion(0L);
    w.a().g("");
    w.a().b(0);
    d locald = d.a();
    locald.a("PHONE_NUMBER", w.a().k());
    locald.g();
    locald.a("USER_ID", w.a().n());
    locald.g();
    locald.a("USER_NAME", w.a().f());
    locald.g();
    locald.a("USER_RANID", localg.Z());
    locald.g();
    locald.a("USER_MD5_PWD", "");
    locald.g();
    locald.a("USER_BIND_INFO", localg.i());
    locald.g();
    locald.a("USER_BANK_INFO", localg.j());
    locald.g();
    w.a().a(0L);
    locald.a("LIMITS", w.a().c());
    locald.g();
  }
  
  public static void b(wl paramwl)
  {
    if ((paramwl != null) && (c.contains(paramwl))) {
      c.remove(paramwl);
    }
  }
  
  private void d()
  {
    boolean bool = false;
    this.f = findViewById(2131560611);
    this.g = findViewById(2131560612);
    this.j = ((CheckBox)findViewById(2131560601));
    this.k = ((CheckBox)findViewById(2131560603));
    this.l = ((CheckBox)findViewById(2131560606));
    this.m = ((CheckBox)findViewById(2131560605));
    this.n = ((CheckBox)findViewById(2131560610));
    this.s = ((Button)findViewById(2131560617));
    this.o = findViewById(2131560607);
    this.p = ((TextView)findViewById(2131560608));
    this.q = ((PopupMenu)findViewById(2131560618));
    this.r = ((CheckBox)findViewById(2131560609));
    this.i = findViewById(2131560616);
    this.h = findViewById(2131560614);
    ((TextView)findViewById(2131560615)).setText("V" + com.android.dazhihui.g.a().r());
    this.s.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.g.setOnClickListener(this);
    this.h.setOnClickListener(this);
    this.v = findViewById(2131560613);
    this.w = findViewById(2131558503);
    this.x = ((DzhHeader)findViewById(2131559624));
    this.x.a(this, this);
    Object localObject1 = m.a().J();
    int i1;
    Object localObject2;
    if ((localObject1 != null) && (((LeftMenuVo)localObject1).getLeftMenuMap() != null))
    {
      localObject1 = (List)((LeftMenuVo)localObject1).getLeftMenuMap().get("channel");
      if (localObject1 != null)
      {
        i1 = 0;
        if (i1 < ((List)localObject1).size())
        {
          localObject2 = (LeftMenuVo.LeftMenuItem)((List)localObject1).get(i1);
          if (!"意见反馈".equals(((LeftMenuVo.LeftMenuItem)localObject2).getMenuname())) {
            break label875;
          }
          this.v.setVisibility(0);
          this.w.setVisibility(0);
          this.w.setOnClickListener(new vs(this, (LeftMenuVo.LeftMenuItem)localObject2));
        }
      }
    }
    if ((this.v.getVisibility() != 0) && (this.w.getVisibility() != 0))
    {
      this.v.setVisibility(0);
      this.w.setVisibility(0);
      this.w.setOnClickListener(new wc(this));
    }
    if (!w.a().l())
    {
      this.s.setVisibility(8);
      this.i.setVisibility(8);
      label486:
      if ((m.a().b().getNeedSynchro() != 1) || (!w.a().l())) {
        break label903;
      }
      this.m.setChecked(true);
      label516:
      this.m.setOnCheckedChangeListener(new wd(this));
      localObject1 = getSharedPreferences("DzhPush", 0);
      ((SharedPreferences)localObject1).getBoolean("isShowHotVide", true);
      if (!((SharedPreferences)localObject1).getBoolean("isShowHotVide", true)) {
        break label914;
      }
      this.j.setChecked(true);
      label572:
      if (!((SharedPreferences)localObject1).getBoolean("isShowStockVide", true)) {
        break label925;
      }
      this.k.setChecked(true);
      label593:
      this.j.setOnCheckedChangeListener(new we(this));
      this.k.setOnCheckedChangeListener(new wf(this));
      this.d.n(this.e.c("SCREEN_ON_OR_OFF"));
      this.e.g();
      if (this.d.aj() != 0) {
        break label936;
      }
      this.l.setChecked(false);
      label665:
      this.l.setOnCheckedChangeListener(new wg(this));
      this.d.o(this.e.c("MINE_MSG_FLAG"));
      this.e.g();
      if (this.d.al() != 1) {
        break label947;
      }
      this.n.setChecked(true);
      label723:
      this.n.setOnCheckedChangeListener(new wh(this));
      localObject1 = findViewById(2131560619);
      localObject2 = findViewById(2131560620);
      View localView = findViewById(2131560621);
      ((View)localObject1).setOnClickListener(this);
      ((View)localObject2).setOnClickListener(this);
      localView.setOnClickListener(this);
      localObject2 = this.p;
      if (this.d.b() != y.b) {
        break label958;
      }
    }
    label875:
    label903:
    label914:
    label925:
    label936:
    label947:
    label958:
    for (localObject1 = "白色主题";; localObject1 = "黑色主题")
    {
      ((TextView)localObject2).setText((CharSequence)localObject1);
      this.o.setOnClickListener(new wi(this));
      i1 = this.e.b("show_user_avatar_by_wifi", 0);
      this.e.g();
      localObject1 = this.r;
      if (i1 == 1) {
        bool = true;
      }
      ((CheckBox)localObject1).setChecked(bool);
      this.r.setOnCheckedChangeListener(new wj(this));
      return;
      i1 += 1;
      break;
      this.s.setVisibility(0);
      this.i.setVisibility(0);
      break label486;
      this.m.setChecked(false);
      break label516;
      this.j.setChecked(false);
      break label572;
      this.k.setChecked(false);
      break label593;
      this.l.setChecked(true);
      break label665;
      this.n.setChecked(false);
      break label723;
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (wb.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.x == null);
      this.x.a(paramy);
      return;
    } while (this.x == null);
    this.x.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 4392;
    paramct.d = "系统设置";
    paramct.p = new wa(this);
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903455);
    d();
  }
  
  public void onClick(View paramView)
  {
    Object localObject = new Intent(this, SettingThirdScreen.class);
    switch (paramView.getId())
    {
    case 2131560613: 
    case 2131560615: 
    case 2131560616: 
    case 2131560618: 
    default: 
      return;
    case 2131560617: 
      showDialog(1001);
      return;
    case 2131560611: 
      ((Intent)localObject).putExtra("screenType", 1);
      startActivity((Intent)localObject);
      return;
    case 2131560612: 
      ((Intent)localObject).putExtra("screenType", 2);
      startActivity((Intent)localObject);
      return;
    case 2131560614: 
      startActivity(new Intent(this, AboutActivity.class));
      return;
    case 2131560619: 
      this.d.a(y.a);
      this.e.a("dzh_look_face", 0);
      this.e.g();
      localObject = this.p;
      if (this.d.b() == y.b) {}
      for (paramView = "白色主题";; paramView = "黑色主题")
      {
        ((TextView)localObject).setText(paramView);
        this.q.c();
        n.a("", 20117);
        return;
      }
    case 2131560620: 
      this.d.a(y.b);
      this.e.a("dzh_look_face", 1);
      this.e.g();
      localObject = this.p;
      if (this.d.b() == y.b) {}
      for (paramView = "白色主题";; paramView = "黑色主题")
      {
        ((TextView)localObject).setText(paramView);
        this.q.c();
        n.a("", 20117);
        return;
      }
    }
    this.q.c();
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return super.onCreateDialog(paramInt);
    }
    String str = getString(2131165457);
    return new AlertDialog.Builder(this).setMessage(str).setPositiveButton(getString(2131165363), new vz(this)).setNegativeButton(getString(2131165331), new vy(this)).setOnCancelListener(new vx(this)).create();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\SystemSetingScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */