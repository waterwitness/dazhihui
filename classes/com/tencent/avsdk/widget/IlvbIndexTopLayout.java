package com.tencent.avsdk.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.r;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.IRequestAdapterListener;
import com.android.dazhihui.ui.model.RequestAdapter;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.MoreNewsListScreen;
import com.android.dazhihui.ui.screen.stock.SelfStockMoreListScreen;
import java.util.ArrayList;
import java.util.Vector;

public class IlvbIndexTopLayout
  extends RelativeLayout
  implements View.OnClickListener, i, IRequestAdapterListener
{
  private static final String[] sGridItemNames = { "上证" };
  private static final String[] sStockCodes = { "SH000001" };
  private Handler mAutoFlipHandler = new Handler();
  private Runnable mAutoFlipRunnable = new IlvbIndexTopLayout.1(this);
  private int mAutoRefreshTime = 5000;
  private Context mContext;
  private ArrayList<SelfStock> mGridItemList = null;
  private Vector<String> mHKZSCode;
  private TextView mIndexName;
  private TextView mIndexPrice;
  private TextView mIndexZf;
  private LayoutInflater mInflater;
  private com.android.dazhihui.a.b.m mManualRequest;
  protected RequestAdapter mRequestAdapter = new IlvbIndexTopLayout.2(this);
  private Toast mToast;
  private View mtopIndex;
  
  public IlvbIndexTopLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public IlvbIndexTopLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public IlvbIndexTopLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mInflater.inflate(2130903212, this);
    this.mHKZSCode = new Vector();
    this.mGridItemList = new ArrayList();
    paramInt = 0;
    while (paramInt < sStockCodes.length)
    {
      this.mHKZSCode.add(sStockCodes[paramInt]);
      paramContext = new SelfStock();
      paramContext.setStockCode(sStockCodes[paramInt]);
      paramContext.selfType = 3;
      paramContext.setLoanable(false);
      this.mGridItemList.add(paramContext);
      paramInt += 1;
    }
    this.mIndexPrice = ((TextView)findViewById(2131559488));
    this.mIndexName = ((TextView)findViewById(2131559489));
    this.mIndexZf = ((TextView)findViewById(2131559490));
    this.mToast = Toast.makeText(this.mContext, "", 0);
    paramContext = SelfSelectedStockManager.getInstance().getIndexStockVector();
    if ((paramContext != null) && (paramContext.size() > 0)) {}
    this.mtopIndex = findViewById(2131559487);
    this.mtopIndex.setOnClickListener(this);
  }
  
  private com.android.dazhihui.a.b.m getRequest()
  {
    x[] arrayOfx = new x[1];
    arrayOfx[0] = new x(2955);
    arrayOfx[0].c(107);
    arrayOfx[0].c(0);
    arrayOfx[0].a(this.mHKZSCode);
    arrayOfx[0].c("互动直播-上证指数");
    return new com.android.dazhihui.a.b.m(arrayOfx);
  }
  
  private void gotoMinute()
  {
    Vector localVector = new Vector();
    localVector.add(new StockVo("上证指数", "SH000001", 0, false));
    com.android.dazhihui.ui.a.m.a().u(0);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("stock_vo", (Parcelable)localVector.get(0));
    r.a(this.mContext, localVector, 0, localBundle);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    int i = 0;
    try
    {
      if (paramh == this.mManualRequest)
      {
        paramh = (o)paramj;
        if (paramh == null) {
          return;
        }
        paramh = paramh.h();
        if ((paramh != null) && (paramh.a == 2955))
        {
          paramh = new q(paramh.b);
          int k = paramh.e();
          int m = paramh.e();
          paramh.e();
          int j = paramh.e();
          paramj = new ArrayList();
          if ((k == 107) && (m == 0))
          {
            while (i < j)
            {
              SelfStock localSelfStock = new SelfStock();
              localSelfStock.selfType = 3;
              String str1 = paramh.l();
              String str2 = paramh.l();
              localSelfStock.setStockCode(str1);
              localSelfStock.setStockName(str2);
              localSelfStock.setDecl(paramh.b());
              localSelfStock.setType(paramh.b());
              localSelfStock.setZs(paramh.h());
              paramh.h();
              localSelfStock.setZxData(paramh.h());
              paramh.h();
              paramh.h();
              localSelfStock.setCje(paramh.h());
              localSelfStock.setLoanable(false);
              paramj.add(localSelfStock);
              SelfSelectedStockManager.getInstance().updateIndexStock(localSelfStock);
              i += 1;
            }
            if (paramj.size() == sGridItemNames.length)
            {
              this.mGridItemList = paramj;
              this.mIndexName.setText(sGridItemNames[0]);
              this.mIndexPrice.setText(((SelfStock)this.mGridItemList.get(0)).getZx());
              this.mIndexZf.setText(((SelfStock)this.mGridItemList.get(0)).getZf());
              this.mIndexPrice.setTextColor(((SelfStock)this.mGridItemList.get(0)).getColor());
              this.mIndexZf.setTextColor(((SelfStock)this.mGridItemList.get(0)).getColor());
              return;
            }
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
    if (g.a().L()) {
      showShortToast(2131166193);
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    showShortToast(2131166192);
  }
  
  public void onClick(View paramView)
  {
    if ((paramView != null) && (getContext() != null)) {}
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131559495: 
      com.android.dazhihui.d.n.a("", 1148);
      paramView = new Intent(this.mContext, MoreNewsListScreen.class);
      Bundle localBundle = new Bundle();
      localBundle.putString("url", "1");
      localBundle.putInt("type", 2);
      localBundle.putString("name", this.mContext.getResources().getString(2131166276));
      paramView.putExtras(localBundle);
      this.mContext.startActivity(paramView);
      return;
    case 2131559499: 
      com.android.dazhihui.d.n.a("", 1186);
      this.mContext.startActivity(new Intent(this.mContext, SelfStockMoreListScreen.class));
      return;
    }
    gotoMinute();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void registRequestListener(h paramh)
  {
    this.mRequestAdapter.registRequestListener(paramh);
  }
  
  public void removeRequest(h paramh)
  {
    this.mRequestAdapter.removeRequest(paramh);
  }
  
  public void sendRequest(h paramh)
  {
    this.mRequestAdapter.sendRequest(paramh);
  }
  
  public void setAutoRequest(h paramh)
  {
    this.mRequestAdapter.setAutoRequest(paramh);
  }
  
  public void setAutoRequestPeriod(long paramLong)
  {
    this.mRequestAdapter.setAutoRequestPeriod(paramLong);
  }
  
  public void setData(ArrayList<SelfStock> paramArrayList)
  {
    this.mGridItemList = paramArrayList;
  }
  
  public void showShortToast(int paramInt)
  {
    if ((this.mContext == null) || (((this.mContext instanceof Activity)) && (((Activity)this.mContext).isFinishing()))) {}
    String str;
    do
    {
      return;
      str = this.mContext.getResources().getString(paramInt);
    } while ((this.mToast == null) || (TextUtils.isEmpty(str)));
    this.mToast.setText(str);
    this.mToast.show();
  }
  
  public void start()
  {
    if (this.mManualRequest == null)
    {
      this.mManualRequest = getRequest();
      this.mManualRequest.a(com.android.dazhihui.a.b.n.d);
      this.mManualRequest.e(true);
      registRequestListener(this.mManualRequest);
    }
    this.mAutoFlipHandler.removeCallbacks(this.mAutoFlipRunnable);
    this.mAutoFlipHandler.post(this.mAutoFlipRunnable);
  }
  
  public void stop()
  {
    this.mAutoFlipHandler.removeCallbacks(this.mAutoFlipRunnable);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\IlvbIndexTopLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */