package com.tencent;

import android.os.Handler;
import com.tencent.imcore.GroupTipsElem;
import com.tencent.imcore.GroupTipsElem_MemberInfo;
import com.tencent.imcore.GroupTipsElem_MemberInfoVec;
import com.tencent.imcore.IGroupUpdateCallback;
import com.tencent.imcore.StrVec;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.QLog;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

final class ᴵ
  extends IGroupUpdateCallback
{
  private static String a = "IMCoreGroupUpdateCallback";
  private String b;
  
  public ᴵ(String paramString)
  {
    this.b = paramString;
    swigReleaseOwnership();
  }
  
  public final void onMembersUpdate(GroupTipsElem paramGroupTipsElem)
  {
    int i = 0;
    TIMGroupMemberUpdateListener localTIMGroupMemberUpdateListener = TIMManager.getInstanceById(this.b).getGroupMemberUpdateListener();
    if (localTIMGroupMemberUpdateListener == null) {
      QLog.d(a, 1, "no group member update listener registered");
    }
    String str;
    Object localObject2;
    do
    {
      return;
      try
      {
        str = new String(paramGroupTipsElem.getGroup_id(), "utf-8");
        if (paramGroupTipsElem.getType() < 6)
        {
          TIMGroupTipsType localTIMGroupTipsType = TIMGroupTipsType.Join;
          switch (paramGroupTipsElem.getType())
          {
          default: 
            localObject2 = new ArrayList();
            i = 0;
            while (i < paramGroupTipsElem.getUser_list().size())
            {
              ((List)localObject2).add(paramGroupTipsElem.getUser_list().get(i));
              i += 1;
            }
          }
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          localUnsupportedEncodingException.printStackTrace();
          str = "";
          continue;
          localObject1 = TIMGroupTipsType.Join;
          continue;
          localObject1 = TIMGroupTipsType.Quit;
          continue;
          localObject1 = TIMGroupTipsType.Kick;
          continue;
          localObject1 = TIMGroupTipsType.SetAdmin;
          continue;
          localObject1 = TIMGroupTipsType.CancelAdmin;
        }
        QLog.d(a, 1, "member update, size " + ((List)localObject2).size());
        IMMsfCoreProxy.mainHandler.post(new ᵎ(this, localTIMGroupMemberUpdateListener, str, (TIMGroupTipsType)localObject1, (List)localObject2));
        return;
      }
    } while (paramGroupTipsElem.getType() != 7);
    Object localObject1 = new ArrayList();
    paramGroupTipsElem = paramGroupTipsElem.getMember_change_list();
    while (i < paramGroupTipsElem.size())
    {
      localObject2 = new TIMGroupTipsElemMemberInfo();
      ((TIMGroupTipsElemMemberInfo)localObject2).setIdentifier(paramGroupTipsElem.get(i).getIdentifier());
      ((TIMGroupTipsElemMemberInfo)localObject2).setShutupTime(paramGroupTipsElem.get(i).getShutup_time());
      ((List)localObject1).add(localObject2);
      i += 1;
    }
    QLog.d(a, 1, "member info update, size " + ((List)localObject1).size());
    IMMsfCoreProxy.mainHandler.post(new ᵔ(this, localTIMGroupMemberUpdateListener, str, (List)localObject1));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ᴵ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */