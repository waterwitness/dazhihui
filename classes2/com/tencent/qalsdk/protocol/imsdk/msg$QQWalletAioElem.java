package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class msg$QQWalletAioElem
  extends MessageMicro<QQWalletAioElem>
{
  public static final int BYTES_ACTIONS_PRIORITY_FIELD_NUMBER = 11;
  public static final int BYTES_BASEMAP_FIELD_NUMBER = 15;
  public static final int BYTES_BLACKSTRIPE_FIELD_NUMBER = 7;
  public static final int BYTES_CONTENT_FIELD_NUMBER = 5;
  public static final int BYTES_JUMP_URL_FIELD_NUMBER = 12;
  public static final int BYTES_LINKURL_FIELD_NUMBER = 6;
  public static final int BYTES_NATIVE_ANDROID_FIELD_NUMBER = 14;
  public static final int BYTES_NATIVE_IOS_FIELD_NUMBER = 13;
  public static final int BYTES_NOTICE_FIELD_NUMBER = 8;
  public static final int BYTES_SUBTITLE_FIELD_NUMBER = 4;
  public static final int BYTES_TITLE_FIELD_NUMBER = 3;
  public static final int UINT32_BACKGROUND_FIELD_NUMBER = 1;
  public static final int UINT32_ICON_FIELD_NUMBER = 2;
  public static final int UINT32_SUBTITLE_COLOR_FIELD_NUMBER = 10;
  public static final int UINT32_TITLE_COLOR_FIELD_NUMBER = 9;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_actions_priority = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_basemap = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_blackstripe = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_content = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_jump_url = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_linkurl = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_native_android = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_native_ios = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_notice = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_subtitle = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_title = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_background = PBField.initUInt32(0);
  public final PBUInt32Field uint32_icon = PBField.initUInt32(0);
  public final PBUInt32Field uint32_subtitle_color = PBField.initUInt32(0);
  public final PBUInt32Field uint32_title_color = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro4 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro5 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro6 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro7 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro8 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro9 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro10 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro11 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26, 34, 42, 50, 58, 66, 72, 80, 90, 98, 106, 114, 122 }, new String[] { "uint32_background", "uint32_icon", "bytes_title", "bytes_subtitle", "bytes_content", "bytes_linkurl", "bytes_blackstripe", "bytes_notice", "uint32_title_color", "uint32_subtitle_color", "bytes_actions_priority", "bytes_jump_url", "bytes_native_ios", "bytes_native_android", "bytes_basemap" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2, localByteStringMicro3, localByteStringMicro4, localByteStringMicro5, localByteStringMicro6, Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro7, localByteStringMicro8, localByteStringMicro9, localByteStringMicro10, localByteStringMicro11 }, QQWalletAioElem.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$QQWalletAioElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */