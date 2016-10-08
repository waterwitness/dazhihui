package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class msg$Elem
  extends MessageMicro<Elem>
{
  public static final int ANON_GROUP_MSG_FIELD_NUMBER = 21;
  public static final int ARK_APP_FIELD_NUMBER = 36;
  public static final int BANKCODE_CTRL_INFO_FIELD_NUMBER = 29;
  public static final int CONFERENCE_TIPS_INFO_FIELD_NUMBER = 26;
  public static final int CRM_ELEM_FIELD_NUMBER = 25;
  public static final int CUSTOM_ELEM_FIELD_NUMBER = 31;
  public static final int CUSTOM_FACE_FIELD_NUMBER = 8;
  public static final int DELIVER_GIFT_MSG_FIELD_NUMBER = 39;
  public static final int ELEM_FLAGS2_FIELD_NUMBER = 9;
  public static final int ELEM_FLAGS_FIELD_NUMBER = 7;
  public static final int EXTRA_INFO_FIELD_NUMBER = 16;
  public static final int FACE_FIELD_NUMBER = 2;
  public static final int FSJ_MSG_ELEM_FIELD_NUMBER = 35;
  public static final int FUN_FACE_FIELD_NUMBER = 10;
  public static final int GENERAL_FLAGS_FIELD_NUMBER = 37;
  public static final int GROUP_FILE_FIELD_NUMBER = 13;
  public static final int HC_FLASH_PIC_FIELD_NUMBER = 38;
  public static final int LIFE_ONLINE_FIELD_NUMBER = 23;
  public static final int LOCATION_INFO_FIELD_NUMBER = 32;
  public static final int LOW_VERSION_TIPS_FIELD_NUMBER = 28;
  public static final int MARKET_FACE_FIELD_NUMBER = 6;
  public static final int MARKET_TRANS_FIELD_NUMBER = 15;
  public static final int NEAR_BY_MSG_FIELD_NUMBER = 30;
  public static final int NOT_ONLINE_IMAGE_FIELD_NUMBER = 4;
  public static final int ONLINE_IMAGE_FIELD_NUMBER = 3;
  public static final int PUB_ACCOUNT_FIELD_NUMBER = 18;
  public static final int PUB_ACC_INFO_FIELD_NUMBER = 33;
  public static final int PUB_GROUP_FIELD_NUMBER = 14;
  public static final int QQWALLET_MSG_FIELD_NUMBER = 24;
  public static final int QQ_LIVE_OLD_FIELD_NUMBER = 22;
  public static final int REDBAG_INFO_FIELD_NUMBER = 27;
  public static final int RICH_MSG_FIELD_NUMBER = 12;
  public static final int SECRET_FILE_FIELD_NUMBER = 11;
  public static final int SHAKE_WINDOW_FIELD_NUMBER = 17;
  public static final int SMALL_EMOJI_FIELD_NUMBER = 34;
  public static final int TEXT_FIELD_NUMBER = 1;
  public static final int TIPS_INFO_FIELD_NUMBER = 20;
  public static final int TRANS_ELEM_INFO_FIELD_NUMBER = 5;
  public static final int VIDEO_FILE_FIELD_NUMBER = 19;
  static final MessageMicro.FieldMap __fieldMap__;
  public msg.AnonymousGroupMsg anon_group_msg = new msg.AnonymousGroupMsg();
  public msg.ArkAppElem ark_app = new msg.ArkAppElem();
  public final PBBytesField bankcode_ctrl_info = PBField.initBytes(ByteStringMicro.EMPTY);
  public msg.ConferenceTipsInfo conference_tips_info = new msg.ConferenceTipsInfo();
  public msg.CrmElem crm_elem = new msg.CrmElem();
  public msg.CustomElem custom_elem = new msg.CustomElem();
  public msg.CustomFace custom_face = new msg.CustomFace();
  public msg.DeliverGiftMsg deliver_gift_msg = new msg.DeliverGiftMsg();
  public msg.ElemFlags elem_flags = new msg.ElemFlags();
  public msg.ElemFlags2 elem_flags2 = new msg.ElemFlags2();
  public msg.ExtraInfo extra_info = new msg.ExtraInfo();
  public msg.Face face = new msg.Face();
  public msg.FSJMessageElem fsj_msg_elem = new msg.FSJMessageElem();
  public msg.FunFace fun_face = new msg.FunFace();
  public msg.GeneralFlags general_flags = new msg.GeneralFlags();
  public msg.GroupFile group_file = new msg.GroupFile();
  public msg.CustomFace hc_flash_pic = new msg.CustomFace();
  public msg.LifeOnlineAccount life_online = new msg.LifeOnlineAccount();
  public msg.LocationInfo location_info = new msg.LocationInfo();
  public msg.LowVersionTips low_version_tips = new msg.LowVersionTips();
  public msg.MarketFace market_face = new msg.MarketFace();
  public msg.MarketTrans market_trans = new msg.MarketTrans();
  public msg.NearByMessageType near_by_msg = new msg.NearByMessageType();
  public msg.NotOnlineImage not_online_image = new msg.NotOnlineImage();
  public msg.OnlineImage online_image = new msg.OnlineImage();
  public msg.PubAccInfo pub_acc_info = new msg.PubAccInfo();
  public msg.PubAccount pub_account = new msg.PubAccount();
  public msg.PubGroup pub_group = new msg.PubGroup();
  public msg.QQLiveOld qq_live_old = new msg.QQLiveOld();
  public msg.QQWalletMsg qqwallet_msg = new msg.QQWalletMsg();
  public msg.RedBagInfo redbag_info = new msg.RedBagInfo();
  public msg.RichMsg rich_msg = new msg.RichMsg();
  public msg.SecretFileMsg secret_file = new msg.SecretFileMsg();
  public msg.ShakeWindow shake_window = new msg.ShakeWindow();
  public msg.SmallEmoji small_emoji = new msg.SmallEmoji();
  public msg.Text text = new msg.Text();
  public msg.TipsInfo tips_info = new msg.TipsInfo();
  public msg.TransElem trans_elem_info = new msg.TransElem();
  public msg.VideoFile video_file = new msg.VideoFile();
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34, 42, 50, 58, 66, 74, 82, 90, 98, 106, 114, 122, 130, 138, 146, 154, 162, 170, 178, 186, 194, 202, 210, 218, 226, 234, 242, 250, 258, 266, 274, 282, 290, 298, 306, 314 }, new String[] { "text", "face", "online_image", "not_online_image", "trans_elem_info", "market_face", "elem_flags", "custom_face", "elem_flags2", "fun_face", "secret_file", "rich_msg", "group_file", "pub_group", "market_trans", "extra_info", "shake_window", "pub_account", "video_file", "tips_info", "anon_group_msg", "qq_live_old", "life_online", "qqwallet_msg", "crm_elem", "conference_tips_info", "redbag_info", "low_version_tips", "bankcode_ctrl_info", "near_by_msg", "custom_elem", "location_info", "pub_acc_info", "small_emoji", "fsj_msg_elem", "ark_app", "general_flags", "hc_flash_pic", "deliver_gift_msg" }, new Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, localByteStringMicro, null, null, null, null, null, null, null, null, null, null }, Elem.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$Elem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */