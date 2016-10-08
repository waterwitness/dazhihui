package com.tencent.avsdk.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.d.bb;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.ThumbUpAnimationView;
import com.android.dazhihui.ui.widget.a.r;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import com.g.a.a.a.b.c;
import com.g.a.b.a.h;
import com.g.a.b.f.a;
import com.g.a.b.g;
import com.g.a.b.j;
import com.tencent.avsdk.ChatEntity;
import com.tencent.avsdk.ChatEntity.ChatGuestType;
import com.tencent.avsdk.CircularImageButton;
import com.tencent.avsdk.Model.CustomRspMsgVo.OwnerPublishRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomInfo;
import com.tencent.avsdk.Model.CustomRspMsgVo.ShowLink;
import com.tencent.avsdk.Model.CustomSysMsgVo.OwnerShowAdvertPushSys;
import com.tencent.avsdk.control.MessageControl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AboveVideoBottomView
  extends RelativeLayout
  implements View.OnClickListener
{
  public static long mLastRecoverHostAudioTime = SystemClock.uptimeMillis();
  public static long mLastStartSpeechProcessTime = ;
  private final int SHAKEDELAY = 5000;
  public CarAnimation carAnimation;
  public FireworksAnimation fireworksAnimation;
  public TwoFlowerView flowerView;
  public IlvbGifView gifView;
  public GiftView giftView;
  PopupWindow inputPopupWindow;
  private PopupWindow mADVPopupWindow;
  private Activity mActivity;
  private Handler mActivityHandler;
  private Context mContext;
  private DanMuContainView mDanMuContainView;
  private String mEditTextString = "";
  private View mEmptyView;
  private View mGongGaoLayout;
  private CircularImageButton mGongGaoUserImg;
  private TextView mGongGaoUserMsg;
  private TextView mGongGaoUserTime;
  a mImageLoadingListener = new AboveVideoBottomView.14(this);
  private LayoutInflater mInflater;
  private View mMenuBar;
  private View mMsgGroupLayout;
  private View mMsgLayout;
  private ChatListView mMsgListView;
  AboveVideoContainView mParent;
  private PopupWindow mPopupWindow;
  private ImageView mRoomGiftBtn;
  private String mRoomImage;
  private CustomRspMsgVo.RoomInfo mRoomInfo;
  RotateAnimation mRotateAnimation;
  private Scroller mScroller;
  private ImageView mSetRotation;
  private Bitmap mShareBitmap = null;
  private View.OnClickListener mShareMenuClickListener = new AboveVideoBottomView.13(this);
  private View mSharePopMenuLayout;
  private PopupWindow mShareWebPopupWindow = null;
  private int mShowGongGaoTime = 20000;
  private Handler mShowHandler = new Handler(new AboveVideoBottomView.12(this));
  private int mShowTime = 10000;
  private ThumbUpAnimationView mThumbUpAnimationView;
  private View mUnreadChatView;
  private ViewFlow mViewFlow;
  private AboveVideoBottomView.ViewFlowAdapter mViewFlowAdapter;
  private List<CustomRspMsgVo.ShowLink> mViewFlowData;
  private PopupWindow mViewFlowPopupWindow;
  private View mZhuBoMsgLayout;
  private CircularImageButton mZhuBoMsgUserImg;
  private TextView mZhuBoMsgUserMsg;
  public YachtAnimation yachtAnimation;
  
  public AboveVideoBottomView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AboveVideoBottomView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AboveVideoBottomView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mInflater.inflate(2130903177, this);
    this.mThumbUpAnimationView = ((ThumbUpAnimationView)findViewById(2131559353));
    this.flowerView = ((TwoFlowerView)findViewById(2131559354));
    this.gifView = ((IlvbGifView)findViewById(2131559355));
    this.mSetRotation = ((ImageView)findViewById(2131559333));
    this.mSetRotation.setOnClickListener(this);
    this.fireworksAnimation = ((FireworksAnimation)findViewById(2131559356));
    this.carAnimation = ((CarAnimation)findViewById(2131559357));
    this.yachtAnimation = ((YachtAnimation)findViewById(2131559358));
    this.mEmptyView = findViewById(2131559330);
    this.mMsgLayout = findViewById(2131559339);
    this.mZhuBoMsgLayout = findViewById(2131559340);
    this.mZhuBoMsgUserImg = ((CircularImageButton)findViewById(2131559342));
    this.mZhuBoMsgUserMsg = ((TextView)findViewById(2131559341));
    this.mZhuBoMsgUserMsg.setMovementMethod(LinkMovementMethod.getInstance());
    this.mMsgGroupLayout = findViewById(2131559338);
    this.mGongGaoLayout = findViewById(2131559347);
    this.mGongGaoUserImg = ((CircularImageButton)findViewById(2131559350));
    this.mGongGaoUserMsg = ((TextView)findViewById(2131559348));
    this.mGongGaoUserMsg.setMovementMethod(LinkMovementMethod.getInstance());
    this.mGongGaoUserTime = ((TextView)findViewById(2131559349));
    findViewById(2131559351).setOnClickListener(this);
    this.mViewFlow = ((ViewFlow)findViewById(2131559331));
    this.mViewFlow.setOnItemClickListener(new AboveVideoBottomView.1(this));
    this.mViewFlowAdapter = new AboveVideoBottomView.ViewFlowAdapter(this, paramContext);
    this.mViewFlow.setAdapter(this.mViewFlowAdapter);
    findViewById(2131559332).setOnClickListener(this);
    this.mRoomGiftBtn = ((ImageView)findViewById(2131559334));
    this.mRoomGiftBtn.setOnClickListener(this);
    this.mShowHandler.sendEmptyMessageDelayed(3, 5000L);
    findViewById(2131559335).setOnClickListener(this);
    findViewById(2131559336).setOnClickListener(this);
    this.mMenuBar = findViewById(2131559329);
    this.mMsgListView = ((ChatListView)findViewById(2131559346));
    this.mUnreadChatView = findViewById(2131559343);
    this.mMsgListView.setUnreadView(this.mUnreadChatView);
    this.mDanMuContainView = ((DanMuContainView)findViewById(2131559352));
    if (!g.a().b())
    {
      paramContext = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(h.b).b();
      g.a().a(paramContext);
    }
    this.mRotateAnimation = new RotateAnimation(0.0F, -10.0F, 1, 0.5F, 1, 1.0F);
    this.mRotateAnimation.setDuration(60L);
    this.mRotateAnimation.setAnimationListener(new AboveVideoBottomView.2(this));
    this.mRotateAnimation.setFillAfter(true);
  }
  
  private void initPopupWindow()
  {
    this.mPopupWindow = new PopupWindow();
    this.mPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
    this.mPopupWindow.setFocusable(true);
    this.mPopupWindow.setOutsideTouchable(true);
    this.mPopupWindow.setAnimationStyle(2131296258);
  }
  
  private void initSharePopMenuLayout()
  {
    this.mSharePopMenuLayout = LayoutInflater.from(this.mContext).inflate(2130903203, null, false);
    TextView localTextView1 = (TextView)this.mSharePopMenuLayout.findViewById(2131559220);
    TextView localTextView2 = (TextView)this.mSharePopMenuLayout.findViewById(2131559221);
    TextView localTextView3 = (TextView)this.mSharePopMenuLayout.findViewById(2131559222);
    if ("app_dzh".equals("app_sb")) {
      localTextView3.setVisibility(8);
    }
    TextView localTextView4 = (TextView)this.mSharePopMenuLayout.findViewById(2131559455);
    localTextView1.setOnClickListener(this.mShareMenuClickListener);
    localTextView2.setOnClickListener(this.mShareMenuClickListener);
    localTextView3.setOnClickListener(this.mShareMenuClickListener);
    localTextView4.setOnClickListener(this.mShareMenuClickListener);
  }
  
  private void openShareWebPopWindow()
  {
    if (this.mShareWebPopupWindow != null) {
      this.mShareWebPopupWindow.dismiss();
    }
    for (;;)
    {
      this.mShareWebPopupWindow.getContentView().findViewById(2131559485).setOnClickListener(new AboveVideoBottomView.15(this));
      this.mShareWebPopupWindow.getContentView().findViewById(2131559486).setOnClickListener(new AboveVideoBottomView.16(this));
      this.mShareWebPopupWindow.setOutsideTouchable(true);
      this.mShareWebPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
      this.mShareWebPopupWindow.setWindowLayoutMode(-2, -2);
      this.mShareWebPopupWindow.showAtLocation(this.mActivity.getWindow().getDecorView(), 1, 0, 0);
      return;
      this.mShareWebPopupWindow = new PopupWindow((ViewGroup)this.mInflater.inflate(2130903211, null), -2, -2, true);
    }
  }
  
  private void showPopupWindow(int paramInt)
  {
    CustomRspMsgVo.ShowLink localShowLink;
    DisplayMetrics localDisplayMetrics;
    if ((this.mViewFlowData != null) && (this.mViewFlowData.get(paramInt) != null))
    {
      localShowLink = (CustomRspMsgVo.ShowLink)this.mViewFlowData.get(paramInt);
      localDisplayMetrics = new DisplayMetrics();
      this.mActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      if (this.mViewFlowPopupWindow == null)
      {
        this.mViewFlowPopupWindow = new PopupWindow();
        this.mViewFlowPopupWindow.setWidth(-1);
        this.mViewFlowPopupWindow.setHeight(-1);
        this.mViewFlowPopupWindow.setOutsideTouchable(true);
        this.mViewFlowPopupWindow.setFocusable(true);
        this.mViewFlowPopupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131493677)));
        this.mViewFlowPopupWindow.setAnimationStyle(2131296258);
      }
      if (!TextUtils.isEmpty(localShowLink.ImageClickUrl))
      {
        RelativeLayout localRelativeLayout = new RelativeLayout(this.mContext);
        MyWebView localMyWebView = new MyWebView(this.mContext);
        localRelativeLayout.addView(localMyWebView, new RelativeLayout.LayoutParams(-1, -1));
        ImageView localImageView = new ImageView(this.mContext);
        localImageView.setImageResource(2130838154);
        localImageView.setVisibility(4);
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        localLayoutParams.addRule(11);
        localImageView.setPadding(20, 20, 20, 20);
        localImageView.setOnClickListener(new AboveVideoBottomView.3(this));
        localMyWebView.setWebViewLoadListener(new AboveVideoBottomView.4(this, localImageView));
        localRelativeLayout.addView(localImageView, localLayoutParams);
        this.mViewFlowPopupWindow.setContentView(localRelativeLayout);
        localMyWebView.loadUrl(com.android.dazhihui.d.r.a(localShowLink.ImageClickUrl, "")[1]);
        if (!localShowLink.ShowType.equals("1")) {
          break label393;
        }
        if (getResources().getConfiguration().orientation != 1) {
          break label373;
        }
        this.mViewFlowPopupWindow.setHeight((int)(localDisplayMetrics.widthPixels / 1.53D));
        this.mViewFlowPopupWindow.showAtLocation(this, 80, 0, 0);
      }
    }
    label373:
    label393:
    while (!localShowLink.ShowType.equals("2")) {
      for (;;)
      {
        return;
        this.mViewFlowPopupWindow.setHeight((int)(localDisplayMetrics.widthPixels / 3.34D));
      }
    }
    this.mViewFlowPopupWindow.setHeight(-1);
    this.mViewFlowPopupWindow.showAtLocation(this, 17, 0, 0);
  }
  
  public void cancel()
  {
    if (this.mThumbUpAnimationView != null) {
      this.mThumbUpAnimationView.b();
    }
    if (this.mDanMuContainView != null) {
      this.mDanMuContainView.cancel();
    }
    if (this.giftView != null) {
      this.giftView.dismiss();
    }
    if ((this.mPopupWindow != null) && (this.mPopupWindow.isShowing())) {
      this.mPopupWindow.dismiss();
    }
    if ((this.mADVPopupWindow != null) && (this.mADVPopupWindow.isShowing())) {
      this.mADVPopupWindow.dismiss();
    }
    if ((this.mViewFlowPopupWindow != null) && (this.mViewFlowPopupWindow.isShowing())) {
      this.mViewFlowPopupWindow.dismiss();
    }
  }
  
  public String getDate(Long paramLong)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    long l1 = paramLong.longValue();
    l1 = System.currentTimeMillis() - l1;
    long l2 = Math.ceil((float)(l1 / 60L) / 1000.0F);
    long l3 = Math.ceil((float)(l1 / 60L / 60L) / 1000.0F);
    if (Math.ceil((float)(l1 / 24L / 60L / 60L) / 1000.0F) - 1L > 0L)
    {
      paramLong = new SimpleDateFormat("yyyy:MM:dd:HH:mm").format(new Date(paramLong.longValue())).split(":");
      localStringBuffer.append(paramLong[1] + "月");
      localStringBuffer.append(paramLong[2] + "日");
      localStringBuffer.append(paramLong[3] + ":" + paramLong[4]);
    }
    for (;;)
    {
      return localStringBuffer.toString();
      if (l3 - 1L > 0L)
      {
        if (l3 >= 24L) {
          localStringBuffer.append("1天前");
        } else {
          localStringBuffer.append(l3 + "小时前");
        }
      }
      else if (l2 - 1L > 0L)
      {
        if (l2 == 60L) {
          localStringBuffer.append("1小时前");
        } else {
          localStringBuffer.append(l2 + "分钟前");
        }
      }
      else {
        localStringBuffer.append("刚才");
      }
    }
  }
  
  public void init(MessageControl paramMessageControl)
  {
    this.mMsgListView.init(paramMessageControl);
    this.mDanMuContainView.init(paramMessageControl);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131559351: 
      this.mShowHandler.sendEmptyMessage(1);
      return;
    case 2131559332: 
      n.a("", 20238);
      showInputHideMenu(true);
      return;
    case 2131559336: 
      n.a("", 20271);
      this.mActivityHandler.sendEmptyMessage(294);
      return;
    case 2131559334: 
      showGift();
      return;
    case 2131559335: 
      openSharePopupwin();
      return;
    }
    n.a("", 20261);
    paramView = new Message();
    paramView.what = 297;
    if (getResources().getConfiguration().orientation == 1) {}
    for (paramView.arg1 = 2;; paramView.arg1 = 1)
    {
      this.mActivityHandler.sendMessage(paramView);
      return;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.mShowHandler.removeMessages(3);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void onSendThumbUp(int paramInt, boolean paramBoolean)
  {
    this.mThumbUpAnimationView.a(paramInt, paramBoolean);
  }
  
  public void openSharePopupwin()
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
    if (this.mSharePopMenuLayout == null) {
      initSharePopMenuLayout();
    }
    this.mPopupWindow.setContentView(this.mSharePopMenuLayout);
    this.mPopupWindow.setWidth(-1);
    this.mPopupWindow.setHeight(-2);
    this.mPopupWindow.showAtLocation(this, 81, 0, 0);
    this.mPopupWindow.update();
  }
  
  public void refreshChat()
  {
    this.mMsgListView.refreshChat();
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
    this.mMsgListView.setActivityHandler(paramHandler);
  }
  
  public void setLeftBottomData(List<CustomRspMsgVo.ShowLink> paramList)
  {
    this.mViewFlowData = paramList;
    int i;
    if ((this.mViewFlowData != null) && (this.mViewFlowData.size() > 0))
    {
      this.mViewFlow.setVisibility(0);
      if (this.mViewFlowAdapter != null) {
        this.mViewFlowAdapter.notifyDataSetChanged();
      }
      if ((this.mViewFlowData == null) || (this.mViewFlowData.size() <= 1)) {
        break label164;
      }
      paramList = new int[this.mViewFlowData.size()];
      i = 0;
      label80:
      if (i >= this.mViewFlowData.size()) {
        break label156;
      }
      if (((CustomRspMsgVo.ShowLink)this.mViewFlowData.get(i)).Duration <= 3) {
        break label165;
      }
    }
    label156:
    label164:
    label165:
    for (int j = ((CustomRspMsgVo.ShowLink)this.mViewFlowData.get(i)).Duration * 1000;; j = 3000)
    {
      paramList[i] = j;
      i += 1;
      break label80;
      this.mViewFlow.setVisibility(4);
      break;
      this.mViewFlow.a(paramList);
      return;
    }
  }
  
  public void setParent(AboveVideoContainView paramAboveVideoContainView)
  {
    this.mParent = paramAboveVideoContainView;
  }
  
  public void setRoomInfo(CustomRspMsgVo.RoomInfo paramRoomInfo)
  {
    this.mRoomInfo = paramRoomInfo;
    setmRoomImage(this.mRoomInfo.OwnerAccountImg);
  }
  
  public void setRotationBtVisible(int paramInt)
  {
    this.mSetRotation.setVisibility(paramInt);
    if (getResources().getConfiguration().orientation != 1)
    {
      Message localMessage = new Message();
      localMessage.what = 297;
      localMessage.arg1 = 1;
      this.mActivityHandler.sendMessage(localMessage);
    }
  }
  
  public void setmActivity(Activity paramActivity)
  {
    this.mActivity = paramActivity;
  }
  
  public void setmRoomImage(String paramString)
  {
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = "http://rebo.yundzh.com/wap/style/images/rebo.png";
    }
    this.mRoomImage = str;
    g.a().a(str, this.mImageLoadingListener);
  }
  
  public void sharePopWinItemSelected(int paramInt)
  {
    if ((this.mRoomInfo == null) || (TextUtils.isEmpty(this.mRoomInfo.OwnerIndexUrl)) || (this.mShareBitmap == null)) {
      return;
    }
    String str2 = getResources().getString(2131165267);
    String str1 = "我在" + str2 + "观看" + this.mRoomInfo.OwnerName + "的直播间——" + this.mRoomInfo.RoomTopic + "，小伙伴们快来围观吧！";
    Bitmap localBitmap = Bitmap.createScaledBitmap(this.mShareBitmap, this.mShareBitmap.getWidth() + 1, this.mShareBitmap.getHeight() + 1, false);
    str2 = "# 视吧直播 # 我在" + str2 + "观看" + this.mRoomInfo.OwnerName + "的直播间——" + this.mRoomInfo.RoomTopic + "，小伙伴们快来围观吧！ 点此下载 APP>> " + this.mRoomInfo.OwnerIndexUrl + " @ 大智慧官方";
    switch (paramInt)
    {
    default: 
      return;
    case 2131559220: 
      if (!bb.a(this.mContext, "com.tencent.mm"))
      {
        Toast.makeText(this.mContext, "请先安装微信", 0).show();
        return;
      }
    case 2131559222: 
      bb.a(this.mContext).a(str2, null);
      return;
    case 2131559221: 
      if (!bb.a(this.mContext, "com.tencent.mm"))
      {
        Toast.makeText(this.mContext, "请先安装微信", 0).show();
        return;
      }
      bb.a(this.mContext).a(str1, localBitmap, str1, this.mRoomInfo.OwnerIndexUrl + "&f=1", true);
      return;
      bb.a(this.mContext).a("【视吧直播】聪明人看的直播，拥有智慧，你也可以！", localBitmap, str1, this.mRoomInfo.OwnerIndexUrl + "&f=1", false);
      return;
    }
    openShareWebPopWindow();
  }
  
  public void showADV(CustomSysMsgVo.OwnerShowAdvertPushSys paramOwnerShowAdvertPushSys)
  {
    DisplayMetrics localDisplayMetrics;
    if (paramOwnerShowAdvertPushSys != null)
    {
      localDisplayMetrics = new DisplayMetrics();
      this.mActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      if (this.mADVPopupWindow == null)
      {
        this.mADVPopupWindow = new PopupWindow();
        this.mADVPopupWindow.setWidth(-1);
        this.mADVPopupWindow.setHeight(-1);
        this.mADVPopupWindow.setOutsideTouchable(false);
        this.mADVPopupWindow.setFocusable(true);
        this.mADVPopupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131493677)));
        this.mADVPopupWindow.setAnimationStyle(2131296258);
      }
      String str = paramOwnerShowAdvertPushSys.AdvertURL;
      if (!TextUtils.isEmpty(str))
      {
        this.mShowHandler.removeMessages(2);
        RelativeLayout localRelativeLayout = new RelativeLayout(this.mContext);
        MyWebView localMyWebView = new MyWebView(this.mContext);
        localRelativeLayout.addView(localMyWebView, new RelativeLayout.LayoutParams(-1, -1));
        ImageView localImageView = new ImageView(this.mContext);
        localImageView.setImageResource(2130838154);
        localImageView.setVisibility(4);
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        localLayoutParams.addRule(11);
        localImageView.setPadding(20, 20, 20, 20);
        localImageView.setOnClickListener(new AboveVideoBottomView.5(this));
        localMyWebView.setWebViewLoadListener(new AboveVideoBottomView.6(this, localImageView));
        localRelativeLayout.addView(localImageView, localLayoutParams);
        this.mADVPopupWindow.setContentView(localRelativeLayout);
        localMyWebView.loadUrl(str);
        if (!paramOwnerShowAdvertPushSys.ShowType.equals("1")) {
          break label398;
        }
        if (getResources().getConfiguration().orientation != 1) {
          break label378;
        }
        this.mADVPopupWindow.setHeight((int)(localDisplayMetrics.widthPixels / 1.53D));
        this.mADVPopupWindow.showAtLocation(this, 80, 0, 0);
      }
    }
    for (;;)
    {
      int j = paramOwnerShowAdvertPushSys.Duration;
      int i = j;
      if (j < 3) {
        i = 3;
      }
      this.mShowHandler.sendEmptyMessageDelayed(2, i * 1000);
      return;
      label378:
      this.mADVPopupWindow.setHeight((int)(localDisplayMetrics.widthPixels / 3.34D));
      break;
      label398:
      if (paramOwnerShowAdvertPushSys.ShowType.equals("2"))
      {
        this.mADVPopupWindow.setHeight(-1);
        this.mADVPopupWindow.showAtLocation(this, 17, 0, 0);
      }
    }
  }
  
  public void showGift()
  {
    n.a("", 20243);
    if (this.giftView == null)
    {
      this.giftView = new GiftView(this.mContext);
      this.giftView.setAnimationStyle(2131296258);
      this.giftView.setOnDismissListener(new AboveVideoBottomView.7(this));
      this.giftView.setHandler(this.mActivityHandler);
    }
    this.giftView.showAtLocation(this.mMenuBar, 80, 0, 0);
    this.mMenuBar.setVisibility(4);
  }
  
  public void showGongGao(CustomRspMsgVo.OwnerPublishRsp paramOwnerPublishRsp)
  {
    this.mShowHandler.removeMessages(1);
    this.mMsgGroupLayout.setVisibility(4);
    this.mGongGaoLayout.setVisibility(0);
    if (TextUtils.isEmpty(paramOwnerPublishRsp.PublishContent)) {
      this.mGongGaoUserMsg.setText("");
    }
    try
    {
      for (;;)
      {
        l = Long.parseLong(paramOwnerPublishRsp.PublishTimeStamp);
        if (l == -1L) {
          break;
        }
        this.mGongGaoUserTime.setVisibility(0);
        this.mGongGaoUserTime.setText(getDate(Long.valueOf(l)));
        if (TextUtils.isEmpty(this.mRoomInfo.OwnerAccountImg)) {
          break label218;
        }
        paramOwnerPublishRsp = new SimpleDateFormat("yyyyMMdd");
        paramOwnerPublishRsp = this.mRoomInfo.OwnerAccountImg + "?time=" + paramOwnerPublishRsp.format(new Date());
        r.a(getContext()).a(paramOwnerPublishRsp, this.mGongGaoUserImg, 2130838231);
        this.mShowHandler.sendEmptyMessageDelayed(1, this.mShowGongGaoTime);
        return;
        this.mGongGaoUserMsg.setText(paramOwnerPublishRsp.PublishContent);
      }
    }
    catch (Exception paramOwnerPublishRsp)
    {
      for (;;)
      {
        paramOwnerPublishRsp.printStackTrace();
        long l = -1L;
        continue;
        this.mGongGaoUserTime.setVisibility(8);
        continue;
        label218:
        this.mGongGaoUserImg.setImageResource(2130838231);
      }
    }
  }
  
  public boolean showInputHideMenu(boolean paramBoolean)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.mContext.getSystemService("input_method");
    if (paramBoolean)
    {
      this.mMenuBar.setVisibility(4);
      if ((this.mParent != null) && (getResources().getConfiguration().orientation == 1)) {
        this.mParent.setTopViewVisiable(8);
      }
      ChatInputView localChatInputView = new ChatInputView(this.mContext);
      if (!TextUtils.isEmpty(this.mEditTextString)) {
        localChatInputView.mInputEdit.setText(this.mEditTextString);
      }
      localChatInputView.mInputEdit.addTextChangedListener(new AboveVideoBottomView.8(this));
      localChatInputView.setActivityHandler(this.mActivityHandler);
      localChatInputView.setOnClickListener(new AboveVideoBottomView.9(this, localInputMethodManager));
      this.inputPopupWindow = new PopupWindow(this.mContext);
      this.inputPopupWindow.setContentView(localChatInputView);
      if (getResources().getConfiguration().orientation == 1)
      {
        this.inputPopupWindow.setWidth(-1);
        this.inputPopupWindow.setHeight(-1);
        localChatInputView.setMaxHeight(getHeight());
      }
      for (;;)
      {
        this.inputPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
        this.inputPopupWindow.setOutsideTouchable(true);
        this.inputPopupWindow.setFocusable(true);
        this.inputPopupWindow.setOnDismissListener(new AboveVideoBottomView.10(this));
        this.inputPopupWindow.setInputMethodMode(1);
        this.inputPopupWindow.setSoftInputMode(16);
        localChatInputView.mInputEdit.setFocusable(true);
        localChatInputView.mInputEdit.requestFocus();
        localChatInputView.setOnSizeChange(new AboveVideoBottomView.11(this, localChatInputView));
        localInputMethodManager.toggleSoftInput(1, 1);
        this.inputPopupWindow.showAtLocation(this.mMenuBar, 80, 0, 0);
        return true;
        localChatInputView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        localChatInputView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.inputPopupWindow.setWidth(-1);
        this.inputPopupWindow.setHeight(localChatInputView.getMeasuredHeight());
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, getMeasuredHeight() - localChatInputView.getMeasuredHeight());
        localLayoutParams.addRule(10);
        setLayoutParams(localLayoutParams);
      }
    }
    if ((this.inputPopupWindow != null) && (this.inputPopupWindow.isShowing()))
    {
      if ((this.mParent != null) && (getResources().getConfiguration().orientation == 1)) {
        this.mParent.setTopViewVisiable(0);
      }
      this.inputPopupWindow.dismiss();
      return true;
    }
    return false;
  }
  
  public void showNoticeOrViewpoint(CustomRspMsgVo.OwnerPublishRsp paramOwnerPublishRsp)
  {
    if ((paramOwnerPublishRsp != null) && (this.mRoomInfo != null))
    {
      ChatEntity localChatEntity = new ChatEntity(ChatEntity.ChatGuestType.CHAT_TEXT);
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
      localChatEntity.userImg = (this.mRoomInfo.OwnerAccountImg + "?time=" + localSimpleDateFormat.format(new Date()));
      localChatEntity.event = paramOwnerPublishRsp.PublishContent;
      if (paramOwnerPublishRsp.Duration > 0) {
        this.mShowGongGaoTime = (paramOwnerPublishRsp.Duration * 1000);
      }
      showGongGao(paramOwnerPublishRsp);
    }
  }
  
  public void showZhuBoMsg(ChatEntity paramChatEntity)
  {
    this.mZhuBoMsgLayout.setVisibility(0);
    this.mShowHandler.removeMessages(0);
    if (TextUtils.isEmpty(paramChatEntity.event))
    {
      this.mZhuBoMsgUserMsg.setText("");
      if (TextUtils.isEmpty(paramChatEntity.userImg)) {
        break label141;
      }
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
      paramChatEntity = paramChatEntity.userImg + "?time=" + localSimpleDateFormat.format(new Date());
      r.a(getContext()).a(paramChatEntity, this.mZhuBoMsgUserImg, 2130838231);
    }
    for (;;)
    {
      this.mShowHandler.sendEmptyMessageDelayed(0, this.mShowTime);
      return;
      this.mZhuBoMsgUserMsg.setText(paramChatEntity.event);
      break;
      label141:
      this.mZhuBoMsgUserImg.setImageResource(2130838231);
    }
  }
  
  public void start() {}
  
  public void updateView(Configuration paramConfiguration)
  {
    int i = getResources().getDimensionPixelOffset(2131230844);
    if (paramConfiguration.orientation == 1)
    {
      this.mEmptyView.setVisibility(8);
      paramConfiguration = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelOffset(2131230942));
      paramConfiguration.addRule(2, this.mMenuBar.getId());
      this.mMsgGroupLayout.setLayoutParams(paramConfiguration);
      ((LinearLayout.LayoutParams)this.mMsgLayout.getLayoutParams()).weight = 0.8F;
      paramConfiguration = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelOffset(2131230942));
      paramConfiguration.addRule(2, this.mMenuBar.getId());
      paramConfiguration.leftMargin = i;
      paramConfiguration.rightMargin = i;
      paramConfiguration.bottomMargin = i;
      this.mGongGaoLayout.setLayoutParams(paramConfiguration);
      this.mSetRotation.setImageResource(2130838145);
    }
    for (;;)
    {
      if ((this.mPopupWindow != null) && (this.mPopupWindow.isShowing())) {
        this.mPopupWindow.dismiss();
      }
      if ((this.mADVPopupWindow != null) && (this.mADVPopupWindow.isShowing())) {
        this.mADVPopupWindow.dismiss();
      }
      if ((this.mViewFlowPopupWindow != null) && (this.mViewFlowPopupWindow.isShowing())) {
        this.mViewFlowPopupWindow.dismiss();
      }
      return;
      this.mEmptyView.setVisibility(4);
      paramConfiguration = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelOffset(2131230941));
      paramConfiguration.addRule(12);
      this.mMsgGroupLayout.setLayoutParams(paramConfiguration);
      ((LinearLayout.LayoutParams)this.mMsgLayout.getLayoutParams()).weight = 0.2F;
      paramConfiguration = new DisplayMetrics();
      this.mActivity.getWindowManager().getDefaultDisplay().getMetrics(paramConfiguration);
      paramConfiguration = new RelativeLayout.LayoutParams(paramConfiguration.widthPixels / 2 - i * 2, getResources().getDimensionPixelOffset(2131230942));
      paramConfiguration.addRule(12);
      paramConfiguration.leftMargin = i;
      paramConfiguration.rightMargin = i;
      paramConfiguration.bottomMargin = i;
      this.mGongGaoLayout.setLayoutParams(paramConfiguration);
      this.mSetRotation.setImageResource(2130838149);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoBottomView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */