package com.tencent.avsdk;

import android.util.Log;
import com.tencent.avsdk.Model.LabelMsgVo.LabelTypeItem;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class LiveVideoInfo
{
  private static final String TAG = "ilvb";
  private String City;
  private int CreateTime;
  private int FollowNum;
  private String ImgRoomUrl;
  private int Je;
  private int MaxMemberCount;
  private int MemberNum;
  private int MoneyUnit;
  private String OwnerAccount;
  private String OwnerAccountImg;
  private String OwnerAccountType;
  private String OwnerInfoUrl;
  private String OwnerName;
  private String OwnerTypeName;
  private int PV;
  private int PV5min;
  private int Rank;
  private String RoomId;
  private String RoomImg;
  private String RoomName;
  private String RoomShareUrl;
  private String RoomStatus;
  private String RoomTopic;
  private String RoomType;
  private int StopTime;
  private String TLSIMId;
  private String TLSVideoId;
  private String TagStatusTxt;
  private String[] TagTxt;
  private int UpNum;
  private int _LookStatus;
  private String _OwnerAccount;
  private String _OwnerName;
  private String _TLSIMId;
  private String _TLSVideoId;
  private String vbImgUrl;
  
  public static String decode(String paramString, List<LiveVideoInfo> paramList, List<LabelMsgVo.LabelTypeItem> paramList1)
  {
    if (paramString == null)
    {
      paramString = null;
      return paramString;
    }
    String str2 = "";
    String str1 = str2;
    for (;;)
    {
      try
      {
        JSONObject localJSONObject1 = new JSONObject(paramString);
        paramString = str2;
        if (localJSONObject1 == null) {
          break;
        }
        str1 = str2;
        localJSONObject1.optInt("Qid");
        str1 = str2;
        int i = localJSONObject1.optInt("Err");
        str1 = str2;
        localJSONObject1.optInt("Counter");
        str1 = str2;
        localJSONObject1 = localJSONObject1.optJSONObject("Data");
        paramString = str2;
        if (localJSONObject1 == null) {
          break;
        }
        str1 = str2;
        localJSONObject1.optInt("code");
        str1 = str2;
        paramString = localJSONObject1.optString("desc");
        if (i != 0)
        {
          str1 = str2;
          Log.e("ilvb", paramString);
          return null;
        }
        str1 = str2;
        localJSONObject1.optString("stack");
        str1 = str2;
        localJSONObject1 = localJSONObject1.optJSONObject("OutPut");
        paramString = str2;
        if (localJSONObject1 == null) {
          break;
        }
        str1 = str2;
        int k = localJSONObject1.optInt("TotalCount");
        str1 = str2;
        str2 = localJSONObject1.optString("NextPageUrl");
        str1 = str2;
        paramString = localJSONObject1.optJSONArray("RoomList");
        i = 0;
        if (i < k)
        {
          str1 = str2;
          JSONObject localJSONObject2 = paramString.optJSONObject(i);
          if (localJSONObject2 != null)
          {
            str1 = str2;
            LiveVideoInfo localLiveVideoInfo = new LiveVideoInfo();
            str1 = str2;
            localLiveVideoInfo.setRoomId(localJSONObject2.optString("RoomId"));
            str1 = str2;
            localLiveVideoInfo.setTLSVideoId(localJSONObject2.optString("TLSVideoId"));
            str1 = str2;
            localLiveVideoInfo.setTLSIMId(localJSONObject2.optString("TLSIMId"));
            str1 = str2;
            localLiveVideoInfo.setRoomName(localJSONObject2.optString("RoomName"));
            str1 = str2;
            localLiveVideoInfo.setOwnerAccount(localJSONObject2.optString("OwnerAccount"));
            str1 = str2;
            localLiveVideoInfo.setRoomStatus(localJSONObject2.optString("RoomStatus"));
            str1 = str2;
            localLiveVideoInfo.setPV(localJSONObject2.optInt("PV"));
            str1 = str2;
            localLiveVideoInfo.setPV5min(localJSONObject2.optInt("PV5min"));
            str1 = str2;
            localLiveVideoInfo.setFollowNum(localJSONObject2.optInt("FollowNum"));
            str1 = str2;
            localLiveVideoInfo.setMemberNum(localJSONObject2.optInt("MemberNum"));
            str1 = str2;
            localLiveVideoInfo.setCreateTime(localJSONObject2.optInt("CreateTime"));
            str1 = str2;
            localLiveVideoInfo.setStopTime(localJSONObject2.optInt("StopTime"));
            str1 = str2;
            localLiveVideoInfo.setRoomType(localJSONObject2.optString("RoomType"));
            str1 = str2;
            localLiveVideoInfo.setRoomImg(localJSONObject2.optString("RoomImg"));
            str1 = str2;
            localLiveVideoInfo.setRoomTopic(localJSONObject2.optString("RoomTopic"));
            str1 = str2;
            localLiveVideoInfo.setOwnerName(localJSONObject2.optString("OwnerName"));
            str1 = str2;
            localLiveVideoInfo.setOwnerAccountImg(localJSONObject2.optString("OwnerAccountImg"));
            str1 = str2;
            localLiveVideoInfo.setOwnerInfoUrl(localJSONObject2.optString("OwnerInfoUrl"));
            str1 = str2;
            localLiveVideoInfo.setMaxMemberCount(localJSONObject2.optInt("MaxMemberCount"));
            str1 = str2;
            localLiveVideoInfo.setUpNum(localJSONObject2.optInt("UpNum"));
            str1 = str2;
            localLiveVideoInfo.setOwnerAccountType(localJSONObject2.optString("OwnerAccountType"));
            str1 = str2;
            localLiveVideoInfo.setRoomShareUrl(localJSONObject2.optString("RoomShareUrl"));
            str1 = str2;
            localLiveVideoInfo.setImgRoomUrl(localJSONObject2.optString("ImgRoomUrl"));
            str1 = str2;
            localLiveVideoInfo.setOwnerTypeName(localJSONObject2.optString("OwnerTypeName"));
            str1 = str2;
            localLiveVideoInfo.setTagStatusTxt(localJSONObject2.optString("TagStatusTxt"));
            str1 = str2;
            localLiveVideoInfo.setmMoneyUnit(localJSONObject2.optInt("MoneyUnit"));
            str1 = str2;
            localLiveVideoInfo.setCity(localJSONObject2.optString("City"));
            str1 = str2;
            localLiveVideoInfo.setRank(localJSONObject2.optInt("Rank"));
            str1 = str2;
            localLiveVideoInfo.setJe(localJSONObject2.optInt("Je"));
            str1 = str2;
            JSONArray localJSONArray = localJSONObject2.optJSONArray("TagTxt");
            if (localJSONArray != null)
            {
              str1 = str2;
              if (localJSONArray.length() > 0)
              {
                str1 = str2;
                String[] arrayOfString = new String[localJSONArray.length()];
                int j = 0;
                str1 = str2;
                if (j < localJSONArray.length())
                {
                  str1 = str2;
                  arrayOfString[j] = localJSONArray.optString(j);
                  j += 1;
                  continue;
                }
                str1 = str2;
                localLiveVideoInfo.setTagTxt(arrayOfString);
              }
            }
            str1 = str2;
            localLiveVideoInfo.setVbImgUrl(localJSONObject2.optString("vbImgUrl"));
            str1 = str2;
            localLiveVideoInfo.set_LookStatus(localJSONObject2.optInt("_LookStatus"));
            str1 = str2;
            localLiveVideoInfo.set_OwnerAccount(localJSONObject2.optString("_OwnerAccount"));
            str1 = str2;
            localLiveVideoInfo.set_TLSVideoId(localJSONObject2.optString("_TLSVideoId"));
            str1 = str2;
            localLiveVideoInfo.set_TLSIMId(localJSONObject2.optString("_TLSIMId"));
            str1 = str2;
            localLiveVideoInfo.set_OwnerName(localJSONObject2.optString("_OwnerName"));
            str1 = str2;
            paramList.add(localLiveVideoInfo);
          }
        }
        else
        {
          str1 = str2;
          paramList = localJSONObject1.optJSONArray("LabelList");
          paramString = str2;
          if (paramList1 == null) {
            break;
          }
          paramString = str2;
          if (paramList == null) {
            break;
          }
          str1 = str2;
          paramList1.clear();
          i = 0;
          paramString = str2;
          str1 = str2;
          if (i >= paramList.length()) {
            break;
          }
          str1 = str2;
          paramString = new LabelMsgVo.LabelTypeItem();
          str1 = str2;
          paramString.setLabelType(paramList.getJSONObject(i).optInt("labelType"));
          str1 = str2;
          paramString.setlabelName(paramList.getJSONObject(i).optString("labelName"));
          str1 = str2;
          paramString.setRoomNum(paramList.getJSONObject(i).optInt("RoomNum"));
          str1 = str2;
          paramString.setMoreUrl(paramList.getJSONObject(i).optString("MoreUrl"));
          str1 = str2;
          paramList1.add(paramString);
          i += 1;
          continue;
        }
        i += 1;
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
        return str1;
      }
    }
  }
  
  public String getCity()
  {
    return this.City;
  }
  
  public int getCreateTime()
  {
    return this.CreateTime;
  }
  
  public int getFollowNum()
  {
    return this.FollowNum;
  }
  
  public String getImgRoomUrl()
  {
    return this.ImgRoomUrl;
  }
  
  public int getJe()
  {
    return this.Je;
  }
  
  public int getMaxMemberCount()
  {
    return this.MaxMemberCount;
  }
  
  public int getMemberNum()
  {
    return this.MemberNum;
  }
  
  public String getOwnerAccount()
  {
    return this.OwnerAccount;
  }
  
  public String getOwnerAccountImg()
  {
    return this.OwnerAccountImg;
  }
  
  public String getOwnerAccountType()
  {
    return this.OwnerAccountType;
  }
  
  public String getOwnerInfoUrl()
  {
    return this.OwnerInfoUrl;
  }
  
  public String getOwnerName()
  {
    return this.OwnerName;
  }
  
  public String getOwnerTypeName()
  {
    return this.OwnerTypeName;
  }
  
  public int getPV()
  {
    return this.PV;
  }
  
  public int getPV5min()
  {
    return this.PV5min;
  }
  
  public int getRank()
  {
    return this.Rank;
  }
  
  public String getRoomId()
  {
    return this.RoomId;
  }
  
  public String getRoomImg()
  {
    return this.RoomImg;
  }
  
  public String getRoomName()
  {
    return this.RoomName;
  }
  
  public String getRoomShareUrl()
  {
    return this.RoomShareUrl;
  }
  
  public String getRoomStatus()
  {
    return this.RoomStatus;
  }
  
  public String getRoomStatusName()
  {
    if (this.RoomStatus.equals("1")) {
      return "正在直播";
    }
    if (this.RoomType.equals("2")) {
      return "未开播";
    }
    return "";
  }
  
  public String getRoomTopic()
  {
    return this.RoomTopic;
  }
  
  public String getRoomType()
  {
    return this.RoomType;
  }
  
  public String getRoomTypeName()
  {
    if (this.RoomType.equals("1")) {
      return "视频直播";
    }
    if (this.RoomType.equals("2")) {
      return "图文直播";
    }
    return "";
  }
  
  public int getStopTime()
  {
    return this.StopTime;
  }
  
  public String getTLSIMId()
  {
    return this.TLSIMId;
  }
  
  public String getTLSVideoId()
  {
    return this.TLSVideoId;
  }
  
  public String getTagStatusTxt()
  {
    return this.TagStatusTxt;
  }
  
  public String[] getTagTxt()
  {
    return this.TagTxt;
  }
  
  public int getUpNum()
  {
    return this.UpNum;
  }
  
  public String getVbImgUrl()
  {
    return this.vbImgUrl;
  }
  
  public int get_LookStatus()
  {
    return this._LookStatus;
  }
  
  public String get_OwnerAccount()
  {
    return this._OwnerAccount;
  }
  
  public String get_OwnerName()
  {
    return this._OwnerName;
  }
  
  public String get_TLSIMId()
  {
    return this._TLSIMId;
  }
  
  public String get_TLSVideoId()
  {
    return this._TLSVideoId;
  }
  
  public int getmMoneyUnit()
  {
    return this.MoneyUnit;
  }
  
  public void setCity(String paramString)
  {
    this.City = paramString;
  }
  
  public void setCreateTime(int paramInt)
  {
    this.CreateTime = paramInt;
  }
  
  public void setFollowNum(int paramInt)
  {
    this.FollowNum = paramInt;
  }
  
  public void setImgRoomUrl(String paramString)
  {
    this.ImgRoomUrl = paramString;
  }
  
  public void setJe(int paramInt)
  {
    this.Je = paramInt;
  }
  
  public void setMaxMemberCount(int paramInt)
  {
    this.MaxMemberCount = paramInt;
  }
  
  public void setMemberNum(int paramInt)
  {
    this.MemberNum = paramInt;
  }
  
  public void setOwnerAccount(String paramString)
  {
    this.OwnerAccount = paramString;
  }
  
  public void setOwnerAccountImg(String paramString)
  {
    this.OwnerAccountImg = paramString;
  }
  
  public void setOwnerAccountType(String paramString)
  {
    this.OwnerAccountType = paramString;
  }
  
  public void setOwnerInfoUrl(String paramString)
  {
    this.OwnerInfoUrl = paramString;
  }
  
  public void setOwnerName(String paramString)
  {
    this.OwnerName = paramString;
  }
  
  public void setOwnerTypeName(String paramString)
  {
    this.OwnerTypeName = paramString;
  }
  
  public void setPV(int paramInt)
  {
    this.PV = paramInt;
  }
  
  public void setPV5min(int paramInt)
  {
    this.PV5min = paramInt;
  }
  
  public void setRank(int paramInt)
  {
    this.Rank = paramInt;
  }
  
  public void setRoomId(String paramString)
  {
    this.RoomId = paramString;
  }
  
  public void setRoomImg(String paramString)
  {
    this.RoomImg = paramString;
  }
  
  public void setRoomName(String paramString)
  {
    this.RoomName = paramString;
  }
  
  public void setRoomShareUrl(String paramString)
  {
    this.RoomShareUrl = paramString;
  }
  
  public void setRoomStatus(String paramString)
  {
    this.RoomStatus = paramString;
  }
  
  public void setRoomTopic(String paramString)
  {
    this.RoomTopic = paramString;
  }
  
  public void setRoomType(String paramString)
  {
    this.RoomType = paramString;
  }
  
  public void setStopTime(int paramInt)
  {
    this.StopTime = paramInt;
  }
  
  public void setTLSIMId(String paramString)
  {
    this.TLSIMId = paramString;
  }
  
  public void setTLSVideoId(String paramString)
  {
    this.TLSVideoId = paramString;
  }
  
  public void setTagStatusTxt(String paramString)
  {
    this.TagStatusTxt = paramString;
  }
  
  public void setTagTxt(String[] paramArrayOfString)
  {
    this.TagTxt = paramArrayOfString;
  }
  
  public void setUpNum(int paramInt)
  {
    this.UpNum = paramInt;
  }
  
  public void setVbImgUrl(String paramString)
  {
    this.vbImgUrl = paramString;
  }
  
  public void set_LookStatus(int paramInt)
  {
    this._LookStatus = paramInt;
  }
  
  public void set_OwnerAccount(String paramString)
  {
    this._OwnerAccount = paramString;
  }
  
  public void set_OwnerName(String paramString)
  {
    this._OwnerName = paramString;
  }
  
  public void set_TLSIMId(String paramString)
  {
    this._TLSIMId = paramString;
  }
  
  public void set_TLSVideoId(String paramString)
  {
    this._TLSVideoId = paramString;
  }
  
  public void setmMoneyUnit(int paramInt)
  {
    this.MoneyUnit = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\LiveVideoInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */