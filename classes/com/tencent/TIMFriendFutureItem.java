package com.tencent;

import com.tencent.imcore.BytesMap;
import com.tencent.imcore.FriendFutureItem;
import com.tencent.imcore.FutureType;
import com.tencent.imcore.MapKeyFetcher;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class TIMFriendFutureItem
{
  private String addSource = "";
  private long addTime;
  private String addWording = "";
  private String identifier = "";
  private TIMUserProfile profile;
  private Map<String, String> recommendTags = new HashMap();
  private TIMFutureFriendType type;
  
  TIMFriendFutureItem(FriendFutureItem paramFriendFutureItem)
  {
    if (paramFriendFutureItem.getEType() == FutureType.FutureTypeRecommend)
    {
      this.type = TIMFutureFriendType.TIM_FUTURE_FRIEND_RECOMMEND_TYPE;
      int j = (int)paramFriendFutureItem.getMpRecommendTags().size();
      MapKeyFetcher localMapKeyFetcher = new MapKeyFetcher();
      localMapKeyFetcher.fetchMapKeys(paramFriendFutureItem.getMpRecommendTags());
      this.recommendTags.clear();
      int i = 0;
      for (;;)
      {
        if (i >= j) {
          break label219;
        }
        Object localObject2 = localMapKeyFetcher.getKey(i);
        Object localObject1 = localMapKeyFetcher.getValue(paramFriendFutureItem.getMpRecommendTags(), i);
        try
        {
          localObject2 = new String((byte[])localObject2, "utf-8");
          localObject1 = new String((byte[])localObject1, "utf-8");
          this.recommendTags.put(localObject2, localObject1);
          i += 1;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            localUnsupportedEncodingException2.printStackTrace();
          }
        }
      }
    }
    if (paramFriendFutureItem.getEType() == FutureType.FutureTypePendencyComeIn) {
      this.type = TIMFutureFriendType.TIM_FUTURE_FRIEND_PENDENCY_IN_TYPE;
    }
    try
    {
      for (;;)
      {
        this.addSource = new String(paramFriendFutureItem.getSAddSource(), "utf-8");
        this.addWording = new String(paramFriendFutureItem.getSAddWording(), "utf-8");
        label219:
        setIdentifier(paramFriendFutureItem.getSIdentifier());
        setAddTime(paramFriendFutureItem.getDdwAddTime());
        setProfile(new TIMUserProfile(paramFriendFutureItem.getStProfile()));
        return;
        if (paramFriendFutureItem.getEType() == FutureType.FutureTypePendencySendOut) {
          this.type = TIMFutureFriendType.TIM_FUTURE_FRIEND_PENDENCY_OUT_TYPE;
        } else if (paramFriendFutureItem.getEType() == FutureType.FutureTypeDecide) {
          this.type = TIMFutureFriendType.TIM_FUTURE_FRIEND_DECIDE_TYPE;
        }
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException1)
    {
      for (;;)
      {
        localUnsupportedEncodingException1.printStackTrace();
      }
    }
  }
  
  public String getAddSource()
  {
    return this.addSource;
  }
  
  public long getAddTime()
  {
    return this.addTime;
  }
  
  public String getAddWording()
  {
    return this.addWording;
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  public TIMUserProfile getProfile()
  {
    return this.profile;
  }
  
  public Map<String, String> getRecommendTags()
  {
    return this.recommendTags;
  }
  
  public TIMFutureFriendType getType()
  {
    return this.type;
  }
  
  void setAddSource(String paramString)
  {
    this.addSource = paramString;
  }
  
  void setAddTime(long paramLong)
  {
    this.addTime = paramLong;
  }
  
  void setAddWording(String paramString)
  {
    this.addWording = paramString;
  }
  
  void setIdentifier(String paramString)
  {
    this.identifier = paramString;
  }
  
  void setProfile(TIMUserProfile paramTIMUserProfile)
  {
    this.profile = paramTIMUserProfile;
  }
  
  void setType(TIMFutureFriendType paramTIMFutureFriendType)
  {
    this.type = paramTIMFutureFriendType;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendFutureItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */