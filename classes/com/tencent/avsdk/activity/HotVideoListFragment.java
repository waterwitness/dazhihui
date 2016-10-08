package com.tencent.avsdk.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.df;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.data;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.header;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.topConfig;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.i;
import com.android.dazhihui.ui.screen.stock.uc;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.CircleImageView;
import com.android.dazhihui.ui.widget.DzhMainHeader;
import com.android.dazhihui.ui.widget.ScrollPeakRelativeLayout;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.d;
import com.android.dazhihui.w;
import com.c.a.k;
import com.tencent.avsdk.widget.MyGallery;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class HotVideoListFragment
  extends com.android.dazhihui.ui.screen.a
  implements d
{
  public static final int ILVB_ROOM_LIST_TYPE_ACTIVITYPAGE = 3;
  public static final int ILVB_ROOM_LIST_TYPE_ATTENTION = 1;
  public static final int ILVB_ROOM_LIST_TYPE_BROWSER = 4;
  public static final int ILVB_ROOM_LIST_TYPE_GENERAL = 0;
  public static final int ILVB_ROOM_LIST_TYPE_HONGBAO = 5;
  public static final int ILVB_ROOM_LIST_TYPE_MORE = 6;
  public static final int ILVB_ROOM_LIST_TYPE_NEW = 7;
  public static final int ILVB_ROOM_LIST_TYPE_VIEWSPAGE = 2;
  private AdvertView advertView137;
  private com.android.dazhihui.a.b.f cameraConfigRequest;
  private int currentIndex = 0;
  private ImageView hongbao;
  private com.android.dazhihui.a.b.f leftMenuRequest;
  private com.android.dazhihui.a.b.f liveBarConfigRequest;
  private boolean mComplete;
  private Runnable mDelayFreshComplete = new HotVideoListFragment.1(this);
  private DzhMainHeader mDzhHeader;
  private MyGallery mGallery;
  private HotVideoListFragment.GalleryAdapter mGalleryAdapter;
  private b mILoginListener;
  private LivebarConfigVo mLivebarConfigVo;
  private HotVideoListFragment.ViwePageAdapter mPageAdapter;
  private df mPageChangListener = new HotVideoListFragment.2(this);
  private LoadAndRefreshView mRefreshView;
  private View mRootView;
  private ScrollPeakRelativeLayout mScrollPeakRelativeLayout;
  private List<LivebarConfigVo.topConfig> mTopLiveConfig;
  private CircleImageView mZbImageView;
  private ViewPager myViewPager;
  private com.android.dazhihui.a.b.f stockMenuRequest;
  private View topAdv;
  private ImageView woyaobo_iv;
  private View zhezhao;
  
  public HotVideoListFragment()
  {
    initConfig();
    initCameraConfig();
    initMeConfig();
  }
  
  private void getUserImageUrl()
  {
    if (w.a().l())
    {
      String str = n.z(w.a().f());
      str = String.format(com.android.dazhihui.a.f.k, new Object[] { str });
      w.a().a(str);
    }
  }
  
  private void initMeConfig()
  {
    LeftMenuVo localLeftMenuVo = (LeftMenuVo)DzhApplication.a().b().a("LeftMenuJson", new HotVideoListFragment.15(this));
    m.a().a(localLeftMenuVo);
    if ((localLeftMenuVo == null) || (!localLeftMenuVo.isSameDay()))
    {
      this.leftMenuRequest = new com.android.dazhihui.a.b.f();
      this.leftMenuRequest.c(com.android.dazhihui.a.f.f);
      registRequestListener(this.leftMenuRequest);
      sendRequest(this.leftMenuRequest);
    }
  }
  
  public void changeLookFace(y paramy)
  {
    if (this.mDzhHeader != null) {
      this.mDzhHeader.a();
    }
  }
  
  public int getHeaderHeight()
  {
    return this.topAdv.getHeight();
  }
  
  public int getHeaderHidden()
  {
    return -this.mScrollPeakRelativeLayout.getScrollY();
  }
  
  public boolean getMyHongBaoShow()
  {
    return this.hongbao.getVisibility() == 0;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    try
    {
      if (paramh == this.liveBarConfigRequest)
      {
        paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
        this.mLivebarConfigVo = ((LivebarConfigVo)new k().a(paramh, LivebarConfigVo.class));
        paramh = this.mLivebarConfigVo.getData();
        if (paramh != null)
        {
          this.mLivebarConfigVo.setTime(System.currentTimeMillis());
          this.mTopLiveConfig = paramh.getTopConfig();
          if (this.mTopLiveConfig != null)
          {
            m.a().a(this.mLivebarConfigVo);
            DzhApplication.a().b().a("liveBarconfig", this.mLivebarConfigVo);
            initData();
          }
        }
      }
      else
      {
        if (paramh == this.leftMenuRequest)
        {
          paramj = new String(((com.android.dazhihui.a.b.g)paramj).a());
          try
          {
            paramh = new LeftMenuVo();
            paramh.decode(paramj);
            paramj = m.a().J();
            if ((paramj != null) && (paramj.getVersion().equals(paramh.getVersion()))) {
              break label316;
            }
            m.a().a(paramh);
            DzhApplication.a().b().a("LeftMenuJson", paramh);
            return;
          }
          catch (JSONException paramh)
          {
            paramh.printStackTrace();
            return;
          }
        }
        if (paramh == this.cameraConfigRequest)
        {
          paramj = new String(((com.android.dazhihui.a.b.g)paramj).a());
          try
          {
            paramh = new uc();
            paramj = new JSONObject(paramj).getJSONObject("data");
            String str = paramj.getString("notice");
            int i = paramj.getInt("HResolution");
            int j = paramj.getInt("VResolution");
            int k = paramj.getInt("FrameRate");
            paramh.a = str;
            paramh.b = i;
            paramh.c = j;
            paramh.d = k;
            m.a().a(paramh);
            return;
          }
          catch (Exception paramh)
          {
            paramh.printStackTrace();
          }
        }
      }
      label316:
      return;
    }
    catch (Exception paramh) {}
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  public void initCameraConfig()
  {
    if (m.a().M() == null)
    {
      this.cameraConfigRequest = new com.android.dazhihui.a.b.f();
      this.cameraConfigRequest.c(com.android.dazhihui.a.f.w);
      registRequestListener(this.cameraConfigRequest);
      sendRequest(this.cameraConfigRequest);
      m.a().a(new uc());
    }
  }
  
  public void initConfig()
  {
    this.mLivebarConfigVo = ((LivebarConfigVo)DzhApplication.a().b().a("liveBarconfig", new HotVideoListFragment.14(this)));
    if ((this.mLivebarConfigVo == null) || (!this.mLivebarConfigVo.isSameDay()))
    {
      this.liveBarConfigRequest = new com.android.dazhihui.a.b.f();
      this.liveBarConfigRequest.c(com.android.dazhihui.a.f.i);
      registRequestListener(this.liveBarConfigRequest);
      sendRequest(this.liveBarConfigRequest);
      return;
    }
    m.a().a(this.mLivebarConfigVo);
    this.mTopLiveConfig = this.mLivebarConfigVo.getData().getTopConfig();
  }
  
  public void initData()
  {
    getUserImageUrl();
    this.mLivebarConfigVo = m.a().g();
    if (this.mLivebarConfigVo == null) {
      this.mLivebarConfigVo = ((LivebarConfigVo)DzhApplication.a().b().a("liveBarconfig", new HotVideoListFragment.12(this)));
    }
    if (this.mLivebarConfigVo == null) {
      initConfig();
    }
    while (this.mTopLiveConfig == null)
    {
      return;
      m.a().a(this.mLivebarConfigVo);
      this.mTopLiveConfig = this.mLivebarConfigVo.getData().getTopConfig();
    }
    int i = 0;
    int j = -1;
    while (i < this.mTopLiveConfig.size())
    {
      localObject = (LivebarConfigVo.topConfig)this.mTopLiveConfig.get(i);
      if (((LivebarConfigVo.topConfig)localObject).getsName().equals("更多")) {
        this.mTopLiveConfig.remove(localObject);
      }
      if (((LivebarConfigVo.topConfig)localObject).getType() == 5) {
        j = i;
      }
      i += 1;
    }
    Object localObject = new ArrayList();
    ((List)localObject).addAll(this.mTopLiveConfig);
    if (j != -1)
    {
      ((List)localObject).remove(j);
      if (j != 0)
      {
        LivebarConfigVo.topConfig localtopConfig = (LivebarConfigVo.topConfig)this.mTopLiveConfig.remove(j);
        this.mTopLiveConfig.add(0, localtopConfig);
      }
    }
    i = 0;
    if (i < this.mTopLiveConfig.size())
    {
      if (((LivebarConfigVo.topConfig)this.mTopLiveConfig.get(i)).getIsDisplay() == 1) {
        this.currentIndex = i;
      }
    }
    else
    {
      if (j == -1) {
        break label403;
      }
      this.hongbao.setVisibility(0);
      label287:
      this.mGallery.setHold(this);
      this.mGalleryAdapter = new HotVideoListFragment.GalleryAdapter(this, getContext());
      this.mGalleryAdapter.setmColumnConfig((List)localObject);
      if (j == -1) {
        break label415;
      }
      this.mGalleryAdapter.setmSelect(this.currentIndex - 1);
    }
    for (;;)
    {
      this.mGallery.setShowMaxNum(5, true);
      this.mGallery.setAdapter(this.mGalleryAdapter);
      this.mGallery.setOnItemSelectedListener(new HotVideoListFragment.13(this));
      this.myViewPager.setAdapter(this.mPageAdapter);
      this.myViewPager.setCurrentItem(this.currentIndex);
      return;
      i += 1;
      break;
      label403:
      this.hongbao.setVisibility(8);
      break label287;
      label415:
      this.mGalleryAdapter.setmSelect(this.currentIndex);
    }
  }
  
  public void initView(View paramView)
  {
    this.mScrollPeakRelativeLayout = ((ScrollPeakRelativeLayout)this.mRootView.findViewById(2131559291));
    this.mScrollPeakRelativeLayout.setScrollPeakListener(this);
    this.zhezhao = this.mRootView.findViewById(2131559178);
    this.advertView137 = ((AdvertView)this.mRootView.findViewById(2131559270));
    this.mRootView.findViewById(2131559298).setOnClickListener(new HotVideoListFragment.3(this));
    this.zhezhao.setOnClickListener(new HotVideoListFragment.4(this));
    this.advertView137.setOnAdvertStateChangeListener(new HotVideoListFragment.5(this));
    this.advertView137.setAdvCode(137);
    addAdvert(this.advertView137);
    this.mRefreshView = ((LoadAndRefreshView)paramView.findViewById(2131559290));
    this.mDzhHeader = ((DzhMainHeader)paramView.findViewById(2131559289));
    this.mDzhHeader.a(getActivity(), 8, null);
    this.myViewPager = ((ViewPager)paramView.findViewById(2131559297));
    this.myViewPager.setOffscreenPageLimit(6);
    this.topAdv = paramView.findViewById(2131559292);
    View localView = paramView.findViewById(2131559253);
    AdvertView localAdvertView = (AdvertView)paramView.findViewById(2131559254);
    localAdvertView.setOnAdvertStateChangeListener(new HotVideoListFragment.6(this, localView));
    localAdvertView.setAdvCode(147);
    addAdvert(localAdvertView);
    this.myViewPager.setOnPageChangeListener(this.mPageChangListener);
    this.hongbao = ((ImageView)paramView.findViewById(2131559294));
    this.mGallery = ((MyGallery)paramView.findViewById(2131559295));
    this.mRefreshView.a(true, true);
    this.mRefreshView.setOnHeaderRefreshListener(new HotVideoListFragment.7(this));
    this.mRefreshView.setOnFooterLoadListener(new HotVideoListFragment.8(this));
    this.hongbao.setOnClickListener(new HotVideoListFragment.9(this));
    this.mPageAdapter = new HotVideoListFragment.ViwePageAdapter(this, getChildFragmentManager());
    this.mDzhHeader.recevierData();
    this.mDzhHeader.i();
    this.mILoginListener = new HotVideoListFragment.10(this);
    this.woyaobo_iv = ((ImageView)paramView.findViewById(2131559299));
    this.woyaobo_iv.setOnClickListener(new HotVideoListFragment.11(this));
    w.a().a(this.mILoginListener);
    initData();
  }
  
  public boolean isScrollBottom()
  {
    if ((this.mPageAdapter != null) && (this.mPageAdapter.getCurrentFrament() != null)) {
      return ((IlvbRoomChildFragment)this.mPageAdapter.getCurrentFrament()).isScrollBottom();
    }
    return false;
  }
  
  public boolean isScrollTop()
  {
    if ((this.mPageAdapter != null) && (this.mPageAdapter.getCurrentFrament() != null)) {
      return ((IlvbRoomChildFragment)this.mPageAdapter.getCurrentFrament()).isScrollTop();
    }
    return true;
  }
  
  public void moveContent(int paramInt)
  {
    if ((this.mPageAdapter != null) && (this.mPageAdapter.getCurrentFrament() != null)) {
      ((IlvbRoomChildFragment)this.mPageAdapter.getCurrentFrament()).moveContent(paramInt);
    }
  }
  
  public void moveHeader(int paramInt)
  {
    this.mScrollPeakRelativeLayout.scrollBy(0, -paramInt);
    this.mScrollPeakRelativeLayout.invalidate();
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.mRootView = paramLayoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), 2131296296)).inflate(2130903170, paramViewGroup, false);
    initView(this.mRootView);
    if (paramBundle != null)
    {
      if (!getMyHongBaoShow()) {
        break label128;
      }
      if (this.currentIndex == 0) {
        break label102;
      }
      this.hongbao.setSelected(false);
      this.mGallery.animateToTab(this.currentIndex - 1);
      this.mGalleryAdapter.setmSelect(this.currentIndex - 1);
      this.mGalleryAdapter.notifyDataSetChanged();
    }
    for (;;)
    {
      return this.mRootView;
      label102:
      this.hongbao.setSelected(true);
      this.mGalleryAdapter.setmSelect(-1);
      this.mGalleryAdapter.notifyDataSetChanged();
      continue;
      label128:
      this.mGallery.animateToTab(this.currentIndex);
      this.mGalleryAdapter.setmSelect(this.currentIndex);
      this.mGalleryAdapter.notifyDataSetChanged();
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    w.a().b(this.mILoginListener);
    this.mDzhHeader.j();
  }
  
  public void onFooterLoadComplete()
  {
    this.mRefreshView.removeCallbacks(this.mDelayFreshComplete);
    this.mRefreshView.b();
  }
  
  public void onFragmentChanged(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.mPageAdapter != null) && (this.mPageAdapter.getCurrentFrament() != null))
    {
      IlvbRoomChildFragment localIlvbRoomChildFragment = (IlvbRoomChildFragment)this.mPageAdapter.getCurrentFrament();
      if (localIlvbRoomChildFragment != null) {
        localIlvbRoomChildFragment.show();
      }
    }
  }
  
  public void onHeaderRefreshComplete(boolean paramBoolean, int paramInt)
  {
    this.mRefreshView.removeCallbacks(this.mDelayFreshComplete);
    this.mRefreshView.a(paramBoolean, paramInt);
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void setLastPage(boolean paramBoolean)
  {
    this.mRefreshView.setLastPage(paramBoolean);
  }
  
  public void setSubFragmentIndex(int paramInt1, int paramInt2)
  {
    if (this.myViewPager != null)
    {
      if ((paramInt1 != -1) && (paramInt2 == -1)) {}
      return;
    }
    this.currentIndex = paramInt1;
  }
  
  public void show()
  {
    if ((this.mPageAdapter != null) && (this.mPageAdapter.getCurrentFrament() != null))
    {
      if (!(this.mPageAdapter.getCurrentFrament() instanceof i)) {
        break label57;
      }
      ((i)this.mPageAdapter.getCurrentFrament()).refresh();
    }
    for (;;)
    {
      changeLookFace(com.android.dazhihui.g.a().b());
      return;
      label57:
      ((e)this.mPageAdapter.getCurrentFrament()).show();
    }
  }
  
  public void upShowLiveView()
  {
    if (this.mLivebarConfigVo != null)
    {
      if (this.mLivebarConfigVo.getHeader().getIsShow() == 1)
      {
        this.mZbImageView.setVisibility(0);
        this.mZbImageView.setOnClickListener(new HotVideoListFragment.16(this));
      }
    }
    else {
      return;
    }
    this.mZbImageView.setVisibility(8);
  }
  
  public int upToLoad(int paramInt, boolean paramBoolean)
  {
    return this.mRefreshView.a(paramInt, paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */