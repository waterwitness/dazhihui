package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.JsonPLItem.UtilsItem;
import java.util.List;

public class NewsCommentListViewSubFloor
  extends LinearLayout
  implements View.OnTouchListener
{
  public Context a;
  public List<JsonPLItem.UtilsItem> b;
  private PopupWindow c;
  private TextView d;
  private TextView e;
  private ah f;
  private String g;
  private boolean h = false;
  private int i;
  private int j;
  private JsonPLItem.UtilsItem k;
  private String l;
  
  public NewsCommentListViewSubFloor(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NewsCommentListViewSubFloor(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NewsCommentListViewSubFloor(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(1);
    this.a = paramContext;
    this.j = ((int)(3.0F * paramContext.getResources().getDisplayMetrics().density));
    this.i = getResources().getDimensionPixelOffset(2131230830);
  }
  
  private void a(View paramView)
  {
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    this.k = ((JsonPLItem.UtilsItem)paramView.getTag());
    this.l = this.k.getId();
    Object localObject = g.a().v();
    if ((TextUtils.isEmpty((CharSequence)localObject)) || (((String)localObject).equals(this.k.getMac()))) {
      return;
    }
    if (this.c == null)
    {
      localObject = LayoutInflater.from(this.a).inflate(2130903078, null);
      this.d = ((TextView)((View)localObject).findViewById(2131558703));
      this.e = ((TextView)((View)localObject).findViewById(2131558704));
      this.c = new PopupWindow((View)localObject);
      this.c.setWidth(g.a().m() / 2);
      this.c.setHeight(this.i);
      this.c.setFocusable(true);
      this.c.setTouchable(true);
      this.c.setOutsideTouchable(true);
      this.c.setBackgroundDrawable(new BitmapDrawable());
      this.d.setOnClickListener(new jb(this));
      this.e.setOnClickListener(new jc(this));
    }
    this.c.showAtLocation(paramView, 0, arrayOfInt[0] + paramView.getWidth() / 2 - this.c.getWidth() / 2, arrayOfInt[1] - this.c.getHeight());
  }
  
  public View a(JsonPLItem.UtilsItem paramUtilsItem, boolean paramBoolean)
  {
    View localView = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130903340, null);
    RelativeLayout localRelativeLayout = (RelativeLayout)localView.findViewById(2131558753);
    Object localObject1 = (TextView)localView.findViewById(2131558758);
    Object localObject2 = (TextView)localView.findViewById(2131558754);
    ((TextView)localView.findViewById(2131558760)).setText(paramUtilsItem.getContent());
    ((TextView)localObject2).setText(paramUtilsItem.getIp());
    ((TextView)localObject1).setText(paramUtilsItem.getFloor());
    localObject1 = localView.findViewById(2131558761);
    localObject2 = (RelativeLayout)localView.findViewById(2131558762);
    localRelativeLayout.setVisibility(0);
    localRelativeLayout.setTag(paramUtilsItem);
    localRelativeLayout.setOnClickListener(new jd(this));
    if (paramBoolean)
    {
      ((RelativeLayout)localObject2).setVisibility(0);
      ((RelativeLayout)localObject2).setOnClickListener(new je(this));
    }
    for (;;)
    {
      paramUtilsItem = (TextView)localView.findViewById(2131558763);
      paramUtilsItem.setCompoundDrawablesWithIntrinsicBounds(2130838698, 0, 0, 0);
      paramUtilsItem.setCompoundDrawablePadding(10);
      localView.findViewById(2131558764).setVisibility(8);
      return localView;
      ((RelativeLayout)localObject2).setVisibility(8);
      ((View)localObject1).setVisibility(8);
    }
  }
  
  public void a()
  {
    removeAllViews();
    if ((this.b == null) || (this.b.size() == 0)) {
      return;
    }
    int m = 0;
    label26:
    View localView;
    label70:
    int n;
    Object localObject;
    if (m < this.b.size())
    {
      if ((!this.h) || (m != 1)) {
        break label137;
      }
      localView = a((JsonPLItem.UtilsItem)this.b.get(m), true);
      n = getResources().getDimensionPixelSize(2131230773);
      if (this.h) {
        break label159;
      }
      localView.setBackgroundDrawable(null);
      if (m != 0)
      {
        localObject = new View(getContext());
        ((View)localObject).setBackgroundColor(-5785152);
        addView((View)localObject, -1, n);
      }
      addView(localView);
    }
    for (;;)
    {
      m += 1;
      break label26;
      break;
      label137:
      localView = a((JsonPLItem.UtilsItem)this.b.get(m), false);
      break label70;
      label159:
      if (m == this.b.size() - 1) {
        localView.setBackgroundDrawable(null);
      }
      localObject = new LinearLayout.LayoutParams(-1, -2);
      ((LinearLayout.LayoutParams)localObject).bottomMargin = (-getResources().getDimensionPixelSize(2131230773));
      n = getResources().getDimensionPixelSize(2131230798);
      ((LinearLayout.LayoutParams)localObject).leftMargin = n;
      if (m == 0) {
        ((LinearLayout.LayoutParams)localObject).topMargin = n;
      }
      ((LinearLayout.LayoutParams)localObject).rightMargin = n;
      addView(localView, (ViewGroup.LayoutParams)localObject);
    }
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
  }
  
  public int getFloorNum()
  {
    return getChildCount();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (getChildCount() <= 0)
    {
      setMeasuredDimension(0, 0);
      return;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public void setCommentId(String paramString)
  {
    this.g = paramString;
  }
  
  public void setHideViewVisible(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void setSubComments(List<JsonPLItem.UtilsItem> paramList)
  {
    this.b = paramList;
  }
  
  public void setSubFloorClickListener(ah paramah)
  {
    this.f = paramah;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\NewsCommentListViewSubFloor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */