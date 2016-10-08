package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem.Attr;
import com.g.a.a.a.b.c;
import com.g.a.b.f;
import com.g.a.b.j;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentViewBZTJ
  extends LinearLayout
{
  private LayoutInflater a;
  private List<JsonPLItem> b = new ArrayList();
  private String c;
  private JsonPLItem d;
  private Context e;
  private com.android.dazhihui.c.a.d f = com.android.dazhihui.c.a.d.a();
  private int g = 0;
  private com.g.a.b.d h;
  
  public CommentViewBZTJ(Context paramContext)
  {
    super(paramContext);
    this.e = paramContext;
    this.a = LayoutInflater.from(paramContext);
    setOrientation(1);
    this.c = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    this.g = this.f.b("show_user_avatar_by_wifi", 0);
    this.h = new f().b(2130838099).c(2130838099).a(true).b(true).a();
  }
  
  public CommentViewBZTJ(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.e = paramContext;
    this.a = LayoutInflater.from(paramContext);
    setOrientation(1);
    this.c = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    this.g = this.f.b("show_user_avatar_by_wifi", 0);
    this.h = new f().b(2130838099).c(2130838099).a(true).b(true).a();
  }
  
  public CommentViewBZTJ(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.e = paramContext;
    this.a = LayoutInflater.from(paramContext);
    setOrientation(1);
    this.c = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    this.g = this.f.b("show_user_avatar_by_wifi", 0);
    this.h = new f().b(2130838099).c(2130838099).a(true).b(true).a();
  }
  
  private void a(JsonPLItem paramJsonPLItem, int paramInt, boolean paramBoolean)
  {
    if ((paramJsonPLItem == null) || (this.b == null)) {
      return;
    }
    ViewGroup localViewGroup = (ViewGroup)this.a.inflate(2130903079, null);
    ((TextView)localViewGroup.findViewById(2131558705)).setVisibility(8);
    Object localObject = (ImageView)localViewGroup.findViewById(2131558707);
    TextView localTextView1 = (TextView)localViewGroup.findViewById(2131558709);
    TextView localTextView4 = (TextView)localViewGroup.findViewById(2131558710);
    TextView localTextView5 = (TextView)localViewGroup.findViewById(2131558715);
    TextView localTextView2 = (TextView)localViewGroup.findViewById(2131558714);
    View localView1 = localViewGroup.findViewById(2131558708);
    TextView localTextView3 = (TextView)localViewGroup.findViewById(2131558711);
    View localView2 = localViewGroup.findViewById(2131558712);
    View localView3 = localViewGroup.findViewById(2131558713);
    localTextView1.setText(paramJsonPLItem.getIp());
    localTextView1.setOnClickListener(new at(this, paramJsonPLItem));
    if (!com.g.a.b.g.a().b())
    {
      com.g.a.b.h localh = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(com.g.a.b.a.h.b).b();
      com.g.a.b.g.a().a(localh);
    }
    if ((this.g == 1) && (com.android.dazhihui.a.g.a().q() != 1))
    {
      label240:
      ((ImageView)localObject).setOnClickListener(new au(this, paramJsonPLItem));
      if ((paramJsonPLItem.getCap() == null) || (paramJsonPLItem.getCap().isEmpty())) {
        break label593;
      }
      localTextView4.setText(paramJsonPLItem.getCap());
      localTextView4.setBackgroundResource(2130838050);
      localTextView4.setVisibility(0);
      label293:
      localTextView5.setText(paramJsonPLItem.getContent());
      localObject = paramJsonPLItem.getOtime();
      if (!((String)localObject).startsWith(this.c)) {
        break label603;
      }
      localTextView2.setText("今日 " + ((String)localObject).subSequence(11, 16));
      label352:
      if (paramJsonPLItem.attr == null) {
        break label712;
      }
      if ((TextUtils.isEmpty(paramJsonPLItem.attr.V)) || (!paramJsonPLItem.attr.V.equals("1"))) {
        break label630;
      }
      localView1.setVisibility(0);
      localTextView1.setTextColor(this.e.getResources().getColor(2131493412));
      label412:
      if ((TextUtils.isEmpty(paramJsonPLItem.attr.lvl)) || (paramJsonPLItem.attr.lvl.equals("0"))) {
        break label640;
      }
      localTextView3.setVisibility(0);
      localTextView3.setText("L" + paramJsonPLItem.attr.lvl);
      label478:
      if ((TextUtils.isEmpty(paramJsonPLItem.attr.BZ)) || (!paramJsonPLItem.attr.BZ.equals("1"))) {
        break label650;
      }
      localView3.setVisibility(0);
      localView2.setVisibility(8);
    }
    for (;;)
    {
      addView(localViewGroup, paramInt);
      if ((paramBoolean) || (paramInt + 1 > getChildCount())) {
        break;
      }
      paramJsonPLItem = getChildAt(paramInt + 1);
      if (paramJsonPLItem == null) {
        break;
      }
      paramJsonPLItem = (TextView)paramJsonPLItem.findViewById(2131558705);
      if (paramJsonPLItem == null) {
        break;
      }
      paramJsonPLItem.setVisibility(8);
      return;
      com.g.a.b.g.a().a(paramJsonPLItem.getAvatar(), (ImageView)localObject, this.h);
      break label240;
      label593:
      localTextView4.setVisibility(8);
      break label293;
      label603:
      if ("".equals(localObject)) {
        break label352;
      }
      localTextView2.setText(((String)localObject).subSequence(5, 16));
      break label352;
      label630:
      localView1.setVisibility(8);
      break label412;
      label640:
      localTextView3.setVisibility(8);
      break label478;
      label650:
      if ((!TextUtils.isEmpty(paramJsonPLItem.attr.BZ)) && (paramJsonPLItem.attr.BZ.equals("2")))
      {
        localView3.setVisibility(8);
        localView2.setVisibility(0);
      }
      else
      {
        localView2.setVisibility(8);
        localView3.setVisibility(8);
        continue;
        label712:
        localView1.setVisibility(8);
        localTextView3.setVisibility(8);
        localView2.setVisibility(8);
        localView3.setVisibility(8);
      }
    }
  }
  
  public void a(int paramInt)
  {
    if ((this.b != null) && (this.b.size() > 0)) {
      while (paramInt < this.b.size())
      {
        a((JsonPLItem)this.b.get(paramInt), paramInt, true);
        paramInt += 1;
      }
    }
  }
  
  public void a(JsonPLItem paramJsonPLItem)
  {
    this.b.add(0, paramJsonPLItem);
    a(paramJsonPLItem, 0, false);
  }
  
  public void addView(View paramView)
  {
    super.addView(paramView);
  }
  
  public void setMainData(ArrayList<JsonPLItem> paramArrayList)
  {
    int i = this.b.size();
    this.b.addAll(paramArrayList);
    a(i);
  }
  
  public void setMainItem(JsonPLItem paramJsonPLItem)
  {
    if ((paramJsonPLItem != null) && (this.d == null)) {
      this.d = paramJsonPLItem;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\CommentViewBZTJ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */