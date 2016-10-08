package com.android.dazhihui.ui.screen.moneybox;

import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FundDetail
  extends DelegateBaseActivity
{
  String[] a = { "" };
  private RelativeLayout b;
  private ImageView c;
  private TextView d;
  private Button e;
  
  private void a()
  {
    this.b = ((RelativeLayout)findViewById(2131560063));
    this.c = ((ImageView)this.b.findViewById(2131560068));
    this.c.setVisibility(0);
    this.d = ((TextView)this.b.findViewById(2131560069));
    this.d.setVisibility(0);
    this.e = ((Button)findViewById(2131559744));
    this.e.setOnClickListener(new a(this));
  }
  
  private void b()
  {
    this.d.setText("了解详情");
    this.c.setOnClickListener(new b(this));
    if (ae.g != null)
    {
      localObject = new ArrayList();
      int i = 0;
      while (i < ae.h.length)
      {
        int j = 0;
        while (j < ae.h[i].b.length)
        {
          if (ae.h[i].b[j][6].equals("1")) {
            ((ArrayList)localObject).add(ae.h[i].a);
          }
          j += 1;
        }
        i += 1;
      }
      if (((ArrayList)localObject).size() > 0)
      {
        this.a = null;
        this.a = new String[((ArrayList)localObject).size()];
        i = 0;
        while (i < this.a.length)
        {
          this.a[i] = ((String)((ArrayList)localObject).get(i));
          i += 1;
        }
      }
    }
    Object localObject = (GridView)findViewById(2131560064);
    ((GridView)localObject).setAdapter(new SimpleAdapter(this, c(), 2130903320, new String[] { "companyName" }, new int[] { 2131560065 }));
    ((GridView)localObject).setEnabled(false);
    ((GridView)localObject).setOnItemClickListener(new c(this));
  }
  
  private List<HashMap<String, Object>> c()
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < this.a.length)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("companyName", this.a[i]);
      localArrayList.add(localHashMap);
      i += 1;
    }
    return localArrayList;
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903319);
    a();
    b();
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  public void onOptionMenuSelect(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\FundDetail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */