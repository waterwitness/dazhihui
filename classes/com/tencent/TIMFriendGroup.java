package com.tencent;

import com.tencent.imcore.FriendGroup;
import com.tencent.imcore.FriendProfile;
import com.tencent.imcore.FriendProfileVec;
import com.tencent.imcore.StrVec;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class TIMFriendGroup
{
  long count = 0L;
  String name = "";
  List<TIMUserProfile> profiles = new ArrayList();
  List<String> users = new ArrayList();
  
  TIMFriendGroup() {}
  
  TIMFriendGroup(FriendGroup paramFriendGroup)
  {
    try
    {
      setName(new String(paramFriendGroup.getName(), "utf-8"));
      setCount(paramFriendGroup.getCount());
      StrVec localStrVec = paramFriendGroup.getIdentifiers();
      localArrayList = new ArrayList();
      i = 0;
      while (i < localStrVec.size())
      {
        if (localStrVec.get(i).length() != 0) {
          localArrayList.add(localStrVec.get(i));
        }
        i += 1;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      ArrayList localArrayList;
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
      setUsers(localArrayList);
      paramFriendGroup = paramFriendGroup.getProfiles();
      int i = j;
      while (i < paramFriendGroup.size())
      {
        FriendProfile localFriendProfile = paramFriendGroup.get(i);
        if (localFriendProfile != null) {
          this.profiles.add(new TIMUserProfile(localFriendProfile));
        }
        i += 1;
      }
    }
  }
  
  public long getCount()
  {
    return this.count;
  }
  
  public String getGroupName()
  {
    return this.name;
  }
  
  public List<TIMUserProfile> getProfiles()
  {
    return this.profiles;
  }
  
  public List<String> getUsers()
  {
    return this.users;
  }
  
  void setCount(long paramLong)
  {
    this.count = paramLong;
  }
  
  void setName(String paramString)
  {
    this.name = paramString;
  }
  
  void setUsers(List<String> paramList)
  {
    this.users = paramList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */