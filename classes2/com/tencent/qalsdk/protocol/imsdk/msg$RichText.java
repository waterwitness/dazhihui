package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class msg$RichText
  extends MessageMicro<RichText>
{
  public static final int ATTR_FIELD_NUMBER = 1;
  public static final int ELEMS_FIELD_NUMBER = 2;
  public static final int NOT_ONLINE_FILE_FIELD_NUMBER = 3;
  public static final int PTT_FIELD_NUMBER = 4;
  public static final int TMP_PTT_FIELD_NUMBER = 5;
  public static final int TRANS_211_TMP_MSG_FIELD_NUMBER = 6;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34, 42, 50 }, new String[] { "attr", "elems", "not_online_file", "ptt", "tmp_ptt", "trans_211_tmp_msg" }, new Object[] { null, null, null, null, null, null }, RichText.class);
  public msg.Attr attr = new msg.Attr();
  public final PBRepeatMessageField<msg.Elem> elems = PBField.initRepeatMessage(msg.Elem.class);
  public msg.NotOnlineFile not_online_file = new msg.NotOnlineFile();
  public msg.Ptt ptt = new msg.Ptt();
  public msg.TmpPtt tmp_ptt = new msg.TmpPtt();
  public msg.Trans211TmpMsg trans_211_tmp_msg = new msg.Trans211TmpMsg();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$RichText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */