package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$ElemFlags2$Inst
  extends MessageMicro<Inst>
{
  public static final int UINT32_APP_ID_FIELD_NUMBER = 1;
  public static final int UINT32_INST_ID_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16 }, new String[] { "uint32_app_id", "uint32_inst_id" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0) }, Inst.class);
  public final PBUInt32Field uint32_app_id = PBField.initUInt32(0);
  public final PBUInt32Field uint32_inst_id = PBField.initUInt32(0);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$ElemFlags2$Inst.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */