package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.Html;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem.Attr;
import com.android.dazhihui.ui.model.stock.JsonPLItem.UtilsItem;
import com.android.dazhihui.ui.screen.stock.oy;
import com.android.dazhihui.ui.screen.y;
import com.g.a.a.a.b.c;
import com.g.a.b.f;
import com.g.a.b.j;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class am
  extends BaseAdapter
{
  protected String a;
  private LayoutInflater b;
  private List<JsonPLItem> c = new ArrayList();
  private ah d;
  private int e = 0;
  private String f;
  private int g;
  private Activity h;
  private View i;
  private Toast j;
  private y k = y.a;
  private com.g.a.b.d l;
  private com.android.dazhihui.c.a.d m = com.android.dazhihui.c.a.d.a();
  private int n = 0;
  
  public am(Context paramContext, String paramString)
  {
    this.h = ((Activity)paramContext);
    this.b = LayoutInflater.from(paramContext);
    this.f = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    this.g = this.h.getResources().getDimensionPixelOffset(2131230834);
    paramContext = paramString;
    if (paramString == null) {
      paramContext = "";
    }
    this.a = paramContext;
    this.l = new f().b(2130838099).c(2130838099).a(true).b(true).a();
    this.n = this.m.b("show_user_avatar_by_wifi", 0);
  }
  
  private View a(ViewGroup paramViewGroup, JsonPLItem paramJsonPLItem, int paramInt)
  {
    TextView localTextView1 = (TextView)paramViewGroup.findViewById(2131558709);
    Object localObject2 = (TextView)paramViewGroup.findViewById(2131558710);
    Object localObject1 = (TextView)paramViewGroup.findViewById(2131558728);
    TextView localTextView4 = (TextView)paramViewGroup.findViewById(2131558715);
    LinearLayout localLinearLayout2 = (LinearLayout)paramViewGroup.findViewById(2131558730);
    LinearLayout localLinearLayout1 = (LinearLayout)paramViewGroup.findViewById(2131558727);
    TextView localTextView5 = (TextView)paramViewGroup.findViewById(2131558732);
    TextView localTextView6 = (TextView)paramViewGroup.findViewById(2131558736);
    TextView localTextView2 = (TextView)paramViewGroup.findViewById(2131558739);
    View localView1 = paramViewGroup.findViewById(2131558731);
    View localView2 = paramViewGroup.findViewById(2131558734);
    View localView3 = paramViewGroup.findViewById(2131558738);
    ImageView localImageView = (ImageView)paramViewGroup.findViewById(2131558735);
    TextView localTextView7 = (TextView)paramViewGroup.findViewById(2131558714);
    Object localObject3 = paramViewGroup.findViewById(2131558740);
    Object localObject4 = (TextView)paramViewGroup.findViewById(2131558741);
    View localView7 = paramViewGroup.findViewById(2131558716);
    View localView8 = paramViewGroup.findViewById(2131558729);
    View localView9 = paramViewGroup.findViewById(2131558733);
    View localView10 = paramViewGroup.findViewById(2131558737);
    View localView4 = paramViewGroup.findViewById(2131558708);
    TextView localTextView3 = (TextView)paramViewGroup.findViewById(2131558711);
    View localView5 = paramViewGroup.findViewById(2131558712);
    View localView6 = paramViewGroup.findViewById(2131558713);
    localTextView4.setTag(paramJsonPLItem);
    localTextView1.setTag(paramJsonPLItem);
    ((TextView)localObject1).setTag(paramJsonPLItem);
    localLinearLayout1.setTag(paramJsonPLItem);
    paramViewGroup.setTag(paramJsonPLItem.getId());
    if (this.k == y.b)
    {
      ((TextView)localObject1).setTextColor(this.h.getResources().getColor(2131493609));
      localTextView4.setTextColor(this.h.getResources().getColor(2131493593));
      ((TextView)localObject4).setTextColor(this.h.getResources().getColor(2131493612));
      localView7.setBackgroundResource(2130838815);
      localView8.setBackgroundColor(this.h.getResources().getColor(2131493594));
      localTextView1.setTextColor(this.h.getResources().getColor(2131493598));
      localView9.setBackgroundColor(this.h.getResources().getColor(2131493594));
      localView10.setBackgroundColor(this.h.getResources().getColor(2131493594));
      ((TextView)localObject2).setBackgroundResource(2130838793);
      ((TextView)localObject2).setTextColor(this.h.getResources().getColor(2131493598));
      if (localObject3 != null) {
        ((View)localObject3).setVisibility(8);
      }
      localObject3 = (ImageView)paramViewGroup.findViewById(2131558707);
      ((ImageView)localObject3).setVisibility(0);
      ((ImageView)localObject3).setTag(2131558470, paramJsonPLItem);
      if (!com.g.a.b.g.a().b())
      {
        localObject4 = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(com.g.a.b.a.h.b).b();
        com.g.a.b.g.a().a((com.g.a.b.h)localObject4);
      }
      if ((this.n != 1) || (com.android.dazhihui.a.g.a().q() == 1)) {
        break label1398;
      }
      label536:
      if (("1".equals(paramJsonPLItem.getAuthortype())) || ("2".equals(paramJsonPLItem.getAuthortype()))) {
        ((ImageView)localObject3).setOnClickListener(new an(this));
      }
      localTextView1.setText(paramJsonPLItem.getIp());
      if ((paramJsonPLItem.getCap() == null) || (paramJsonPLItem.getCap().isEmpty())) {
        break label1417;
      }
      ((TextView)localObject2).setText(paramJsonPLItem.getCap());
      ((TextView)localObject2).setVisibility(0);
      label616:
      localObject2 = paramJsonPLItem.getOtime();
      if (!((String)localObject2).startsWith(this.f)) {
        break label1427;
      }
      localTextView7.setText("今日 " + ((String)localObject2).subSequence(11, 16));
      label667:
      if ((paramJsonPLItem.getTitle() == null) || (paramJsonPLItem.getTitle().isEmpty())) {
        break label1453;
      }
      ((TextView)localObject1).setText(paramJsonPLItem.getTitle());
      ((TextView)localObject1).setVisibility(0);
      label699:
      if ((paramJsonPLItem.getContent() == null) || (paramJsonPLItem.getContent().isEmpty())) {
        break label1463;
      }
      localTextView4.setText(paramJsonPLItem.getContent());
      localTextView4.setVisibility(0);
      label731:
      if ((paramJsonPLItem.getCalltype() != null) && (!paramJsonPLItem.getCalltype().isEmpty()) && (!"0".equals(paramJsonPLItem.getCalltype()))) {
        break label1529;
      }
      localLinearLayout2.setVisibility(0);
      localTextView5.setText(paramJsonPLItem.getReply());
      if (paramJsonPLItem.getReply().equals("0")) {
        break label1473;
      }
      localTextView5.setTextColor(Color.parseColor("#ff8208"));
      label800:
      localTextView6.setText(paramJsonPLItem.getGood());
      if (paramJsonPLItem.getGood().equals("0")) {
        break label1487;
      }
      localTextView6.setTextColor(Color.parseColor("#ff8208"));
      label833:
      if (paramJsonPLItem.getView().equals("0")) {
        break label1501;
      }
      localObject1 = "阅读  <font color='#ff8208'><b>" + paramJsonPLItem.getView() + "</b></font>";
      label877:
      localTextView2.setText(Html.fromHtml((String)localObject1));
      localView1.setTag(paramJsonPLItem);
      localView2.setTag(paramJsonPLItem);
      localView3.setTag(paramJsonPLItem);
      localImageView.setSelected(false);
      if ((oy.a.get(paramJsonPLItem.getId()) != null) && (((Boolean)oy.a.get(paramJsonPLItem.getId())).booleanValue())) {
        localImageView.setSelected(true);
      }
      localView1.setOnClickListener(new ao(this, paramViewGroup));
      localView2.setOnClickListener(new ap(this, localImageView, paramViewGroup));
      localView3.setOnClickListener(new aq(this, paramViewGroup));
      label993:
      if (("1".equals(paramJsonPLItem.getAuthortype())) || ("2".equals(paramJsonPLItem.getAuthortype())))
      {
        localTextView1.getPaint().setFlags(8);
        localTextView1.getPaint().setAntiAlias(true);
        localTextView1.setOnClickListener(new ar(this));
      }
      localLinearLayout1.setOnClickListener(new as(this, paramViewGroup));
      if (paramJsonPLItem.attr == null) {
        break label1619;
      }
      if ((TextUtils.isEmpty(paramJsonPLItem.attr.V)) || (!paramJsonPLItem.attr.V.equals("1"))) {
        break label1539;
      }
      localView4.setVisibility(0);
      localTextView1.setTextColor(this.h.getResources().getColor(2131493412));
      label1125:
      if ((TextUtils.isEmpty(paramJsonPLItem.attr.lvl)) || (paramJsonPLItem.attr.lvl.equals("0"))) {
        break label1549;
      }
      localTextView3.setVisibility(0);
      localTextView3.setText("L" + paramJsonPLItem.attr.lvl);
    }
    for (;;)
    {
      if ((TextUtils.isEmpty(paramJsonPLItem.attr.BZ)) || (!paramJsonPLItem.attr.BZ.equals("1"))) {
        break label1559;
      }
      localView6.setVisibility(0);
      localView5.setVisibility(8);
      return paramViewGroup;
      ((TextView)localObject1).setTextColor(this.h.getResources().getColor(2131493546));
      localTextView4.setTextColor(this.h.getResources().getColor(2131493530));
      ((TextView)localObject4).setTextColor(this.h.getResources().getColor(2131493549));
      localView7.setBackgroundResource(2130838733);
      localView8.setBackgroundColor(this.h.getResources().getColor(2131493531));
      localTextView1.setTextColor(this.h.getResources().getColor(2131493535));
      localView9.setBackgroundColor(this.h.getResources().getColor(2131493531));
      localView10.setBackgroundColor(this.h.getResources().getColor(2131493531));
      ((TextView)localObject2).setBackgroundResource(2130838708);
      ((TextView)localObject2).setTextColor(this.h.getResources().getColor(2131493530));
      break;
      label1398:
      com.g.a.b.g.a().a(paramJsonPLItem.getAvatar(), (ImageView)localObject3, this.l);
      break label536;
      label1417:
      ((TextView)localObject2).setVisibility(8);
      break label616;
      label1427:
      if ("".equals(localObject2)) {
        break label667;
      }
      localTextView7.setText(((String)localObject2).subSequence(5, 16));
      break label667;
      label1453:
      ((TextView)localObject1).setVisibility(8);
      break label699;
      label1463:
      localTextView4.setVisibility(8);
      break label731;
      label1473:
      localTextView5.setTextColor(Color.parseColor("#757575"));
      break label800;
      label1487:
      localTextView6.setTextColor(Color.parseColor("#757575"));
      break label833;
      label1501:
      localObject1 = "阅读  " + paramJsonPLItem.getView();
      break label877;
      label1529:
      localLinearLayout2.setVisibility(8);
      break label993;
      label1539:
      localView4.setVisibility(8);
      break label1125;
      label1549:
      localTextView3.setVisibility(8);
    }
    label1559:
    if ((!TextUtils.isEmpty(paramJsonPLItem.attr.BZ)) && (paramJsonPLItem.attr.BZ.equals("2")))
    {
      localView6.setVisibility(8);
      localView5.setVisibility(0);
      return paramViewGroup;
    }
    localView5.setVisibility(8);
    localView6.setVisibility(8);
    return paramViewGroup;
    label1619:
    localView4.setVisibility(8);
    localTextView3.setVisibility(8);
    localView5.setVisibility(8);
    localView6.setVisibility(8);
    return paramViewGroup;
  }
  
  public void a()
  {
    this.c.clear();
    notifyDataSetChanged();
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void a(JsonPLItem paramJsonPLItem)
  {
    this.c.add(this.e, paramJsonPLItem);
    notifyDataSetChanged();
  }
  
  public void a(y paramy)
  {
    if (paramy != null)
    {
      this.k = paramy;
      notifyDataSetChanged();
    }
  }
  
  public void a(ah paramah)
  {
    this.d = paramah;
  }
  
  public void a(String paramString)
  {
    if (this.j != null) {
      this.j.setText(paramString);
    }
    for (;;)
    {
      this.j.show();
      return;
      this.j = Toast.makeText(this.h, paramString, 0);
    }
  }
  
  public void a(ArrayList<JsonPLItem> paramArrayList)
  {
    this.c.addAll(paramArrayList);
    notifyDataSetChanged();
  }
  
  public void a(ArrayList<JsonPLItem> paramArrayList, JsonPLItem paramJsonPLItem)
  {
    List localList = paramJsonPLItem.getRemarks();
    int i1 = 0;
    while (i1 < paramArrayList.size())
    {
      JsonPLItem localJsonPLItem = (JsonPLItem)paramArrayList.get(i1);
      localList.add(i1 + 2, new JsonPLItem.UtilsItem(localJsonPLItem.getId(), localJsonPLItem.getIp(), localJsonPLItem.getContent(), localJsonPLItem.getOtime(), localJsonPLItem.getGood(), localJsonPLItem.getMac(), localJsonPLItem.getFloor()));
      i1 += 1;
    }
    if (this.c.indexOf(paramJsonPLItem) >= 0) {
      notifyDataSetChanged();
    }
  }
  
  public void b()
  {
    if (this.i != null)
    {
      localTextView = (TextView)this.i.getTag(2131558470);
      if (localTextView != null)
      {
        localObject1 = (String)localTextView.getText();
        localTextView.setText(Integer.valueOf((String)localObject1).intValue() + 1 + "");
        localTextView.setSelected(true);
        this.i = null;
      }
    }
    else
    {
      return;
    }
    Object localObject2 = (LinearLayout)this.i.findViewById(2131558727);
    TextView localTextView = (TextView)this.i.findViewById(2131558736);
    Object localObject1 = (ImageView)this.i.findViewById(2131558735);
    if ((localObject2 == null) || (localTextView == null) || (localObject1 == null))
    {
      this.i = null;
      return;
    }
    localObject2 = (JsonPLItem)((LinearLayout)localObject2).getTag();
    if ((localObject2 == null) || (((JsonPLItem)localObject2).getId() == null))
    {
      this.i = null;
      return;
    }
    if ((oy.a.get(((JsonPLItem)localObject2).getId()) == null) || (!((Boolean)oy.a.get(((JsonPLItem)localObject2).getId())).booleanValue()))
    {
      this.i = null;
      return;
    }
    ((ImageView)localObject1).setSelected(true);
    try
    {
      ((JsonPLItem)localObject2).setGood(Integer.toString(Integer.parseInt(((JsonPLItem)localObject2).getGood()) + 1));
      if (localTextView != null)
      {
        localTextView.setText(((JsonPLItem)localObject2).getGood());
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
    this.i = null;
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
  
  public int getItemViewType(int paramInt)
  {
    return super.getItemViewType(paramInt);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = (JsonPLItem)this.c.get(paramInt);
    if (paramView == null)
    {
      paramView = this.b.inflate(2130903080, null);
      a((ViewGroup)paramView, paramViewGroup, paramInt);
      return paramView;
    }
    a((ViewGroup)paramView, paramViewGroup, paramInt);
    return paramView;
  }
  
  public int getViewTypeCount()
  {
    return super.getViewTypeCount();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */