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
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.JsonPLItem.Attr;
import com.android.dazhihui.ui.model.stock.JsonPLItem.UtilsItem;
import com.android.dazhihui.ui.screen.y;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CommentListViewSubFloor
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
  private y m = y.a;
  private String n;
  
  public CommentListViewSubFloor(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CommentListViewSubFloor(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CommentListViewSubFloor(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(1);
    this.a = paramContext;
    this.j = ((int)(3.0F * paramContext.getResources().getDisplayMetrics().density));
    this.i = getResources().getDimensionPixelOffset(2131230830);
    this.n = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
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
      this.d.setOnClickListener(new ai(this));
      this.e.setOnClickListener(new aj(this));
    }
    this.c.showAtLocation(paramView, 0, arrayOfInt[0] + paramView.getWidth() / 2 - this.c.getWidth() / 2, arrayOfInt[1] - this.c.getHeight());
  }
  
  public View a(JsonPLItem.UtilsItem paramUtilsItem, boolean paramBoolean)
  {
    View localView = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130903083, null);
    Object localObject1 = (RelativeLayout)localView.findViewById(2131558753);
    Object localObject2 = (TextView)localView.findViewById(2131558758);
    TextView localTextView1 = (TextView)localView.findViewById(2131558754);
    TextView localTextView2 = (TextView)localView.findViewById(2131558760);
    localTextView2.setText(paramUtilsItem.getContent());
    localTextView1.setText(paramUtilsItem.getIp());
    ((TextView)localObject2).setText(paramUtilsItem.getFloor() + "F");
    localObject2 = localView.findViewById(2131558761);
    Object localObject3 = (RelativeLayout)localView.findViewById(2131558762);
    Object localObject4 = (TextView)localView.findViewById(2131558763);
    ((RelativeLayout)localObject1).setVisibility(0);
    ((RelativeLayout)localObject1).setTag(paramUtilsItem);
    ((RelativeLayout)localObject1).setOnClickListener(new ak(this));
    if (this.m == y.b)
    {
      localTextView2.setTextColor(this.a.getResources().getColor(2131493597));
      localTextView1.setTextColor(this.a.getResources().getColor(2131493598));
      localView.setBackgroundResource(2130838784);
      ((RelativeLayout)localObject3).setBackgroundColor(getResources().getColor(2131493595));
      ((TextView)localObject4).setTextColor(this.a.getResources().getColor(2131493597));
      ((TextView)localObject4).setCompoundDrawablesWithIntrinsicBounds(2130838783, 0, 0, 0);
      if (!paramBoolean) {
        break label659;
      }
      ((RelativeLayout)localObject3).setVisibility(0);
      ((View)localObject2).setVisibility(0);
      ((RelativeLayout)localObject3).setOnClickListener(new al(this));
      label293:
      ((TextView)localObject4).setCompoundDrawablePadding(10);
      localView.findViewById(2131558764).setVisibility(8);
      localObject1 = (TextView)localView.findViewById(2131558759);
      localTextView2 = (TextView)localView.findViewById(2131558755);
      localObject2 = localView.findViewById(2131558756);
      localObject3 = localView.findViewById(2131558757);
      localObject4 = paramUtilsItem.getOtime();
      if (!((String)localObject4).startsWith(this.n)) {
        break label676;
      }
      ((TextView)localObject1).setText("今日 " + ((String)localObject4).subSequence(11, 16));
      label405:
      if (paramUtilsItem.attr == null) {
        break label773;
      }
      if ((!TextUtils.isEmpty(paramUtilsItem.attr.V)) && (paramUtilsItem.attr.V.equals("1"))) {
        localTextView1.setTextColor(this.a.getResources().getColor(2131493412));
      }
      if ((TextUtils.isEmpty(paramUtilsItem.attr.lvl)) || (paramUtilsItem.attr.lvl.equals("0"))) {
        break label703;
      }
      localTextView2.setVisibility(0);
      localTextView2.setText("L" + paramUtilsItem.attr.lvl);
    }
    for (;;)
    {
      if ((TextUtils.isEmpty(paramUtilsItem.attr.BZ)) || (!paramUtilsItem.attr.BZ.equals("1"))) {
        break label713;
      }
      ((View)localObject3).setVisibility(0);
      ((View)localObject2).setVisibility(8);
      return localView;
      localTextView2.setTextColor(this.a.getResources().getColor(2131493530));
      localTextView1.setTextColor(this.a.getResources().getColor(2131493535));
      localView.setBackgroundResource(2130838699);
      ((RelativeLayout)localObject3).setBackgroundColor(getResources().getColor(2131493532));
      ((TextView)localObject4).setTextColor(this.a.getResources().getColor(2131493530));
      ((TextView)localObject4).setCompoundDrawablesWithIntrinsicBounds(2130838698, 0, 0, 0);
      break;
      label659:
      ((RelativeLayout)localObject3).setVisibility(8);
      ((View)localObject2).setVisibility(8);
      break label293;
      label676:
      if ("".equals(localObject4)) {
        break label405;
      }
      ((TextView)localObject1).setText(((String)localObject4).subSequence(5, 16));
      break label405;
      label703:
      localTextView2.setVisibility(8);
    }
    label713:
    if ((!TextUtils.isEmpty(paramUtilsItem.attr.BZ)) && (paramUtilsItem.attr.BZ.equals("2")))
    {
      ((View)localObject3).setVisibility(8);
      ((View)localObject2).setVisibility(0);
      return localView;
    }
    ((View)localObject2).setVisibility(8);
    ((View)localObject3).setVisibility(8);
    return localView;
    label773:
    localTextView2.setVisibility(8);
    ((View)localObject2).setVisibility(8);
    ((View)localObject3).setVisibility(8);
    return localView;
  }
  
  public void a()
  {
    removeAllViews();
    if ((this.b == null) || (this.b.size() == 0)) {
      return;
    }
    int i1 = 0;
    label26:
    if (i1 < this.b.size()) {
      if ((!this.h) || (i1 != 1)) {
        break label82;
      }
    }
    label82:
    for (View localView = a((JsonPLItem.UtilsItem)this.b.get(i1), true);; localView = a((JsonPLItem.UtilsItem)this.b.get(i1), false))
    {
      addView(localView);
      i1 += 1;
      break label26;
      break;
    }
  }
  
  public void a(y paramy)
  {
    if (paramy != null) {
      this.m = paramy;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\CommentListViewSubFloor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */