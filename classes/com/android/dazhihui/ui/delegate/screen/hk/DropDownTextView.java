package com.android.dazhihui.ui.delegate.screen.hk;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class DropDownTextView
  extends RelativeLayout
{
  boolean a = false;
  m b;
  n c;
  private PopupWindow d = null;
  private ListView e;
  private j f;
  private Context g;
  private TextView h;
  private ImageView i;
  private View j;
  private View k = null;
  private View l = null;
  private View m = null;
  private LinearLayout n = null;
  private int o = -1;
  private ArrayList<String> p = null;
  
  public DropDownTextView(Context paramContext)
  {
    super(paramContext);
    this.g = paramContext;
    a();
  }
  
  public DropDownTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.g = paramContext;
    a();
  }
  
  public DropDownTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.g = paramContext;
    a();
  }
  
  private void a()
  {
    this.k = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130903495, this);
    this.l = findViewById(2131560833);
    this.h = ((TextView)findViewById(2131560661));
    this.i = ((ImageView)findViewById(2131560662));
    this.i.setImageResource(2130838894);
    this.n = ((LinearLayout)findViewById(2131560660));
    this.k.setOnClickListener(new h(this));
    this.f = new j(this);
    this.j = LayoutInflater.from(getContext()).inflate(2130903098, null);
    this.m = this.j.findViewById(2131558826);
    this.e = ((ListView)this.j.findViewById(2131558827));
    this.e.setAdapter(this.f);
    this.e.setOnItemClickListener(new i(this));
  }
  
  private void b()
  {
    if (this.d == null)
    {
      this.d = new PopupWindow(this.j, getWidth(), -2, true);
      this.d.setTouchable(true);
      this.d.setOutsideTouchable(true);
      this.d.setBackgroundDrawable(new ColorDrawable(0));
    }
    if (this.f.getCount() != 0) {
      this.d.showAsDropDown(this);
    }
  }
  
  public void a(ArrayList<String> paramArrayList, int paramInt)
  {
    this.p = paramArrayList;
    if ((paramArrayList != null) && (paramArrayList.size() != 0))
    {
      this.o = paramInt;
      setText((String)paramArrayList.get(paramInt));
      if (this.b != null) {
        this.b.a((String)paramArrayList.get(paramInt), paramInt);
      }
    }
    for (;;)
    {
      if ((this.d != null) && (this.d.isShowing())) {
        this.d.dismiss();
      }
      return;
      setText("");
      this.o = -1;
    }
  }
  
  public String getCurrentItem()
  {
    return this.h.getText().toString();
  }
  
  public ArrayList<String> getDataList()
  {
    return this.p;
  }
  
  public View getDropDownMainView()
  {
    return this.m;
  }
  
  public LinearLayout getLlCenter()
  {
    return this.n;
  }
  
  public View getMainView()
  {
    return this.l;
  }
  
  public int getSelectedItemPosition()
  {
    return this.o;
  }
  
  public TextView getTextView()
  {
    return this.h;
  }
  
  public void setCanDelItem(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public void setCanDropDown(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.i.setVisibility(0);
      return;
    }
    this.i.setVisibility(8);
  }
  
  public void setOnItemChangeListener(m paramm)
  {
    this.b = paramm;
  }
  
  public void setOnListItemImageClickListener(n paramn)
  {
    this.c = paramn;
  }
  
  public void setText(String paramString)
  {
    this.h.setText(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\DropDownTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */