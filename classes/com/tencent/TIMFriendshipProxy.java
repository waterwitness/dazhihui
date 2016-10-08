package com.tencent;

import android.text.TextUtils;
import com.tencent.imcore.BytesVec;
import com.tencent.imcore.FriendGroupVec;
import com.tencent.imcore.FriendProfileVec;
import com.tencent.imcore.FriendshipProxy;
import com.tencent.imcore.IMCoreUser;
import com.tencent.imcore.StrVec;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TIMFriendshipProxy
{
  private static TIMFriendshipProxy inst = new TIMFriendshipProxy();
  private static final String tag = "MSF.C.TIMFriendshipProxy";
  private String identifier = "";
  
  private TIMFriendshipProxy() {}
  
  private TIMFriendshipProxy(String paramString)
  {
    this.identifier = paramString;
  }
  
  private FriendshipProxy getFriendshipProxy()
  {
    if (TextUtils.isEmpty(this.identifier)) {
      return TIMManager.getInstance().getCoreUser().getFriendShipPrxy();
    }
    return TIMManager.getInstanceById(this.identifier).getCoreUser().getFriendShipPrxy();
  }
  
  public static TIMFriendshipProxy getInstance()
  {
    inst.setIdentifier(TIMManager.getInstance().getIdentification());
    return inst;
  }
  
  public static TIMFriendshipProxy getInstanceById(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return inst;
    }
    TIMFriendshipProxy localTIMFriendshipProxy = new TIMFriendshipProxy(paramString);
    localTIMFriendshipProxy.setIdentifier(paramString);
    return localTIMFriendshipProxy;
  }
  
  public List<TIMUserProfile> getFriends()
  {
    FriendProfileVec localFriendProfileVec = new FriendProfileVec();
    if (getFriendshipProxy().getFriendList(localFriendProfileVec) == 0)
    {
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (i < localFriendProfileVec.size())
      {
        localArrayList.add(new TIMUserProfile(localFriendProfileVec.get(i)));
        i += 1;
      }
      return localArrayList;
    }
    return null;
  }
  
  public List<TIMFriendGroup> getFriendsByGroups(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramList != null) && (paramList.size() == 0)) {
      return localArrayList;
    }
    FriendGroupVec localFriendGroupVec = new FriendGroupVec();
    BytesVec localBytesVec = new BytesVec();
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        try
        {
          localBytesVec.pushBack(str.getBytes("utf-8"));
        }
        catch (UnsupportedEncodingException paramList)
        {
          paramList.printStackTrace();
          return null;
        }
      }
    }
    if (getFriendshipProxy().getFriendGroup(localBytesVec, localFriendGroupVec) != 0) {
      return null;
    }
    int i = 0;
    while (i < localFriendGroupVec.size())
    {
      localArrayList.add(new TIMFriendGroup(localFriendGroupVec.get(i)));
      i += 1;
    }
    return localArrayList;
  }
  
  public List<TIMUserProfile> getFriendsById(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramList == null) || (paramList.size() == 0)) {
      return localArrayList;
    }
    FriendProfileVec localFriendProfileVec = new FriendProfileVec();
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localStrVec.pushBack((String)paramList.next());
    }
    if (getFriendshipProxy().getFriendProfile(localStrVec, localFriendProfileVec) == 0)
    {
      int i = 0;
      while (i < localFriendProfileVec.size())
      {
        localArrayList.add(new TIMUserProfile(localFriendProfileVec.get(i)));
        i += 1;
      }
      return localArrayList;
    }
    return null;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */