package com.tencent.qalsdk.base.remote;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.qalsdk.sdk.MsfCommand;
import java.util.HashMap;

public class ToServiceMsg
  implements Parcelable
{
  public static final Parcelable.Creator<ToServiceMsg> CREATOR = new c();
  private static final String tag = "ToServiceMsg";
  private static final String version = "version";
  private IBaseActionListener actionListener;
  private int appId;
  private int appSeq = -1;
  private HashMap<String, Object> attributes = new HashMap();
  public Bundle extraData = new Bundle();
  private boolean httpReq = false;
  private MsfCommand msfCommand = MsfCommand.unknown;
  private boolean needResp = true;
  private long sendTimeout = -1L;
  private String serviceCmd = "";
  private String serviceName;
  private int ssoSeq = -1;
  private long timeout = -1L;
  private byte toVersion = 1;
  private String uin;
  private byte uinType = 20;
  private byte[] wupBuffer = new byte[0];
  
  public ToServiceMsg(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }
  
  public ToServiceMsg(String paramString1, String paramString2, String paramString3)
  {
    this.serviceName = paramString1;
    this.uin = paramString2;
    this.serviceCmd = paramString3;
    this.extraData.putByte("version", this.toVersion);
  }
  
  /* Error */
  private void readFromParcel(Parcel paramParcel)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 115	android/os/Parcel:readInt	()I
    //   5: putfield 117	com/tencent/qalsdk/base/remote/ToServiceMsg:appId	I
    //   8: aload_0
    //   9: aload_1
    //   10: invokevirtual 115	android/os/Parcel:readInt	()I
    //   13: putfield 66	com/tencent/qalsdk/base/remote/ToServiceMsg:appSeq	I
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual 121	android/os/Parcel:readString	()Ljava/lang/String;
    //   21: putfield 101	com/tencent/qalsdk/base/remote/ToServiceMsg:serviceName	Ljava/lang/String;
    //   24: aload_0
    //   25: aload_1
    //   26: invokevirtual 121	android/os/Parcel:readString	()Ljava/lang/String;
    //   29: putfield 103	com/tencent/qalsdk/base/remote/ToServiceMsg:uin	Ljava/lang/String;
    //   32: aload_0
    //   33: aload_1
    //   34: invokevirtual 125	android/os/Parcel:readByte	()B
    //   37: putfield 95	com/tencent/qalsdk/base/remote/ToServiceMsg:uinType	B
    //   40: aload_0
    //   41: aload_1
    //   42: invokevirtual 121	android/os/Parcel:readString	()Ljava/lang/String;
    //   45: putfield 58	com/tencent/qalsdk/base/remote/ToServiceMsg:serviceCmd	Ljava/lang/String;
    //   48: aload_0
    //   49: aload_1
    //   50: invokevirtual 129	android/os/Parcel:readLong	()J
    //   53: putfield 64	com/tencent/qalsdk/base/remote/ToServiceMsg:timeout	J
    //   56: aload_0
    //   57: getfield 84	com/tencent/qalsdk/base/remote/ToServiceMsg:extraData	Landroid/os/Bundle;
    //   60: invokevirtual 132	android/os/Bundle:clear	()V
    //   63: aload_0
    //   64: getfield 84	com/tencent/qalsdk/base/remote/ToServiceMsg:extraData	Landroid/os/Bundle;
    //   67: aload_1
    //   68: invokestatic 138	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   71: invokevirtual 142	java/lang/Thread:getContextClassLoader	()Ljava/lang/ClassLoader;
    //   74: invokevirtual 146	android/os/Parcel:readBundle	(Ljava/lang/ClassLoader;)Landroid/os/Bundle;
    //   77: invokevirtual 150	android/os/Bundle:putAll	(Landroid/os/Bundle;)V
    //   80: aload_0
    //   81: aload_1
    //   82: invokevirtual 154	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   85: invokestatic 160	com/tencent/qalsdk/base/remote/IBaseActionListener$Stub:asInterface	(Landroid/os/IBinder;)Lcom/tencent/qalsdk/base/remote/IBaseActionListener;
    //   88: putfield 162	com/tencent/qalsdk/base/remote/ToServiceMsg:actionListener	Lcom/tencent/qalsdk/base/remote/IBaseActionListener;
    //   91: aload_0
    //   92: aload_0
    //   93: getfield 84	com/tencent/qalsdk/base/remote/ToServiceMsg:extraData	Landroid/os/Bundle;
    //   96: ldc 15
    //   98: invokevirtual 166	android/os/Bundle:getByte	(Ljava/lang/String;)B
    //   101: putfield 86	com/tencent/qalsdk/base/remote/ToServiceMsg:toVersion	B
    //   104: aload_0
    //   105: getfield 86	com/tencent/qalsdk/base/remote/ToServiceMsg:toVersion	B
    //   108: ifle +96 -> 204
    //   111: aload_0
    //   112: aload_1
    //   113: invokevirtual 170	android/os/Parcel:readSerializable	()Ljava/io/Serializable;
    //   116: checkcast 88	com/tencent/qalsdk/sdk/MsfCommand
    //   119: putfield 93	com/tencent/qalsdk/base/remote/ToServiceMsg:msfCommand	Lcom/tencent/qalsdk/sdk/MsfCommand;
    //   122: aload_0
    //   123: aload_1
    //   124: invokevirtual 129	android/os/Parcel:readLong	()J
    //   127: putfield 62	com/tencent/qalsdk/base/remote/ToServiceMsg:sendTimeout	J
    //   130: aload_1
    //   131: invokevirtual 125	android/os/Parcel:readByte	()B
    //   134: ifne +71 -> 205
    //   137: iconst_0
    //   138: istore_2
    //   139: aload_0
    //   140: iload_2
    //   141: putfield 70	com/tencent/qalsdk/base/remote/ToServiceMsg:needResp	Z
    //   144: aload_1
    //   145: invokevirtual 125	android/os/Parcel:readByte	()B
    //   148: ifne +62 -> 210
    //   151: iconst_0
    //   152: istore_2
    //   153: aload_0
    //   154: iload_2
    //   155: putfield 72	com/tencent/qalsdk/base/remote/ToServiceMsg:httpReq	Z
    //   158: aload_0
    //   159: aload_1
    //   160: invokevirtual 115	android/os/Parcel:readInt	()I
    //   163: newarray <illegal type>
    //   165: putfield 68	com/tencent/qalsdk/base/remote/ToServiceMsg:wupBuffer	[B
    //   168: aload_1
    //   169: aload_0
    //   170: getfield 68	com/tencent/qalsdk/base/remote/ToServiceMsg:wupBuffer	[B
    //   173: invokevirtual 174	android/os/Parcel:readByteArray	([B)V
    //   176: aload_0
    //   177: aload_1
    //   178: invokevirtual 115	android/os/Parcel:readInt	()I
    //   181: putfield 74	com/tencent/qalsdk/base/remote/ToServiceMsg:ssoSeq	I
    //   184: aload_0
    //   185: getfield 79	com/tencent/qalsdk/base/remote/ToServiceMsg:attributes	Ljava/util/HashMap;
    //   188: invokevirtual 175	java/util/HashMap:clear	()V
    //   191: aload_1
    //   192: aload_0
    //   193: getfield 79	com/tencent/qalsdk/base/remote/ToServiceMsg:attributes	Ljava/util/HashMap;
    //   196: ldc 2
    //   198: invokevirtual 180	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   201: invokevirtual 184	android/os/Parcel:readMap	(Ljava/util/Map;Ljava/lang/ClassLoader;)V
    //   204: return
    //   205: iconst_1
    //   206: istore_2
    //   207: goto -68 -> 139
    //   210: iconst_1
    //   211: istore_2
    //   212: goto -59 -> 153
    //   215: astore_1
    //   216: ldc 13
    //   218: ldc -70
    //   220: aload_1
    //   221: invokestatic 192	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   224: pop
    //   225: aload_1
    //   226: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	227	0	this	ToServiceMsg
    //   0	227	1	paramParcel	Parcel
    //   138	74	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	137	215	java/lang/RuntimeException
    //   139	151	215	java/lang/RuntimeException
    //   153	204	215	java/lang/RuntimeException
  }
  
  public Object addAttribute(String paramString, Object paramObject)
  {
    return this.attributes.put(paramString, paramObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBaseActionListener getActionListener()
  {
    return this.actionListener;
  }
  
  public int getAppId()
  {
    return this.appId;
  }
  
  public int getAppSeq()
  {
    return this.appSeq;
  }
  
  public Object getAttribute(String paramString)
  {
    return this.attributes.get(paramString);
  }
  
  public <T> T getAttribute(String paramString, T paramT)
  {
    if (!this.attributes.containsKey(paramString)) {
      return paramT;
    }
    return (T)this.attributes.get(paramString);
  }
  
  public HashMap<String, Object> getAttributes()
  {
    return this.attributes;
  }
  
  public String getDestServiceId()
  {
    return this.serviceName;
  }
  
  public MsfCommand getMsfCommand()
  {
    return this.msfCommand;
  }
  
  public int getRequestSsoSeq()
  {
    return this.ssoSeq;
  }
  
  public String getServiceCmd()
  {
    return this.serviceCmd;
  }
  
  public String getServiceName()
  {
    return this.serviceName;
  }
  
  public long getTimeout()
  {
    return this.timeout;
  }
  
  public String getUin()
  {
    return this.uin;
  }
  
  public byte getUinType()
  {
    return this.uinType;
  }
  
  public byte[] getWupBuffer()
  {
    return this.wupBuffer;
  }
  
  public boolean isFastResendEnabled()
  {
    return ((Boolean)getAttribute("fastresend", Boolean.valueOf(false))).booleanValue();
  }
  
  public boolean isHttpReq()
  {
    return this.httpReq;
  }
  
  public boolean isNeedCallback()
  {
    return this.needResp;
  }
  
  public boolean isNeedRemindSlowNetwork()
  {
    return ((Boolean)getAttribute("remind_slown_network", Boolean.valueOf(false))).booleanValue();
  }
  
  public void putWupBuffer(byte[] paramArrayOfByte)
  {
    this.wupBuffer = paramArrayOfByte;
  }
  
  public void setActionListener(IBaseActionListener paramIBaseActionListener)
  {
    this.actionListener = paramIBaseActionListener;
  }
  
  public void setAppId(int paramInt)
  {
    this.appId = paramInt;
  }
  
  public void setAppSeq(int paramInt)
  {
    this.appSeq = paramInt;
  }
  
  public void setAttributes(HashMap<String, Object> paramHashMap)
  {
    this.attributes = paramHashMap;
  }
  
  public void setEnableFastResend(boolean paramBoolean)
  {
    addAttribute("fastresend", Boolean.valueOf(paramBoolean));
  }
  
  public void setIsHttpReq()
  {
    this.httpReq = true;
  }
  
  public void setMsfCommand(MsfCommand paramMsfCommand)
  {
    this.msfCommand = paramMsfCommand;
  }
  
  public void setNeedCallback(boolean paramBoolean)
  {
    this.needResp = paramBoolean;
  }
  
  public void setNeedRemindSlowNetwork(boolean paramBoolean)
  {
    addAttribute("remind_slown_network", Boolean.valueOf(paramBoolean));
  }
  
  public void setRequestSsoSeq(int paramInt)
  {
    this.ssoSeq = paramInt;
  }
  
  public void setServiceCmd(String paramString)
  {
    this.serviceCmd = paramString;
  }
  
  public void setServiceName(String paramString)
  {
    this.serviceName = paramString;
  }
  
  public void setTimeout(long paramLong)
  {
    this.timeout = paramLong;
  }
  
  public void setUin(String paramString)
  {
    this.uin = paramString;
  }
  
  public void setUinType(int paramInt)
  {
    this.uinType = ((byte)paramInt);
  }
  
  public String toString()
  {
    return "ToServiceMsg msName:" + this.msfCommand + " ssoSeq:" + getRequestSsoSeq() + " appId:" + this.appId + " appSeq:" + this.appSeq + " sName:" + this.serviceName + " uin:" + this.uin + " sCmd:" + this.serviceCmd + " t:" + this.timeout + " needResp:" + this.needResp + "httpReq:" + this.httpReq;
  }
  
  /* Error */
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: aload_1
    //   4: aload_0
    //   5: getfield 117	com/tencent/qalsdk/base/remote/ToServiceMsg:appId	I
    //   8: invokevirtual 324	android/os/Parcel:writeInt	(I)V
    //   11: aload_1
    //   12: aload_0
    //   13: getfield 66	com/tencent/qalsdk/base/remote/ToServiceMsg:appSeq	I
    //   16: invokevirtual 324	android/os/Parcel:writeInt	(I)V
    //   19: aload_1
    //   20: aload_0
    //   21: getfield 101	com/tencent/qalsdk/base/remote/ToServiceMsg:serviceName	Ljava/lang/String;
    //   24: invokevirtual 327	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   27: aload_1
    //   28: aload_0
    //   29: getfield 103	com/tencent/qalsdk/base/remote/ToServiceMsg:uin	Ljava/lang/String;
    //   32: invokevirtual 327	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   35: aload_1
    //   36: aload_0
    //   37: getfield 95	com/tencent/qalsdk/base/remote/ToServiceMsg:uinType	B
    //   40: invokevirtual 331	android/os/Parcel:writeByte	(B)V
    //   43: aload_1
    //   44: aload_0
    //   45: getfield 58	com/tencent/qalsdk/base/remote/ToServiceMsg:serviceCmd	Ljava/lang/String;
    //   48: invokevirtual 327	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   51: aload_1
    //   52: aload_0
    //   53: getfield 64	com/tencent/qalsdk/base/remote/ToServiceMsg:timeout	J
    //   56: invokevirtual 334	android/os/Parcel:writeLong	(J)V
    //   59: aload_1
    //   60: aload_0
    //   61: getfield 84	com/tencent/qalsdk/base/remote/ToServiceMsg:extraData	Landroid/os/Bundle;
    //   64: invokevirtual 337	android/os/Parcel:writeBundle	(Landroid/os/Bundle;)V
    //   67: aload_1
    //   68: aload_0
    //   69: getfield 162	com/tencent/qalsdk/base/remote/ToServiceMsg:actionListener	Lcom/tencent/qalsdk/base/remote/IBaseActionListener;
    //   72: invokevirtual 341	android/os/Parcel:writeStrongInterface	(Landroid/os/IInterface;)V
    //   75: aload_0
    //   76: getfield 86	com/tencent/qalsdk/base/remote/ToServiceMsg:toVersion	B
    //   79: ifle +81 -> 160
    //   82: aload_1
    //   83: aload_0
    //   84: getfield 93	com/tencent/qalsdk/base/remote/ToServiceMsg:msfCommand	Lcom/tencent/qalsdk/sdk/MsfCommand;
    //   87: invokevirtual 345	android/os/Parcel:writeSerializable	(Ljava/io/Serializable;)V
    //   90: aload_1
    //   91: aload_0
    //   92: getfield 62	com/tencent/qalsdk/base/remote/ToServiceMsg:sendTimeout	J
    //   95: invokevirtual 334	android/os/Parcel:writeLong	(J)V
    //   98: aload_0
    //   99: getfield 70	com/tencent/qalsdk/base/remote/ToServiceMsg:needResp	Z
    //   102: ifeq +59 -> 161
    //   105: iconst_1
    //   106: istore_3
    //   107: aload_1
    //   108: iload_3
    //   109: invokevirtual 331	android/os/Parcel:writeByte	(B)V
    //   112: aload_0
    //   113: getfield 72	com/tencent/qalsdk/base/remote/ToServiceMsg:httpReq	Z
    //   116: ifeq +50 -> 166
    //   119: iload 4
    //   121: istore_3
    //   122: aload_1
    //   123: iload_3
    //   124: invokevirtual 331	android/os/Parcel:writeByte	(B)V
    //   127: aload_1
    //   128: aload_0
    //   129: getfield 68	com/tencent/qalsdk/base/remote/ToServiceMsg:wupBuffer	[B
    //   132: arraylength
    //   133: invokevirtual 324	android/os/Parcel:writeInt	(I)V
    //   136: aload_1
    //   137: aload_0
    //   138: getfield 68	com/tencent/qalsdk/base/remote/ToServiceMsg:wupBuffer	[B
    //   141: invokevirtual 348	android/os/Parcel:writeByteArray	([B)V
    //   144: aload_1
    //   145: aload_0
    //   146: getfield 74	com/tencent/qalsdk/base/remote/ToServiceMsg:ssoSeq	I
    //   149: invokevirtual 324	android/os/Parcel:writeInt	(I)V
    //   152: aload_1
    //   153: aload_0
    //   154: getfield 79	com/tencent/qalsdk/base/remote/ToServiceMsg:attributes	Ljava/util/HashMap;
    //   157: invokevirtual 352	android/os/Parcel:writeMap	(Ljava/util/Map;)V
    //   160: return
    //   161: iconst_0
    //   162: istore_3
    //   163: goto -56 -> 107
    //   166: iconst_0
    //   167: istore_3
    //   168: goto -46 -> 122
    //   171: astore_1
    //   172: ldc 13
    //   174: ldc_w 354
    //   177: aload_1
    //   178: invokestatic 192	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   181: pop
    //   182: aload_1
    //   183: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	this	ToServiceMsg
    //   0	184	1	paramParcel	Parcel
    //   0	184	2	paramInt	int
    //   106	62	3	b1	byte
    //   1	119	4	b2	byte
    // Exception table:
    //   from	to	target	type
    //   3	105	171	java/lang/RuntimeException
    //   107	119	171	java/lang/RuntimeException
    //   122	160	171	java/lang/RuntimeException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\base\remote\ToServiceMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */