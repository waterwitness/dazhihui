package com.tencent;

import android.text.TextUtils;
import com.tencent.imcore.GroupAssistant;
import com.tencent.imcore.GroupCacheInfoVec;
import com.tencent.imcore.IMCoreUser;
import com.tencent.imcore.StrVec;
import com.tencent.imsdk.QLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TIMGroupAssistant
{
  private static TIMGroupAssistant inst = new TIMGroupAssistant();
  private static final String tag = "MSF.C.TIMGroupAssistant";
  private String identifier = "";
  
  private TIMGroupAssistant() {}
  
  private TIMGroupAssistant(String paramString)
  {
    this.identifier = paramString;
  }
  
  private GroupAssistant getGroupAssistant()
  {
    if (TextUtils.isEmpty(this.identifier)) {
      return TIMManager.getInstance().getCoreUser().getGroupAssistant();
    }
    return TIMManager.getInstanceById(this.identifier).getCoreUser().getGroupAssistant();
  }
  
  public static TIMGroupAssistant getInstance()
  {
    inst.setIdentifier(TIMManager.getInstance().getIdentification());
    return inst;
  }
  
  public static TIMGroupAssistant getInstanceById(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return inst;
    }
    TIMGroupAssistant localTIMGroupAssistant = new TIMGroupAssistant(paramString);
    localTIMGroupAssistant.setIdentifier(paramString);
    return localTIMGroupAssistant;
  }
  
  public List<TIMGroupCacheInfo> getGroups(List<String> paramList)
  {
    if (!IMCoreWrapper.get().isReady())
    {
      QLog.e("MSF.C.TIMGroupAssistant", 1, "sdk not initialized");
      return null;
    }
    Object localObject = new StrVec();
    if ((paramList != null) && (paramList.size() != 0))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        if (TextUtils.isEmpty(str)) {
          QLog.w("MSF.C.TIMGroupAssistant", 1, "groupIds contain null or empty object");
        } else {
          ((StrVec)localObject).pushBack(str);
        }
      }
    }
    paramList = new GroupCacheInfoVec();
    if (TIMManager.getInstanceById(this.identifier).getCoreUser().getGroupAssistant().getGroups((StrVec)localObject, paramList) != 0) {
      return null;
    }
    localObject = new ArrayList();
    long l = paramList.size();
    if (l > 0L)
    {
      int i = 0;
      while (i < l)
      {
        ((List)localObject).add(new TIMGroupCacheInfo(paramList.get(i)));
        i += 1;
      }
    }
    QLog.d("MSF.C.TIMGroupAssistant", 1, "getGroupList size: " + l);
    return (List<TIMGroupCacheInfo>)localObject;
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  void setIdentifier(String paramString)
  {
    this.identifier = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupAssistant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */