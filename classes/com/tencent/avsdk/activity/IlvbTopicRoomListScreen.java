package com.tencent.avsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.GridView;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.tencent.avsdk.LiveVideoInfo;
import com.tencent.avsdk.TopicRoomInfoAdapter;
import java.util.ArrayList;
import java.util.List;

public class IlvbTopicRoomListScreen
  extends BaseActivity
{
  private TopicRoomInfoAdapter mAdapter;
  private boolean mComplete;
  private int mCurrentPage = 0;
  private Runnable mDelayFreshComplete = new IlvbTopicRoomListScreen.1(this);
  private DzhHeader mDzhHeader;
  private GridView mGridView;
  private f mLiveListRequest;
  private boolean mManually = false;
  private String mNextPageUrl;
  private LoadAndRefreshView mRefreshView;
  private List<LiveVideoInfo> mRoomList = new ArrayList();
  private String mTitleStr;
  private String mUrl;
  
  private void sendLiveRoomList(String paramString, int paramInt, boolean paramBoolean)
  {
    if (paramString != null)
    {
      if (paramInt == 0)
      {
        this.mCurrentPage = 0;
        if (this.mRefreshView != null) {
          this.mRefreshView.setLastPage(false);
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
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (this.mDzhHeader != null)) {
      this.mDzhHeader.a(paramy);
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramh == this.mLiveListRequest)
    {
      paramj = new String(((g)paramj).a());
      if (!TextUtils.isEmpty(paramj)) {
        break label37;
      }
    }
    label37:
    int i;
    do
    {
      do
      {
        return;
        i = ((Integer)paramh.j()).intValue();
        paramh = new ArrayList();
        paramj = LiveVideoInfo.decode(paramj, paramh, null);
        if ((paramh != null) && (paramh.size() >= 0))
        {
          if (this.mCurrentPage == i)
          {
            if (this.mCurrentPage == 0) {
              this.mRoomList.clear();
            }
            this.mCurrentPage += 1;
            this.mRoomList.addAll(paramh);
            this.mNextPageUrl = paramj;
          }
          if ((TextUtils.isEmpty(paramj)) && (this.mRefreshView != null)) {
            this.mRefreshView.setLastPage(true);
          }
          this.mAdapter.notifyDataSetChanged();
        }
      } while (!this.mManually);
      this.mComplete = true;
    } while (this.mRefreshView == null);
    this.mRefreshView.removeCallbacks(this.mDelayFreshComplete);
    if (i != 0)
    {
      this.mRefreshView.b();
      return;
    }
    this.mRefreshView.a(false, 1);
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (this.mManually)
    {
      int i = ((Integer)paramh.j()).intValue();
      this.mComplete = true;
      if (this.mRefreshView != null)
      {
        this.mRefreshView.removeCallbacks(this.mDelayFreshComplete);
        if (i == 0) {
          break label61;
        }
        this.mRefreshView.b();
      }
    }
    return;
    label61:
    this.mRefreshView.a(false, 2);
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903214);
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.mUrl = paramBundle.getString("url");
      this.mTitleStr = paramBundle.getString("title");
    }
    initView();
  }
  
  public void initView()
  {
    this.mRefreshView = ((LoadAndRefreshView)findViewById(2131558779));
    this.mRefreshView.a(true, true);
    this.mRefreshView.setOnHeaderRefreshListener(new IlvbTopicRoomListScreen.2(this));
    this.mRefreshView.setOnFooterLoadListener(new IlvbTopicRoomListScreen.3(this));
    this.mDzhHeader = ((DzhHeader)findViewById(2131558585));
    this.mDzhHeader.a(this, new IlvbTopicRoomListScreen.4(this));
    this.mGridView = ((GridView)findViewById(2131559320));
    this.mAdapter = new TopicRoomInfoAdapter(this, 2130903195, this.mRoomList, true);
    this.mGridView.setAdapter(this.mAdapter);
    this.mGridView.setOnItemClickListener(new IlvbTopicRoomListScreen.5(this));
    sendLiveRoomList(this.mUrl, this.mCurrentPage, false);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this.mManually)
    {
      int i = ((Integer)paramh.j()).intValue();
      this.mComplete = true;
      if (this.mRefreshView != null)
      {
        this.mRefreshView.removeCallbacks(this.mDelayFreshComplete);
        if (i == 0) {
          break label62;
        }
        this.mRefreshView.b();
      }
    }
    return;
    label62:
    this.mRefreshView.a(false, 2);
  }
  
  public void sendToPullRefresh()
  {
    if (this.mRefreshView != null)
    {
      this.mRefreshView.removeCallbacks(this.mDelayFreshComplete);
      this.mComplete = false;
      this.mRefreshView.postDelayed(this.mDelayFreshComplete, 5000L);
    }
    this.mCurrentPage = 0;
    sendLiveRoomList(this.mUrl, 0, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbTopicRoomListScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */