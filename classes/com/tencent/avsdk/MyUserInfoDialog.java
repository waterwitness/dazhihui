package com.tencent.avsdk;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.f;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;
import com.android.dazhihui.ui.widget.CircleImageView;
import com.android.dazhihui.ui.widget.a.r;
import com.android.dazhihui.w;
import com.tencent.avsdk.Model.CustomRspMsgVo.OwnerRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomInfo;
import com.tencent.avsdk.widget.AboveVideoContainView;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUserInfoDialog
  extends RelativeLayout
  implements View.OnClickListener
{
  private View buttom_view;
  private View close_iv;
  private Context context;
  private TextView fensi_value;
  private TextView guanzhu_bt;
  private TextView guanzhu_value;
  private String hostIdentifier;
  private TextView huipiao_value;
  private View isV;
  private TextView jianjie_content;
  private boolean jubaoSending = false;
  private Handler mActivityHandler;
  private LayoutInflater mInflater;
  private boolean mIsGuanZhu = false;
  private View.OnClickListener mJubaoMenuClickListener = new MyUserInfoDialog.1(this);
  private View mJubaoPopMenuLayout;
  private CustomRspMsgVo.OwnerRsp mOwnerRsp;
  private PopupWindow mPopupWindow;
  private CustomRspMsgVo.RoomInfo mRoomInfo;
  private TextView name;
  private AboveVideoContainView parentView;
  private TextView renzheng_content;
  private View report_iv;
  private int roomId;
  private TextView shibaId;
  private TextView sixin_bt;
  private TextView songchu_value;
  private View top_view;
  private TextView user_activity_value;
  public TextView user_level;
  public ImageView user_level_image;
  private View user_level_layout;
  private LinearLayout user_shibanum_add_renzheng;
  private TextView user_tag;
  private CircleImageView userimage;
  private TextView zhuye_bt;
  
  public MyUserInfoDialog(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MyUserInfoDialog(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MyUserInfoDialog(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mInflater.inflate(2130903579, this);
    this.name = ((TextView)findViewById(2131558624));
    this.user_tag = ((TextView)findViewById(2131561284));
    this.user_level_layout = findViewById(2131561285);
    this.user_level = ((TextView)findViewById(2131561286));
    this.user_level.setTypeface(Typeface.createFromAsset(paramContext.getAssets(), "fonts/eurostib.ttf"));
    this.user_level_image = ((ImageView)findViewById(2131561287));
    this.user_activity_value = ((TextView)findViewById(2131561288));
    this.user_shibanum_add_renzheng = ((LinearLayout)findViewById(2131561289));
    this.renzheng_content = ((TextView)findViewById(2131561294));
    this.jianjie_content = ((TextView)findViewById(2131561297));
    this.guanzhu_value = ((TextView)findViewById(2131561302));
    this.guanzhu_value = ((TextView)findViewById(2131561302));
    this.songchu_value = ((TextView)findViewById(2131561305));
    this.shibaId = ((TextView)findViewById(2131561291));
    this.fensi_value = ((TextView)findViewById(2131561309));
    this.huipiao_value = ((TextView)findViewById(2131559391));
    this.userimage = ((CircleImageView)findViewById(2131561316));
    this.isV = findViewById(2131560305);
    this.close_iv = findViewById(2131561282);
    this.report_iv = findViewById(2131561281);
    this.top_view = findViewById(2131560210);
    this.buttom_view = findViewById(2131561317);
    this.guanzhu_bt = ((TextView)findViewById(2131561311));
    this.sixin_bt = ((TextView)findViewById(2131561312));
    this.zhuye_bt = ((TextView)findViewById(2131561313));
    this.close_iv.setOnClickListener(this);
    this.report_iv.setOnClickListener(this);
    this.guanzhu_bt.setOnClickListener(this);
    this.sixin_bt.setOnClickListener(this);
    this.zhuye_bt.setOnClickListener(this);
    this.top_view.setOnClickListener(this);
    this.buttom_view.setOnClickListener(this);
    dismiss();
  }
  
  private void initJubaoPopMenuLayout()
  {
    this.mJubaoPopMenuLayout = LayoutInflater.from(this.context).inflate(2130903202, null, false);
    TextView localTextView1 = (TextView)this.mJubaoPopMenuLayout.findViewById(2131559454);
    TextView localTextView2 = (TextView)this.mJubaoPopMenuLayout.findViewById(2131559223);
    localTextView1.setOnClickListener(this.mJubaoMenuClickListener);
    localTextView2.setOnClickListener(this.mJubaoMenuClickListener);
  }
  
  private void initPopupWindow()
  {
    this.mPopupWindow = new PopupWindow();
    this.mPopupWindow.setBackgroundDrawable(new ColorDrawable(1711276032));
    this.mPopupWindow.setFocusable(true);
    this.mPopupWindow.setOutsideTouchable(true);
  }
  
  private void sixin()
  {
    if (!UserilvbManager.getInstance().isFromDZHAccount())
    {
      localObject = new Intent();
      ((Intent)localObject).setClass(this.context, LoginMainScreen.class);
      ((Intent)localObject).putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
      this.context.startActivity((Intent)localObject);
      return;
    }
    String str = w.a().o();
    Object localObject = str;
    if (TextUtils.isEmpty(str)) {
      localObject = "0";
    }
    str = "";
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    if (this.mOwnerRsp != null) {
      str = this.mOwnerRsp.OwnerAccount;
    }
    localBundle.putString("nexturl", f.ab + "?toun=" + str + "&token=" + (String)localObject);
    localBundle.putString("names", "私信");
    localIntent.putExtras(localBundle);
    localIntent.setClass(this.context, BrowserActivity.class);
    this.context.startActivity(localIntent);
  }
  
  private void zhuye()
  {
    Intent localIntent = null;
    Object localObject = localIntent;
    if (this.mRoomInfo != null)
    {
      localObject = localIntent;
      if (!TextUtils.isEmpty(this.mRoomInfo.RoomShareUrl)) {
        localObject = this.mRoomInfo.RoomShareUrl;
      }
    }
    if (localObject != null)
    {
      localIntent = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("nexturl", (String)localObject + "&formPlant=1");
      localBundle.putString("names", "主页");
      localIntent.putExtras(localBundle);
      localIntent.setClass(this.context, BrowserActivity.class);
      this.context.startActivity(localIntent);
      return;
    }
    Toast.makeText(this.context, "房间信息获取失败", 0).show();
  }
  
  public void dismiss()
  {
    setVisibility(4);
  }
  
  public void jubaoPopWinItemSelected(int paramInt)
  {
    switch (paramInt)
    {
    }
    do
    {
      return;
    } while (this.jubaoSending == true);
    n.a("", 20240);
    this.jubaoSending = true;
    String str3 = this.hostIdentifier;
    String str4 = this.roomId + "";
    String str2 = w.a().o();
    String str1 = str2;
    if (TextUtils.isEmpty(str2)) {
      str1 = "0";
    }
    str1 = ("?info={\"defendant\":\"" + str3 + "\",\"roomID\":\"" + str4 + "\"}&token=" + str1 + "&qid=" + "report").replace("\"", "%22").replace("{", "%7b").replace("}", "%7d");
    str1 = f.Z + str1;
    System.out.println("guquan--举报 url = " + str1);
    new MyUserInfoDialog.2(this).execute(new String[] { str1 });
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131560210: 
    case 2131561282: 
    case 2131561317: 
      dismiss();
      return;
    case 2131561281: 
      openJubaoPopupwin();
      return;
    case 2131561311: 
      n.a("", 20236);
      if (!UserilvbManager.getInstance().isFromDZHAccount())
      {
        paramView = new Intent();
        paramView.setClass(this.context, LoginMainScreen.class);
        paramView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
        this.context.startActivity(paramView);
        return;
      }
      if (!this.mIsGuanZhu)
      {
        this.mActivityHandler.sendEmptyMessage(279);
        return;
      }
      this.mActivityHandler.sendEmptyMessage(281);
      return;
    case 2131561312: 
      n.a("", 20237);
      sixin();
      dismiss();
      return;
    }
    n.a("", 20239);
    zhuye();
    dismiss();
  }
  
  public void onGuanZhuResult()
  {
    if (this.mIsGuanZhu)
    {
      this.guanzhu_bt.setText("关注");
      this.mIsGuanZhu = false;
      return;
    }
    this.guanzhu_bt.setText("取消关注");
    this.mIsGuanZhu = true;
  }
  
  public void openJubaoPopupwin()
  {
    if (this.mPopupWindow == null) {
      initPopupWindow();
    }
    if (this.mPopupWindow.isShowing())
    {
      this.mPopupWindow.dismiss();
      this.mPopupWindow.update();
      return;
    }
    if (this.mJubaoPopMenuLayout == null) {
      initJubaoPopMenuLayout();
    }
    this.mPopupWindow.setContentView(this.mJubaoPopMenuLayout);
    this.mPopupWindow.setWidth(-1);
    this.mPopupWindow.setHeight(-1);
    this.mPopupWindow.setBackgroundDrawable(new ColorDrawable(1711276032));
    this.mPopupWindow.showAtLocation(this, 81, 0, 0);
    this.mPopupWindow.update();
  }
  
  public void set(String paramString, CustomRspMsgVo.OwnerRsp paramOwnerRsp)
  {
    this.mOwnerRsp = paramOwnerRsp;
    this.name.setText(paramOwnerRsp.OwnerName);
    this.renzheng_content.setText(paramOwnerRsp.Indentity);
    this.jianjie_content.setText(paramOwnerRsp.Introduce);
    if ((!TextUtils.isEmpty(paramOwnerRsp.VbarId)) && (!paramOwnerRsp.VbarId.equals("null")) && (!paramOwnerRsp.VbarId.equals("NULL"))) {
      this.shibaId.setText(paramOwnerRsp.VbarId);
    }
    this.guanzhu_value.setText(String.valueOf(paramOwnerRsp.OwnerFollowNum));
    long l1 = 0L;
    try
    {
      long l2 = Long.parseLong(paramOwnerRsp.OwnerCost);
      l1 = l2;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        continue;
        this.isV.setVisibility(8);
      }
    }
    this.songchu_value.setText(b.g(l1) + " 慧币");
    this.fensi_value.setText(b.g(paramOwnerRsp.FollowNum));
    this.huipiao_value.setText(b.a(Float.parseFloat(paramOwnerRsp.Diamond)) + " 慧币");
    if (paramOwnerRsp.IsV.equals("1"))
    {
      this.isV.setVisibility(0);
      paramString = new SimpleDateFormat("yyyyMMdd");
      r.a(this.context).a(paramOwnerRsp.OwnerAccountImg + "?time=" + paramString.format(new Date()), this.userimage);
      return;
    }
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
  }
  
  public void setParent(AboveVideoContainView paramAboveVideoContainView)
  {
    this.parentView = paramAboveVideoContainView;
  }
  
  public void setRoomId(int paramInt)
  {
    this.roomId = paramInt;
  }
  
  /* Error */
  public void setRoomInfo(CustomRspMsgVo.RoomInfo paramRoomInfo)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: ldc_w 553
    //   8: aload_1
    //   9: getfield 595	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:IsFollow	Ljava/lang/String;
    //   12: invokevirtual 507	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   15: ifeq +295 -> 310
    //   18: aload_0
    //   19: getfield 187	com/tencent/avsdk/MyUserInfoDialog:guanzhu_bt	Landroid/widget/TextView;
    //   22: ldc_w 461
    //   25: invokevirtual 459	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   28: aload_0
    //   29: iconst_1
    //   30: putfield 72	com/tencent/avsdk/MyUserInfoDialog:mIsGuanZhu	Z
    //   33: aload_0
    //   34: aload_1
    //   35: putfield 344	com/tencent/avsdk/MyUserInfoDialog:mRoomInfo	Lcom/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo;
    //   38: aload_1
    //   39: getfield 598	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:ActivityName	Ljava/lang/String;
    //   42: invokestatic 292	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   45: ifne +291 -> 336
    //   48: aload_0
    //   49: getfield 138	com/tencent/avsdk/MyUserInfoDialog:user_activity_value	Landroid/widget/TextView;
    //   52: iconst_0
    //   53: invokevirtual 599	android/widget/TextView:setVisibility	(I)V
    //   56: aload_0
    //   57: getfield 138	com/tencent/avsdk/MyUserInfoDialog:user_activity_value	Landroid/widget/TextView;
    //   60: aload_1
    //   61: getfield 598	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:ActivityName	Ljava/lang/String;
    //   64: invokevirtual 459	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   67: aload_0
    //   68: getfield 106	com/tencent/avsdk/MyUserInfoDialog:user_tag	Landroid/widget/TextView;
    //   71: invokevirtual 603	android/widget/TextView:getBackground	()Landroid/graphics/drawable/Drawable;
    //   74: checkcast 605	android/graphics/drawable/GradientDrawable
    //   77: astore_2
    //   78: aload_1
    //   79: getfield 608	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:ActivityColor	Ljava/lang/String;
    //   82: invokestatic 292	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   85: ifne +14 -> 99
    //   88: aload_2
    //   89: aload_1
    //   90: getfield 608	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:ActivityColor	Ljava/lang/String;
    //   93: invokestatic 614	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   96: invokevirtual 617	android/graphics/drawable/GradientDrawable:setColor	(I)V
    //   99: aload_1
    //   100: getfield 621	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:OwnerTags	Ljava/util/List;
    //   103: ifnull +102 -> 205
    //   106: aload_1
    //   107: getfield 621	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:OwnerTags	Ljava/util/List;
    //   110: invokeinterface 626 1 0
    //   115: ifle +90 -> 205
    //   118: aload_0
    //   119: getfield 106	com/tencent/avsdk/MyUserInfoDialog:user_tag	Landroid/widget/TextView;
    //   122: iconst_0
    //   123: invokevirtual 599	android/widget/TextView:setVisibility	(I)V
    //   126: aload_0
    //   127: getfield 106	com/tencent/avsdk/MyUserInfoDialog:user_tag	Landroid/widget/TextView;
    //   130: aload_1
    //   131: getfield 621	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:OwnerTags	Ljava/util/List;
    //   134: iconst_0
    //   135: invokeinterface 630 2 0
    //   140: checkcast 632	com/tencent/avsdk/Model/CustomRspMsgVo$OwnerTag
    //   143: getfield 635	com/tencent/avsdk/Model/CustomRspMsgVo$OwnerTag:Tag	Ljava/lang/String;
    //   146: invokevirtual 459	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   149: aload_0
    //   150: getfield 106	com/tencent/avsdk/MyUserInfoDialog:user_tag	Landroid/widget/TextView;
    //   153: invokevirtual 603	android/widget/TextView:getBackground	()Landroid/graphics/drawable/Drawable;
    //   156: checkcast 605	android/graphics/drawable/GradientDrawable
    //   159: astore_2
    //   160: aload_1
    //   161: getfield 621	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:OwnerTags	Ljava/util/List;
    //   164: iconst_0
    //   165: invokeinterface 630 2 0
    //   170: checkcast 632	com/tencent/avsdk/Model/CustomRspMsgVo$OwnerTag
    //   173: getfield 638	com/tencent/avsdk/Model/CustomRspMsgVo$OwnerTag:Color	Ljava/lang/String;
    //   176: invokestatic 292	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   179: ifne +26 -> 205
    //   182: aload_2
    //   183: aload_1
    //   184: getfield 621	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:OwnerTags	Ljava/util/List;
    //   187: iconst_0
    //   188: invokeinterface 630 2 0
    //   193: checkcast 632	com/tencent/avsdk/Model/CustomRspMsgVo$OwnerTag
    //   196: getfield 638	com/tencent/avsdk/Model/CustomRspMsgVo$OwnerTag:Color	Ljava/lang/String;
    //   199: invokestatic 614	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   202: invokevirtual 617	android/graphics/drawable/GradientDrawable:setColor	(I)V
    //   205: aload_1
    //   206: getfield 641	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:AccountLevel	Ljava/lang/String;
    //   209: invokestatic 292	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   212: ifne +193 -> 405
    //   215: aload_1
    //   216: getfield 641	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:AccountLevel	Ljava/lang/String;
    //   219: ldc_w 643
    //   222: invokevirtual 507	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   225: ifne +180 -> 405
    //   228: aload_1
    //   229: getfield 641	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:AccountLevel	Ljava/lang/String;
    //   232: invokestatic 292	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   235: ifne +180 -> 415
    //   238: aload_1
    //   239: getfield 641	com/tencent/avsdk/Model/CustomRspMsgVo$RoomInfo:AccountLevel	Ljava/lang/String;
    //   242: invokestatic 648	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   245: istore_3
    //   246: iload_3
    //   247: ifle +148 -> 395
    //   250: aload_0
    //   251: getfield 109	com/tencent/avsdk/MyUserInfoDialog:user_level_layout	Landroid/view/View;
    //   254: iconst_0
    //   255: invokevirtual 554	android/view/View:setVisibility	(I)V
    //   258: aload_0
    //   259: getfield 109	com/tencent/avsdk/MyUserInfoDialog:user_level_layout	Landroid/view/View;
    //   262: invokevirtual 649	android/view/View:getBackground	()Landroid/graphics/drawable/Drawable;
    //   265: checkcast 605	android/graphics/drawable/GradientDrawable
    //   268: iload_3
    //   269: invokestatic 655	com/tencent/avsdk/Util:getLevelBackgroundColor	(I)I
    //   272: invokevirtual 617	android/graphics/drawable/GradientDrawable:setColor	(I)V
    //   275: iload_3
    //   276: bipush 99
    //   278: if_icmpgt +88 -> 366
    //   281: aload_0
    //   282: getfield 112	com/tencent/avsdk/MyUserInfoDialog:user_level	Landroid/widget/TextView;
    //   285: iconst_0
    //   286: invokevirtual 599	android/widget/TextView:setVisibility	(I)V
    //   289: aload_0
    //   290: getfield 135	com/tencent/avsdk/MyUserInfoDialog:user_level_image	Landroid/widget/ImageView;
    //   293: bipush 8
    //   295: invokevirtual 656	android/widget/ImageView:setVisibility	(I)V
    //   298: aload_0
    //   299: getfield 112	com/tencent/avsdk/MyUserInfoDialog:user_level	Landroid/widget/TextView;
    //   302: iload_3
    //   303: invokestatic 516	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   306: invokevirtual 459	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   309: return
    //   310: aload_0
    //   311: getfield 187	com/tencent/avsdk/MyUserInfoDialog:guanzhu_bt	Landroid/widget/TextView;
    //   314: ldc_w 455
    //   317: invokevirtual 459	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   320: aload_0
    //   321: iconst_0
    //   322: putfield 72	com/tencent/avsdk/MyUserInfoDialog:mIsGuanZhu	Z
    //   325: goto -292 -> 33
    //   328: astore_2
    //   329: aload_2
    //   330: invokevirtual 583	java/lang/Exception:printStackTrace	()V
    //   333: goto -234 -> 99
    //   336: aload_0
    //   337: getfield 138	com/tencent/avsdk/MyUserInfoDialog:user_activity_value	Landroid/widget/TextView;
    //   340: bipush 8
    //   342: invokevirtual 599	android/widget/TextView:setVisibility	(I)V
    //   345: goto -246 -> 99
    //   348: astore_2
    //   349: aload_2
    //   350: invokevirtual 583	java/lang/Exception:printStackTrace	()V
    //   353: goto -148 -> 205
    //   356: astore_1
    //   357: aload_1
    //   358: invokevirtual 583	java/lang/Exception:printStackTrace	()V
    //   361: iconst_0
    //   362: istore_3
    //   363: goto -117 -> 246
    //   366: aload_0
    //   367: getfield 112	com/tencent/avsdk/MyUserInfoDialog:user_level	Landroid/widget/TextView;
    //   370: bipush 8
    //   372: invokevirtual 599	android/widget/TextView:setVisibility	(I)V
    //   375: aload_0
    //   376: getfield 135	com/tencent/avsdk/MyUserInfoDialog:user_level_image	Landroid/widget/ImageView;
    //   379: iconst_0
    //   380: invokevirtual 656	android/widget/ImageView:setVisibility	(I)V
    //   383: aload_0
    //   384: getfield 135	com/tencent/avsdk/MyUserInfoDialog:user_level_image	Landroid/widget/ImageView;
    //   387: iload_3
    //   388: invokestatic 659	com/tencent/avsdk/Util:getLevelImageResource	(I)I
    //   391: invokevirtual 662	android/widget/ImageView:setImageResource	(I)V
    //   394: return
    //   395: aload_0
    //   396: getfield 109	com/tencent/avsdk/MyUserInfoDialog:user_level_layout	Landroid/view/View;
    //   399: bipush 8
    //   401: invokevirtual 554	android/view/View:setVisibility	(I)V
    //   404: return
    //   405: aload_0
    //   406: getfield 109	com/tencent/avsdk/MyUserInfoDialog:user_level_layout	Landroid/view/View;
    //   409: bipush 8
    //   411: invokevirtual 554	android/view/View:setVisibility	(I)V
    //   414: return
    //   415: iconst_0
    //   416: istore_3
    //   417: goto -171 -> 246
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	420	0	this	MyUserInfoDialog
    //   0	420	1	paramRoomInfo	CustomRspMsgVo.RoomInfo
    //   77	106	2	localGradientDrawable	android.graphics.drawable.GradientDrawable
    //   328	2	2	localException1	Exception
    //   348	2	2	localException2	Exception
    //   245	172	3	i	int
    // Exception table:
    //   from	to	target	type
    //   78	99	328	java/lang/Exception
    //   160	205	348	java/lang/Exception
    //   228	246	356	java/lang/Exception
  }
  
  public void sethostIdentifier(String paramString)
  {
    this.hostIdentifier = paramString;
  }
  
  public void show()
  {
    setVisibility(0);
    this.jubaoSending = false;
  }
  
  public void updateView(Configuration paramConfiguration)
  {
    int i = getResources().getDimensionPixelOffset(2131230829);
    int j = getResources().getDimensionPixelOffset(2131230813);
    if (paramConfiguration.orientation == 1)
    {
      this.user_shibanum_add_renzheng.setOrientation(1);
      this.jianjie_content.setMaxLines(6);
      paramConfiguration = new RelativeLayout.LayoutParams(-2, -2);
      paramConfiguration.addRule(3, this.name.getId());
      paramConfiguration.addRule(14);
      paramConfiguration.topMargin = i;
      this.user_activity_value.setLayoutParams(paramConfiguration);
      ((RelativeLayout.LayoutParams)this.user_level_layout.getLayoutParams()).addRule(1, this.user_tag.getId());
      return;
    }
    this.user_shibanum_add_renzheng.setOrientation(0);
    this.jianjie_content.setMaxLines(2);
    paramConfiguration = new RelativeLayout.LayoutParams(-2, -2);
    paramConfiguration.addRule(1, this.user_tag.getId());
    paramConfiguration.addRule(8, this.name.getId());
    paramConfiguration.bottomMargin = j;
    paramConfiguration.leftMargin = j;
    this.user_activity_value.setLayoutParams(paramConfiguration);
    ((RelativeLayout.LayoutParams)this.user_level_layout.getLayoutParams()).addRule(1, this.user_activity_value.getId());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\MyUserInfoDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */