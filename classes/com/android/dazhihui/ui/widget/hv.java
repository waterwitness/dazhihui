package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.model.stock.JsonMyTalkItem;
import com.android.dazhihui.ui.model.stock.JsonMyTalkItem.ReplyItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.screen.stock.oy;
import com.g.a.a.a.b.c;
import com.g.a.b.f;
import com.g.a.b.j;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class hv
  extends BaseAdapter
{
  private int a = 0;
  private LayoutInflater b;
  private List<JsonMyTalkItem> c = new ArrayList();
  private ag d;
  private String e;
  private PopupWindow f;
  private TextView g;
  private TextView h;
  private int i;
  private String j;
  private JsonMyTalkItem k;
  private Activity l;
  private View m;
  private Toast n;
  private com.g.a.b.d o;
  private com.android.dazhihui.c.a.d p = com.android.dazhihui.c.a.d.a();
  private int q = 0;
  
  public hv(Context paramContext, int paramInt)
  {
    this.l = ((Activity)paramContext);
    this.a = paramInt;
    this.b = LayoutInflater.from(paramContext);
    this.e = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    this.i = this.l.getResources().getDimensionPixelOffset(2131230834);
    this.o = new f().b(2130838099).c(2130838099).a(true).b(true).a();
    this.q = this.p.b("show_user_avatar_by_wifi", 0);
    this.p.g();
  }
  
  private View a(ViewGroup paramViewGroup, JsonMyTalkItem paramJsonMyTalkItem, int paramInt)
  {
    paramViewGroup.setTag(paramJsonMyTalkItem.getId());
    Object localObject1 = (TextView)paramViewGroup.findViewById(2131558710);
    Object localObject2;
    label146:
    label259:
    label333:
    Object localObject5;
    if ((paramJsonMyTalkItem.getCap() != null) && (!paramJsonMyTalkItem.getCap().isEmpty()))
    {
      ((TextView)localObject1).setText(paramJsonMyTalkItem.getCap());
      ((TextView)localObject1).setVisibility(0);
      localObject1 = (ImageView)paramViewGroup.findViewById(2131558707);
      ((ImageView)localObject1).setTag(2131558470, paramJsonMyTalkItem);
      if (!com.g.a.b.g.a().b())
      {
        localObject2 = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(com.g.a.b.a.h.b).b();
        com.g.a.b.g.a().a((com.g.a.b.h)localObject2);
      }
      if ((this.q != 1) || (com.android.dazhihui.a.g.a().q() == 1)) {
        break label684;
      }
      ((ImageView)localObject1).setOnClickListener(new hy(this));
      localObject1 = (TextView)paramViewGroup.findViewById(2131558709);
      ((TextView)localObject1).setTag(paramJsonMyTalkItem);
      ((TextView)localObject1).setText(paramJsonMyTalkItem.getIp());
      ((TextView)localObject1).setOnClickListener(new hz(this));
      localObject1 = (TextView)paramViewGroup.findViewById(2131558745);
      localObject2 = paramJsonMyTalkItem.getOtime();
      if (!((String)localObject2).startsWith(this.e)) {
        break label703;
      }
      ((TextView)localObject1).setText("今日 " + ((String)localObject2).subSequence(11, 16));
      localObject1 = (TextView)paramViewGroup.findViewById(2131558746);
      localObject2 = (ImageView)paramViewGroup.findViewById(2131558747);
      if ((oy.a == null) || (oy.a.get(paramJsonMyTalkItem.getId()) == null) || (!((Boolean)oy.a.get(paramJsonMyTalkItem.getId())).booleanValue())) {
        break label730;
      }
      ((TextView)localObject1).setSelected(true);
      ((ImageView)localObject2).setSelected(true);
      ((TextView)localObject1).setText(paramJsonMyTalkItem.getGood());
      ((TextView)localObject1).setTag(paramJsonMyTalkItem);
      if ((paramJsonMyTalkItem.getGood() == null) || (paramJsonMyTalkItem.getGood().equals(""))) {
        ((TextView)localObject1).setText("0");
      }
      localObject3 = paramViewGroup.findViewById(2131558706);
      ((View)localObject3).setTag(paramJsonMyTalkItem);
      ((View)localObject3).setOnClickListener(new ia(this));
      localObject4 = (TextView)paramViewGroup.findViewById(2131558715);
      ((TextView)localObject4).setTag(paramJsonMyTalkItem);
      ((TextView)localObject4).setText(paramJsonMyTalkItem.getContent());
      ((TextView)localObject4).setOnClickListener(new ib(this));
      localObject5 = (LinearLayout)paramViewGroup.findViewById(2131560087);
      ((LinearLayout)localObject5).setTag(paramJsonMyTalkItem);
      ((LinearLayout)localObject5).setOnClickListener(new ic(this));
      ((View)localObject3).setTag(2131558470, localObject1);
      ((TextView)localObject4).setTag(2131558470, localObject1);
      ((View)localObject3).setTag(2131558471, localObject2);
      ((TextView)localObject4).setTag(2131558471, localObject2);
      ((LinearLayout)localObject5).setTag(2131558470, localObject1);
      ((LinearLayout)localObject5).setTag(2131558471, localObject2);
      localObject5 = (TextView)paramViewGroup.findViewById(2131560088);
      localObject3 = "";
      localObject4 = "";
      if (paramJsonMyTalkItem.getTopurl().equals("")) {
        break label745;
      }
      ((TextView)localObject5).setText(" 资讯");
      ((TextView)localObject5).setTag("ZX");
      ((TextView)localObject5).setTag(2131558470, paramJsonMyTalkItem.getTopurl());
    }
    for (;;)
    {
      ((TextView)localObject5).setOnClickListener(new id(this));
      localObject1 = (RelativeLayout)paramViewGroup.findViewById(2131558748);
      localObject2 = paramJsonMyTalkItem.getReply();
      if (localObject2 == null) {
        break label1008;
      }
      if ((paramJsonMyTalkItem.getTopurl().equals("")) || ((((JsonMyTalkItem.ReplyItem)localObject2).otime != null) && (!((JsonMyTalkItem.ReplyItem)localObject2).otime.equals("")))) {
        break label923;
      }
      ((RelativeLayout)localObject1).setVisibility(8);
      return paramViewGroup;
      ((TextView)localObject1).setVisibility(8);
      break;
      label684:
      com.g.a.b.g.a().a(paramJsonMyTalkItem.getAvatar(), (ImageView)localObject1, this.o);
      break label146;
      label703:
      if ("".equals(localObject2)) {
        break label259;
      }
      ((TextView)localObject1).setText(((String)localObject2).subSequence(5, 16));
      break label259;
      label730:
      ((TextView)localObject1).setSelected(false);
      ((ImageView)localObject2).setSelected(false);
      break label333;
      label745:
      if (paramJsonMyTalkItem.getStock() != null)
      {
        localObject1 = paramJsonMyTalkItem.getStock().toString();
        System.out.println("stock = " + (String)localObject1);
        String[] arrayOfString = ((String)localObject1).replace("{", "").replace("}", "").split("=|:");
        localObject2 = localObject4;
        localObject1 = localObject3;
        if (arrayOfString != null)
        {
          localObject2 = localObject4;
          localObject1 = localObject3;
          if (arrayOfString.length == 2)
          {
            localObject1 = arrayOfString[0];
            localObject2 = arrayOfString[1];
          }
        }
        ((TextView)localObject5).setText((String)localObject2 + " (" + (String)localObject1 + ")");
        ((TextView)localObject5).setTag("GUH");
        ((TextView)localObject5).setTag(2131558470, localObject2);
        ((TextView)localObject5).setTag(2131558471, localObject1);
      }
    }
    label923:
    ((RelativeLayout)localObject1).setVisibility(0);
    Object localObject3 = (TextView)paramViewGroup.findViewById(2131558758);
    localObject3 = (TextView)paramViewGroup.findViewById(2131558754);
    Object localObject4 = (TextView)paramViewGroup.findViewById(2131558760);
    ((TextView)localObject3).setText(((JsonMyTalkItem.ReplyItem)localObject2).getIp());
    ((TextView)localObject4).setText(((JsonMyTalkItem.ReplyItem)localObject2).getTitle());
    ((RelativeLayout)localObject1).setTag(2131558470, paramJsonMyTalkItem);
    ((RelativeLayout)localObject1).setOnClickListener(new ie(this));
    return paramViewGroup;
    label1008:
    ((RelativeLayout)localObject1).setVisibility(8);
    return paramViewGroup;
  }
  
  public void a()
  {
    this.c.clear();
    if (com.g.a.b.g.a().b())
    {
      com.g.a.b.g.a().c();
      com.g.a.b.g.a().d();
    }
    notifyDataSetChanged();
  }
  
  public void a(View paramView)
  {
    this.k = ((JsonMyTalkItem)paramView.getTag());
    this.j = this.k.getId();
    if (com.android.dazhihui.g.a().v().equals(this.k.getMac())) {
      return;
    }
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    this.m = paramView;
    if (this.f == null)
    {
      View localView = LayoutInflater.from(this.l).inflate(2130903078, null);
      this.g = ((TextView)localView.findViewById(2131558703));
      this.h = ((TextView)localView.findViewById(2131558704));
      this.f = new PopupWindow(localView);
      this.f.setWidth(com.android.dazhihui.g.a().m() / 2);
      this.f.setHeight(this.i);
      this.f.setFocusable(true);
      this.f.setTouchable(true);
      this.f.setOutsideTouchable(true);
      this.f.setBackgroundDrawable(new BitmapDrawable());
      this.g.setOnClickListener(new hw(this));
      this.h.setOnClickListener(new hx(this));
    }
    this.f.showAtLocation(paramView, 0, arrayOfInt[0] + paramView.getWidth() / 2 - this.f.getWidth() / 2, arrayOfInt[1] - this.f.getHeight());
  }
  
  public void a(ag paramag)
  {
    this.d = paramag;
  }
  
  public void a(String paramString)
  {
    if (this.n != null) {
      this.n.setText(paramString);
    }
    for (;;)
    {
      this.n.show();
      return;
      this.n = Toast.makeText(this.l, paramString, 0);
    }
  }
  
  public void a(ArrayList<JsonMyTalkItem> paramArrayList)
  {
    this.c.addAll(paramArrayList);
    notifyDataSetChanged();
  }
  
  public void b()
  {
    if (this.m != null)
    {
      localTextView = (TextView)this.m.getTag(2131558470);
      localImageView = (ImageView)this.m.getTag(2131558471);
      if (localTextView != null)
      {
        localObject = (String)localTextView.getText();
        localTextView.setText(Integer.valueOf((String)localObject).intValue() + 1 + "");
        localTextView.setSelected(true);
        if (localImageView != null) {
          localImageView.setSelected(true);
        }
        this.m = null;
      }
    }
    else
    {
      return;
    }
    Object localObject = (LinearLayout)this.m.findViewById(2131558727);
    TextView localTextView = (TextView)this.m.findViewById(2131558736);
    ImageView localImageView = (ImageView)this.m.findViewById(2131558735);
    if ((localObject == null) || (localTextView == null) || (localImageView == null))
    {
      this.m = null;
      return;
    }
    localObject = (JsonPLItem)((LinearLayout)localObject).getTag();
    if ((localObject == null) || (((JsonPLItem)localObject).getId() == null))
    {
      this.m = null;
      return;
    }
    if ((oy.a.get(((JsonPLItem)localObject).getId()) == null) || (!((Boolean)oy.a.get(((JsonPLItem)localObject).getId())).booleanValue()))
    {
      this.m = null;
      return;
    }
    localImageView.setSelected(true);
    try
    {
      ((JsonPLItem)localObject).setGood(Integer.toString(Integer.parseInt(((JsonPLItem)localObject).getGood()) + 1));
      if (localTextView != null)
      {
        localTextView.setText(((JsonPLItem)localObject).getGood());
        localTextView.setTextColor(Color.parseColor("#ff8208"));
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        localNumberFormatException.printStackTrace();
      }
    }
    this.m = null;
  }
  
  public int getCount()
  {
    return this.c.size();
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = (JsonMyTalkItem)this.c.get(paramInt);
    if (paramView == null)
    {
      paramView = this.b.inflate(2130903331, null);
      a((ViewGroup)paramView, paramViewGroup, paramInt);
      return paramView;
    }
    a((ViewGroup)paramView, paramViewGroup, paramInt);
    return paramView;
  }
  
  public int getViewTypeCount()
  {
    return 2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\hv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */