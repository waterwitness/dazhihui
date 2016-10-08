package com.android.thinkive.framework;

import android.content.Context;
import com.android.thinkive.framework.config.AddressConfigBean;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.util.FormatUtil;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.NetWorkUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PingService
{
  private Context mContext;
  private ArrayList<AddressConfigBean> mRouteList;
  private HashMap<String, ArrayList<AddressConfigBean>> mRouteMap;
  private ThreadManager mThreadManager;
  
  public PingService(Context paramContext)
  {
    this.mContext = paramContext;
    this.mThreadManager = ThreadManager.getInstance();
    this.mRouteList = new ArrayList();
    this.mRouteMap = new HashMap();
  }
  
  private void clear()
  {
    this.mRouteMap.clear();
    this.mRouteList.clear();
  }
  
  private boolean compareList(List<String> paramList1, List<String> paramList2)
  {
    if (paramList1.size() != paramList2.size()) {
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= paramList1.size()) {
        return true;
      }
      if (!paramList2.contains((String)paramList1.get(i))) {
        break;
      }
      i += 1;
    }
  }
  
  private void initRouteData(AddressConfigBean paramAddressConfigBean)
  {
    if (this.mRouteList.size() == 0)
    {
      this.mRouteList.add(paramAddressConfigBean);
      return;
    }
    Object localObject = this.mRouteList.iterator();
    int i;
    label40:
    AddressConfigBean localAddressConfigBean;
    do
    {
      if (!((Iterator)localObject).hasNext())
      {
        i = 1;
        if (i == 0) {
          break;
        }
        this.mRouteList.add(paramAddressConfigBean);
        return;
      }
      localAddressConfigBean = (AddressConfigBean)((Iterator)localObject).next();
    } while (!compareList(localAddressConfigBean.getValue(), paramAddressConfigBean.getValue()));
    if (this.mRouteMap.containsKey(localAddressConfigBean.getName())) {
      ((ArrayList)this.mRouteMap.get(localAddressConfigBean.getName())).add(paramAddressConfigBean);
    }
    for (;;)
    {
      i = 0;
      break label40;
      break;
      localObject = new ArrayList();
      ((ArrayList)localObject).add(paramAddressConfigBean);
      this.mRouteMap.put(localAddressConfigBean.getName(), localObject);
    }
  }
  
  private void startRoute(AddressConfigBean paramAddressConfigBean)
  {
    int k = 0;
    Log.e("route url = " + paramAddressConfigBean.getName());
    Object localObject = new ArrayList();
    int i = 0;
    if (i >= paramAddressConfigBean.getValue().size())
    {
      localObject = NetWorkUtil.pingAddressList((ArrayList)localObject);
      if (localObject != null) {
        break label123;
      }
      Log.e("ping delayTime list =  null!!!");
    }
    label123:
    float f1;
    int j;
    for (;;)
    {
      return;
      String str = (String)paramAddressConfigBean.getValue().get(i);
      if (FormatUtil.formatUrlToIp(str) != null) {
        ((ArrayList)localObject).add(FormatUtil.formatUrlToIp(str));
      }
      for (;;)
      {
        i += 1;
        break;
        ((ArrayList)localObject).add(FormatUtil.formatUrlToDomain(str));
      }
      try
      {
        f1 = Float.parseFloat((String)((List)localObject).get(0));
        j = 1;
        i = 0;
        if (j >= ((List)localObject).size())
        {
          if (i <= paramAddressConfigBean.getValue().size()) {
            break label324;
          }
          i = k;
          label172:
          paramAddressConfigBean.setPriorityValue((String)paramAddressConfigBean.getValue().get(i));
          Log.d("priority address =  " + paramAddressConfigBean.getPriorityValue());
          if (this.mRouteMap.containsKey(paramAddressConfigBean.getName()))
          {
            localObject = ((ArrayList)this.mRouteMap.get(paramAddressConfigBean.getName())).iterator();
            while (((Iterator)localObject).hasNext()) {
              ((AddressConfigBean)((Iterator)localObject).next()).setPriorityValue((String)paramAddressConfigBean.getValue().get(i));
            }
          }
        }
        else
        {
          f2 = Float.parseFloat((String)((List)localObject).get(j));
        }
      }
      catch (Exception paramAddressConfigBean)
      {
        paramAddressConfigBean.printStackTrace();
        return;
      }
    }
    float f2;
    if (f2 < f1)
    {
      f1 = f2;
      i = j;
    }
    for (;;)
    {
      j += 1;
      break;
      label324:
      break label172;
    }
  }
  
  public void routeServerAddress()
  {
    clear();
    if (NetWorkUtil.isNetworkConnected(this.mContext))
    {
      Object localObject = ConfigManager.getInstance().getAddressConfig().iterator();
      int i;
      if (!((Iterator)localObject).hasNext()) {
        i = 0;
      }
      for (;;)
      {
        if (i >= this.mRouteList.size())
        {
          return;
          AddressConfigBean localAddressConfigBean = (AddressConfigBean)((Iterator)localObject).next();
          if (!localAddressConfigBean.isRoute()) {
            break;
          }
          initRouteData(localAddressConfigBean);
          break;
        }
        localObject = (AddressConfigBean)this.mRouteList.get(i);
        this.mThreadManager.submit(new PingService.1(this, (AddressConfigBean)localObject));
        i += 1;
      }
    }
    Log.d("network is unavailable,route server address failed!!!");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\PingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */