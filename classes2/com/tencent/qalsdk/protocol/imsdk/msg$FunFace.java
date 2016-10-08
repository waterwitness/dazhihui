package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class msg$FunFace
  extends MessageMicro<FunFace>
{
  public static final int MSG_BOMB_FIELD_NUMBER = 2;
  public static final int MSG_TURNTABLE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "msg_turntable", "msg_bomb" }, new Object[] { null, null }, FunFace.class);
  public msg.FunFace.Bomb msg_bomb = new msg.FunFace.Bomb();
  public msg.FunFace.Turntable msg_turntable = new msg.FunFace.Turntable();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$FunFace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */