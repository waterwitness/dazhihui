package com.tencent.avsdkhost.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
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
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Scroller;
import android.widget.SeekBar;
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
import com.tencent.av.sdk.AVAudioCtrl;
import com.tencent.av.sdk.AVContext;
import com.tencent.avsdk.CircularImageButton;
import com.tencent.avsdk.IlvbDataBase;
import com.tencent.avsdk.Model.CustomRspMsgVo.OwnerPublishRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomInfo;
import com.tencent.avsdk.Model.CustomRspMsgVo.ShowLink;
import com.tencent.avsdk.Model.CustomSysMsgVo.OwnerShowAdvertPushSys;
import com.tencent.avsdk.control.QavsdkControl;
import com.tencent.avsdk.widget.CarAnimation;
import com.tencent.avsdk.widget.FireworksAnimation;
import com.tencent.avsdk.widget.GiftView;
import com.tencent.avsdk.widget.IlvbGifView;
import com.tencent.avsdk.widget.TwoFlowerView;
import com.tencent.avsdk.widget.YachtAnimation;
import com.tencent.avsdkhost.ChatEntityHost;
import com.tencent.avsdkhost.ChatEntityHost.ChatHostType;
import com.tencent.avsdkhost.activity.IlvbRedEnvelopeHost;
import com.tencent.avsdkhost.control.MessageControlHost;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AboveVideoBottomViewHost
  extends RelativeLayout
  implements View.OnClickListener
{
  public CarAnimation carAnimation;
  public FireworksAnimation fireworksAnimation;
  public TwoFlowerView flowerView;
  public IlvbGifView gifView;
  public GiftView giftView;
  PopupWindow inputPopupWindow;
  private PopupWindow mADVPopupWindow;
  private Activity mActivity;
  private Handler mActivityHandler;
  private PopupWindow mBeautyPopupWindow;
  private boolean mChecked = false;
  private Context mContext;
  private DanMuContainViewHost mDanMuContainView;
  private String mEditTextString = "";
  private View mGongGaoLayout;
  private CircularImageButton mGongGaoUserImg;
  private TextView mGongGaoUserMsg;
  private TextView mGongGaoUserTime;
  a mImageLoadingListener = new AboveVideoBottomViewHost.12(this);
  private LayoutInflater mInflater;
  private boolean mIsPushing = false;
  private boolean mIsRecording = false;
  private View mMenuBar;
  private ImageView mMoreMenu;
  private PopupWindow mMoreMenuPopupWindow;
  private View mMsgGroupLayout;
  private View mMsgLayout;
  private ChatListViewHost mMsgListView;
  AboveVideoContainViewHost mParent;
  private PopupWindow mPopupWindow;
  private ViewGroup mPushMenu;
  private QavsdkControl mQavsdkControl;
  private ViewGroup mRecordMenu;
  private String mRoomImage;
  private CustomRspMsgVo.RoomInfo mRoomInfo;
  private View mRoomShareMask;
  private int mRotation = 0;
  private Scroller mScroller;
  private ImageView mSetRotation;
  private Bitmap mShareBitmap = null;
  private View.OnClickListener mShareMenuClickListener = new AboveVideoBottomViewHost.11(this);
  private View mSharePopMenuLayout;
  private PopupWindow mShareWebPopupWindow = null;
  private int mShowGongGaoTime = 20000;
  private Handler mShowHandler = new Handler(new AboveVideoBottomViewHost.10(this));
  private int mShowTime = 10000;
  private ThumbUpAnimationView mThumbUpAnimationView;
  private View mUnreadChatView;
  private ViewFlow mViewFlow;
  private AboveVideoBottomViewHost.ViewFlowAdapter mViewFlowAdapter;
  private List<CustomRspMsgVo.ShowLink> mViewFlowData;
  private PopupWindow mViewFlowPopupWindow;
  private ImageView mVoiceImage;
  private View mZhuBoMsgLayout;
  private CircularImageButton mZhuBoMsgUserImg;
  private TextView mZhuBoMsgUserMsg;
  private long moreShowingTime = -1L;
  TextView voiceText;
  public YachtAnimation yachtAnimation;
  
  public AboveVideoBottomViewHost(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AboveVideoBottomViewHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AboveVideoBottomViewHost(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mScroller = new Scroller(paramContext, new LinearInterpolator());
    this.mInflater.inflate(2130903185, this);
    this.mThumbUpAnimationView = ((ThumbUpAnimationView)findViewById(2131559353));
    this.flowerView = ((TwoFlowerView)findViewById(2131559354));
    this.gifView = ((IlvbGifView)findViewById(2131559355));
    this.mSetRotation = ((ImageView)findViewById(2131559333));
    this.fireworksAnimation = ((FireworksAnimation)findViewById(2131559356));
    this.carAnimation = ((CarAnimation)findViewById(2131559357));
    this.yachtAnimation = ((YachtAnimation)findViewById(2131559358));
    this.mMsgLayout = findViewById(2131559339);
    this.mRoomShareMask = findViewById(2131559403);
    this.mRoomShareMask.setOnClickListener(this);
    if (IlvbDataBase.getInstance().getBoolean("ilvb_host_notify_share_mask", true)) {
      this.mRoomShareMask.setVisibility(0);
    }
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
    this.mViewFlow.setOnItemClickListener(new AboveVideoBottomViewHost.1(this));
    this.mViewFlowAdapter = new AboveVideoBottomViewHost.ViewFlowAdapter(this, paramContext);
    this.mViewFlow.setAdapter(this.mViewFlowAdapter);
    this.mMoreMenu = ((ImageView)findViewById(2131559401));
    findViewById(2131559332).setOnClickListener(this);
    findViewById(2131559334).setOnClickListener(this);
    findViewById(2131559335).setOnClickListener(this);
    findViewById(2131559401).setOnClickListener(this);
    findViewById(2131559402).setOnClickListener(this);
    findViewById(2131559336).setOnClickListener(this);
    this.mMenuBar = findViewById(2131559329);
    this.mMsgListView = ((ChatListViewHost)findViewById(2131559346));
    this.mUnreadChatView = findViewById(2131559343);
    this.mMsgListView.setUnreadView(this.mUnreadChatView);
    this.mDanMuContainView = ((DanMuContainViewHost)findViewById(2131559352));
    if (!g.a().b())
    {
      paramContext = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(h.b).b();
      g.a().a(paramContext);
    }
    this.mQavsdkControl = QavsdkControl.getInstance();
  }
  
  public static float getBeautyProgress(int paramInt)
  {
    return 9.0F * paramInt / 100.0F;
  }
  
  private void initPopupWindow()
  {
    this.mPopupWindow = new PopupWindow();
    this.mPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
    this.mPopupWindow.setFocusable(true);
    this.mPopupWindow.setOutsideTouchable(true);
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
      this.mShareWebPopupWindow.getContentView().findViewById(2131559485).setOnClickListener(new AboveVideoBottomViewHost.13(this));
      this.mShareWebPopupWindow.getContentView().findViewById(2131559486).setOnClickListener(new AboveVideoBottomViewHost.14(this));
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
    if ((this.mViewFlowData != null) && (this.mViewFlowData.get(paramInt) != null))
    {
      localShowLink = (CustomRspMsgVo.ShowLink)this.mViewFlowData.get(paramInt);
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      this.mActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      if (this.mViewFlowPopupWindow == null)
      {
        this.mViewFlowPopupWindow = new PopupWindow();
        this.mViewFlowPopupWindow.setWidth(-1);
        this.mViewFlowPopupWindow.setHeight(-1);
        this.mViewFlowPopupWindow.setOutsideTouchable(true);
        this.mViewFlowPopupWindow.setFocusable(true);
        this.mViewFlowPopupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(17170445)));
      }
      if (!TextUtils.isEmpty(localShowLink.ImageClickUrl))
      {
        RelativeLayout localRelativeLayout = new RelativeLayout(this.mContext);
        MyWebView localMyWebView = new MyWebView(this.mContext);
        localRelativeLayout.addView(localMyWebView, new RelativeLayout.LayoutParams(-1, -1));
        ImageView localImageView = new ImageView(this.mContext);
        localImageView.setImageResource(2130838154);
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        localLayoutParams.addRule(11);
        localImageView.setPadding(20, 20, 20, 20);
        localImageView.setOnClickListener(new AboveVideoBottomViewHost.2(this));
        localRelativeLayout.addView(localImageView, localLayoutParams);
        this.mViewFlowPopupWindow.setContentView(localRelativeLayout);
        localMyWebView.loadUrl(com.android.dazhihui.d.r.a(localShowLink.ImageClickUrl, "")[1]);
        if (!localShowLink.ShowType.equals("1")) {
          break label328;
        }
        this.mViewFlowPopupWindow.setHeight((int)(localDisplayMetrics.widthPixels / 1.53D));
        this.mViewFlowPopupWindow.showAtLocation(this, 80, 0, 0);
      }
    }
    label328:
    while (!localShowLink.ShowType.equals("2")) {
      return;
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
  
  public void init(MessageControlHost paramMessageControlHost)
  {
    this.mMsgListView.init(paramMessageControlHost);
    this.mDanMuContainView.init(paramMessageControlHost);
  }
  
  public void onClick(View paramView)
  {
    boolean bool2 = true;
    boolean bool1 = true;
    label219:
    label354:
    Object localObject;
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131559476: 
      if (!this.mIsRecording)
      {
        bool1 = true;
        this.mIsRecording = bool1;
        if (!this.mIsRecording) {
          break label219;
        }
        ((TextView)this.mRecordMenu.findViewById(2131559478)).setText("停止录制");
        ((ImageView)this.mRecordMenu.findViewById(2131559477)).setImageResource(2130838223);
        this.mActivityHandler.sendEmptyMessage(311);
      }
      for (;;)
      {
        this.mMoreMenuPopupWindow.dismiss();
        return;
        bool1 = false;
        break;
        ((TextView)this.mRecordMenu.findViewById(2131559478)).setText("启动录制");
        ((ImageView)this.mRecordMenu.findViewById(2131559477)).setImageResource(2130838222);
        this.mActivityHandler.sendEmptyMessage(312);
      }
    case 2131559479: 
      if (!this.mIsPushing)
      {
        this.mIsPushing = bool1;
        if (!this.mIsPushing) {
          break label354;
        }
        ((TextView)this.mPushMenu.findViewById(2131559481)).setText("停止推流");
        ((ImageView)this.mPushMenu.findViewById(2131559480)).setImageResource(2130838223);
        this.mActivityHandler.sendEmptyMessage(313);
      }
      for (;;)
      {
        this.mMoreMenuPopupWindow.dismiss();
        return;
        bool1 = false;
        break;
        ((TextView)this.mPushMenu.findViewById(2131559481)).setText("开启推流");
        ((ImageView)this.mPushMenu.findViewById(2131559480)).setImageResource(2130838222);
        this.mActivityHandler.sendEmptyMessage(314);
      }
    case 2131559403: 
      this.mRoomShareMask.setVisibility(8);
      openSharePopupwin();
      IlvbDataBase.getInstance().putBoolean("ilvb_host_notify_share_mask", false);
      return;
    case 2131559401: 
      long l = System.currentTimeMillis();
      if ((this.mMoreMenuPopupWindow != null) && (l - this.moreShowingTime <= 100L))
      {
        this.mMoreMenuPopupWindow.dismiss();
        return;
      }
      if (this.mMoreMenuPopupWindow == null)
      {
        localObject = LayoutInflater.from(getContext()).inflate(2130903209, null, false);
        ((View)localObject).findViewById(2131559475).setOnClickListener(this);
        ((View)localObject).findViewById(2131559474).setOnClickListener(this);
        ((View)localObject).findViewById(2131559471).setOnClickListener(this);
        ((View)localObject).findViewById(2131559476).setOnClickListener(this);
        ((View)localObject).findViewById(2131559479).setOnClickListener(this);
        this.voiceText = ((TextView)((View)localObject).findViewById(2131559473));
        this.mVoiceImage = ((ImageView)((View)localObject).findViewById(2131559472));
        this.mRecordMenu = ((ViewGroup)((View)localObject).findViewById(2131559476));
        this.mPushMenu = ((ViewGroup)((View)localObject).findViewById(2131559479));
        GradientDrawable localGradientDrawable = new GradientDrawable();
        localGradientDrawable.setCornerRadius(20.0F);
        localGradientDrawable.setColor(-1576971);
        ((View)localObject).setBackgroundDrawable(localGradientDrawable);
        this.mMoreMenuPopupWindow = new PopupWindow(getContext());
        this.mMoreMenuPopupWindow.setContentView((View)localObject);
        this.mMoreMenuPopupWindow.setOutsideTouchable(true);
        this.mMoreMenuPopupWindow.setTouchable(true);
        this.mMoreMenuPopupWindow.setHeight(-2);
        this.mMoreMenuPopupWindow.setWidth(-2);
        this.mMoreMenuPopupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(17170445)));
        this.mMoreMenuPopupWindow.setOnDismissListener(new AboveVideoBottomViewHost.3(this));
      }
      localObject = new int[2];
      paramView.getLocationOnScreen((int[])localObject);
      int i = getResources().getDimensionPixelSize(2131230787);
      this.mMoreMenuPopupWindow.showAtLocation(paramView, 0, localObject[0], localObject[1] - i);
      this.mMoreMenu.setImageResource(2130838184);
      this.moreShowingTime = System.currentTimeMillis();
      return;
    case 2131559471: 
      paramView = this.mQavsdkControl.getAVContext();
      if (paramView != null)
      {
        paramView = paramView.getAudioCtrl();
        if (paramView != null)
        {
          if (!this.mChecked) {
            break label856;
          }
          this.voiceText.setText("静音");
          paramView.enableMic(true);
          this.mVoiceImage.setImageResource(2130838222);
          if (this.mChecked) {
            break label885;
          }
        }
      }
      for (bool1 = bool2;; bool1 = false)
      {
        this.mChecked = bool1;
        this.mMoreMenuPopupWindow.dismiss();
        return;
        paramView.enableMic(false);
        this.voiceText.setText("开声音");
        this.mVoiceImage.setImageResource(2130838223);
        break;
      }
    case 2131559412: 
      this.mBeautyPopupWindow.dismiss();
      return;
    case 2131559402: 
      Log.i("ilvb", "onLineNumber=" + MessageControlHost.getInstance().onLineNumber);
      IlvbRedEnvelopeHost.onStart(this.mContext, MessageControlHost.getInstance().onLineNumber);
      return;
    case 2131559475: 
      this.mMoreMenuPopupWindow.dismiss();
      if (this.mBeautyPopupWindow == null)
      {
        paramView = LayoutInflater.from(getContext()).inflate(2130903188, null, false);
        paramView.findViewById(2131559412).setOnClickListener(this);
        localObject = (SeekBar)paramView.findViewById(2131559411);
        ((SeekBar)localObject).setOnSeekBarChangeListener(new AboveVideoBottomViewHost.4(this));
        ((SeekBar)localObject).setProgress(30);
        this.mBeautyPopupWindow = new PopupWindow(getContext());
        this.mBeautyPopupWindow.setContentView(paramView);
        this.mBeautyPopupWindow.setOutsideTouchable(true);
        this.mBeautyPopupWindow.setTouchable(true);
        this.mBeautyPopupWindow.setHeight(-2);
        this.mBeautyPopupWindow.setWidth(-2);
        this.mBeautyPopupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(17170445)));
      }
      this.mBeautyPopupWindow.showAtLocation(getRootView(), 17, 0, 0);
      return;
    case 2131559474: 
      this.mMoreMenuPopupWindow.dismiss();
      this.mActivityHandler.sendEmptyMessage(316);
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
      label856:
      label885:
      n.a("", 20243);
      showGift();
      return;
    }
    openSharePopupwin();
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
  
  public void setRoomInfo(CustomRspMsgVo.RoomInfo paramRoomInfo)
  {
    this.mRoomInfo = paramRoomInfo;
    setmRoomImage(this.mRoomInfo.OwnerAccountImg);
  }
  
  public void setRotationBtVisible(int paramInt) {}
  
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
    String str1 = this.mRoomInfo.OwnerName + "在" + str2 + "开播啦，" + "小伙伴们快来围观我的直播间吧！";
    Bitmap localBitmap = Bitmap.createScaledBitmap(this.mShareBitmap, this.mShareBitmap.getWidth() + 1, this.mShareBitmap.getHeight() + 1, false);
    str2 = "# 视吧直播 # " + this.mRoomInfo.OwnerName + "在" + str2 + "开播啦，" + "小伙伴们快来围观我的直播间吧！ 点此下载 APP>> " + this.mRoomInfo.OwnerIndexUrl + " @ 大智慧官方";
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
    int i = 3;
    int j;
    if (paramOwnerShowAdvertPushSys != null)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      this.mActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      if (this.mADVPopupWindow == null)
      {
        this.mADVPopupWindow = new PopupWindow();
        this.mADVPopupWindow.setWidth(-1);
        this.mADVPopupWindow.setHeight(-1);
        this.mADVPopupWindow.setOutsideTouchable(false);
        this.mADVPopupWindow.setFocusable(true);
        this.mADVPopupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(17170445)));
      }
      String str = paramOwnerShowAdvertPushSys.AdvertURL;
      if (!TextUtils.isEmpty(str))
      {
        this.mShowHandler.removeMessages(2);
        MyWebView localMyWebView = new MyWebView(this.mContext);
        this.mADVPopupWindow.setContentView(localMyWebView);
        localMyWebView.loadUrl(str);
        if (!paramOwnerShowAdvertPushSys.ShowType.equals("1")) {
          break label224;
        }
        this.mADVPopupWindow.setHeight((int)(localDisplayMetrics.widthPixels / 1.53D));
        this.mADVPopupWindow.showAtLocation(this, 80, 0, 0);
        j = paramOwnerShowAdvertPushSys.Duration;
        if (j >= 3) {
          break label260;
        }
      }
    }
    for (;;)
    {
      this.mShowHandler.sendEmptyMessageDelayed(2, i * 1000);
      return;
      label224:
      if (!paramOwnerShowAdvertPushSys.ShowType.equals("2")) {
        break;
      }
      this.mADVPopupWindow.setHeight(-1);
      this.mADVPopupWindow.showAtLocation(this, 17, 0, 0);
      break;
      label260:
      i = j;
    }
  }
  
  public void showGift()
  {
    if (this.giftView == null)
    {
      this.giftView = new GiftView(this.mContext);
      this.giftView.setOnDismissListener(new AboveVideoBottomViewHost.5(this));
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
      ChatInputViewHost localChatInputViewHost = new ChatInputViewHost(this.mContext);
      if (!TextUtils.isEmpty(this.mEditTextString)) {
        localChatInputViewHost.mInputEdit.setText(this.mEditTextString);
      }
      localChatInputViewHost.mInputEdit.addTextChangedListener(new AboveVideoBottomViewHost.6(this));
      localChatInputViewHost.setActivityHandler(this.mActivityHandler);
      localChatInputViewHost.setOnClickListener(new AboveVideoBottomViewHost.7(this, localInputMethodManager));
      this.inputPopupWindow = new PopupWindow(this.mContext);
      this.inputPopupWindow.setContentView(localChatInputViewHost);
      if (getResources().getConfiguration().orientation == 1)
      {
        this.inputPopupWindow.setWidth(-1);
        this.inputPopupWindow.setHeight(-1);
        localChatInputViewHost.setMaxHeight(getHeight());
      }
      for (;;)
      {
        this.inputPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
        this.inputPopupWindow.setOutsideTouchable(true);
        this.inputPopupWindow.setFocusable(true);
        this.inputPopupWindow.setOnDismissListener(new AboveVideoBottomViewHost.8(this));
        this.inputPopupWindow.setInputMethodMode(1);
        this.inputPopupWindow.setSoftInputMode(16);
        localChatInputViewHost.mInputEdit.setFocusable(true);
        localChatInputViewHost.mInputEdit.requestFocus();
        localChatInputViewHost.setOnSizeChange(new AboveVideoBottomViewHost.9(this));
        localInputMethodManager.toggleSoftInput(1, 1);
        this.inputPopupWindow.showAtLocation(this.mMenuBar, 80, 0, 0);
        return true;
        localChatInputViewHost.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        localChatInputViewHost.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.inputPopupWindow.setWidth(-1);
        this.inputPopupWindow.setHeight(localChatInputViewHost.getMeasuredHeight());
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, getMeasuredHeight() - localChatInputViewHost.getMeasuredHeight());
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
      ChatEntityHost localChatEntityHost = new ChatEntityHost(ChatEntityHost.ChatHostType.CHAT_TEXT);
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
      localChatEntityHost.userImg = (this.mRoomInfo.OwnerAccountImg + "?time=" + localSimpleDateFormat.format(new Date()));
      localChatEntityHost.event = paramOwnerPublishRsp.PublishContent;
      if (paramOwnerPublishRsp.Duration > 0) {
        this.mShowGongGaoTime = (paramOwnerPublishRsp.Duration * 1000);
      }
      showGongGao(paramOwnerPublishRsp);
    }
  }
  
  public void showZhuBoMsg(ChatEntityHost paramChatEntityHost)
  {
    this.mZhuBoMsgLayout.setVisibility(0);
    this.mShowHandler.removeMessages(0);
    if (TextUtils.isEmpty(paramChatEntityHost.event))
    {
      this.mZhuBoMsgUserMsg.setText("");
      if (TextUtils.isEmpty(paramChatEntityHost.userImg)) {
        break label141;
      }
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
      paramChatEntityHost = paramChatEntityHost.userImg + "?time=" + localSimpleDateFormat.format(new Date());
      r.a(getContext()).a(paramChatEntityHost, this.mZhuBoMsgUserImg, 2130838231);
    }
    for (;;)
    {
      this.mShowHandler.sendEmptyMessageDelayed(0, this.mShowTime);
      return;
      this.mZhuBoMsgUserMsg.setText(paramChatEntityHost.event);
      break;
      label141:
      this.mZhuBoMsgUserImg.setImageResource(2130838231);
    }
  }
  
  public void start() {}
  
  public void updateView(Configuration paramConfiguration) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\AboveVideoBottomViewHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */