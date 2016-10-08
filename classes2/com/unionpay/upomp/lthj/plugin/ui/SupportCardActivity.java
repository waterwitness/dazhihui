package com.unionpay.upomp.lthj.plugin.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.f.a.a.bp;
import com.f.a.a.bs;
import com.f.a.a.dk;
import com.f.a.a.dy;
import com.f.a.a.ec;
import com.f.a.a.ej;
import com.f.a.a.ep;
import com.f.a.a.eq;
import com.f.a.a.es;
import com.f.a.a.t;
import com.unionpay.upomp.lthj.plugin.model.GetBankService;
import com.unionpay.upomp.lthj.plugin.model.PanBank;
import java.util.Vector;

public class SupportCardActivity
  extends BaseActivity
  implements View.OnClickListener, AbsListView.OnScrollListener, UIResponseListener
{
  private ListView a;
  private ListView b;
  private RelativeLayout c;
  private RelativeLayout d;
  private Vector e;
  private Vector f;
  private int g = 15;
  private dk h;
  private View.OnClickListener i = new ep(this);
  private View.OnClickListener j = new eq(this);
  
  private Vector a(t paramt)
  {
    String[] arrayOfString1 = ec.a(paramt.b(), '|');
    String[] arrayOfString2 = ec.a(paramt.c(), '|');
    String[] arrayOfString3 = ec.a(paramt.d(), '|');
    String[] arrayOfString4 = ec.a(paramt.e(), '|');
    paramt = ec.a(paramt.e(), '|');
    if ((arrayOfString1 == null) || (arrayOfString2 == null) || (arrayOfString3 == null) || (arrayOfString4 == null) || (paramt == null)) {
      return null;
    }
    Vector localVector = new Vector();
    int k = 0;
    while (k < arrayOfString1.length)
    {
      GetBankService localGetBankService = new GetBankService();
      localGetBankService.panBank = arrayOfString1[k];
      localGetBankService.panBankId = arrayOfString2[k];
      localGetBankService.creditCard = arrayOfString3[k];
      localGetBankService.debitCard = arrayOfString4[k];
      localGetBankService.payTips = paramt[k];
      localVector.add(localGetBankService);
      k += 1;
    }
    return localVector;
  }
  
  private void a(ej paramej)
  {
    String[] arrayOfString1 = ec.a(paramej.b(), '|');
    String[] arrayOfString2 = ec.a(paramej.c(), '|');
    this.f = new Vector();
    int k = 0;
    while (k < arrayOfString1.length)
    {
      PanBank localPanBank = new PanBank();
      localPanBank.setPanBankId(arrayOfString1[k]);
      localPanBank.setPanBank(arrayOfString2[k]);
      localPanBank.setPanType(paramej.d());
      this.f.add(localPanBank);
      k += 1;
    }
  }
  
  private void b()
  {
    dy localdy = new dy(this);
    this.b.setAdapter(localdy);
    this.b.setVisibility(0);
  }
  
  private void c()
  {
    this.h = new dk(this);
    this.a.setAdapter(this.h);
    this.a.setVisibility(0);
    findViewById(bp.dj()).setVisibility(0);
    findViewById(bp.dk()).setVisibility(0);
  }
  
  private void d()
  {
    if (this.g <= this.e.size()) {}
    for (this.g += 15; this.h == null; this.g = this.e.size()) {
      return;
    }
    this.h.notifyDataSetChanged();
  }
  
  public void errorCallBack(String paramString)
  {
    ec.a(this, paramString);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.c)
    {
      if (this.f == null) {
        bs.a("02", this, this);
      }
      if (this.b.getVisibility() == 0) {
        this.b.setVisibility(8);
      }
    }
    while (paramView != this.d)
    {
      return;
      this.a.setVisibility(8);
      this.b.setVisibility(0);
      return;
    }
    if (this.a.getVisibility() == 0)
    {
      this.a.setVisibility(8);
      findViewById(bp.dj()).setVisibility(8);
      findViewById(bp.dk()).setVisibility(8);
      return;
    }
    this.a.setVisibility(0);
    this.b.setVisibility(8);
    findViewById(bp.dj()).setVisibility(0);
    findViewById(bp.dk()).setVisibility(0);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("tranType");
    if (TextUtils.isEmpty(paramBundle)) {
      paramBundle = "1";
    }
    for (;;)
    {
      if (paramBundle == "1") {
        a(getString(bp.j()), this.i);
      }
      for (;;)
      {
        setContentView(bp.al());
        this.a = ((ListView)findViewById(bp.bI()));
        this.b = ((ListView)findViewById(bp.bJ()));
        this.d = ((RelativeLayout)findViewById(bp.bK()));
        this.c = ((RelativeLayout)findViewById(bp.bL()));
        this.c.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.a.setOnScrollListener(this);
        this.a.setVisibility(8);
        findViewById(bp.dj()).setVisibility(8);
        findViewById(bp.dk()).setVisibility(8);
        bs.c(this, this, paramBundle);
        return;
        a(getString(bp.j()), this.j);
      }
    }
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1) {
      d();
    }
  }
  
  public void responseCallBack(es parames)
  {
    if ((parames == null) || (parames.s() == null)) {}
    while (isFinishing()) {
      return;
    }
    int k = parames.j();
    int m = Integer.parseInt(parames.s());
    switch (k)
    {
    default: 
      return;
    case 8202: 
      if (m == 0)
      {
        a((ej)parames);
        b();
        return;
      }
      break;
    case 8228: 
      if (m == 0)
      {
        this.e = a((t)parames);
        c();
        return;
      }
      ec.a(this, parames.t(), m);
      return;
    }
    ec.a(this, parames.t(), m);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\SupportCardActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */