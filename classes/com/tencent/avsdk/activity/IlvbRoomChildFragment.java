package com.tencent.avsdk.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.widget.NoScrollGridView;
import com.tencent.avsdk.LiveVideoInfo;
import com.tencent.avsdk.LiveVideoRecycleViewAdapter;
import com.tencent.avsdk.Model.LabelMsgVo.LabelTypeItem;
import java.util.ArrayList;
import java.util.List;

public class IlvbRoomChildFragment
  extends e
{
  public static final int DELAY = 300;
  public static final int REFRESH_DELAY_TIME = 300000;
  long lastRefreshTime = 0L;
  private View mAttentionNoneLayout;
  private int mCurrentPage = 0;
  private Handler mHandler = new Handler(new IlvbRoomChildFragment.3(this));
  boolean mIsVisibleToUser;
  List<LabelMsgVo.LabelTypeItem> mLabelList = new ArrayList();
  private View mListNoneLayout;
  private f mLiveListRequest;
  private boolean mManually = false;
  private String mName = "";
  private String mNextPageUrl;
  HotVideoListFragment mParent;
  private List<LiveVideoInfo> mRoomList = new ArrayList();
  private LiveVideoRecycleViewAdapter mRoomListAdapter;
  private RecyclerView mRoomListRecyclerView;
  private NoScrollGridView mTagListGridView;
  private IlvbRoomChildFragment.TopicListAdapter mTopicListAdapter;
  private int mType;
  private String mUrl;
  
  private void initView(View paramView)
  {
    this.mTagListGridView = ((NoScrollGridView)paramView.findViewById(2131559316));
    this.mTopicListAdapter = new IlvbRoomChildFragment.TopicListAdapter(this, getActivity());
    this.mTagListGridView.setAdapter(this.mTopicListAdapter);
    this.mTagListGridView.setOnItemClickListener(new IlvbRoomChildFragment.1(this));
    this.mRoomListRecyclerView = ((RecyclerView)paramView.findViewById(2131559320));
    this.mRoomListAdapter = new LiveVideoRecycleViewAdapter(getActivity(), true, this.mType);
    this.mRoomListAdapter.setOnRecyclerViewListener(new IlvbRoomChildFragment.2(this));
    this.mRoomListRecyclerView.setAdapter(this.mRoomListAdapter);
    if (this.mType != 7) {}
    for (GridLayoutManager localGridLayoutManager = new GridLayoutManager(getActivity(), 2);; localGridLayoutManager = new GridLayoutManager(getActivity(), 3))
    {
      localGridLayoutManager.b(1);
      localGridLayoutManager.b(false);
      this.mRoomListRecyclerView.setLayoutManager(localGridLayoutManager);
      this.mAttentionNoneLayout = paramView.findViewById(2131559318);
      this.mListNoneLayout = paramView.findViewById(2131559317);
      if (this.mType != 1) {
        break;
      }
      this.mAttentionNoneLayout.setVisibility(0);
      this.mListNoneLayout.setVisibility(8);
      return;
    }
    this.mAttentionNoneLayout.setVisibility(8);
    this.mListNoneLayout.setVisibility(0);
  }
  
  public static IlvbRoomChildFragment newInstance(int paramInt, String paramString1, String paramString2)
  {
    IlvbRoomChildFragment localIlvbRoomChildFragment = new IlvbRoomChildFragment();
    Bundle localBundle = new Bundle();
    localBundle.putInt("type", paramInt);
    localBundle.putString("url", paramString1);
    localBundle.putString("name", paramString2);
    localIlvbRoomChildFragment.setArguments(localBundle);
    return localIlvbRoomChildFragment;
  }
  
  private void refreshData()
  {
    if ((this.mRoomList != null) && (this.mRoomList.size() != 0))
    {
      this.mAttentionNoneLayout.setVisibility(8);
      this.mListNoneLayout.setVisibility(8);
      if (this.mTopicListAdapter != null)
      {
        if (this.mTopicListAdapter.getCount() <= 0) {
          break label118;
        }
        this.mTagListGridView.setVisibility(0);
      }
    }
    for (;;)
    {
      this.mTopicListAdapter.notifyDataSetChanged();
      return;
      if (this.mType == 1)
      {
        this.mAttentionNoneLayout.setVisibility(0);
        this.mListNoneLayout.setVisibility(8);
        break;
      }
      this.mAttentionNoneLayout.setVisibility(8);
      this.mListNoneLayout.setVisibility(0);
      break;
      label118:
      this.mTagListGridView.setVisibility(8);
    }
  }
  
  private void sendLiveRoomList(String paramString, int paramInt, boolean paramBoolean)
  {
    if (paramInt == 0)
    {
      this.mCurrentPage = 0;
      if (this.mParent != null) {
        this.mParent.setLastPage(false);
      }
    }
    this.mManually = paramBoolean;
    paramString = com.android.dazhihui.d.r.a(paramString, "")[1];
    this.mLiveListRequest = new f();
    this.mLiveListRequest.c(paramString);
    this.mLiveListRequest.a(Integer.valueOf(paramInt));
    registRequestListener(this.mLiveListRequest);
    sendRequest(this.mLiveListRequest);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if ((!this.mIsVisibleToUser) || (!isAdded())) {}
    label20:
    int i;
    do
    {
      do
      {
        break label20;
        do
        {
          return;
        } while (paramh != this.mLiveListRequest);
        paramj = new String(((g)paramj).a());
      } while (TextUtils.isEmpty(paramj));
      i = ((Integer)paramh.j()).intValue();
      paramh = new ArrayList();
      paramj = LiveVideoInfo.decode(paramj, paramh, this.mLabelList);
    } while ((!this.mIsVisibleToUser) || (!isAdded()));
    if ((paramh != null) && (paramh.size() >= 0)) {
      if (this.mCurrentPage == i)
      {
        if (this.mCurrentPage == 0)
        {
          this.mRoomList.clear();
          this.mRoomList.addAll(paramh);
          this.mRoomListAdapter.refreshItems(paramh);
          label152:
          this.mCurrentPage += 1;
          this.mNextPageUrl = paramj;
        }
      }
      else
      {
        if ((TextUtils.isEmpty(paramj)) && (this.mParent != null)) {
          this.mParent.setLastPage(true);
        }
        this.lastRefreshTime = System.currentTimeMillis();
      }
    }
    for (;;)
    {
      refreshData();
      if ((!this.mManually) || (this.mParent == null)) {
        break;
      }
      if (i == 0) {
        break label266;
      }
      this.mParent.onFooterLoadComplete();
      return;
      this.mRoomList.addAll(paramh);
      this.mRoomListAdapter.addItems(paramh);
      break label152;
      if (this.mParent != null) {
        this.mParent.setLastPage(true);
      }
    }
    label266:
    this.mParent.onHeaderRefreshComplete(false, 1);
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (this.mManually)
    {
      int i = ((Integer)paramh.j()).intValue();
      if (this.mParent != null)
      {
        if (i == 0) {
          break label44;
        }
        this.mParent.onFooterLoadComplete();
      }
    }
    return;
    label44:
    this.mParent.onHeaderRefreshComplete(false, 2);
  }
  
  public boolean isScrollBottom()
  {
    if (this.mRoomListRecyclerView == null) {
      return false;
    }
    View localView = this.mRoomListRecyclerView.getChildAt(this.mRoomListRecyclerView.getChildCount() - 1);
    if (localView == null) {
      return false;
    }
    return (localView.getBottom() <= this.mRoomListRecyclerView.getHeight()) && (((LinearLayoutManager)this.mRoomListRecyclerView.getLayoutManager()).k() == this.mRoomListAdapter.getItemCount() - 1);
  }
  
  public boolean isScrollTop()
  {
    boolean bool2 = false;
    boolean bool1;
    if ((this.mRoomList == null) || (this.mRoomList.size() == 0)) {
      bool1 = true;
    }
    View localView;
    do
    {
      do
      {
        do
        {
          return bool1;
          bool1 = bool2;
        } while (this.mRoomListRecyclerView == null);
        localView = this.mRoomListRecyclerView.getChildAt(0);
        bool1 = bool2;
      } while (localView == null);
      bool1 = bool2;
    } while (localView.getTop() < this.mRoomListRecyclerView.getPaddingTop());
    return true;
  }
  
  public void moveContent(int paramInt)
  {
    this.mRoomListRecyclerView.scrollBy(0, paramInt);
    this.mRoomListRecyclerView.invalidate();
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this.mManually)
    {
      int i = ((Integer)paramh.j()).intValue();
      if (this.mParent != null)
      {
        if (i == 0) {
          break label45;
        }
        this.mParent.onFooterLoadComplete();
      }
    }
    return;
    label45:
    this.mParent.onHeaderRefreshComplete(false, 2);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getArguments() != null)
    {
      this.mType = getArguments().getInt("type");
      this.mUrl = getArguments().getString("url");
      this.mName = getArguments().getString("name");
    }
    while (this.mBundle == null) {
      return;
    }
    this.mType = this.mBundle.getInt("type");
    this.mUrl = this.mBundle.getString("url");
    this.mName = this.mBundle.getString("name");
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130903174, null);
    initView(paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onDetach()
  {
    super.onDetach();
    if (this.mRoomListAdapter != null) {
      this.mRoomListAdapter.doRecycle();
    }
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void sendMoreRoomList()
  {
    if ((!TextUtils.isEmpty(this.mNextPageUrl)) && (this.mCurrentPage > 0)) {
      sendLiveRoomList(this.mNextPageUrl, this.mCurrentPage, true);
    }
    while (this.mParent == null) {
      return;
    }
    this.mParent.onFooterLoadComplete();
  }
  
  public void sendToPullRefresh()
  {
    sendLiveRoomList(this.mUrl, 0, true);
  }
  
  public void setParent(HotVideoListFragment paramHotVideoListFragment)
  {
    this.mParent = paramHotVideoListFragment;
    if (this.mRoomListRecyclerView != null) {
      this.mRoomListRecyclerView.a(0);
    }
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
    this.mIsVisibleToUser = paramBoolean;
    if (this.mIsVisibleToUser)
    {
      Message localMessage = new Message();
      localMessage.what = 0;
      localMessage.obj = this.mUrl;
      localMessage.arg1 = 0;
      this.mHandler.sendMessageDelayed(localMessage, 300L);
      return;
    }
    this.mHandler.removeMessages(0);
  }
  
  public void show()
  {
    if (System.currentTimeMillis() - this.lastRefreshTime > 300000L) {
      sendLiveRoomList(this.mUrl, 0, false);
    }
    super.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbRoomChildFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */