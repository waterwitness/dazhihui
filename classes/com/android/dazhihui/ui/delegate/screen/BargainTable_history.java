package com.android.dazhihui.ui.delegate.screen;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BargainTable_history
  extends DelegateBaseActivity
  implements cp, cs
{
  private mh A;
  private boolean B;
  private DatePickerDialog.OnDateSetListener C;
  private DatePickerDialog.OnDateSetListener D;
  private com.android.dazhihui.a.b.u E;
  protected boolean a;
  protected int b;
  protected int c;
  protected int d;
  LinearLayout e;
  EditText f;
  EditText g;
  Button h;
  private int i = m.a().H();
  private int j = 0;
  private byte m = 1;
  private TableLayoutGroup n;
  private String[] o;
  private String[] p;
  private String q;
  private String r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private DzhHeader z;
  
  public BargainTable_history()
  {
    String[] arrayOfString;
    if (a.k == null)
    {
      arrayOfString = new String[6];
      arrayOfString[0] = "股票名称";
      arrayOfString[1] = "成交数量";
      arrayOfString[2] = "成交价格";
      arrayOfString[3] = "买卖类别";
      arrayOfString[4] = "成交日期";
      arrayOfString[5] = "成交时间";
      this.o = arrayOfString;
      if (a.l != null) {
        break label180;
      }
      arrayOfString = new String[6];
      arrayOfString[0] = "1037";
      arrayOfString[1] = "1047";
      arrayOfString[2] = "1048";
      arrayOfString[3] = "1026";
      arrayOfString[4] = "1045";
      arrayOfString[5] = "1046";
    }
    for (;;)
    {
      this.p = arrayOfString;
      this.a = true;
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.s = 0;
      this.B = false;
      this.C = new i(this);
      this.D = new j(this);
      return;
      arrayOfString = a.k;
      break;
      label180:
      arrayOfString = a.l;
    }
  }
  
  private void b()
  {
    this.f.setText(new StringBuilder().append(d(this.t)).append(d(this.u + 1)).append(d(this.v)));
  }
  
  private void c()
  {
    this.g.setText(new StringBuilder().append(d(this.w)).append(d(this.x + 1)).append(d(this.y)));
  }
  
  private static String d(int paramInt)
  {
    if (paramInt >= 10) {
      return String.valueOf(paramInt);
    }
    return "0" + String.valueOf(paramInt);
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a()
  {
    if (this.b == 0) {
      return;
    }
    String[] arrayOfString = this.A.a;
    StringBuffer localStringBuffer = new StringBuffer();
    int k = 0;
    while (k < arrayOfString.length)
    {
      String str = arrayOfString[k];
      localObject = str;
      if (str == null) {
        localObject = "-";
      }
      localStringBuffer.append("\n").append(this.o[k].trim()).append(": ").append((String)localObject);
      k += 1;
    }
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("str", localStringBuffer.toString());
    startActivity(TradeText.class, (Bundle)localObject);
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 0)
    {
      localToast = Toast.makeText(this, "　　起始日期和结束日期都必须填写。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    if (paramInt == 1)
    {
      localToast = Toast.makeText(this, "　　起始日期、结束日期未填写完整。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    Toast localToast = Toast.makeText(this, "　　起始日期,不能比结束日期晚。", 0);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.B == true) {
      return;
    }
    this.n.a();
    this.j = 0;
    this.q = this.f.getText().toString();
    this.r = this.g.getText().toString();
    b(paramBoolean);
    this.B = true;
  }
  
  public void b(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.E = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11142").a("1022", this.q).a("1023", this.r).a("1206", this.j).a("1277", this.i).a("1217", Integer.toString(this.m)).a("1036", "").a("1026", "").h()) });
    registRequestListener(this.E);
    a(this.E, paramBoolean);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (k.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.z == null);
      this.z.a(paramy);
      return;
    } while (this.z == null);
    this.z.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = paramContext.getResources().getString(2131166383);
    paramct.a = 40;
    paramct.d = paramContext;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.z = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramh == this.E)
    {
      paramh = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a(paramh, this))
      {
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
        if (paramh.b()) {
          break label68;
        }
        paramh = Toast.makeText(this, paramh.d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
      }
    }
    label68:
    do
    {
      return;
      this.b = paramh.g();
      this.d = paramh.b("1289");
      if ((this.b == 0) && (this.n.getDataModel().size() == 0))
      {
        this.n.setBackgroundResource(2130838490);
        return;
      }
      this.n.setBackgroundColor(getResources().getColor(2131493677));
    } while (this.b <= 0);
    paramj = new ArrayList();
    int k = 0;
    while (k < this.b)
    {
      mh localmh = new mh();
      String[] arrayOfString = new String[this.o.length];
      int[] arrayOfInt = new int[this.o.length];
      int i1 = 0;
      while (i1 < this.o.length)
      {
        try
        {
          arrayOfString[i1] = paramh.a(k, this.p[i1]).trim();
          if (arrayOfString[i1] == null) {
            arrayOfString[i1] = "--";
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            arrayOfString[i1] = "--";
          }
        }
        arrayOfString[i1] = o.c(this.p[i1], arrayOfString[i1]);
        arrayOfInt[i1] = getResources().getColor(2131493235);
        i1 += 1;
      }
      localmh.a = arrayOfString;
      localmh.b = arrayOfInt;
      paramj.add(localmh);
      k += 1;
    }
    this.n.a(paramj, this.j);
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.E) {
      this.n.d();
    }
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    this.j = 0;
    setContentView(2130903107);
    this.z = ((DzhHeader)findViewById(2131558643));
    this.z.a(this, this);
    this.e = ((LinearLayout)findViewById(2131558879));
    this.n = ((TableLayoutGroup)findViewById(2131558885));
    this.n.setHeaderColumn(this.o);
    this.n.setPullDownLoading(false);
    this.n.setColumnClickable(null);
    this.n.setContinuousLoading(false);
    this.n.setHeaderBackgroundColor(getResources().getColor(2131493234));
    this.n.setDrawHeaderSeparateLine(false);
    this.n.setHeaderTextColor(getResources().getColor(2131493235));
    this.n.setHeaderHeight(56);
    this.n.setContentRowHeight(96);
    this.n.setLeftPadding(25);
    this.n.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.n.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.n.setStockNameColor(getResources().getColor(2131493235));
    this.n.setOnLoadingListener(new d(this));
    this.n.setOnTableLayoutClickListener(new e(this));
    this.f = ((EditText)findViewById(2131558880));
    this.g = ((EditText)findViewById(2131558882));
    this.h = ((Button)findViewById(2131558883));
    if (this.s == 0)
    {
      this.q = o.w();
      this.r = o.y();
      this.f.setText(this.q);
      this.g.setText(this.r);
    }
    for (;;)
    {
      this.f.setOnClickListener(new f(this));
      this.g.setOnClickListener(new g(this));
      this.h.setOnClickListener(new h(this));
      this.t = Integer.valueOf(this.f.getText().toString().substring(0, 4)).intValue();
      this.u = (Integer.valueOf(this.f.getText().toString().substring(4, 6)).intValue() - 1);
      this.v = Integer.valueOf(this.f.getText().toString().substring(6, 8)).intValue();
      paramBundle = Calendar.getInstance();
      this.w = paramBundle.get(1);
      this.x = paramBundle.get(2);
      this.y = paramBundle.get(5);
      b(true);
      return;
      this.q = this.f.getText().toString();
      this.r = this.g.getText().toString();
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.E) {
      this.n.d();
    }
    if (this == b.a().f()) {
      b(9);
    }
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      localDatePickerDialog = new DatePickerDialog(this, this.C, this.t, this.u, this.v);
      localDatePickerDialog.setTitle("请选择开始日期");
      return localDatePickerDialog;
    }
    DatePickerDialog localDatePickerDialog = new DatePickerDialog(this, this.D, this.w, this.x, this.y);
    localDatePickerDialog.setTitle("请选择结束日期");
    return localDatePickerDialog;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84) {
      startActivity(SearchStockScreen.class);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\BargainTable_history.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */