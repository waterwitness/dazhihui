package com.android.dazhihui.ui.delegate.screen.margin;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.TradeText;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;

public class bt
  extends ad
{
  private TableLayoutGroup c;
  private View d;
  private RelativeLayout e;
  private EditText f;
  private Button g;
  private String[] h;
  private String[] i;
  private int j;
  private int k;
  private int l;
  private int m;
  private com.android.dazhihui.a.b.u n;
  
  public bt() {}
  
  public bt(int paramInt)
  {
    this.m = paramInt;
  }
  
  private void a(boolean paramBoolean, String paramString)
  {
    if (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh2;
    com.android.dazhihui.ui.delegate.b.h localh1;
    switch (this.m)
    {
    default: 
      return;
    case 0: 
      localh2 = o.g("12252").a("1206", this.l).a("1277", this.k);
      localh1 = localh2;
      if (paramString != null)
      {
        localh2.a("1036", paramString);
        localh1 = localh2;
      }
      break;
    }
    for (;;)
    {
      this.n = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh1.h()) });
      registRequestListener(this.n);
      a(this.n, paramBoolean);
      return;
      localh2 = o.g("12154").a("1206", this.l).a("1277", this.k);
      localh1 = localh2;
      if (paramString != null)
      {
        localh2.a("1036", paramString);
        localh1 = localh2;
        continue;
        localh1 = o.g("12126").a("1206", this.l).a("1277", this.k).a("1028", "0");
        continue;
        localh1 = o.g("12028").a("1206", this.l).a("1277", this.k).a("1019", "").a("1036", "");
      }
    }
  }
  
  private void c()
  {
    this.c = ((TableLayoutGroup)this.d.findViewById(2131558887));
    this.e = ((RelativeLayout)this.d.findViewById(2131559791));
    this.f = ((EditText)this.d.findViewById(2131559140));
    this.g = ((Button)this.d.findViewById(2131559792));
  }
  
  private void d()
  {
    switch (this.m)
    {
    }
    for (;;)
    {
      if ((this.h == null) || (this.i == null))
      {
        this.h = new String[] { "" };
        this.i = new String[] { "" };
      }
      this.c.setHeaderColumn(this.h);
      this.c.setPullDownLoading(false);
      this.c.setColumnClickable(null);
      this.c.setContinuousLoading(true);
      this.c.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.c.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.c.setDrawHeaderSeparateLine(false);
      this.c.setHeaderTextColor(getResources().getColor(2131493099));
      this.c.setHeaderFontSize(getResources().getDimension(2131230899));
      this.c.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.c.setLeftPadding(25);
      this.c.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.c.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.c.setStockNameColor(getResources().getColor(2131493235));
      this.c.setFirstColumnColorDifferent(true);
      this.c.setOnLoadingListener(new bu(this));
      return;
      this.e.setVisibility(0);
      this.h = a.bi;
      this.i = a.bj;
      continue;
      this.e.setVisibility(0);
      this.h = a.aU;
      this.i = a.aV;
      continue;
      this.e.setVisibility(8);
      this.h = a.aO;
      this.i = a.aP;
      continue;
      this.e.setVisibility(8);
      this.h = a.aQ;
      this.i = a.aR;
    }
  }
  
  private void e()
  {
    if ((this.m == 0) || (this.m == 1)) {
      this.g.setOnClickListener(new bv(this));
    }
    this.c.setOnTableLayoutClickListener(new bw(this));
  }
  
  public void a(int paramInt)
  {
    Toast localToast = Toast.makeText(getActivity(), "", 0);
    localToast.setGravity(17, 0, 0);
    switch (paramInt)
    {
    default: 
      return;
    }
    localToast.setText("请输入完整的6位代码！");
    localToast.show();
  }
  
  public void a(mh parammh, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    String[] arrayOfString = parammh.a;
    StringBuffer localStringBuffer = new StringBuffer();
    paramInt = 0;
    while (paramInt < arrayOfString.length)
    {
      paramArrayOfString2 = arrayOfString[paramInt];
      parammh = paramArrayOfString2;
      if (paramArrayOfString2 == null) {
        parammh = "-";
      }
      localStringBuffer.append("\n").append(paramArrayOfString1[paramInt]).append(": ").append(parammh);
      paramInt += 1;
    }
    parammh = new Bundle();
    parammh.putString("str", localStringBuffer.toString());
    a(TradeText.class, parammh);
  }
  
  public void b()
  {
    this.l = 0;
    this.k = 20;
    this.c.a();
    if ((this.m == 0) || (this.m == 1)) {
      this.f.setText("");
    }
    a(true, null);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    int i4;
    do
    {
      do
      {
        do
        {
          return;
        } while (paramh != this.n);
        paramh = ((v)paramj).b();
      } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity()));
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
      if (!paramh.b())
      {
        paramh = Toast.makeText(getActivity(), paramh.d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
      }
      paramh.g();
      this.j = paramh.b("1289");
      i4 = paramh.g();
      if ((i4 == 0) && (this.c.getDataModel().size() == 0))
      {
        this.c.setBackgroundResource(2130838490);
        return;
      }
      this.c.setBackgroundColor(getResources().getColor(2131493677));
    } while (i4 <= 0);
    paramj = new ArrayList();
    int i2 = 0;
    while (i2 < i4)
    {
      mh localmh = new mh();
      String[] arrayOfString = new String[this.h.length];
      int[] arrayOfInt = new int[this.h.length];
      int i3 = 0;
      for (;;)
      {
        if (i3 >= this.h.length) {
          break label367;
        }
        try
        {
          arrayOfString[i3] = paramh.a(i2, this.i[i3]).trim();
          if (arrayOfString[i3] == null) {
            arrayOfString[i3] = "--";
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            String str;
            int i1;
            arrayOfString[i3] = "--";
            continue;
            if ((localException != null) && (localException.equals("1"))) {
              i1 = getResources().getColor(2131492932);
            } else {
              i1 = -16777216;
            }
          }
        }
        str = paramh.a(i2, "1026");
        if ((str == null) || (!str.equals("0"))) {
          break;
        }
        i1 = -65536;
        arrayOfString[i3] = o.c(this.i[i3], arrayOfString[i3]);
        arrayOfInt[i3] = i1;
        i3 += 1;
      }
      label367:
      localmh.a = arrayOfString;
      localmh.b = arrayOfInt;
      paramj.add(localmh);
      i2 += 1;
    }
    a(paramh, this.l);
    this.c.a(paramj, this.l);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.d = paramLayoutInflater.inflate(2130903263, paramViewGroup, false);
    c();
    d();
    e();
    a(true, null);
    return this.d;
  }
  
  public void show()
  {
    super.show();
    if (this.c != null) {
      b();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */