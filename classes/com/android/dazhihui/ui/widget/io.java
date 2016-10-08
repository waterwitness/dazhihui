package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.Html;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem.UtilsItem;
import com.android.dazhihui.ui.screen.stock.oy;
import com.g.a.a.a.b.c;
import com.g.a.b.f;
import com.g.a.b.j;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class io
  extends BaseAdapter
{
  private LayoutInflater a;
  private List<JsonPLItem> b = new ArrayList();
  private ah c;
  private int d = 0;
  private String e;
  private PopupWindow f;
  private TextView g;
  private TextView h;
  private int i;
  private String j;
  private JsonPLItem k;
  private Activity l;
  private View m;
  private Toast n;
  private com.g.a.b.d o;
  private com.android.dazhihui.c.a.d p = com.android.dazhihui.c.a.d.a();
  private int q = 0;
  
  public io(Context paramContext)
  {
    this.l = ((Activity)paramContext);
    this.a = LayoutInflater.from(paramContext);
    this.e = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    this.i = this.l.getResources().getDimensionPixelOffset(2131230834);
    this.o = new f().b(2130838099).c(2130838099).a(true).b(true).a();
    this.q = this.p.b("show_user_avatar_by_wifi", 0);
    this.p.g();
  }
  
  private View a(ViewGroup paramViewGroup, JsonPLItem paramJsonPLItem, int paramInt)
  {
    TextView localTextView1 = (TextView)paramViewGroup.findViewById(2131558709);
    Object localObject2 = (TextView)paramViewGroup.findViewById(2131558710);
    Object localObject1 = (TextView)paramViewGroup.findViewById(2131558728);
    TextView localTextView3 = (TextView)paramViewGroup.findViewById(2131558715);
    LinearLayout localLinearLayout2 = (LinearLayout)paramViewGroup.findViewById(2131558730);
    LinearLayout localLinearLayout1 = (LinearLayout)paramViewGroup.findViewById(2131558727);
    TextView localTextView4 = (TextView)paramViewGroup.findViewById(2131558732);
    TextView localTextView5 = (TextView)paramViewGroup.findViewById(2131558736);
    TextView localTextView2 = (TextView)paramViewGroup.findViewById(2131558739);
    View localView1 = paramViewGroup.findViewById(2131558731);
    View localView2 = paramViewGroup.findViewById(2131558734);
    View localView3 = paramViewGroup.findViewById(2131558738);
    ImageView localImageView1 = (ImageView)paramViewGroup.findViewById(2131558735);
    TextView localTextView6 = (TextView)paramViewGroup.findViewById(2131558714);
    View localView4 = paramViewGroup.findViewById(2131558740);
    localTextView3.setTag(paramJsonPLItem);
    localTextView1.setTag(paramJsonPLItem);
    ((TextView)localObject1).setTag(paramJsonPLItem);
    localLinearLayout1.setTag(paramJsonPLItem);
    paramViewGroup.setTag(paramJsonPLItem.getId());
    ImageView localImageView2 = (ImageView)paramViewGroup.findViewById(2131558707);
    localImageView2.setVisibility(0);
    if (!com.g.a.b.g.a().b())
    {
      com.g.a.b.h localh = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(com.g.a.b.a.h.b).b();
      com.g.a.b.g.a().a(localh);
    }
    if ((this.q == 1) && (com.android.dazhihui.a.g.a().q() != 1))
    {
      if ((this.d == 0) || (paramInt != this.d - 1)) {
        break label825;
      }
      localView4.setVisibility(0);
      localView4.setOnClickListener(new iu(this));
      label314:
      localTextView1.setText(paramJsonPLItem.getIp());
      if ((paramJsonPLItem.getCap() == null) || (paramJsonPLItem.getCap().isEmpty())) {
        break label835;
      }
      ((TextView)localObject2).setText(paramJsonPLItem.getCap());
      ((TextView)localObject2).setVisibility(0);
      label355:
      localObject2 = paramJsonPLItem.getOtime();
      if (!((String)localObject2).startsWith(this.e)) {
        break label852;
      }
      localTextView6.setText("今日 " + ((String)localObject2).subSequence(11, 16));
      label406:
      if ((paramJsonPLItem.getTitle() == null) || (paramJsonPLItem.getTitle().isEmpty())) {
        break label879;
      }
      ((TextView)localObject1).setText(paramJsonPLItem.getTitle());
      ((TextView)localObject1).setVisibility(0);
      label438:
      if ((paramJsonPLItem.getContent() == null) || (paramJsonPLItem.getContent().isEmpty())) {
        break label889;
      }
      localTextView3.setText(paramJsonPLItem.getContent());
      localTextView3.setVisibility(0);
      label470:
      if ((paramJsonPLItem.getCalltype() != null) && (!paramJsonPLItem.getCalltype().isEmpty()) && (!"0".equals(paramJsonPLItem.getCalltype()))) {
        break label955;
      }
      localLinearLayout2.setVisibility(0);
      localTextView4.setText(paramJsonPLItem.getReply());
      if (paramJsonPLItem.getReply().equals("0")) {
        break label899;
      }
      localTextView4.setTextColor(Color.parseColor("#ff8208"));
      label539:
      localTextView5.setText(paramJsonPLItem.getGood());
      if (paramJsonPLItem.getGood().equals("0")) {
        break label913;
      }
      localTextView5.setTextColor(Color.parseColor("#ff8208"));
      label572:
      if (paramJsonPLItem.getView().equals("0")) {
        break label927;
      }
      localObject1 = "阅读  <font color='#ff8208'><b>" + paramJsonPLItem.getView() + "</b></font>";
      label616:
      localTextView2.setText(Html.fromHtml((String)localObject1));
      localView1.setTag(paramJsonPLItem);
      localView2.setTag(paramJsonPLItem);
      localView3.setTag(paramJsonPLItem);
      localImageView1.setSelected(false);
      if ((oy.a.get(paramJsonPLItem.getId()) != null) && (((Boolean)oy.a.get(paramJsonPLItem.getId())).booleanValue())) {
        localImageView1.setSelected(true);
      }
      localView1.setOnClickListener(new iv(this, paramViewGroup));
      localView2.setOnClickListener(new iw(this, localImageView1, paramViewGroup));
      localView3.setOnClickListener(new ix(this, paramViewGroup));
    }
    for (;;)
    {
      if (("1".equals(paramJsonPLItem.getAuthortype())) || ("2".equals(paramJsonPLItem.getAuthortype())))
      {
        localTextView1.getPaint().setFlags(8);
        localTextView1.getPaint().setAntiAlias(true);
        localTextView1.setOnClickListener(new iy(this));
      }
      localLinearLayout1.setOnClickListener(new iz(this, paramViewGroup));
      return paramViewGroup;
      com.g.a.b.g.a().a(paramJsonPLItem.getAvatar(), localImageView2, this.o);
      break;
      label825:
      localView4.setVisibility(8);
      break label314;
      label835:
      ((TextView)localObject2).setText("股友");
      ((TextView)localObject2).setVisibility(0);
      break label355;
      label852:
      if ("".equals(localObject2)) {
        break label406;
      }
      localTextView6.setText(((String)localObject2).subSequence(5, 16));
      break label406;
      label879:
      ((TextView)localObject1).setVisibility(8);
      break label438;
      label889:
      localTextView3.setVisibility(8);
      break label470;
      label899:
      localTextView4.setTextColor(Color.parseColor("#757575"));
      break label539;
      label913:
      localTextView5.setTextColor(Color.parseColor("#757575"));
      break label572;
      label927:
      localObject1 = "阅读  " + paramJsonPLItem.getView();
      break label616;
      label955:
      localLinearLayout2.setVisibility(8);
    }
  }
  
  private View b(ViewGroup paramViewGroup, JsonPLItem paramJsonPLItem, int paramInt)
  {
    if (paramJsonPLItem == null) {
      return null;
    }
    paramViewGroup.setTag(paramJsonPLItem.getId());
    Object localObject1 = (TextView)paramViewGroup.findViewById(2131558710);
    Object localObject2;
    if ((paramJsonPLItem.getCap() != null) && (!paramJsonPLItem.getCap().isEmpty()))
    {
      ((TextView)localObject1).setText(paramJsonPLItem.getCap());
      ((TextView)localObject1).setVisibility(0);
      localObject1 = (ImageView)paramViewGroup.findViewById(2131558707);
      ((ImageView)localObject1).setVisibility(0);
      ((ImageView)localObject1).setTag(2131558470, paramJsonPLItem);
      if (!com.g.a.b.g.a().b())
      {
        localObject2 = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(com.g.a.b.a.h.b).b();
        com.g.a.b.g.a().a((com.g.a.b.h)localObject2);
      }
      if ((this.q != 1) || (com.android.dazhihui.a.g.a().q() == 1)) {
        break label603;
      }
      label159:
      ((ImageView)localObject1).setOnClickListener(new ja(this));
      localObject1 = paramJsonPLItem.getRemarks();
      if (localObject1 == null) {
        break label697;
      }
    }
    label293:
    label367:
    label514:
    label603:
    label649:
    label664:
    label679:
    label688:
    label697:
    for (paramInt = ((List)localObject1).size();; paramInt = 0)
    {
      localObject1 = (TextView)paramViewGroup.findViewById(2131558709);
      ((TextView)localObject1).setText(paramJsonPLItem.getIp());
      ((TextView)localObject1).setTag(paramJsonPLItem);
      ((TextView)localObject1).setOnClickListener(new iq(this));
      localObject1 = (TextView)paramViewGroup.findViewById(2131558745);
      localObject2 = paramJsonPLItem.getOtime();
      int i1;
      if (((String)localObject2).startsWith(this.e))
      {
        ((TextView)localObject1).setText("今日 " + ((String)localObject2).subSequence(11, 16));
        localObject1 = (TextView)paramViewGroup.findViewById(2131558746);
        localObject2 = (ImageView)paramViewGroup.findViewById(2131558747);
        if ((oy.a == null) || (oy.a.get(paramJsonPLItem.getId()) == null) || (!((Boolean)oy.a.get(paramJsonPLItem.getId())).booleanValue())) {
          break label649;
        }
        ((TextView)localObject1).setSelected(true);
        ((ImageView)localObject2).setSelected(true);
        ((TextView)localObject1).setText(paramJsonPLItem.getGood());
        ((TextView)localObject1).setTag(paramJsonPLItem);
        View localView = paramViewGroup.findViewById(2131558706);
        localView.setTag(paramJsonPLItem);
        localView.setOnClickListener(new ir(this));
        TextView localTextView = (TextView)paramViewGroup.findViewById(2131558715);
        localTextView.setTag(paramJsonPLItem);
        localTextView.setText(paramJsonPLItem.getContent());
        localTextView.setOnClickListener(new is(this));
        localView.setTag(2131558470, localObject1);
        localTextView.setTag(2131558470, localObject1);
        localView.setTag(2131558471, localObject2);
        localTextView.setTag(2131558471, localObject2);
        localObject1 = (NewsCommentListViewSubFloor)paramViewGroup.findViewById(2131558748);
        if (!TextUtils.isEmpty(paramJsonPLItem.getFloor())) {
          break label664;
        }
        i1 = 0;
        if ((paramJsonPLItem.getRemarks() == null) || (paramInt <= 0)) {
          break label688;
        }
        if (i1 > paramJsonPLItem.getRemarks().size() + 1) {
          break label679;
        }
        ((NewsCommentListViewSubFloor)localObject1).setHideViewVisible(false);
      }
      for (;;)
      {
        ((NewsCommentListViewSubFloor)localObject1).setTag(paramJsonPLItem);
        ((NewsCommentListViewSubFloor)localObject1).setCommentId(paramJsonPLItem.getId());
        ((NewsCommentListViewSubFloor)localObject1).setSubFloorClickListener(this.c);
        ((NewsCommentListViewSubFloor)localObject1).setSubComments(paramJsonPLItem.getRemarks());
        ((NewsCommentListViewSubFloor)localObject1).a();
        ((NewsCommentListViewSubFloor)localObject1).setVisibility(0);
        return paramViewGroup;
        ((TextView)localObject1).setVisibility(8);
        break;
        com.g.a.b.g.a().a(paramJsonPLItem.getAvatar(), (ImageView)localObject1, this.o);
        break label159;
        if ("".equals(localObject2)) {
          break label293;
        }
        ((TextView)localObject1).setText(((String)localObject2).subSequence(5, 16));
        break label293;
        ((TextView)localObject1).setSelected(false);
        ((ImageView)localObject2).setSelected(false);
        break label367;
        i1 = Integer.valueOf(paramJsonPLItem.getFloor()).intValue();
        break label514;
        ((NewsCommentListViewSubFloor)localObject1).setHideViewVisible(true);
      }
      ((NewsCommentListViewSubFloor)localObject1).setVisibility(8);
      return paramViewGroup;
    }
  }
  
  private boolean b(int paramInt)
  {
    return (this.d > 0) && (paramInt < this.d);
  }
  
  public void a()
  {
    this.b.clear();
    if (com.g.a.b.g.a().b())
    {
      com.g.a.b.g.a().c();
      com.g.a.b.g.a().d();
    }
    notifyDataSetChanged();
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(View paramView)
  {
    this.k = ((JsonPLItem)paramView.getTag());
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
      this.g.setOnClickListener(new ip(this));
      this.h.setOnClickListener(new it(this));
    }
    this.f.showAtLocation(paramView, 0, arrayOfInt[0] + paramView.getWidth() / 2 - this.f.getWidth() / 2, arrayOfInt[1] - this.f.getHeight());
  }
  
  public void a(JsonPLItem paramJsonPLItem)
  {
    this.b.add(this.d, paramJsonPLItem);
    notifyDataSetChanged();
  }
  
  public void a(ah paramah)
  {
    this.c = paramah;
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
  
  public void a(ArrayList<JsonPLItem> paramArrayList)
  {
    this.b.addAll(paramArrayList);
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
    if (this.b.indexOf(paramJsonPLItem) >= 0) {
      notifyDataSetChanged();
    }
  }
  
  public void b()
  {
    if (this.m != null)
    {
      localTextView = (TextView)this.m.getTag(2131558470);
      localImageView = (ImageView)this.m.getTag(2131558471);
      if (localTextView != null)
      {
        localObject = localTextView.getText().toString();
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
    return this.b.size();
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
    if (b(paramInt)) {
      return 0;
    }
    return 1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = (JsonPLItem)this.b.get(paramInt);
    if (paramView == null)
    {
      if (b(paramInt))
      {
        paramView = this.a.inflate(2130903080, null);
        a((ViewGroup)paramView, paramViewGroup, paramInt);
        return paramView;
      }
      paramView = this.a.inflate(2130903339, null);
      b((ViewGroup)paramView, paramViewGroup, paramInt);
      return paramView;
    }
    if (b(paramInt))
    {
      a((ViewGroup)paramView, paramViewGroup, paramInt);
      return paramView;
    }
    b((ViewGroup)paramView, paramViewGroup, paramInt);
    return paramView;
  }
  
  public int getViewTypeCount()
  {
    return 2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\io.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */