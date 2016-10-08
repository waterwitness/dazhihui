package com.android.dazhihui.ui.delegate.screen;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
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

public class EntrustTable_history
  extends DelegateBaseActivity
  implements cp, cs
{
  private int A;
  private int B;
  private DzhHeader C;
  private mh D;
  private String E;
  private boolean F;
  private DatePickerDialog.OnDateSetListener G;
  private DatePickerDialog.OnDateSetListener H;
  private com.android.dazhihui.a.b.u I;
  private com.android.dazhihui.a.b.u J;
  private com.android.dazhihui.a.b.u K;
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
  private TableLayoutGroup m;
  private String[] n;
  private String[] o;
  private String[] p;
  private String[] q;
  private String[] r;
  private String[] s;
  private String t;
  private String u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;
  
  public EntrustTable_history()
  {
    String[] arrayOfString;
    if (a.C == null)
    {
      arrayOfString = new String[12];
      arrayOfString[0] = "证券代码";
      arrayOfString[1] = "证券名称";
      arrayOfString[2] = "买卖标志";
      arrayOfString[3] = "买卖说明";
      arrayOfString[4] = "状态说明";
      arrayOfString[5] = "委托价格";
      arrayOfString[6] = "委托数量";
      arrayOfString[7] = "成交数量";
      arrayOfString[8] = "撤单数量";
      arrayOfString[9] = "股东代码";
      arrayOfString[10] = "委托日期";
      arrayOfString[11] = "委托时间";
      this.n = arrayOfString;
      if (a.D != null) {
        break label385;
      }
      arrayOfString = new String[12];
      arrayOfString[0] = "1036";
      arrayOfString[1] = "1037";
      arrayOfString[2] = "1026";
      arrayOfString[3] = "1027";
      arrayOfString[4] = "1043";
      arrayOfString[5] = "1041";
      arrayOfString[6] = "1040";
      arrayOfString[7] = "1047";
      arrayOfString[8] = "1054";
      arrayOfString[9] = "1019";
      arrayOfString[10] = "1038";
      arrayOfString[11] = "1039";
      label180:
      this.o = arrayOfString;
      if (a.w != null) {
        break label392;
      }
      arrayOfString = new String[8];
      arrayOfString[0] = "基金名称";
      arrayOfString[1] = "委托状态";
      arrayOfString[2] = "委托份额";
      arrayOfString[3] = "委托金额";
      arrayOfString[4] = "委托类别";
      arrayOfString[5] = "申报时间";
      arrayOfString[6] = "合同号";
      arrayOfString[7] = "基金代码";
      label239:
      this.p = arrayOfString;
      if (a.x != null) {
        break label399;
      }
      arrayOfString = new String[8];
      arrayOfString[0] = "1091";
      arrayOfString[1] = "1043";
      arrayOfString[2] = "1111";
      arrayOfString[3] = "1093";
      arrayOfString[4] = "1283";
      arrayOfString[5] = "1038";
      arrayOfString[6] = "1042";
      arrayOfString[7] = "1090";
    }
    for (;;)
    {
      this.q = arrayOfString;
      this.r = a.y;
      this.s = a.z;
      this.a = true;
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.v = 0;
      this.E = "";
      this.F = false;
      this.G = new ca(this);
      this.H = new cb(this);
      return;
      arrayOfString = a.C;
      break;
      label385:
      arrayOfString = a.D;
      break label180;
      label392:
      arrayOfString = a.w;
      break label239;
      label399:
      arrayOfString = a.x;
    }
  }
  
  private void b()
  {
    this.f.setText(new StringBuilder().append(d(this.w)).append(d(this.x + 1)).append(d(this.y)));
  }
  
  private void c()
  {
    this.g.setText(new StringBuilder().append(d(this.z)).append(d(this.A + 1)).append(d(this.B)));
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
    String[] arrayOfString = this.D.a;
    StringBuffer localStringBuffer = new StringBuffer();
    int k = 0;
    if (k < arrayOfString.length)
    {
      String str = arrayOfString[k];
      localObject = str;
      if (str == null) {
        localObject = "-";
      }
      if (this.E.equals("fundDeledate")) {
        localStringBuffer.append("\n").append(this.p[k]).append(": ").append((String)localObject);
      }
      for (;;)
      {
        k += 1;
        break;
        if (this.E.equals("tradeHistory")) {
          localStringBuffer.append("\n").append(this.r[k]).append(": ").append((String)localObject);
        } else {
          localStringBuffer.append("\n").append(this.n[k]).append(": ").append((String)localObject);
        }
      }
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
    if (this.F == true) {
      return;
    }
    this.m.a();
    this.j = 0;
    this.t = this.f.getText().toString();
    this.u = this.g.getText().toString();
    if (this.E.equals("fundDeledate")) {
      b(paramBoolean);
    }
    for (;;)
    {
      this.F = true;
      return;
      if (this.E.equals("tradeHistory")) {
        c(paramBoolean);
      } else {
        d(paramBoolean);
      }
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.I = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11908").a("1022", this.t).a("1023", this.u).a("1206", this.j).a("1277", this.i).h()) });
    registRequestListener(this.I);
    a(this.I, paramBoolean);
  }
  
  public void c(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.J = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11912").a("1022", this.t).a("1023", this.u).a("1206", this.j).a("1277", this.i).h()) });
    registRequestListener(this.J);
    a(this.J, paramBoolean);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {}
    switch (cc.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.C.setBackgroundColor(getResources().getColor(2131493291));
      return;
    }
    this.C.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    String str = paramContext.getResources().getString(2131165447);
    paramContext = paramContext.getResources().getString(2131165446);
    paramct.a = 40;
    if (this.E.equals("fundDeledate")) {
      paramct.d = paramContext;
    }
    for (;;)
    {
      paramct.p = this;
      return;
      if (this.E.equals("tradeHistory")) {
        paramct.d = "基金历史成交";
      } else {
        paramct.d = str;
      }
    }
  }
  
  public void d(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.K = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11136").a("1022", this.t).a("1023", this.u).a("1206", this.j).a("1277", this.i).h()) });
    registRequestListener(this.K);
    a(this.K, paramBoolean);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.C = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    boolean bool = com.android.dazhihui.ui.delegate.b.u.a(paramj, this);
    Object localObject1;
    if (paramh == this.K)
    {
      this.F = false;
      if (bool)
      {
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
        {
          paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
        }
      }
    }
    Object localObject2;
    Object localObject3;
    int i1;
    do
    {
      do
      {
        do
        {
          return;
          this.b = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
          this.d = ((com.android.dazhihui.ui.delegate.b.h)localObject1).b("1289");
          if ((this.b == 0) && (this.m.getDataModel().size() == 0))
          {
            this.m.setBackgroundResource(2130838490);
            return;
          }
          this.m.setBackgroundColor(getResources().getColor(2131493677));
          String[] arrayOfString;
          int[] arrayOfInt;
          if (this.b > 0)
          {
            localObject2 = new ArrayList();
            k = 0;
            while (k < this.b)
            {
              localObject3 = new mh();
              arrayOfString = new String[this.n.length];
              arrayOfInt = new int[this.n.length];
              i1 = 0;
              while (i1 < this.n.length)
              {
                try
                {
                  arrayOfString[i1] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, this.o[i1]).trim();
                  if (arrayOfString[i1] == null) {
                    arrayOfString[i1] = "--";
                  }
                }
                catch (Exception localException2)
                {
                  for (;;)
                  {
                    arrayOfString[i1] = "--";
                  }
                }
                arrayOfString[i1] = o.c(this.o[i1], arrayOfString[i1]);
                arrayOfInt[i1] = getResources().getColor(2131493235);
                i1 += 1;
              }
              ((mh)localObject3).a = arrayOfString;
              ((mh)localObject3).b = arrayOfInt;
              ((List)localObject2).add(localObject3);
              k += 1;
            }
            this.m.a((List)localObject2, this.j);
          }
          if (paramh == this.I)
          {
            this.F = false;
            if (bool)
            {
              localObject1 = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
              if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
              {
                paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
                paramh.setGravity(17, 0, 0);
                paramh.show();
                return;
              }
              this.b = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
              this.d = ((com.android.dazhihui.ui.delegate.b.h)localObject1).b("1289");
              if ((this.b == 0) && (this.m.getDataModel().size() == 0))
              {
                this.m.setBackgroundResource(2130838490);
                return;
              }
              this.m.setBackgroundColor(getResources().getColor(2131493677));
              if (this.b > 0)
              {
                localObject2 = new ArrayList();
                k = 0;
                while (k < this.b)
                {
                  localObject3 = new mh();
                  arrayOfString = new String[this.p.length];
                  arrayOfInt = new int[this.p.length];
                  i1 = 0;
                  while (i1 < this.p.length)
                  {
                    try
                    {
                      arrayOfString[i1] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, this.q[i1]).trim();
                      if (arrayOfString[i1] == null) {
                        arrayOfString[i1] = "--";
                      }
                    }
                    catch (Exception localException3)
                    {
                      for (;;)
                      {
                        arrayOfString[i1] = "--";
                      }
                    }
                    arrayOfString[i1] = o.c(this.q[i1], arrayOfString[i1]);
                    arrayOfInt[i1] = getResources().getColor(2131493235);
                    i1 += 1;
                  }
                  ((mh)localObject3).a = arrayOfString;
                  ((mh)localObject3).b = arrayOfInt;
                  ((List)localObject2).add(localObject3);
                  k += 1;
                }
                this.m.a((List)localObject2, this.j);
              }
            }
          }
        } while (paramh != this.J);
        this.F = false;
      } while (!bool);
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (!paramh.b())
      {
        paramh = Toast.makeText(this, paramh.d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
      }
      this.b = paramh.g();
      this.d = paramh.b("1289");
      if ((this.b == 0) && (this.m.getDataModel().size() == 0))
      {
        this.m.setBackgroundResource(2130838490);
        return;
      }
      this.m.setBackgroundColor(getResources().getColor(2131493677));
    } while (this.b <= 0);
    paramj = new ArrayList();
    int k = 0;
    while (k < this.b)
    {
      localObject1 = new mh();
      localObject2 = new String[this.r.length];
      localObject3 = new int[this.r.length];
      i1 = 0;
      while (i1 < this.r.length)
      {
        try
        {
          localObject2[i1] = paramh.a(k, this.s[i1]).trim();
          if (localObject2[i1] == null) {
            localObject2[i1] = "--";
          }
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            localObject2[i1] = "--";
          }
        }
        i1 += 1;
      }
      i1 = 1;
      while (i1 < this.r.length)
      {
        localObject3[i1] = getResources().getColor(2131493235);
        i1 += 1;
      }
      ((mh)localObject1).a = ((String[])localObject2);
      ((mh)localObject1).b = ((int[])localObject3);
      paramj.add(localObject1);
      k += 1;
    }
    this.m.a(paramj, this.j);
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    this.m.d();
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    paramBundle = getIntent().getExtras();
    if (paramBundle != null) {
      this.E = paramBundle.getString("type");
    }
    if (TextUtils.isEmpty(this.E)) {
      this.E = "";
    }
    setContentView(2130903107);
    this.C = ((DzhHeader)findViewById(2131558643));
    this.C.a(this, this);
    this.e = ((LinearLayout)findViewById(2131558879));
    this.m = ((TableLayoutGroup)findViewById(2131558885));
    if (this.E.equals("fundDeledate"))
    {
      this.m.setHeaderColumn(this.p);
      this.m.setPullDownLoading(false);
      this.m.setColumnClickable(null);
      this.m.setContinuousLoading(true);
      this.m.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.m.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.m.setDrawHeaderSeparateLine(false);
      this.m.setHeaderTextColor(getResources().getColor(2131493099));
      this.m.setHeaderFontSize(getResources().getDimension(2131230899));
      this.m.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.m.setLeftPadding(25);
      this.m.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.m.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.m.setStockNameColor(getResources().getColor(2131493235));
      this.m.setFirstColumnColorDifferent(true);
      this.m.setOnLoadingListener(new bv(this));
      this.m.setOnTableLayoutClickListener(new bw(this));
      this.f = ((EditText)findViewById(2131558880));
      this.g = ((EditText)findViewById(2131558882));
      this.h = ((Button)findViewById(2131558883));
      if (this.v != 0) {
        break label643;
      }
      this.t = o.w();
      this.u = o.y();
      this.f.setText(this.t);
      this.g.setText(this.u);
    }
    for (;;)
    {
      this.f.setOnClickListener(new bx(this));
      this.g.setOnClickListener(new by(this));
      this.h.setOnClickListener(new bz(this));
      this.w = Integer.valueOf(this.f.getText().toString().substring(0, 4)).intValue();
      this.x = (Integer.valueOf(this.f.getText().toString().substring(4, 6)).intValue() - 1);
      this.y = Integer.valueOf(this.f.getText().toString().substring(6, 8)).intValue();
      paramBundle = Calendar.getInstance();
      this.z = paramBundle.get(1);
      this.A = paramBundle.get(2);
      this.B = paramBundle.get(5);
      if (!this.E.equals("fundDeledate")) {
        break label674;
      }
      b(true);
      return;
      if (this.E.equals("tradeHistory"))
      {
        this.m.setHeaderColumn(this.r);
        break;
      }
      this.m.setHeaderColumn(this.n);
      break;
      label643:
      this.t = this.f.getText().toString();
      this.u = this.g.getText().toString();
    }
    label674:
    if (this.E.equals("tradeHistory"))
    {
      c(true);
      return;
    }
    d(true);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    this.m.d();
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
      localDatePickerDialog = new DatePickerDialog(this, this.G, this.w, this.x, this.y);
      localDatePickerDialog.setTitle("请选择开始日期");
      return localDatePickerDialog;
    }
    DatePickerDialog localDatePickerDialog = new DatePickerDialog(this, this.H, this.z, this.A, this.B);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\EntrustTable_history.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */