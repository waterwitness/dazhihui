package com.android.dazhihui.ui.delegate.screen.newstock;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class y
  extends ad
{
  public int c = -1;
  private TableLayoutGroup d;
  private View e;
  private EditText f;
  private TextView g;
  private TextView h;
  private EditText i;
  private Button j;
  private int k;
  private String[] l;
  private String[] m;
  private int n;
  private int o;
  private String p;
  private String q;
  private com.android.dazhihui.a.b.u r = null;
  private com.android.dazhihui.a.b.u s = null;
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    String str = "12926";
    if (o.y == o.w) {
      str = "12940";
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g(str).a("1036", "").a("1206", this.n).a("1277", this.o).a("6133", "1").a("2315", "4");
    if (this.p == null) {}
    for (str = "";; str = this.p)
    {
      this.r = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.a("1972", str).h()) });
      registRequestListener(this.r);
      a(this.r, paramBoolean);
      return;
    }
  }
  
  private void c()
  {
    this.d = ((TableLayoutGroup)this.e.findViewById(2131558887));
    this.f = ((EditText)this.e.findViewById(2131559140));
    this.g = ((TextView)this.e.findViewById(2131559141));
    this.h = ((TextView)this.e.findViewById(2131560926));
    this.i = ((EditText)this.e.findViewById(2131560927));
    this.j = ((Button)this.e.findViewById(2131558520));
  }
  
  private void d()
  {
    this.n = 0;
    this.o = 20;
    this.p = null;
    this.d.a();
    this.d.e();
    this.f.setText("");
    this.g.setText("");
    this.h.setText("");
    this.i.setText("");
    this.q = null;
  }
  
  private void e()
  {
    if (o.y == o.v)
    {
      this.l = a.i;
      this.m = a.j;
    }
    for (;;)
    {
      if ((this.l == null) || (this.m == null))
      {
        this.l = new String[] { "" };
        this.m = new String[] { "" };
      }
      this.d.setHeaderColumn(this.l);
      this.d.setPullDownLoading(false);
      this.d.setColumnClickable(null);
      this.d.setContinuousLoading(false);
      this.d.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.d.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.d.setDrawHeaderSeparateLine(false);
      this.d.setHeaderTextColor(getResources().getColor(2131493099));
      this.d.setHeaderFontSize(getResources().getDimension(2131230899));
      this.d.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.d.setContentRowHeight(this.d.getContentHeight() / 5 * 3);
      this.d.setLeftPadding(25);
      this.d.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.d.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.d.setStockNameColor(getResources().getColor(2131493235));
      this.d.setFirstColumnColorDifferent(true);
      this.d.setOnLoadingListener(new z(this));
      this.d.setOnTableLayoutClickListener(new aa(this));
      return;
      if (o.y == o.w)
      {
        this.l = a.k;
        this.m = a.l;
      }
    }
  }
  
  private void f()
  {
    ab localab = new ab(this);
    this.j.setOnClickListener(localab);
  }
  
  private void g()
  {
    if (this.f.getText().toString().equals(""))
    {
      a(0);
      return;
    }
    if (this.i.getText().toString().equals(""))
    {
      a(1);
      return;
    }
    String str = "温馨提示：根据规定,如果您连续12个月内累计出现3次中签未足额缴款的情形,6个月内将不得参与网上新股申购。\n" + "\t证券名称:" + this.f.getText().toString() + "\n";
    str = str + "\t证券代码:" + this.g.getText().toString() + "\n";
    str = str + "\t中签数量:" + this.h.getText().toString() + "\n";
    str = str + "\t放弃数量:" + this.i.getText().toString() + "\n";
    if ((!this.i.getText().toString().equals("")) && (!this.h.getText().toString().equals("")) && (Double.parseDouble(this.i.getText().toString()) > Double.parseDouble(this.h.getText().toString()))) {
      new StringBuilder().append(str).append("交易提示：放弃数量大于中签数量！").toString();
    }
    h();
    d();
  }
  
  private void h()
  {
    if (!o.r()) {
      return;
    }
    String str = "12928";
    if (o.y == o.w) {
      str = "12942";
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g(str).a("1040", this.i.getText().toString());
    if (this.q == null) {}
    for (str = "";; str = this.q)
    {
      this.s = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.a("1800", str).a("2315", "4").h()) });
      registRequestListener(this.s);
      sendRequest(this.s);
      return;
    }
  }
  
  public void a(int paramInt)
  {
    String str = "";
    switch (paramInt)
    {
    }
    for (;;)
    {
      Toast.makeText(getActivity(), str, 0).show();
      return;
      str = "  请先选择下方中签股票。";
      continue;
      str = "  请填写放弃股量。";
    }
  }
  
  public void b()
  {
    if ((this.c < 0) || (this.c > this.k)) {
      return;
    }
    Object localObject1 = b(this.c);
    Object localObject3 = (String)((Hashtable)localObject1).get("1036");
    Object localObject2 = (String)((Hashtable)localObject1).get("1037");
    String str = (String)((Hashtable)localObject1).get("1219");
    this.q = ((String)((Hashtable)localObject1).get("1800"));
    EditText localEditText = this.f;
    localObject1 = localObject3;
    if (localObject3 == null) {
      localObject1 = "";
    }
    localEditText.setText((CharSequence)localObject1);
    localObject3 = this.g;
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = "";
    }
    ((TextView)localObject3).setText((CharSequence)localObject1);
    localObject2 = this.h;
    localObject1 = str;
    if (str == null) {
      localObject1 = "";
    }
    ((TextView)localObject2).setText((CharSequence)localObject1);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    label357:
    do
    {
      do
      {
        return;
        if (paramh == this.r)
        {
          Object localObject = ((v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject, getActivity()))
          {
            localObject = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
            {
              paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject).d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              return;
            }
            ((com.android.dazhihui.ui.delegate.b.h)localObject).g();
            this.p = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1972");
            this.k = ((com.android.dazhihui.ui.delegate.b.h)localObject).b("1289");
            int i4 = ((com.android.dazhihui.ui.delegate.b.h)localObject).g();
            if ((i4 == 0) && (this.d.getDataModel().size() == 0))
            {
              this.d.setBackgroundResource(2130838490);
              return;
            }
            this.d.setBackgroundColor(getResources().getColor(2131493677));
            if (i4 > 0)
            {
              ArrayList localArrayList = new ArrayList();
              int i1 = 0;
              while (i1 < i4)
              {
                mh localmh = new mh();
                String[] arrayOfString = new String[this.l.length];
                int[] arrayOfInt = new int[this.l.length];
                int i2 = 0;
                for (;;)
                {
                  if (i2 >= this.l.length) {
                    break label357;
                  }
                  try
                  {
                    arrayOfString[i2] = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, this.m[i2]).trim();
                    if (arrayOfString[i2] == null) {
                      arrayOfString[i2] = "--";
                    }
                  }
                  catch (Exception localException)
                  {
                    for (;;)
                    {
                      String str;
                      arrayOfString[i2] = "--";
                      continue;
                      int i3 = getResources().getColor(2131492932);
                    }
                  }
                  str = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, "1026");
                  if ((str == null) || (!str.equals("0"))) {
                    break;
                  }
                  i3 = -65536;
                  arrayOfString[i2] = o.c(this.m[i2], arrayOfString[i2]);
                  arrayOfInt[i2] = i3;
                  i2 += 1;
                }
                localmh.a = arrayOfString;
                localmh.b = arrayOfInt;
                localArrayList.add(localmh);
                i1 += 1;
              }
              a((com.android.dazhihui.ui.delegate.b.h)localObject, this.n);
              this.d.a(localArrayList, this.n);
            }
          }
        }
      } while (paramh != this.s);
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
    if (paramh.g() > 0)
    {
      paramh = paramh.a(0, "1042");
      a("申购成功，委托编号：" + paramh);
    }
    a(true);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.e = paramLayoutInflater.inflate(2130903513, paramViewGroup, false);
    c();
    e();
    f();
    a(true);
    return this.e;
  }
  
  public void show()
  {
    if (this.e != null)
    {
      d();
      a(true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */