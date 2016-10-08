package com.tencent.avsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ListView;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.header;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.c.a.k;
import com.tencent.avsdk.Model.LabelMsgVo;
import com.tencent.avsdk.Model.LabelMsgVo.LabelData;
import com.tencent.avsdk.Model.LabelMsgVo.LabelOutPut;

public class IlvbMoreTopicActivity
  extends BaseActivity
{
  private DzhHeader mDzhHeader;
  private IlvbMoreTopicActivity.ListAdapter mListAdapter;
  private ListView mListView;
  private f mLiveRequest;
  private String titleStr = "更多话题";
  
  private void requestList()
  {
    Object localObject = m.a().g();
    if (localObject != null)
    {
      localObject = ((LivebarConfigVo)localObject).getHeader().getAllJson();
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        localObject = com.android.dazhihui.d.r.a(localObject, "")[1];
        this.mLiveRequest = new f();
        this.mLiveRequest.c((String)localObject);
        registRequestListener(this.mLiveRequest);
        sendRequest(this.mLiveRequest);
      }
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
    try
    {
      if (paramh == this.mLiveRequest)
      {
        paramh = new String(((g)paramj).a());
        if (TextUtils.isEmpty(paramh)) {
          return;
        }
        paramh = (LabelMsgVo)new k().a(paramh, LabelMsgVo.class);
        if (paramh != null)
        {
          paramh = paramh.Data.OutPut.TypeList;
          if (this.mListAdapter != null)
          {
            this.mListAdapter.refreshList(paramh);
            return;
          }
        }
      }
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903199);
    getIntent().getExtras();
    this.mDzhHeader = ((DzhHeader)findViewById(2131558585));
    this.mDzhHeader.a(this, new IlvbMoreTopicActivity.1(this));
    this.mListView = ((ListView)findViewById(2131559448));
    this.mListAdapter = new IlvbMoreTopicActivity.ListAdapter(this, this);
    this.mListView.setAdapter(this.mListAdapter);
    this.mListView.setOnItemClickListener(new IlvbMoreTopicActivity.2(this));
    requestList();
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbMoreTopicActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */