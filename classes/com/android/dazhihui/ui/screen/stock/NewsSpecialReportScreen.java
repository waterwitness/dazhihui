package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.ui.model.stock.KxNewsVo;
import com.android.dazhihui.ui.model.stock.SpecialReportVo;
import com.android.dazhihui.ui.model.stock.SpecialReportVo.Header;
import com.android.dazhihui.ui.model.stock.SpecialReportVo.ImageItem;
import com.android.dazhihui.ui.model.stock.adapter.NewsAdapter.KxNewsAdapter;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.flip.CircleFlowIndicator;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import java.util.ArrayList;

public class NewsSpecialReportScreen
  extends BaseActivity
{
  f a;
  PageLoadTip b;
  String c = "";
  TextView d;
  ListView e;
  View f;
  ViewFlow g;
  GridView h;
  View i;
  TextView j;
  ScrollView k;
  
  private void a(String paramString)
  {
    this.b.b();
    this.a = new f();
    this.a.c(paramString);
    registRequestListener(this.a);
    sendRequest(this.a);
  }
  
  private void b(String paramString)
  {
    this.b.a(paramString, new nb(this));
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramh == this.a) {
      this.b.a();
    }
    for (;;)
    {
      try
      {
        paramh = SpecialReportVo.decode(new String(((com.android.dazhihui.a.b.g)paramj).a()));
        paramj = paramh.header;
        paramh = paramh.data;
        this.j.setText(paramj.title);
        Object localObject;
        if ((paramj.imgList != null) && (paramj.imgList.size() > 0))
        {
          this.f.setVisibility(0);
          m = ((SpecialReportVo.ImageItem)paramj.imgList.get(0)).height;
          int n = ((SpecialReportVo.ImageItem)paramj.imgList.get(0)).width;
          if (n != 0)
          {
            m = com.android.dazhihui.g.a().m() * m / n;
            this.g.getLayoutParams().height = m;
            localObject = new nd(this, paramj.imgList);
            this.g.setAdapter((Adapter)localObject);
          }
        }
        else
        {
          localObject = new SpannableStringBuilder();
          ((SpannableStringBuilder)localObject).append("专题导语: ");
          m = ((SpannableStringBuilder)localObject).length();
          ((SpannableStringBuilder)localObject).append(paramj.lead);
          ((SpannableStringBuilder)localObject).setSpan(new ForegroundColorSpan(-16777216), 0, m, 33);
          ((SpannableStringBuilder)localObject).setSpan(new AbsoluteSizeSpan(15, true), 0, m, 33);
          this.d.setText((CharSequence)localObject);
          this.d.setFocusable(true);
          this.d.setFocusableInTouchMode(true);
          this.d.requestFocus();
          if ((paramj.stock != null) && (paramj.stock.size() > 0))
          {
            this.i.setVisibility(0);
            this.h.setVisibility(0);
            paramj = new nc(this, paramj.stock);
            this.h.setOnItemClickListener(paramj);
            this.h.setAdapter(paramj);
          }
          paramj = new KxNewsVo();
          paramj.data = paramh;
          paramh = new NewsAdapter.KxNewsAdapter(this, "专题新闻", paramj);
          this.e.setOnItemClickListener(paramh);
          this.e.setAdapter(paramh);
          return;
        }
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        this.b.setPageError("数据解析异常!");
        return;
      }
      int m = 0;
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (paramh == this.a) {
      b("数据请求超时,点击重试!");
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903347);
    paramBundle = getIntent();
    if (paramBundle != null) {
      this.c = paramBundle.getStringExtra("url");
    }
    this.b = ((PageLoadTip)findViewById(2131558603));
    this.j = ((TextView)findViewById(2131558567));
    findViewById(2131560115).setOnClickListener(new na(this));
    this.d = ((TextView)findViewById(2131560117));
    this.k = ((ScrollView)findViewById(2131558651));
    this.f = findViewById(2131560116);
    this.g = ((ViewFlow)findViewById(2131559235));
    paramBundle = (CircleFlowIndicator)findViewById(2131559236);
    this.g.setFlowIndicator(paramBundle);
    this.h = ((GridView)findViewById(2131560119));
    this.i = findViewById(2131560118);
    this.e = ((ListView)findViewById(2131558568));
    if (TextUtils.isEmpty(this.c))
    {
      this.b.setPageError("数据异常!");
      return;
    }
    a(this.c);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (paramh == this.a) {
      b("数据请求异常,点击重试!");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\NewsSpecialReportScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */