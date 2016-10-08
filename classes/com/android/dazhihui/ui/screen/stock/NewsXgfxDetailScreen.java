package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class NewsXgfxDetailScreen
  extends BaseActivity
{
  private String a = "";
  private List<String[]> b = new ArrayList();
  private f c;
  private BaseAdapter d = new ni(this);
  
  protected void a()
  {
    ((ListView)findViewById(2131561355)).setAdapter(this.d);
    ((DzhHeader)findViewById(2131559624)).a(this, new nk(this));
  }
  
  protected void b()
  {
    if (!TextUtils.isEmpty(this.a))
    {
      this.c = new f();
      this.c.c(this.a);
      registRequestListener(this.c);
      sendRequest(this.c);
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (this.c == paramh) {
      paramh = ((g)paramj).a();
    }
    try
    {
      paramh = new String(paramh, "UTF-8");
      n.c("content: " + paramh);
      try
      {
        paramh = new JSONObject(paramh);
        paramj = paramh.keys();
        while (paramj.hasNext())
        {
          String str1 = (String)paramj.next();
          String str2 = paramh.getString(str1);
          this.b.add(new String[] { str1, str2 });
          n.c("result: " + str2);
          continue;
          return;
        }
      }
      catch (JSONException paramh)
      {
        paramh.printStackTrace();
        n.c("===d: Error Response.");
      }
      while (this.d == null) {}
      this.d.notifyDataSetChanged();
      return;
    }
    catch (UnsupportedEncodingException paramh)
    {
      paramh.printStackTrace();
    }
  }
  
  public void handleTimeout(h paramh) {}
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903595);
    paramBundle = getIntent();
    if (paramBundle != null) {
      this.a = paramBundle.getStringExtra("DETAIL_JSON");
    }
    a();
    b();
  }
  
  public void netException(h paramh, Exception paramException) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\NewsXgfxDetailScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */