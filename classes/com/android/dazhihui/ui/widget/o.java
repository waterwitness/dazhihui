package com.android.dazhihui.ui.widget;

import android.app.Activity;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.ui.a.a;
import com.android.dazhihui.ui.model.stock.AdvertVo;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem.Attr;
import com.android.dazhihui.ui.model.stock.JsonPLItem.UtilsItem;
import com.android.dazhihui.ui.screen.AdvertBaseActivity;
import com.android.dazhihui.ui.screen.stock.bs;
import com.android.dazhihui.ui.screen.stock.oy;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.g.a.a.a.b.c;
import com.g.a.b.f;
import com.g.a.b.j;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class o
  extends BaseAdapter
{
  public static boolean a = false;
  private LayoutInflater b;
  private List<JsonPLItem> c = new ArrayList();
  private ah d;
  private int e = 0;
  private int f = 0;
  private bs g;
  private String h;
  private PopupWindow i;
  private TextView j;
  private TextView k;
  private int l;
  private String m;
  private JsonPLItem n;
  private Activity o;
  private View p;
  private Toast q;
  private com.g.a.b.d r;
  private com.android.dazhihui.ui.screen.y s = com.android.dazhihui.ui.screen.y.a;
  private com.android.dazhihui.c.a.d t = com.android.dazhihui.c.a.d.a();
  private int u = 0;
  private AdvertView v;
  
  public o(bs parambs)
  {
    this.o = parambs.getActivity();
    this.g = parambs;
    this.b = LayoutInflater.from(parambs.getActivity());
    this.h = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    this.l = this.o.getResources().getDimensionPixelOffset(2131230834);
    this.r = new f().b(2130838099).c(2130838099).a(true).b(true).a();
    this.u = this.t.b("show_user_avatar_by_wifi", 0);
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
    View localView7 = paramViewGroup.findViewById(2131558740);
    Object localObject3 = (TextView)paramViewGroup.findViewById(2131558741);
    Object localObject4 = (ImageView)paramViewGroup.findViewById(2131558742);
    View localView8 = paramViewGroup.findViewById(2131558716);
    View localView9 = paramViewGroup.findViewById(2131558729);
    View localView10 = paramViewGroup.findViewById(2131558733);
    View localView11 = paramViewGroup.findViewById(2131558737);
    View localView4 = paramViewGroup.findViewById(2131558708);
    TextView localTextView3 = (TextView)paramViewGroup.findViewById(2131558711);
    View localView5 = paramViewGroup.findViewById(2131558712);
    View localView6 = paramViewGroup.findViewById(2131558713);
    localTextView4.setTag(paramJsonPLItem);
    localTextView1.setTag(paramJsonPLItem);
    ((TextView)localObject1).setTag(paramJsonPLItem);
    localLinearLayout1.setTag(paramJsonPLItem);
    paramViewGroup.setTag(paramJsonPLItem.getId());
    if (this.s == com.android.dazhihui.ui.screen.y.b)
    {
      ((TextView)localObject1).setTextColor(this.o.getResources().getColor(2131493597));
      localTextView4.setTextColor(this.o.getResources().getColor(2131493593));
      ((TextView)localObject3).setTextColor(this.o.getResources().getColor(2131493612));
      localView7.setBackgroundResource(2130838815);
      ((ImageView)localObject4).setImageDrawable(com.android.dazhihui.d.q.a(this.o, 2130838446, this.o.getResources().getColor(2131493612)));
      localView8.setBackgroundResource(2130838815);
      localView9.setBackgroundColor(this.o.getResources().getColor(2131493594));
      localTextView1.setTextColor(this.o.getResources().getColor(2131493598));
      localView10.setBackgroundColor(this.o.getResources().getColor(2131493594));
      localView11.setBackgroundColor(this.o.getResources().getColor(2131493594));
      ((TextView)localObject2).setBackgroundResource(2130838793);
      ((TextView)localObject2).setTextColor(this.o.getResources().getColor(2131493598));
      localObject3 = (ImageView)paramViewGroup.findViewById(2131558707);
      ((ImageView)localObject3).setVisibility(0);
      ((ImageView)localObject3).setTag(2131558470, paramJsonPLItem);
      if (!com.g.a.b.g.a().b())
      {
        localObject4 = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(com.g.a.b.a.h.b).b();
        com.g.a.b.g.a().a((com.g.a.b.h)localObject4);
      }
      if ((this.u != 1) || (com.android.dazhihui.a.g.a().q() == 1)) {
        break label1482;
      }
      label568:
      if (("1".equals(paramJsonPLItem.getAuthortype())) || ("2".equals(paramJsonPLItem.getAuthortype()))) {
        ((ImageView)localObject3).setOnClickListener(new z(this));
      }
      if ((this.e == 0) || (paramInt != this.e - 1)) {
        break label1501;
      }
      localView7.setVisibility(0);
      localView7.setOnClickListener(new aa(this));
      label643:
      localTextView1.setText(paramJsonPLItem.getIp());
      if ((paramJsonPLItem.getCap() == null) || (paramJsonPLItem.getCap().isEmpty())) {
        break label1511;
      }
      ((TextView)localObject2).setText(paramJsonPLItem.getCap());
      ((TextView)localObject2).setVisibility(0);
      label684:
      localObject2 = paramJsonPLItem.getOtime();
      if (!((String)localObject2).startsWith(this.h)) {
        break label1521;
      }
      localTextView7.setText("今日 " + ((String)localObject2).subSequence(11, 16));
      label735:
      if ((paramJsonPLItem.getTitle() == null) || (paramJsonPLItem.getTitle().isEmpty())) {
        break label1548;
      }
      ((TextView)localObject1).setText(paramJsonPLItem.getTitle());
      ((TextView)localObject1).setVisibility(0);
      label767:
      if ((paramJsonPLItem.getContent() == null) || (paramJsonPLItem.getContent().isEmpty())) {
        break label1558;
      }
      localTextView4.setText(paramJsonPLItem.getContent());
      localTextView4.setVisibility(0);
      label799:
      if ((paramJsonPLItem.getCalltype() != null) && (!paramJsonPLItem.getCalltype().isEmpty()) && (!"0".equals(paramJsonPLItem.getCalltype()))) {
        break label1624;
      }
      localLinearLayout2.setVisibility(0);
      localTextView5.setText(paramJsonPLItem.getReply());
      if (paramJsonPLItem.getReply().equals("0")) {
        break label1568;
      }
      localTextView5.setTextColor(Color.parseColor("#ff8208"));
      label868:
      localTextView6.setText(paramJsonPLItem.getGood());
      if (paramJsonPLItem.getGood().equals("0")) {
        break label1582;
      }
      localTextView6.setTextColor(Color.parseColor("#ff8208"));
      label901:
      if (paramJsonPLItem.getView().equals("0")) {
        break label1596;
      }
      localObject1 = "阅读  <font color='#ff8208'><b>" + paramJsonPLItem.getView() + "</b></font>";
      label945:
      localTextView2.setText(Html.fromHtml((String)localObject1));
      localView1.setTag(paramJsonPLItem);
      localView2.setTag(paramJsonPLItem);
      localView3.setTag(paramJsonPLItem);
      localImageView.setSelected(false);
      if ((oy.a.get(paramJsonPLItem.getId()) != null) && (((Boolean)oy.a.get(paramJsonPLItem.getId())).booleanValue())) {
        localImageView.setSelected(true);
      }
      localView1.setOnClickListener(new ab(this, paramViewGroup));
      localView2.setOnClickListener(new ac(this, localImageView, paramViewGroup));
      localView3.setOnClickListener(new ad(this, paramViewGroup));
      label1061:
      if (("1".equals(paramJsonPLItem.getAuthortype())) || ("2".equals(paramJsonPLItem.getAuthortype())))
      {
        localTextView1.getPaint().setFlags(8);
        localTextView1.getPaint().setAntiAlias(true);
        localTextView1.setOnClickListener(new ae(this));
      }
      localLinearLayout1.setOnClickListener(new af(this, paramViewGroup));
      if (paramJsonPLItem.attr == null) {
        break label1714;
      }
      if ((TextUtils.isEmpty(paramJsonPLItem.attr.V)) || (!paramJsonPLItem.attr.V.equals("1"))) {
        break label1634;
      }
      localView4.setVisibility(0);
      localTextView1.setTextColor(this.o.getResources().getColor(2131493412));
      label1193:
      if ((TextUtils.isEmpty(paramJsonPLItem.attr.lvl)) || (paramJsonPLItem.attr.lvl.equals("0"))) {
        break label1644;
      }
      localTextView3.setVisibility(0);
      localTextView3.setText("L" + paramJsonPLItem.attr.lvl);
    }
    for (;;)
    {
      if ((TextUtils.isEmpty(paramJsonPLItem.attr.BZ)) || (!paramJsonPLItem.attr.BZ.equals("1"))) {
        break label1654;
      }
      localView6.setVisibility(0);
      localView5.setVisibility(8);
      return paramViewGroup;
      ((TextView)localObject1).setTextColor(this.o.getResources().getColor(2131493534));
      localTextView4.setTextColor(this.o.getResources().getColor(2131493530));
      ((TextView)localObject3).setTextColor(this.o.getResources().getColor(2131493549));
      localView7.setBackgroundResource(2130838733);
      ((ImageView)localObject4).setImageResource(2130838445);
      localView8.setBackgroundResource(2130838733);
      localView9.setBackgroundColor(this.o.getResources().getColor(2131493531));
      localTextView1.setTextColor(this.o.getResources().getColor(2131493535));
      localView10.setBackgroundColor(this.o.getResources().getColor(2131493531));
      localView11.setBackgroundColor(this.o.getResources().getColor(2131493531));
      ((TextView)localObject2).setBackgroundResource(2130838708);
      ((TextView)localObject2).setTextColor(this.o.getResources().getColor(2131493530));
      break;
      label1482:
      com.g.a.b.g.a().a(paramJsonPLItem.getAvatar(), (ImageView)localObject3, this.r);
      break label568;
      label1501:
      localView7.setVisibility(8);
      break label643;
      label1511:
      ((TextView)localObject2).setVisibility(8);
      break label684;
      label1521:
      if ("".equals(localObject2)) {
        break label735;
      }
      localTextView7.setText(((String)localObject2).subSequence(5, 16));
      break label735;
      label1548:
      ((TextView)localObject1).setVisibility(8);
      break label767;
      label1558:
      localTextView4.setVisibility(8);
      break label799;
      label1568:
      localTextView5.setTextColor(Color.parseColor("#757575"));
      break label868;
      label1582:
      localTextView6.setTextColor(Color.parseColor("#757575"));
      break label901;
      label1596:
      localObject1 = "阅读  " + paramJsonPLItem.getView();
      break label945;
      label1624:
      localLinearLayout2.setVisibility(8);
      break label1061;
      label1634:
      localView4.setVisibility(8);
      break label1193;
      label1644:
      localTextView3.setVisibility(8);
    }
    label1654:
    if ((!TextUtils.isEmpty(paramJsonPLItem.attr.BZ)) && (paramJsonPLItem.attr.BZ.equals("2")))
    {
      localView6.setVisibility(8);
      localView5.setVisibility(0);
      return paramViewGroup;
    }
    localView5.setVisibility(8);
    localView6.setVisibility(8);
    return paramViewGroup;
    label1714:
    localView4.setVisibility(8);
    localTextView3.setVisibility(8);
    localView5.setVisibility(8);
    localView6.setVisibility(8);
    return paramViewGroup;
  }
  
  private View b(ViewGroup paramViewGroup, JsonPLItem paramJsonPLItem, int paramInt)
  {
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
      if ((this.u != 1) || (com.android.dazhihui.a.g.a().q() == 1)) {
        break label1023;
      }
      label152:
      ((ImageView)localObject1).setOnClickListener(new q(this));
      localObject1 = paramJsonPLItem.getRemarks();
      if (localObject1 == null) {
        break label1435;
      }
    }
    label278:
    label380:
    label454:
    label535:
    label634:
    label667:
    label711:
    label808:
    label903:
    label1023:
    label1146:
    label1173:
    label1188:
    label1209:
    label1223:
    label1232:
    label1242:
    label1325:
    label1335:
    label1345:
    label1405:
    label1435:
    for (int i1 = ((List)localObject1).size();; i1 = 0)
    {
      localObject2 = (RelativeLayout)paramViewGroup.findViewById(2131558743);
      TextView localTextView1 = (TextView)paramViewGroup.findViewById(2131558705);
      localObject1 = (ImageView)paramViewGroup.findViewById(2131558744);
      Object localObject3;
      Object localObject4;
      TextView localTextView2;
      if ((this.f != 0) && (paramInt == this.e))
      {
        ((RelativeLayout)localObject2).setVisibility(0);
        localTextView1.setText("股友热评");
        if (this.s == com.android.dazhihui.ui.screen.y.b)
        {
          ((ImageView)localObject1).setImageDrawable(com.android.dazhihui.d.q.a(this.o, 2130838076, -12686651));
          localObject1 = (TextView)paramViewGroup.findViewById(2131558709);
          ((TextView)localObject1).setText(paramJsonPLItem.getIp());
          ((TextView)localObject1).setTag(paramJsonPLItem);
          ((TextView)localObject1).setOnClickListener(new r(this));
          localObject3 = (TextView)paramViewGroup.findViewById(2131558745);
          localObject4 = paramJsonPLItem.getOtime();
          if (!((String)localObject4).startsWith(this.h)) {
            break label1146;
          }
          ((TextView)localObject3).setText("今日 " + ((String)localObject4).subSequence(11, 16));
          localObject3 = (TextView)paramViewGroup.findViewById(2131558746);
          localObject4 = (ImageView)paramViewGroup.findViewById(2131558747);
          if ((oy.a == null) || (oy.a.get(paramJsonPLItem.getId()) == null) || (!((Boolean)oy.a.get(paramJsonPLItem.getId())).booleanValue())) {
            break label1173;
          }
          ((TextView)localObject3).setSelected(true);
          ((ImageView)localObject4).setSelected(true);
          ((TextView)localObject3).setText(paramJsonPLItem.getGood());
          ((TextView)localObject3).setTag(paramJsonPLItem);
          View localView = paramViewGroup.findViewById(2131558706);
          localView.setTag(paramJsonPLItem);
          localView.setOnClickListener(new s(this));
          localTextView2 = (TextView)paramViewGroup.findViewById(2131558715);
          if (this.s != com.android.dazhihui.ui.screen.y.b) {
            break label1188;
          }
          localTextView2.setTextColor(this.o.getResources().getColor(2131493597));
          localTextView2.setTag(paramJsonPLItem);
          localTextView2.setText(paramJsonPLItem.getContent());
          localTextView2.setOnClickListener(new t(this));
          localView.setTag(2131558470, localObject3);
          localTextView2.setTag(2131558470, localObject3);
          localView.setTag(2131558471, localObject4);
          localTextView2.setTag(2131558471, localObject4);
          localObject3 = (CommentListViewSubFloor)paramViewGroup.findViewById(2131558748);
          ((CommentListViewSubFloor)localObject3).a(this.s);
          if (!TextUtils.isEmpty(paramJsonPLItem.getFloor())) {
            break label1209;
          }
          paramInt = 0;
          if ((paramJsonPLItem.getRemarks() == null) || (i1 <= 0)) {
            break label1232;
          }
          if (paramInt > paramJsonPLItem.getRemarks().size() + 1) {
            break label1223;
          }
          ((CommentListViewSubFloor)localObject3).setHideViewVisible(false);
          ((CommentListViewSubFloor)localObject3).setTag(paramJsonPLItem);
          ((CommentListViewSubFloor)localObject3).setCommentId(paramJsonPLItem.getId());
          ((CommentListViewSubFloor)localObject3).setSubFloorClickListener(this.d);
          ((CommentListViewSubFloor)localObject3).setSubComments(paramJsonPLItem.getRemarks());
          ((CommentListViewSubFloor)localObject3).a();
          ((CommentListViewSubFloor)localObject3).setVisibility(0);
          localObject4 = paramViewGroup.findViewById(2131558749);
          if (this.s != com.android.dazhihui.ui.screen.y.b) {
            break label1242;
          }
          ((RelativeLayout)localObject2).setBackgroundColor(this.o.getResources().getColor(2131493595));
          ((CommentListViewSubFloor)localObject3).setBackgroundColor(this.o.getResources().getColor(2131493596));
          localTextView1.setTextColor(-12686651);
          ((View)localObject4).setBackgroundColor(this.o.getResources().getColor(2131493594));
          ((TextView)localObject1).setTextColor(this.o.getResources().getColor(2131493598));
          localObject2 = paramViewGroup.findViewById(2131558708);
          localTextView1 = (TextView)paramViewGroup.findViewById(2131558711);
          localObject3 = paramViewGroup.findViewById(2131558712);
          localObject4 = paramViewGroup.findViewById(2131558713);
          if (paramJsonPLItem.attr == null) {
            break label1405;
          }
          if ((TextUtils.isEmpty(paramJsonPLItem.attr.V)) || (!paramJsonPLItem.attr.V.equals("1"))) {
            break label1325;
          }
          ((View)localObject2).setVisibility(0);
          ((TextView)localObject1).setTextColor(this.o.getResources().getColor(2131493412));
          if ((TextUtils.isEmpty(paramJsonPLItem.attr.lvl)) || (paramJsonPLItem.attr.lvl.equals("0"))) {
            break label1335;
          }
          localTextView1.setVisibility(0);
          localTextView1.setText("L" + paramJsonPLItem.attr.lvl);
        }
      }
      for (;;)
      {
        if ((TextUtils.isEmpty(paramJsonPLItem.attr.BZ)) || (!paramJsonPLItem.attr.BZ.equals("1"))) {
          break label1345;
        }
        ((View)localObject4).setVisibility(0);
        ((View)localObject3).setVisibility(8);
        return paramViewGroup;
        ((TextView)localObject1).setVisibility(8);
        break;
        com.g.a.b.g.a().a(paramJsonPLItem.getAvatar(), (ImageView)localObject1, this.r);
        break label152;
        ((ImageView)localObject1).setImageDrawable(com.android.dazhihui.d.q.a(this.o, 2130838075));
        break label278;
        if (paramInt == this.e + this.f)
        {
          ((RelativeLayout)localObject2).setVisibility(0);
          localTextView1.setText("最新评论");
          if (this.s == com.android.dazhihui.ui.screen.y.b)
          {
            ((ImageView)localObject1).setImageDrawable(com.android.dazhihui.d.q.a(this.o, 2130837559, -12686651));
            break label278;
          }
          ((ImageView)localObject1).setImageDrawable(com.android.dazhihui.d.q.a(this.o, 2130837559));
          break label278;
        }
        ((RelativeLayout)localObject2).setVisibility(8);
        break label278;
        if ("".equals(localObject4)) {
          break label380;
        }
        ((TextView)localObject3).setText(((String)localObject4).subSequence(5, 16));
        break label380;
        ((TextView)localObject3).setSelected(false);
        ((ImageView)localObject4).setSelected(false);
        break label454;
        localTextView2.setTextColor(this.o.getResources().getColor(2131493530));
        break label535;
        paramInt = Integer.valueOf(paramJsonPLItem.getFloor()).intValue();
        break label634;
        ((CommentListViewSubFloor)localObject3).setHideViewVisible(true);
        break label667;
        ((CommentListViewSubFloor)localObject3).setVisibility(8);
        break label711;
        ((RelativeLayout)localObject2).setBackgroundColor(this.o.getResources().getColor(2131493532));
        ((CommentListViewSubFloor)localObject3).setBackgroundColor(this.o.getResources().getColor(2131493533));
        localTextView1.setTextColor(-4210494);
        ((View)localObject4).setBackgroundColor(this.o.getResources().getColor(2131493531));
        ((TextView)localObject1).setTextColor(this.o.getResources().getColor(2131493535));
        break label808;
        ((View)localObject2).setVisibility(8);
        break label903;
        localTextView1.setVisibility(8);
      }
      if ((!TextUtils.isEmpty(paramJsonPLItem.attr.BZ)) && (paramJsonPLItem.attr.BZ.equals("2")))
      {
        ((View)localObject4).setVisibility(8);
        ((View)localObject3).setVisibility(0);
        return paramViewGroup;
      }
      ((View)localObject3).setVisibility(8);
      ((View)localObject4).setVisibility(8);
      return paramViewGroup;
      ((View)localObject2).setVisibility(8);
      localTextView1.setVisibility(8);
      ((View)localObject3).setVisibility(8);
      ((View)localObject4).setVisibility(8);
      return paramViewGroup;
    }
  }
  
  private View c(ViewGroup paramViewGroup, JsonPLItem paramJsonPLItem, int paramInt)
  {
    paramJsonPLItem = (RelativeLayout)paramViewGroup.findViewById(2131558750);
    TextView localTextView1;
    TextView localTextView2;
    if (a)
    {
      paramJsonPLItem.setVisibility(0);
      localTextView1 = (TextView)paramViewGroup.findViewById(2131558709);
      if ((a.c().b() != null) && (a.c().b().getAdvert(138) != null))
      {
        str = ((AdvertVo.AdvItem)a.c().b().getAdvert(138).advList.get(0)).text;
        System.out.println("floor_username = " + str);
        localTextView1.setText(str);
      }
      this.v = ((AdvertView)paramViewGroup.findViewById(2131558752));
      this.v.setOnAdvertStateChangeListener(new u(this, paramJsonPLItem));
      this.v.setOnCarouselistener(new v(this, localTextView1));
      this.v.setAdvCode(138);
      if ((this.g.getActivity() != null) && ((this.g.getActivity() instanceof AdvertBaseActivity))) {
        ((AdvertBaseActivity)this.g.getActivity()).a(this.v);
      }
      paramJsonPLItem = (ImageView)paramViewGroup.findViewById(2131558707);
      paramJsonPLItem.setVisibility(0);
      paramJsonPLItem.setOnClickListener(new w(this));
      localTextView2 = (TextView)paramViewGroup.findViewById(2131558751);
      String str = "0";
      paramJsonPLItem = str;
      if (a.c().b() != null)
      {
        paramJsonPLItem = str;
        if (a.c().b().getAdvert(138) != null)
        {
          paramJsonPLItem = a.c().b().getAdvert(138).closetype;
          System.out.println("closetype = " + paramJsonPLItem);
        }
      }
      if ((!paramJsonPLItem.equals("1")) && (!paramJsonPLItem.equals("2")) && (!paramJsonPLItem.equals("3")) && (!paramJsonPLItem.equals("6"))) {
        break label496;
      }
      localTextView2.setVisibility(0);
      label377:
      if (this.s != com.android.dazhihui.ui.screen.y.b) {
        break label505;
      }
      localTextView2.setTextColor(this.o.getResources().getColor(2131493597));
    }
    for (;;)
    {
      localTextView2.setOnClickListener(new x(this));
      paramJsonPLItem = paramViewGroup.findViewById(2131558749);
      if (this.s != com.android.dazhihui.ui.screen.y.b) {
        break label526;
      }
      paramJsonPLItem.setBackgroundColor(this.o.getResources().getColor(2131493594));
      localTextView1.setTextColor(this.o.getResources().getColor(2131493598));
      localTextView2.setTextColor(this.o.getResources().getColor(2131493598));
      return paramViewGroup;
      paramJsonPLItem.setVisibility(8);
      break;
      label496:
      localTextView2.setVisibility(4);
      break label377;
      label505:
      localTextView2.setTextColor(this.o.getResources().getColor(2131493530));
    }
    label526:
    paramJsonPLItem.setBackgroundColor(this.o.getResources().getColor(2131493531));
    localTextView1.setTextColor(this.o.getResources().getColor(2131493535));
    localTextView2.setTextColor(this.o.getResources().getColor(2131493535));
    return paramViewGroup;
  }
  
  private boolean c(int paramInt)
  {
    return (this.e > 0) && (paramInt < this.e);
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
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void a(View paramView)
  {
    this.n = ((JsonPLItem)paramView.getTag());
    this.m = this.n.getId();
    if (com.android.dazhihui.g.a().v().equals(this.n.getMac())) {
      return;
    }
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    this.p = paramView;
    if (this.i == null)
    {
      View localView = LayoutInflater.from(this.o).inflate(2130903078, null);
      this.j = ((TextView)localView.findViewById(2131558703));
      this.k = ((TextView)localView.findViewById(2131558704));
      this.i = new PopupWindow(localView);
      this.i.setWidth(com.android.dazhihui.g.a().m() / 2);
      this.i.setHeight(this.l);
      this.i.setFocusable(true);
      this.i.setTouchable(true);
      this.i.setOutsideTouchable(true);
      this.i.setBackgroundDrawable(new BitmapDrawable());
      this.j.setOnClickListener(new p(this));
      this.k.setOnClickListener(new y(this));
    }
    this.i.showAtLocation(paramView, 0, arrayOfInt[0] + paramView.getWidth() / 2 - this.i.getWidth() / 2, arrayOfInt[1] - this.i.getHeight());
  }
  
  public void a(JsonPLItem paramJsonPLItem)
  {
    if (this.c.size() < this.e + this.f) {
      return;
    }
    this.c.add(this.e + this.f, paramJsonPLItem);
    notifyDataSetChanged();
  }
  
  public void a(com.android.dazhihui.ui.screen.y paramy)
  {
    if (paramy != null)
    {
      this.s = paramy;
      notifyDataSetChanged();
    }
  }
  
  public void a(ah paramah)
  {
    this.d = paramah;
  }
  
  public void a(String paramString)
  {
    if (this.q != null) {
      this.q.setText(paramString);
    }
    for (;;)
    {
      this.q.show();
      return;
      this.q = Toast.makeText(this.o, paramString, 0);
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
    if (this.p != null)
    {
      localTextView = (TextView)this.p.getTag(2131558470);
      localImageView = (ImageView)this.p.getTag(2131558471);
      if (localTextView != null)
      {
        localObject = localTextView.getText().toString();
        localTextView.setText(Integer.valueOf((String)localObject).intValue() + 1 + "");
        localTextView.setSelected(true);
        if (localImageView != null) {
          localImageView.setSelected(true);
        }
        this.p = null;
      }
    }
    else
    {
      return;
    }
    Object localObject = (LinearLayout)this.p.findViewById(2131558727);
    TextView localTextView = (TextView)this.p.findViewById(2131558736);
    ImageView localImageView = (ImageView)this.p.findViewById(2131558735);
    if ((localObject == null) || (localTextView == null) || (localImageView == null))
    {
      this.p = null;
      return;
    }
    localObject = (JsonPLItem)((LinearLayout)localObject).getTag();
    if ((localObject == null) || (((JsonPLItem)localObject).getId() == null))
    {
      this.p = null;
      return;
    }
    if ((oy.a.get(((JsonPLItem)localObject).getId()) == null) || (!((Boolean)oy.a.get(((JsonPLItem)localObject).getId())).booleanValue()))
    {
      this.p = null;
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
    this.p = null;
  }
  
  public void b(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void c()
  {
    if ((this.g.getActivity() != null) && ((this.g.getActivity() instanceof AdvertBaseActivity))) {
      ((AdvertBaseActivity)this.g.getActivity()).b(this.v);
    }
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
    if (c(paramInt)) {
      return 0;
    }
    if ((this.c != null) && (this.c.get(paramInt) != null) && (((JsonPLItem)this.c.get(paramInt)).getIsAdv().booleanValue())) {
      return 2;
    }
    return 1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = (JsonPLItem)this.c.get(paramInt);
    if (paramView == null)
    {
      if (c(paramInt))
      {
        paramView = this.b.inflate(2130903080, null);
        a((ViewGroup)paramView, paramViewGroup, paramInt);
        return paramView;
      }
      if (((JsonPLItem)this.c.get(paramInt)).getIsAdv().booleanValue())
      {
        paramView = this.b.inflate(2130903082, null);
        c((ViewGroup)paramView, paramViewGroup, paramInt);
        return paramView;
      }
      paramView = this.b.inflate(2130903081, null);
      b((ViewGroup)paramView, paramViewGroup, paramInt);
      return paramView;
    }
    if (c(paramInt))
    {
      a((ViewGroup)paramView, paramViewGroup, paramInt);
      return paramView;
    }
    if (((JsonPLItem)this.c.get(paramInt)).getIsAdv().booleanValue())
    {
      paramView = this.b.inflate(2130903082, null);
      c((ViewGroup)paramView, paramViewGroup, paramInt);
      return paramView;
    }
    b((ViewGroup)paramView, paramViewGroup, paramInt);
    return paramView;
  }
  
  public int getViewTypeCount()
  {
    return 3;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */