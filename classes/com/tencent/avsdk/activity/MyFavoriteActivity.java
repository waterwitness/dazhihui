package com.tencent.avsdk.activity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.o;
import com.android.dazhihui.ui.model.stock.MyFavoriteVo;
import com.android.dazhihui.ui.model.stock.MyFavoriteVo.FavoriteItem;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.ToastMaker;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.w;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.json.JSONObject;

public class MyFavoriteActivity
  extends BaseActivity
  implements cp, cs
{
  private com.android.dazhihui.a.b.f mDelFavoriteRequest;
  private View mFavoriteNoneLayout;
  private String mFirstPage = "1";
  private ArrayList<MyFavoriteVo.FavoriteItem> mMyFavoriteList;
  private ListView mMyFavoriteListView;
  private MyFavoriteActivity.MyFavoriteAdapter mMyFavoriteListViewAdapter;
  private MyFavoriteVo mMyFavoriteListVo;
  private com.android.dazhihui.a.b.f mRequestFavorite;
  private DzhHeader mTitle;
  private LoadAndRefreshView refresh_view;
  
  private void dealFavoriteResponse(String paramString1, String paramString2)
  {
    if (this.mMyFavoriteListVo == null) {
      this.mMyFavoriteListVo = new MyFavoriteVo();
    }
    paramString1 = paramString1.substring(paramString1.indexOf("page=") + 5);
    this.mMyFavoriteListVo.setCurPage(paramString1);
    if (paramString2 != null)
    {
      this.mMyFavoriteListVo.decode(paramString2);
      if (this.mMyFavoriteListVo.getError() == 0) {
        this.mMyFavoriteList = this.mMyFavoriteListVo.getFavoriteList();
      }
      if (this.mMyFavoriteListViewAdapter != null) {
        break label130;
      }
      this.mMyFavoriteListViewAdapter = new MyFavoriteActivity.MyFavoriteAdapter(this, this, this.mMyFavoriteList);
      this.mMyFavoriteListView.setAdapter(this.mMyFavoriteListViewAdapter);
    }
    for (;;)
    {
      if (this.mMyFavoriteListVo.isLastPage()) {
        this.refresh_view.setLastPage(true);
      }
      updateFavoriteNoneLayout();
      return;
      label130:
      this.mMyFavoriteListViewAdapter.refreshData(this.mMyFavoriteList);
    }
  }
  
  private String encodeUrlParameter(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
    return paramString;
  }
  
  private void openPopWin(View paramView, int paramInt)
  {
    PopupWindow localPopupWindow = new PopupWindow(this);
    LinearLayout localLinearLayout = (LinearLayout)LayoutInflater.from(this).inflate(2130903333, null);
    localLinearLayout.setOnClickListener(new MyFavoriteActivity.5(this, paramInt, localPopupWindow));
    paramInt = getResources().getDimensionPixelSize(2131230845);
    int i = getResources().getDimensionPixelSize(2131230830);
    localPopupWindow.setBackgroundDrawable(new BitmapDrawable());
    localPopupWindow.setWidth(paramInt);
    localPopupWindow.setHeight(i);
    localPopupWindow.setOutsideTouchable(true);
    localPopupWindow.setFocusable(true);
    localPopupWindow.setContentView(localLinearLayout);
    paramView.getLocationOnScreen(new int[2]);
    localPopupWindow.showAsDropDown(paramView, (paramView.getWidth() - paramInt) / 2, -paramView.getHeight() - i / 2);
    localPopupWindow.setOnDismissListener(new MyFavoriteActivity.6(this));
    paramView.setBackgroundColor(getResources().getColor(2131493618));
  }
  
  private void sendData(String paramString)
  {
    if (paramString.equals(this.mFirstPage))
    {
      if (this.mMyFavoriteList != null) {
        this.mMyFavoriteList.clear();
      }
      if (this.mMyFavoriteListViewAdapter != null) {
        this.mMyFavoriteListViewAdapter.clear();
      }
      this.mMyFavoriteListVo = null;
    }
    if (w.a().l())
    {
      paramString = com.android.dazhihui.a.f.ai + "userid=" + w.a().f() + "&page=" + paramString + "&token=" + o.a().c();
      this.mRequestFavorite = new com.android.dazhihui.a.b.f();
      this.mRequestFavorite.c(paramString);
      this.mRequestFavorite.a(this);
      sendRequest(this.mRequestFavorite);
      if (this.mTitle != null) {
        this.mTitle.a();
      }
    }
  }
  
  private void sendDelFavorite(MyFavoriteVo.FavoriteItem paramFavoriteItem)
  {
    if (w.a().l())
    {
      paramFavoriteItem = com.android.dazhihui.a.f.ak + "userid=" + encodeUrlParameter(w.a().f()) + "&title=" + encodeUrlParameter(paramFavoriteItem.getTitle()) + "&clickurl=" + encodeUrlParameter(paramFavoriteItem.getClickurl()) + "&token=" + o.a().c();
      this.mDelFavoriteRequest = new com.android.dazhihui.a.b.f();
      this.mDelFavoriteRequest.c(paramFavoriteItem);
      this.mDelFavoriteRequest.a(this);
      sendRequest(this.mDelFavoriteRequest);
      if (this.mTitle != null) {
        this.mTitle.a();
      }
    }
  }
  
  private void updateFavoriteNoneLayout()
  {
    if ((this.mMyFavoriteList == null) || (this.mMyFavoriteList.size() == 0))
    {
      this.mFavoriteNoneLayout.setVisibility(0);
      return;
    }
    this.mFavoriteNoneLayout.setVisibility(8);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return false;
      finish();
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (MyFavoriteActivity.7.$SwitchMap$com$android$dazhihui$ui$screen$LookFace[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.mTitle == null);
      this.mTitle.a(paramy);
      return;
    } while (this.mTitle == null);
    this.mTitle.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "我的收藏";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.mTitle = paramDzhHeader;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (this.mTitle != null) {
      this.mTitle.b();
    }
    if (paramj == null) {}
    do
    {
      do
      {
        do
        {
          return;
        } while (!(paramj instanceof g));
        paramj = (g)paramj;
      } while (paramh == null);
      if (paramh == this.mRequestFavorite) {
        try
        {
          paramh = new String(paramj.a());
          dealFavoriteResponse(this.mRequestFavorite.o(), paramh);
          return;
        }
        catch (Exception paramh)
        {
          paramh.printStackTrace();
          return;
        }
      }
    } while (paramh != this.mDelFavoriteRequest);
    try
    {
      paramh = new JSONObject(new String(paramj.a()));
      paramh.optString("Qid");
      int i = paramh.optInt("Err");
      paramh.optInt("Counter");
      if (i == 0)
      {
        ToastMaker.a(this, "删除成功");
        return;
      }
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
      return;
    }
    paramh = paramh.optJSONObject("Data");
    if (paramh != null)
    {
      paramh.optInt("code");
      ToastMaker.a(this, paramh.optString("desc"));
      return;
    }
    ToastMaker.a(this, "删除失败");
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (this.mTitle != null) {
      this.mTitle.b();
    }
    updateFavoriteNoneLayout();
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903335);
    this.mTitle = ((DzhHeader)findViewById(2131558513));
    this.mFavoriteNoneLayout = findViewById(2131560093);
    this.refresh_view = ((LoadAndRefreshView)findViewById(2131558779));
    this.refresh_view.a(true, true);
    this.refresh_view.setOnHeaderRefreshListener(new MyFavoriteActivity.1(this));
    this.refresh_view.setOnFooterLoadListener(new MyFavoriteActivity.2(this));
    this.mMyFavoriteListView = ((ListView)findViewById(2131560092));
    this.mTitle.a(this, this);
    sendData(this.mFirstPage);
    this.mMyFavoriteListView.setOnItemClickListener(new MyFavoriteActivity.3(this));
    this.mMyFavoriteListView.setOnItemLongClickListener(new MyFavoriteActivity.4(this));
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this.mTitle != null) {
      this.mTitle.b();
    }
    updateFavoriteNoneLayout();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\MyFavoriteActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */