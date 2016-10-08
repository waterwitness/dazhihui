package com.tencent;

import android.text.TextUtils;
import com.tencent.imcore.CustomElem;
import com.tencent.imcore.Elem;
import com.tencent.imcore.FaceElem;
import com.tencent.imcore.FileElem;
import com.tencent.imcore.ImageElem;
import com.tencent.imcore.LocationElem;
import com.tencent.imcore.Msg;
import com.tencent.imcore.MsgElemType;
import com.tencent.imcore.SoundElem;
import com.tencent.imcore.TextElem;
import com.tencent.imcore.VideoElem;
import com.tencent.imsdk.QLog;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class TIMMessage
{
  private static final TIMElem defaultElem = new ˆﹳ();
  private static final String tag = "imsdk.TIMMessage";
  private TIMConversation conversation;
  public Msg msg;
  
  public TIMMessage()
  {
    try
    {
      this.msg = Msg.newMsg();
      this.conversation = new TIMConversation();
      return;
    }
    catch (UnknownError localUnknownError)
    {
      QLog.e("imsdk.TIMMessage", 1, IMFunc.getExceptionInfo(localUnknownError));
      throw new OutOfMemoryError();
    }
  }
  
  TIMMessage(Msg paramMsg)
  {
    try
    {
      this.msg = Msg.newMsg(paramMsg);
      this.conversation = new TIMConversation();
      this.conversation.fromSession(this.msg.session());
      return;
    }
    catch (UnknownError paramMsg)
    {
      QLog.e("imsdk.TIMMessage", 1, IMFunc.getExceptionInfo(paramMsg));
      throw new OutOfMemoryError();
    }
  }
  
  static TIMImageElem buildImageElem(Elem paramElem)
  {
    TIMImageElem localTIMImageElem = buildImageElem(paramElem.getImage());
    try
    {
      String str = new String(paramElem.getResource(), "utf-8");
      localTIMImageElem.setPath(str);
      localTIMImageElem.setImageFormat(paramElem.getImage().getFormat());
      localTIMImageElem.setLevel(paramElem.getImage().getLevel());
      return localTIMImageElem;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
        localObject = "";
      }
    }
    catch (Throwable paramElem)
    {
      paramElem = IMFunc.getExceptionInfo(paramElem);
      QLog.e("imsdk.TIMMessage", 1, paramElem);
      Object localObject = TIMManager.getInstance().getExceptionListener();
      if (localObject != null) {
        ((TIMExceptionListener)localObject).onException(paramElem);
      }
    }
    return localTIMImageElem;
  }
  
  static TIMImageElem buildImageElem(ImageElem paramImageElem)
  {
    TIMImageElem localTIMImageElem = new TIMImageElem();
    TIMImage localTIMImage;
    if ((paramImageElem.getOrig_url() != null) && (paramImageElem.getOrig_url().length() > 0))
    {
      localTIMImage = new TIMImage();
      localTIMImage.setType(TIMImageType.Original);
      localTIMImage.setUuid(paramImageElem.getFileid());
      localTIMImage.setHeight(paramImageElem.getPic_height());
      localTIMImage.setWidth(paramImageElem.getPic_width());
      localTIMImage.setSize(paramImageElem.getPic_size());
      localTIMImage.setUrl(paramImageElem.getOrig_url());
      localTIMImageElem.getImageList().add(localTIMImage);
    }
    if ((paramImageElem.getThumb_url() != null) && (paramImageElem.getThumb_url().length() > 0))
    {
      localTIMImage = new TIMImage();
      localTIMImage.setType(TIMImageType.Thumb);
      localTIMImage.setUuid(paramImageElem.getFileid());
      localTIMImage.setHeight(paramImageElem.getPic_thumb_height());
      localTIMImage.setWidth(paramImageElem.getPic_thumb_width());
      localTIMImage.setSize(paramImageElem.getPic_thumb_size());
      localTIMImage.setUrl(paramImageElem.getThumb_url());
      localTIMImageElem.getImageList().add(localTIMImage);
    }
    if ((paramImageElem.getLarge_url() != null) && (paramImageElem.getLarge_url().length() > 0))
    {
      localTIMImage = new TIMImage();
      localTIMImage.setType(TIMImageType.Large);
      localTIMImage.setUuid(paramImageElem.getFileid());
      localTIMImage.setHeight(paramImageElem.getPic_large_height());
      localTIMImage.setWidth(paramImageElem.getPic_large_width());
      localTIMImage.setSize(paramImageElem.getPic_large_size());
      localTIMImage.setUrl(paramImageElem.getLarge_url());
      localTIMImageElem.getImageList().add(localTIMImage);
    }
    localTIMImageElem.setTaskId(paramImageElem.getTaskid());
    return localTIMImageElem;
  }
  
  /* Error */
  static TIMVideoElem buildVideoElem(Elem paramElem)
  {
    // Byte code:
    //   0: new 234	com/tencent/TIMVideoElem
    //   3: dup
    //   4: invokespecial 235	com/tencent/TIMVideoElem:<init>	()V
    //   7: astore_1
    //   8: aload_0
    //   9: invokevirtual 239	com/tencent/imcore/Elem:getVideo	()Lcom/tencent/imcore/VideoElem;
    //   12: astore_0
    //   13: aload_0
    //   14: ifnull +221 -> 235
    //   17: aload_1
    //   18: aload_0
    //   19: invokevirtual 244	com/tencent/imcore/VideoElem:getTaskid	()J
    //   22: invokevirtual 246	com/tencent/TIMVideoElem:setTaskId	(J)V
    //   25: new 248	com/tencent/TIMVideo
    //   28: dup
    //   29: invokespecial 249	com/tencent/TIMVideo:<init>	()V
    //   32: astore_2
    //   33: aload_2
    //   34: aload_0
    //   35: invokevirtual 252	com/tencent/imcore/VideoElem:getVideo_duration	()J
    //   38: invokevirtual 255	com/tencent/TIMVideo:setDuaration	(J)V
    //   41: aload_2
    //   42: aload_0
    //   43: invokevirtual 258	com/tencent/imcore/VideoElem:getVideo_size	()J
    //   46: invokevirtual 259	com/tencent/TIMVideo:setSize	(J)V
    //   49: aload_0
    //   50: invokevirtual 262	com/tencent/imcore/VideoElem:getVideo_type	()[B
    //   53: ifnull +44 -> 97
    //   56: aload_0
    //   57: invokevirtual 265	com/tencent/imcore/VideoElem:getVideoId	()[B
    //   60: ifnull +37 -> 97
    //   63: aload_2
    //   64: new 84	java/lang/String
    //   67: dup
    //   68: aload_0
    //   69: invokevirtual 262	com/tencent/imcore/VideoElem:getVideo_type	()[B
    //   72: ldc 90
    //   74: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   77: invokevirtual 267	com/tencent/TIMVideo:setType	(Ljava/lang/String;)V
    //   80: aload_2
    //   81: new 84	java/lang/String
    //   84: dup
    //   85: aload_0
    //   86: invokevirtual 265	com/tencent/imcore/VideoElem:getVideoId	()[B
    //   89: ldc 90
    //   91: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   94: invokevirtual 268	com/tencent/TIMVideo:setUuid	(Ljava/lang/String;)V
    //   97: aload_1
    //   98: aload_2
    //   99: invokevirtual 272	com/tencent/TIMVideoElem:setVideo	(Lcom/tencent/TIMVideo;)V
    //   102: new 274	com/tencent/TIMSnapshot
    //   105: dup
    //   106: invokespecial 275	com/tencent/TIMSnapshot:<init>	()V
    //   109: astore_2
    //   110: aload_2
    //   111: aload_0
    //   112: invokevirtual 278	com/tencent/imcore/VideoElem:getImage_size	()J
    //   115: invokevirtual 279	com/tencent/TIMSnapshot:setSize	(J)V
    //   118: aload_2
    //   119: aload_0
    //   120: invokevirtual 282	com/tencent/imcore/VideoElem:getImage_height	()J
    //   123: invokevirtual 283	com/tencent/TIMSnapshot:setHeight	(J)V
    //   126: aload_2
    //   127: aload_0
    //   128: invokevirtual 286	com/tencent/imcore/VideoElem:getImage_width	()J
    //   131: invokevirtual 287	com/tencent/TIMSnapshot:setWidth	(J)V
    //   134: aload_0
    //   135: invokevirtual 290	com/tencent/imcore/VideoElem:getImageId	()[B
    //   138: ifnull +44 -> 182
    //   141: aload_0
    //   142: invokevirtual 293	com/tencent/imcore/VideoElem:getImage_type	()[B
    //   145: ifnull +37 -> 182
    //   148: aload_2
    //   149: new 84	java/lang/String
    //   152: dup
    //   153: aload_0
    //   154: invokevirtual 290	com/tencent/imcore/VideoElem:getImageId	()[B
    //   157: ldc 90
    //   159: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   162: invokevirtual 294	com/tencent/TIMSnapshot:setUuid	(Ljava/lang/String;)V
    //   165: aload_2
    //   166: new 84	java/lang/String
    //   169: dup
    //   170: aload_0
    //   171: invokevirtual 293	com/tencent/imcore/VideoElem:getImage_type	()[B
    //   174: ldc 90
    //   176: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   179: invokevirtual 295	com/tencent/TIMSnapshot:setType	(Ljava/lang/String;)V
    //   182: aload_1
    //   183: aload_2
    //   184: invokevirtual 299	com/tencent/TIMVideoElem:setSnapshot	(Lcom/tencent/TIMSnapshot;)V
    //   187: aload_0
    //   188: invokevirtual 302	com/tencent/imcore/VideoElem:getImage_path	()[B
    //   191: ifnull +44 -> 235
    //   194: aload_0
    //   195: invokevirtual 305	com/tencent/imcore/VideoElem:getVideo_path	()[B
    //   198: ifnull +37 -> 235
    //   201: aload_1
    //   202: new 84	java/lang/String
    //   205: dup
    //   206: aload_0
    //   207: invokevirtual 302	com/tencent/imcore/VideoElem:getImage_path	()[B
    //   210: ldc 90
    //   212: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   215: invokevirtual 308	com/tencent/TIMVideoElem:setSnapshotPath	(Ljava/lang/String;)V
    //   218: aload_1
    //   219: new 84	java/lang/String
    //   222: dup
    //   223: aload_0
    //   224: invokevirtual 305	com/tencent/imcore/VideoElem:getVideo_path	()[B
    //   227: ldc 90
    //   229: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   232: invokevirtual 311	com/tencent/TIMVideoElem:setVideoPath	(Ljava/lang/String;)V
    //   235: aload_1
    //   236: areturn
    //   237: astore_3
    //   238: aload_3
    //   239: invokevirtual 118	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   242: goto -145 -> 97
    //   245: astore_0
    //   246: aload_0
    //   247: invokestatic 46	com/tencent/IMFunc:getExceptionInfo	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   250: astore_0
    //   251: ldc 10
    //   253: iconst_1
    //   254: aload_0
    //   255: invokestatic 52	com/tencent/imsdk/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   258: invokestatic 126	com/tencent/TIMManager:getInstance	()Lcom/tencent/TIMManager;
    //   261: invokevirtual 130	com/tencent/TIMManager:getExceptionListener	()Lcom/tencent/TIMExceptionListener;
    //   264: astore_2
    //   265: aload_2
    //   266: ifnull -31 -> 235
    //   269: aload_2
    //   270: aload_0
    //   271: invokeinterface 135 2 0
    //   276: aload_1
    //   277: areturn
    //   278: astore_3
    //   279: aload_3
    //   280: invokevirtual 118	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   283: goto -101 -> 182
    //   286: astore_0
    //   287: aload_0
    //   288: invokevirtual 118	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   291: aload_1
    //   292: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	293	0	paramElem	Elem
    //   7	285	1	localTIMVideoElem	TIMVideoElem
    //   32	238	2	localObject	Object
    //   237	2	3	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   278	2	3	localUnsupportedEncodingException2	UnsupportedEncodingException
    // Exception table:
    //   from	to	target	type
    //   49	97	237	java/io/UnsupportedEncodingException
    //   8	13	245	java/lang/Throwable
    //   17	49	245	java/lang/Throwable
    //   49	97	245	java/lang/Throwable
    //   97	134	245	java/lang/Throwable
    //   134	182	245	java/lang/Throwable
    //   182	187	245	java/lang/Throwable
    //   187	235	245	java/lang/Throwable
    //   238	242	245	java/lang/Throwable
    //   279	283	245	java/lang/Throwable
    //   287	291	245	java/lang/Throwable
    //   134	182	278	java/io/UnsupportedEncodingException
    //   187	235	286	java/io/UnsupportedEncodingException
  }
  
  public boolean DeleteFromStorage()
  {
    if (this.msg != null) {
      return this.msg.deleteFromStorage();
    }
    QLog.i("imsdk.TIMMessage", 1, "msg is null");
    return false;
  }
  
  public int addElement(TIMElem paramTIMElem)
  {
    if (paramTIMElem == null) {
      return 1;
    }
    if (paramTIMElem.getType() == TIMElemType.Invalid) {
      return 1;
    }
    Elem localElem = new Elem();
    Object localObject;
    if (paramTIMElem.getType() == TIMElemType.Text)
    {
      localElem.setType(MsgElemType.kText);
      localObject = new TextElem();
      paramTIMElem = (TIMTextElem)paramTIMElem;
    }
    for (;;)
    {
      try
      {
        ((TextElem)localObject).setContent(paramTIMElem.getText().getBytes("utf-8"));
        localElem.setText((TextElem)localObject);
        this.msg.addElem(localElem);
        return 0;
      }
      catch (Exception paramTIMElem)
      {
        paramTIMElem.printStackTrace();
        return 1;
      }
      if (paramTIMElem.getType() == TIMElemType.Image)
      {
        localElem.setType(MsgElemType.kPicNew);
        localObject = new ImageElem();
        paramTIMElem = (TIMImageElem)paramTIMElem;
        if (paramTIMElem.getPath() == null) {
          return 1;
        }
        ((ImageElem)localObject).setLevel(paramTIMElem.getLevel());
        ((ImageElem)localObject).setFormat(paramTIMElem.getImageFormat());
        try
        {
          localElem.setResource(paramTIMElem.getPath().getBytes("utf-8"));
          localElem.setImage((ImageElem)localObject);
        }
        catch (Exception paramTIMElem)
        {
          paramTIMElem.printStackTrace();
          return 1;
        }
      }
      int i;
      if (paramTIMElem.getType() == TIMElemType.Sound)
      {
        i = 0;
        while (i < this.msg.elemSize())
        {
          if (this.msg.elemType(i) == MsgElemType.kPttNew) {
            return 1;
          }
          i += 1;
        }
        localElem.setType(MsgElemType.kPttNew);
        localObject = new SoundElem();
        paramTIMElem = (TIMSoundElem)paramTIMElem;
        if ((TextUtils.isEmpty(paramTIMElem.getPath())) && (paramTIMElem.getData() == null)) {
          return 1;
        }
        if (paramTIMElem.getData() != null) {
          localElem.setResource(paramTIMElem.getData());
        }
        ((SoundElem)localObject).setFile_time((int)paramTIMElem.getDuration());
        ((SoundElem)localObject).setFile_size((int)paramTIMElem.getDataSize());
        if (!TextUtils.isEmpty(paramTIMElem.getPath())) {}
        try
        {
          ((SoundElem)localObject).setFile_path(paramTIMElem.getPath().getBytes("utf-8"));
          localElem.setSound((SoundElem)localObject);
        }
        catch (UnsupportedEncodingException paramTIMElem)
        {
          for (;;)
          {
            paramTIMElem.printStackTrace();
          }
        }
      }
      if (paramTIMElem.getType() == TIMElemType.File)
      {
        i = 0;
        while (i < this.msg.elemSize())
        {
          if (this.msg.elemType(i) == MsgElemType.kFile) {
            return 1;
          }
          i += 1;
        }
        localElem.setType(MsgElemType.kFile);
        localObject = new FileElem();
        paramTIMElem = (TIMFileElem)paramTIMElem;
        if ((TextUtils.isEmpty(paramTIMElem.getPath())) && (paramTIMElem.getData() == null)) {
          return 1;
        }
        if (paramTIMElem.getData() != null) {
          localElem.setResource(paramTIMElem.getData());
        }
        try
        {
          if (!TextUtils.isEmpty(paramTIMElem.getPath())) {
            ((FileElem)localObject).setFile_path(paramTIMElem.getPath().getBytes("utf-8"));
          }
          if (!TextUtils.isEmpty(paramTIMElem.getFileName())) {
            ((FileElem)localObject).setFile_name(paramTIMElem.getFileName().getBytes("utf-8"));
          }
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            localException1.printStackTrace();
          }
        }
        ((FileElem)localObject).setFile_size(paramTIMElem.getFileSize());
        localElem.setFile((FileElem)localObject);
        continue;
      }
      if (paramTIMElem.getType() == TIMElemType.Custom)
      {
        localElem.setType(MsgElemType.kCustom);
        localObject = new CustomElem();
        paramTIMElem = (TIMCustomElem)paramTIMElem;
        ((CustomElem)localObject).setData(paramTIMElem.getData());
        ((CustomElem)localObject).setExt(paramTIMElem.getExt());
        ((CustomElem)localObject).setSound(paramTIMElem.getSound());
        try
        {
          ((CustomElem)localObject).setDesc(paramTIMElem.getDesc().getBytes("utf-8"));
          localElem.setCustom((CustomElem)localObject);
        }
        catch (Exception paramTIMElem)
        {
          for (;;)
          {
            paramTIMElem.printStackTrace();
          }
        }
      }
      if (paramTIMElem.getType() == TIMElemType.Location)
      {
        localElem.setType(MsgElemType.kLocation);
        localObject = new LocationElem();
        paramTIMElem = (TIMLocationElem)paramTIMElem;
        try
        {
          ((LocationElem)localObject).setDesc(paramTIMElem.getDesc().getBytes("utf-8"));
          ((LocationElem)localObject).setLatitude(paramTIMElem.getLatitude());
          ((LocationElem)localObject).setLongitude(paramTIMElem.getLongitude());
          localElem.setLocation((LocationElem)localObject);
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            localException2.printStackTrace();
          }
        }
      }
      if (paramTIMElem.getType() == TIMElemType.Face)
      {
        localElem.setType(MsgElemType.kFace);
        localObject = new FaceElem();
        paramTIMElem = (TIMFaceElem)paramTIMElem;
        ((FaceElem)localObject).setIndex(paramTIMElem.getIndex());
        if (paramTIMElem.getData() != null) {
          ((FaceElem)localObject).setBuf(paramTIMElem.getData());
        }
        localElem.setFace((FaceElem)localObject);
        continue;
      }
      if (paramTIMElem.getType() != TIMElemType.Video) {
        continue;
      }
      localElem.setType(MsgElemType.kVideo);
      localObject = new VideoElem();
      paramTIMElem = (TIMVideoElem)paramTIMElem;
      if ((paramTIMElem.getSnapshotPath() == null) || (paramTIMElem.getSnapshotPath().length() == 0))
      {
        QLog.d("imsdk.TIMMessage", 1, "snapshot path error");
        return 1;
      }
      if ((paramTIMElem.getSnapshotInfo() == null) || (paramTIMElem.getSnapshotInfo().getType() == null))
      {
        QLog.d("imsdk.TIMMessage", 1, "snapshot type error");
        return 1;
      }
      if ((paramTIMElem.getVideoPath() == null) || (paramTIMElem.getVideoPath().length() == 0))
      {
        QLog.d("imsdk.TIMMessage", 1, "video path error");
        return 1;
      }
      if ((paramTIMElem.getVideoInfo() == null) || (paramTIMElem.getVideoInfo().getType() == null))
      {
        QLog.d("imsdk.TIMMessage", 1, "video type error");
        return 1;
      }
      try
      {
        ((VideoElem)localObject).setVideo_path(paramTIMElem.getVideoPath().getBytes("utf-8"));
        ((VideoElem)localObject).setImage_path(paramTIMElem.getSnapshotPath().getBytes("utf-8"));
        ((VideoElem)localObject).setImage_type(paramTIMElem.getSnapshotInfo().getType().getBytes("utf-8"));
        ((VideoElem)localObject).setVideo_type(paramTIMElem.getVideoInfo().getType().getBytes("utf-8"));
        localElem.setResource(TIMManager.getInstance().getVideoCachePath().getBytes("utf-8"));
        ((VideoElem)localObject).setImage_height(paramTIMElem.getSnapshotInfo().getHeight());
        ((VideoElem)localObject).setImage_width(paramTIMElem.getSnapshotInfo().getWidth());
        ((VideoElem)localObject).setVideo_duration(paramTIMElem.getVideoInfo().getDuaration());
        localElem.setVideo((VideoElem)localObject);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
    }
  }
  
  public TIMConversation getConversation()
  {
    return this.conversation;
  }
  
  public int getCustomInt()
  {
    if (this.msg == null) {
      return 0;
    }
    return this.msg.customInt();
  }
  
  public String getCustomStr()
  {
    if (this.msg == null) {
      return "";
    }
    return this.msg.customStr();
  }
  
  /* Error */
  public TIMElem getElement(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	com/tencent/TIMMessage:msg	Lcom/tencent/imcore/Msg;
    //   4: ifnull +7 -> 11
    //   7: iload_1
    //   8: ifge +9 -> 17
    //   11: getstatic 23	com/tencent/TIMMessage:defaultElem	Lcom/tencent/TIMElem;
    //   14: astore_2
    //   15: aload_2
    //   16: areturn
    //   17: aload_0
    //   18: getfield 35	com/tencent/TIMMessage:msg	Lcom/tencent/imcore/Msg;
    //   21: iload_1
    //   22: i2l
    //   23: invokevirtual 410	com/tencent/imcore/Msg:elemType	(J)Lcom/tencent/imcore/MsgElemType;
    //   26: astore_2
    //   27: aload_0
    //   28: getfield 35	com/tencent/TIMMessage:msg	Lcom/tencent/imcore/Msg;
    //   31: iload_1
    //   32: i2l
    //   33: invokevirtual 655	com/tencent/imcore/Msg:getElem	(J)Lcom/tencent/imcore/Elem;
    //   36: astore 4
    //   38: aload_2
    //   39: getstatic 658	com/tencent/imcore/MsgElemType:kInvalid	Lcom/tencent/imcore/MsgElemType;
    //   42: if_acmpne +7 -> 49
    //   45: getstatic 23	com/tencent/TIMMessage:defaultElem	Lcom/tencent/TIMElem;
    //   48: areturn
    //   49: aload_2
    //   50: getstatic 347	com/tencent/imcore/MsgElemType:kText	Lcom/tencent/imcore/MsgElemType;
    //   53: if_acmpne +82 -> 135
    //   56: new 355	com/tencent/TIMTextElem
    //   59: dup
    //   60: invokespecial 659	com/tencent/TIMTextElem:<init>	()V
    //   63: astore_3
    //   64: new 84	java/lang/String
    //   67: dup
    //   68: aload 4
    //   70: invokevirtual 662	com/tencent/imcore/Elem:getText	()Lcom/tencent/imcore/TextElem;
    //   73: invokevirtual 665	com/tencent/imcore/TextElem:getContent	()[B
    //   76: ldc 90
    //   78: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   81: astore_2
    //   82: aload_3
    //   83: aload_2
    //   84: invokevirtual 667	com/tencent/TIMTextElem:setText	(Ljava/lang/String;)V
    //   87: aload_3
    //   88: areturn
    //   89: astore_2
    //   90: aload_2
    //   91: invokestatic 46	com/tencent/IMFunc:getExceptionInfo	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   94: astore_2
    //   95: ldc 10
    //   97: iconst_1
    //   98: aload_2
    //   99: invokestatic 52	com/tencent/imsdk/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   102: invokestatic 126	com/tencent/TIMManager:getInstance	()Lcom/tencent/TIMManager;
    //   105: invokevirtual 130	com/tencent/TIMManager:getExceptionListener	()Lcom/tencent/TIMExceptionListener;
    //   108: astore_3
    //   109: aload_3
    //   110: ifnull +10 -> 120
    //   113: aload_3
    //   114: aload_2
    //   115: invokeinterface 135 2 0
    //   120: getstatic 23	com/tencent/TIMMessage:defaultElem	Lcom/tencent/TIMElem;
    //   123: areturn
    //   124: astore_2
    //   125: aload_2
    //   126: invokevirtual 118	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   129: ldc 120
    //   131: astore_2
    //   132: goto -50 -> 82
    //   135: aload_2
    //   136: getstatic 381	com/tencent/imcore/MsgElemType:kPicNew	Lcom/tencent/imcore/MsgElemType;
    //   139: if_acmpne +9 -> 148
    //   142: aload 4
    //   144: invokestatic 669	com/tencent/TIMMessage:buildImageElem	(Lcom/tencent/imcore/Elem;)Lcom/tencent/TIMImageElem;
    //   147: areturn
    //   148: aload_2
    //   149: getstatic 413	com/tencent/imcore/MsgElemType:kPttNew	Lcom/tencent/imcore/MsgElemType;
    //   152: if_acmpne +91 -> 243
    //   155: new 418	com/tencent/TIMSoundElem
    //   158: dup
    //   159: invokespecial 670	com/tencent/TIMSoundElem:<init>	()V
    //   162: astore_2
    //   163: aload_2
    //   164: aload 4
    //   166: invokevirtual 673	com/tencent/imcore/Elem:getSound	()Lcom/tencent/imcore/SoundElem;
    //   169: invokevirtual 674	com/tencent/imcore/SoundElem:getFileid	()Ljava/lang/String;
    //   172: invokevirtual 675	com/tencent/TIMSoundElem:setUuid	(Ljava/lang/String;)V
    //   175: aload_2
    //   176: aload 4
    //   178: invokevirtual 673	com/tencent/imcore/Elem:getSound	()Lcom/tencent/imcore/SoundElem;
    //   181: invokevirtual 678	com/tencent/imcore/SoundElem:getFile_size	()I
    //   184: i2l
    //   185: invokevirtual 681	com/tencent/TIMSoundElem:setDataSize	(J)V
    //   188: aload_2
    //   189: aload 4
    //   191: invokevirtual 673	com/tencent/imcore/Elem:getSound	()Lcom/tencent/imcore/SoundElem;
    //   194: invokevirtual 684	com/tencent/imcore/SoundElem:getFile_time	()I
    //   197: i2l
    //   198: invokevirtual 687	com/tencent/TIMSoundElem:setDuration	(J)V
    //   201: aload_2
    //   202: aload 4
    //   204: invokevirtual 673	com/tencent/imcore/Elem:getSound	()Lcom/tencent/imcore/SoundElem;
    //   207: invokevirtual 688	com/tencent/imcore/SoundElem:getTaskid	()I
    //   210: invokevirtual 689	com/tencent/TIMSoundElem:setTaskId	(I)V
    //   213: aload_2
    //   214: new 84	java/lang/String
    //   217: dup
    //   218: aload 4
    //   220: invokevirtual 673	com/tencent/imcore/Elem:getSound	()Lcom/tencent/imcore/SoundElem;
    //   223: invokevirtual 692	com/tencent/imcore/SoundElem:getFile_path	()[B
    //   226: ldc 90
    //   228: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   231: invokevirtual 693	com/tencent/TIMSoundElem:setPath	(Ljava/lang/String;)V
    //   234: aload_2
    //   235: areturn
    //   236: astore_3
    //   237: aload_3
    //   238: invokevirtual 118	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   241: aload_2
    //   242: areturn
    //   243: aload_2
    //   244: getstatic 453	com/tencent/imcore/MsgElemType:kFile	Lcom/tencent/imcore/MsgElemType;
    //   247: if_acmpne +98 -> 345
    //   250: new 458	com/tencent/TIMFileElem
    //   253: dup
    //   254: invokespecial 694	com/tencent/TIMFileElem:<init>	()V
    //   257: astore_2
    //   258: aload_2
    //   259: aload 4
    //   261: invokevirtual 698	com/tencent/imcore/Elem:getFile	()Lcom/tencent/imcore/FileElem;
    //   264: invokevirtual 699	com/tencent/imcore/FileElem:getFileid	()Ljava/lang/String;
    //   267: invokevirtual 700	com/tencent/TIMFileElem:setUuid	(Ljava/lang/String;)V
    //   270: aload_2
    //   271: aload 4
    //   273: invokevirtual 698	com/tencent/imcore/Elem:getFile	()Lcom/tencent/imcore/FileElem;
    //   276: invokevirtual 702	com/tencent/imcore/FileElem:getFile_size	()J
    //   279: invokevirtual 705	com/tencent/TIMFileElem:setFileSize	(J)V
    //   282: aload_2
    //   283: aload 4
    //   285: invokevirtual 698	com/tencent/imcore/Elem:getFile	()Lcom/tencent/imcore/FileElem;
    //   288: invokevirtual 706	com/tencent/imcore/FileElem:getTaskid	()I
    //   291: invokevirtual 707	com/tencent/TIMFileElem:setTaskId	(I)V
    //   294: aload_2
    //   295: new 84	java/lang/String
    //   298: dup
    //   299: aload 4
    //   301: invokevirtual 698	com/tencent/imcore/Elem:getFile	()Lcom/tencent/imcore/FileElem;
    //   304: invokevirtual 710	com/tencent/imcore/FileElem:getFile_name	()[B
    //   307: ldc 90
    //   309: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   312: invokevirtual 713	com/tencent/TIMFileElem:setFileName	(Ljava/lang/String;)V
    //   315: aload_2
    //   316: new 84	java/lang/String
    //   319: dup
    //   320: aload 4
    //   322: invokevirtual 698	com/tencent/imcore/Elem:getFile	()Lcom/tencent/imcore/FileElem;
    //   325: invokevirtual 714	com/tencent/imcore/FileElem:getFile_path	()[B
    //   328: ldc 90
    //   330: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   333: invokevirtual 715	com/tencent/TIMFileElem:setPath	(Ljava/lang/String;)V
    //   336: aload_2
    //   337: areturn
    //   338: astore_3
    //   339: aload_3
    //   340: invokevirtual 118	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   343: aload_2
    //   344: areturn
    //   345: aload_2
    //   346: getstatic 518	com/tencent/imcore/MsgElemType:kLocation	Lcom/tencent/imcore/MsgElemType;
    //   349: if_acmpne +71 -> 420
    //   352: new 523	com/tencent/TIMLocationElem
    //   355: dup
    //   356: invokespecial 716	com/tencent/TIMLocationElem:<init>	()V
    //   359: astore_3
    //   360: aload_3
    //   361: aload 4
    //   363: invokevirtual 720	com/tencent/imcore/Elem:getLocation	()Lcom/tencent/imcore/LocationElem;
    //   366: invokevirtual 721	com/tencent/imcore/LocationElem:getLongitude	()D
    //   369: invokevirtual 722	com/tencent/TIMLocationElem:setLongitude	(D)V
    //   372: aload_3
    //   373: aload 4
    //   375: invokevirtual 720	com/tencent/imcore/Elem:getLocation	()Lcom/tencent/imcore/LocationElem;
    //   378: invokevirtual 723	com/tencent/imcore/LocationElem:getLatitude	()D
    //   381: invokevirtual 724	com/tencent/TIMLocationElem:setLatitude	(D)V
    //   384: new 84	java/lang/String
    //   387: dup
    //   388: aload 4
    //   390: invokevirtual 720	com/tencent/imcore/Elem:getLocation	()Lcom/tencent/imcore/LocationElem;
    //   393: invokevirtual 726	com/tencent/imcore/LocationElem:getDesc	()[B
    //   396: ldc 90
    //   398: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   401: astore_2
    //   402: aload_3
    //   403: aload_2
    //   404: invokevirtual 728	com/tencent/TIMLocationElem:setDesc	(Ljava/lang/String;)V
    //   407: aload_3
    //   408: areturn
    //   409: astore_2
    //   410: aload_2
    //   411: invokevirtual 118	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   414: ldc 120
    //   416: astore_2
    //   417: goto -15 -> 402
    //   420: aload_2
    //   421: getstatic 482	com/tencent/imcore/MsgElemType:kCustom	Lcom/tencent/imcore/MsgElemType;
    //   424: if_acmpne +106 -> 530
    //   427: new 487	com/tencent/TIMCustomElem
    //   430: dup
    //   431: invokespecial 729	com/tencent/TIMCustomElem:<init>	()V
    //   434: astore_3
    //   435: aload 4
    //   437: invokevirtual 733	com/tencent/imcore/Elem:getCustom	()Lcom/tencent/imcore/CustomElem;
    //   440: invokevirtual 734	com/tencent/imcore/CustomElem:getExt	()[B
    //   443: astore_2
    //   444: aload_2
    //   445: ifnull +13 -> 458
    //   448: aload_2
    //   449: arraylength
    //   450: ifle +8 -> 458
    //   453: aload_3
    //   454: aload_2
    //   455: invokevirtual 735	com/tencent/TIMCustomElem:setExt	([B)V
    //   458: aload_3
    //   459: aload 4
    //   461: invokevirtual 733	com/tencent/imcore/Elem:getCustom	()Lcom/tencent/imcore/CustomElem;
    //   464: invokevirtual 736	com/tencent/imcore/CustomElem:getData	()[B
    //   467: invokevirtual 737	com/tencent/TIMCustomElem:setData	([B)V
    //   470: aload_3
    //   471: aload 4
    //   473: invokevirtual 733	com/tencent/imcore/Elem:getCustom	()Lcom/tencent/imcore/CustomElem;
    //   476: invokevirtual 738	com/tencent/imcore/CustomElem:getSound	()[B
    //   479: invokevirtual 739	com/tencent/TIMCustomElem:setSound	([B)V
    //   482: aload_3
    //   483: aload 4
    //   485: invokevirtual 733	com/tencent/imcore/Elem:getCustom	()Lcom/tencent/imcore/CustomElem;
    //   488: invokevirtual 734	com/tencent/imcore/CustomElem:getExt	()[B
    //   491: invokevirtual 735	com/tencent/TIMCustomElem:setExt	([B)V
    //   494: new 84	java/lang/String
    //   497: dup
    //   498: aload 4
    //   500: invokevirtual 733	com/tencent/imcore/Elem:getCustom	()Lcom/tencent/imcore/CustomElem;
    //   503: invokevirtual 740	com/tencent/imcore/CustomElem:getDesc	()[B
    //   506: ldc 90
    //   508: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   511: astore_2
    //   512: aload_3
    //   513: aload_2
    //   514: invokevirtual 741	com/tencent/TIMCustomElem:setDesc	(Ljava/lang/String;)V
    //   517: aload_3
    //   518: areturn
    //   519: astore_2
    //   520: aload_2
    //   521: invokevirtual 118	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   524: ldc 120
    //   526: astore_2
    //   527: goto -15 -> 512
    //   530: aload_2
    //   531: getstatic 549	com/tencent/imcore/MsgElemType:kFace	Lcom/tencent/imcore/MsgElemType;
    //   534: if_acmpne +37 -> 571
    //   537: new 554	com/tencent/TIMFaceElem
    //   540: dup
    //   541: invokespecial 742	com/tencent/TIMFaceElem:<init>	()V
    //   544: astore_2
    //   545: aload_2
    //   546: aload 4
    //   548: invokevirtual 746	com/tencent/imcore/Elem:getFace	()Lcom/tencent/imcore/FaceElem;
    //   551: invokevirtual 749	com/tencent/imcore/FaceElem:getBuf	()[B
    //   554: invokevirtual 750	com/tencent/TIMFaceElem:setData	([B)V
    //   557: aload_2
    //   558: aload 4
    //   560: invokevirtual 746	com/tencent/imcore/Elem:getFace	()Lcom/tencent/imcore/FaceElem;
    //   563: invokevirtual 751	com/tencent/imcore/FaceElem:getIndex	()I
    //   566: invokevirtual 752	com/tencent/TIMFaceElem:setIndex	(I)V
    //   569: aload_2
    //   570: areturn
    //   571: aload_2
    //   572: getstatic 755	com/tencent/imcore/MsgElemType:kGroupTips	Lcom/tencent/imcore/MsgElemType;
    //   575: if_acmpne +16 -> 591
    //   578: new 757	com/tencent/TIMGroupTipsElem
    //   581: dup
    //   582: aload 4
    //   584: invokevirtual 761	com/tencent/imcore/Elem:getGroup_tips	()Lcom/tencent/imcore/GroupTipsElem;
    //   587: invokespecial 764	com/tencent/TIMGroupTipsElem:<init>	(Lcom/tencent/imcore/GroupTipsElem;)V
    //   590: areturn
    //   591: aload_2
    //   592: getstatic 767	com/tencent/imcore/MsgElemType:kGroupReport	Lcom/tencent/imcore/MsgElemType;
    //   595: if_acmpne +16 -> 611
    //   598: new 769	com/tencent/TIMGroupSystemElem
    //   601: dup
    //   602: aload 4
    //   604: invokevirtual 773	com/tencent/imcore/Elem:getGroup_report	()Lcom/tencent/imcore/GroupReportElem;
    //   607: invokespecial 776	com/tencent/TIMGroupSystemElem:<init>	(Lcom/tencent/imcore/GroupReportElem;)V
    //   610: areturn
    //   611: aload_2
    //   612: getstatic 779	com/tencent/imcore/MsgElemType:kFriendChange	Lcom/tencent/imcore/MsgElemType;
    //   615: if_acmpne +116 -> 731
    //   618: new 781	com/tencent/TIMSNSSystemElem
    //   621: dup
    //   622: invokespecial 782	com/tencent/TIMSNSSystemElem:<init>	()V
    //   625: astore_3
    //   626: aload_3
    //   627: aload 4
    //   629: invokevirtual 786	com/tencent/imcore/Elem:getFriend_change	()Lcom/tencent/imcore/FriendChangeElem;
    //   632: invokevirtual 790	com/tencent/imcore/FriendChangeElem:getType	()J
    //   635: invokevirtual 793	com/tencent/TIMSNSSystemElem:setSubType	(J)V
    //   638: aload 4
    //   640: invokevirtual 786	com/tencent/imcore/Elem:getFriend_change	()Lcom/tencent/imcore/FriendChangeElem;
    //   643: invokevirtual 797	com/tencent/imcore/FriendChangeElem:getUsers	()Lcom/tencent/imcore/FriendChangeInfoVec;
    //   646: astore 5
    //   648: iconst_0
    //   649: istore_1
    //   650: aload_3
    //   651: astore_2
    //   652: iload_1
    //   653: i2l
    //   654: aload 5
    //   656: invokevirtual 802	com/tencent/imcore/FriendChangeInfoVec:size	()J
    //   659: lcmp
    //   660: ifge -645 -> 15
    //   663: new 804	com/tencent/TIMSNSChangeInfo
    //   666: dup
    //   667: aload 5
    //   669: iload_1
    //   670: invokevirtual 808	com/tencent/imcore/FriendChangeInfoVec:get	(I)Lcom/tencent/imcore/FriendChangeUserInfo;
    //   673: invokespecial 811	com/tencent/TIMSNSChangeInfo:<init>	(Lcom/tencent/imcore/FriendChangeUserInfo;)V
    //   676: astore_2
    //   677: aload_3
    //   678: aload 4
    //   680: invokevirtual 786	com/tencent/imcore/Elem:getFriend_change	()Lcom/tencent/imcore/FriendChangeElem;
    //   683: invokevirtual 814	com/tencent/imcore/FriendChangeElem:getDdwPendencyReportTimestamp	()J
    //   686: invokevirtual 817	com/tencent/TIMSNSSystemElem:setPendencyReportTimestamp	(J)V
    //   689: aload_3
    //   690: aload 4
    //   692: invokevirtual 786	com/tencent/imcore/Elem:getFriend_change	()Lcom/tencent/imcore/FriendChangeElem;
    //   695: invokevirtual 820	com/tencent/imcore/FriendChangeElem:getDdwDecideReportTimestamp	()J
    //   698: invokevirtual 823	com/tencent/TIMSNSSystemElem:setDecideReportTimestamp	(J)V
    //   701: aload_3
    //   702: aload 4
    //   704: invokevirtual 786	com/tencent/imcore/Elem:getFriend_change	()Lcom/tencent/imcore/FriendChangeElem;
    //   707: invokevirtual 826	com/tencent/imcore/FriendChangeElem:getDdwRecommendReportTimestamp	()J
    //   710: invokevirtual 829	com/tencent/TIMSNSSystemElem:setRecommendReportTimestamp	(J)V
    //   713: aload_3
    //   714: invokevirtual 833	com/tencent/TIMSNSSystemElem:getChangeInfoList	()Ljava/util/List;
    //   717: aload_2
    //   718: invokeinterface 836 2 0
    //   723: pop
    //   724: iload_1
    //   725: iconst_1
    //   726: iadd
    //   727: istore_1
    //   728: goto -78 -> 650
    //   731: aload_2
    //   732: getstatic 839	com/tencent/imcore/MsgElemType:kProfileChange	Lcom/tencent/imcore/MsgElemType;
    //   735: if_acmpne +71 -> 806
    //   738: new 841	com/tencent/TIMProfileSystemElem
    //   741: dup
    //   742: invokespecial 842	com/tencent/TIMProfileSystemElem:<init>	()V
    //   745: astore_3
    //   746: aload_3
    //   747: aload 4
    //   749: invokevirtual 846	com/tencent/imcore/Elem:getProfile_change	()Lcom/tencent/imcore/ProfileChangeElem;
    //   752: invokevirtual 849	com/tencent/imcore/ProfileChangeElem:getType	()J
    //   755: invokevirtual 850	com/tencent/TIMProfileSystemElem:setSubType	(J)V
    //   758: aload_3
    //   759: aload 4
    //   761: invokevirtual 846	com/tencent/imcore/Elem:getProfile_change	()Lcom/tencent/imcore/ProfileChangeElem;
    //   764: invokevirtual 853	com/tencent/imcore/ProfileChangeElem:getFrom	()Ljava/lang/String;
    //   767: invokevirtual 856	com/tencent/TIMProfileSystemElem:setFromUser	(Ljava/lang/String;)V
    //   770: new 84	java/lang/String
    //   773: dup
    //   774: aload 4
    //   776: invokevirtual 846	com/tencent/imcore/Elem:getProfile_change	()Lcom/tencent/imcore/ProfileChangeElem;
    //   779: invokevirtual 859	com/tencent/imcore/ProfileChangeElem:getNick	()[B
    //   782: ldc 90
    //   784: invokespecial 93	java/lang/String:<init>	([BLjava/lang/String;)V
    //   787: astore_2
    //   788: aload_3
    //   789: aload_2
    //   790: invokevirtual 862	com/tencent/TIMProfileSystemElem:setNickName	(Ljava/lang/String;)V
    //   793: aload_3
    //   794: areturn
    //   795: astore_2
    //   796: aload_2
    //   797: invokevirtual 118	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   800: ldc 120
    //   802: astore_2
    //   803: goto -15 -> 788
    //   806: aload_2
    //   807: getstatic 574	com/tencent/imcore/MsgElemType:kVideo	Lcom/tencent/imcore/MsgElemType;
    //   810: if_acmpne -690 -> 120
    //   813: aload 4
    //   815: invokestatic 864	com/tencent/TIMMessage:buildVideoElem	(Lcom/tencent/imcore/Elem;)Lcom/tencent/TIMVideoElem;
    //   818: astore_2
    //   819: aload_2
    //   820: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	821	0	this	TIMMessage
    //   0	821	1	paramInt	int
    //   14	70	2	localObject1	Object
    //   89	2	2	localThrowable	Throwable
    //   94	21	2	str	String
    //   124	2	2	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   131	273	2	localObject2	Object
    //   409	2	2	localUnsupportedEncodingException2	UnsupportedEncodingException
    //   416	98	2	localObject3	Object
    //   519	2	2	localUnsupportedEncodingException3	UnsupportedEncodingException
    //   526	264	2	localObject4	Object
    //   795	2	2	localUnsupportedEncodingException4	UnsupportedEncodingException
    //   802	18	2	localObject5	Object
    //   63	51	3	localObject6	Object
    //   236	2	3	localUnsupportedEncodingException5	UnsupportedEncodingException
    //   338	2	3	localUnsupportedEncodingException6	UnsupportedEncodingException
    //   359	435	3	localObject7	Object
    //   36	778	4	localElem	Elem
    //   646	22	5	localFriendChangeInfoVec	com.tencent.imcore.FriendChangeInfoVec
    // Exception table:
    //   from	to	target	type
    //   17	49	89	java/lang/Throwable
    //   49	64	89	java/lang/Throwable
    //   64	82	89	java/lang/Throwable
    //   82	87	89	java/lang/Throwable
    //   125	129	89	java/lang/Throwable
    //   135	148	89	java/lang/Throwable
    //   148	213	89	java/lang/Throwable
    //   213	234	89	java/lang/Throwable
    //   237	241	89	java/lang/Throwable
    //   243	294	89	java/lang/Throwable
    //   294	336	89	java/lang/Throwable
    //   339	343	89	java/lang/Throwable
    //   345	384	89	java/lang/Throwable
    //   384	402	89	java/lang/Throwable
    //   402	407	89	java/lang/Throwable
    //   410	414	89	java/lang/Throwable
    //   420	444	89	java/lang/Throwable
    //   448	458	89	java/lang/Throwable
    //   458	494	89	java/lang/Throwable
    //   494	512	89	java/lang/Throwable
    //   512	517	89	java/lang/Throwable
    //   520	524	89	java/lang/Throwable
    //   530	569	89	java/lang/Throwable
    //   571	591	89	java/lang/Throwable
    //   591	611	89	java/lang/Throwable
    //   611	648	89	java/lang/Throwable
    //   652	724	89	java/lang/Throwable
    //   731	770	89	java/lang/Throwable
    //   770	788	89	java/lang/Throwable
    //   788	793	89	java/lang/Throwable
    //   796	800	89	java/lang/Throwable
    //   806	819	89	java/lang/Throwable
    //   64	82	124	java/io/UnsupportedEncodingException
    //   213	234	236	java/io/UnsupportedEncodingException
    //   294	336	338	java/io/UnsupportedEncodingException
    //   384	402	409	java/io/UnsupportedEncodingException
    //   494	512	519	java/io/UnsupportedEncodingException
    //   770	788	795	java/io/UnsupportedEncodingException
  }
  
  public long getElementCount()
  {
    if (this.msg == null) {
      return 0L;
    }
    return this.msg.elemSize();
  }
  
  String getGroupName()
  {
    try
    {
      String str1 = new String(this.msg.getGroupName(), "utf-8");
      localObject2 = str1;
      if (TextUtils.isEmpty(str1)) {
        localObject2 = "";
      }
      return (String)localObject2;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
        Object localObject1 = null;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        String str2 = IMFunc.getExceptionInfo(localThrowable);
        QLog.e("imsdk.TIMMessage", 1, str2);
        Object localObject2 = TIMManager.getInstance().getExceptionListener();
        if (localObject2 != null) {
          ((TIMExceptionListener)localObject2).onException(str2);
        }
        str2 = null;
      }
    }
  }
  
  Msg getMsg()
  {
    return this.msg;
  }
  
  public String getMsgId()
  {
    String str;
    if (this.msg == null)
    {
      QLog.i("imsdk.TIMMessage", 1, "msg is null");
      str = "";
    }
    for (;;)
    {
      QLog.i("imsdk.TIMMessage", 1, "msgid " + str);
      return str;
      try
      {
        str = new String(this.msg.msgid(), "utf-8");
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
    return "";
  }
  
  public long getMsgUniqueId()
  {
    if (this.msg != null) {
      return this.msg.uniqueid();
    }
    return 0L;
  }
  
  public String getSender()
  {
    if (this.msg != null) {
      return this.msg.getSender();
    }
    QLog.i("imsdk.TIMMessage", 1, "msg is null");
    return null;
  }
  
  public TIMGroupMemberInfo getSenderGroupMemberProfile()
  {
    if ((this.msg == null) || (getConversation().getType() != TIMConversationType.Group)) {}
    TIMGroupMemberInfo localTIMGroupMemberInfo;
    do
    {
      return null;
      localTIMGroupMemberInfo = new TIMGroupMemberInfo(this.msg.getSenderGroupMemberProfile());
    } while (localTIMGroupMemberInfo.getUser().length() == 0);
    return localTIMGroupMemberInfo;
  }
  
  public TIMUserProfile getSenderProfile()
  {
    if (this.msg == null) {}
    TIMUserProfile localTIMUserProfile;
    do
    {
      return null;
      localTIMUserProfile = new TIMUserProfile(this.msg.getSenderProfile());
    } while (localTIMUserProfile.getIdentifier().length() == 0);
    return localTIMUserProfile;
  }
  
  public boolean hasGap()
  {
    if (this.msg == null) {
      return false;
    }
    return this.msg.hasGap();
  }
  
  public boolean isRead()
  {
    if (this.msg != null) {
      return this.msg.isRead();
    }
    return true;
  }
  
  public boolean isSelf()
  {
    if (this.msg != null) {
      return this.msg.isSelf();
    }
    return true;
  }
  
  public boolean remove()
  {
    if (this.msg == null) {
      return false;
    }
    return this.msg.remove();
  }
  
  void setConversation(TIMConversation paramTIMConversation)
  {
    this.conversation = paramTIMConversation;
  }
  
  public void setCustomInt(int paramInt)
  {
    if (this.msg == null) {
      return;
    }
    this.msg.setCustomInt(paramInt);
  }
  
  public void setCustomStr(String paramString)
  {
    if (this.msg == null) {
      return;
    }
    Msg localMsg = this.msg;
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    localMsg.setCustomStr(str);
  }
  
  public TIMMessageStatus status()
  {
    if (this.msg == null) {
      return TIMMessageStatus.SendSucc;
    }
    switch (this.msg.status())
    {
    default: 
      return TIMMessageStatus.SendSucc;
    case 1: 
      return TIMMessageStatus.Sending;
    case 2: 
      return TIMMessageStatus.SendSucc;
    case 3: 
      return TIMMessageStatus.SendFail;
    }
    return TIMMessageStatus.HasDeleted;
  }
  
  public long timestamp()
  {
    if (this.msg != null) {
      return this.msg.time();
    }
    return 0L;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */