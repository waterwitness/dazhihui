package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.ArrayList;

public class DropDownEditTextView
  extends RelativeLayout
{
  protected Handler a = new bk(this);
  boolean b = false;
  bo c;
  bp d;
  bq e;
  private PopupWindow f = null;
  private ListView g;
  private bl h;
  private Context i;
  private EditText j;
  private ImageView k;
  private ColorStateList l;
  private View m;
  private int n = -1;
  private ArrayList<String> o = null;
  
  public DropDownEditTextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DropDownEditTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DropDownEditTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.i = paramContext;
    c();
  }
  
  private void c()
  {
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130903473, this);
    this.j = ((EditText)findViewById(2131560663));
    this.l = this.j.getTextColors();
    this.k = ((ImageView)findViewById(2131560662));
    this.k.setImageResource(2130838894);
    this.k.setOnClickListener(new bh(this));
    this.h = new bl(this);
    this.m = LayoutInflater.from(getContext()).inflate(2130903098, null);
    this.g = ((ListView)this.m.findViewById(2131558827));
    this.g.setAdapter(this.h);
    this.g.setOnItemClickListener(new bi(this));
  }
  
  private void d()
  {
    if (this.f == null)
    {
      this.f = new PopupWindow(this.m, getWidth(), -2, true);
      this.f.setTouchable(true);
      this.f.setOutsideTouchable(true);
      this.f.setBackgroundDrawable(new ColorDrawable(0));
    }
    if (this.h.getCount() != 0) {
      this.f.showAsDropDown(this);
    }
  }
  
  private void setCanDropDown(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.k.setVisibility(0);
      return;
    }
    this.k.setVisibility(8);
  }
  
  public void a()
  {
    setBackgroundDrawable(getResources().getDrawable(2130837698));
  }
  
  public void a(ArrayList<String> paramArrayList, int paramInt, boolean paramBoolean)
  {
    this.o = paramArrayList;
    if (this.j.getVisibility() != 0) {
      this.j.setVisibility(0);
    }
    if ((paramArrayList != null) && (paramArrayList.size() != 0))
    {
      int i1 = paramInt;
      if (paramInt == -1) {
        i1 = 0;
      }
      setCanDropDown(true);
      this.n = i1;
      paramArrayList = (String)paramArrayList.get(i1);
      this.j.setText(paramArrayList);
      if ((this.c != null) && (paramBoolean)) {
        this.a.sendEmptyMessage(0);
      }
    }
    for (;;)
    {
      postInvalidate();
      if ((this.f != null) && (this.f.isShowing())) {
        this.f.dismiss();
      }
      return;
      this.j.setText("");
      this.n = -1;
    }
  }
  
  public void b()
  {
    this.o = null;
    this.j.setText("");
    setCanDropDown(false);
    this.n = -1;
  }
  
  public String getCurrentItem()
  {
    return this.j.getText().toString();
  }
  
  public ArrayList<String> getDataList()
  {
    return this.o;
  }
  
  public int getSelectedItemPosition()
  {
    return this.n;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    post(new bj(this));
  }
  
  public void setCanDelItem(boolean paramBoolean)
  {
    this.b = true;
  }
  
  public void setCurrentPositon(int paramInt)
  {
    this.n = paramInt;
  }
  
  public void setEditable(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.j.setTextColor(this.l);
    }
    for (;;)
    {
      this.j.setEnabled(paramBoolean);
      return;
      this.j.setTextColor(this.l.getDefaultColor());
    }
  }
  
  public void setOnItemChangeListener(bo parambo)
  {
    this.c = parambo;
  }
  
  public void setOnListItemImageClickListener(bp parambp)
  {
    this.d = parambp;
  }
  
  public void setOnPopShowListener(bq parambq)
  {
    this.e = parambq;
  }
  
  public void setText(String paramString)
  {
    if (this.j.getVisibility() != 0) {
      this.j.setVisibility(0);
    }
    this.j.setText(paramString);
    setCanDropDown(false);
  }
  
  public void setTransformationMethod(TransformationMethod paramTransformationMethod)
  {
    if (this.j != null) {
      this.j.setTransformationMethod(paramTransformationMethod);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\DropDownEditTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */