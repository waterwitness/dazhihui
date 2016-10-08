package com.tencent.qalsdk.im_open;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class mobroute$MobRouteSSOList
  extends MessageMicro<MobRouteSSOList>
{
  public static final int UINT32_TIMEOUT_FIELD_NUMBER = 1;
  public static final int VEC_HTTPLIST_FIELD_NUMBER = 3;
  public static final int VEC_TCPLIST_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "uint32_timeout", "vec_tcplist", "vec_httplist" }, new Object[] { Integer.valueOf(0), null, null }, MobRouteSSOList.class);
  public final PBUInt32Field uint32_timeout = PBField.initUInt32(0);
  public final PBRepeatMessageField<mobroute.MobRouteSSOListInfo> vec_httplist = PBField.initRepeatMessage(mobroute.MobRouteSSOListInfo.class);
  public final PBRepeatMessageField<mobroute.MobRouteSSOListInfo> vec_tcplist = PBField.initRepeatMessage(mobroute.MobRouteSSOListInfo.class);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\im_open\mobroute$MobRouteSSOList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */