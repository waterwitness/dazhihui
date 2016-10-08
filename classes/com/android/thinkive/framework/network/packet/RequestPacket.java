package com.android.thinkive.framework.network.packet;

import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.config.FunctionBean;
import com.android.thinkive.framework.config.FunctionBean.InputBean;
import com.android.thinkive.framework.network.socket.SocketRequestBean;
import com.android.thinkive.framework.network.socket.SocketType;
import com.android.thinkive.framework.network.socket.TradeSocketManager;
import com.android.thinkive.framework.util.AESUtil;
import com.android.thinkive.framework.util.ArrayUtil;
import com.android.thinkive.framework.util.ByteUtil;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.ZLibUtil;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public class RequestPacket
  implements IPacket
{
  private int mBodyLength;
  private short mBranchId;
  private int mFlowNo;
  private FunctionBean mFunctionBean;
  private HashMap<String, String> mHeader;
  private int mInfoFuncNo;
  private String mJsonFuncNo;
  private int mMsgType;
  private HashMap<String, String> mParam;
  private short mQuotationFuncNo;
  private SocketType mSocketType;
  private int mTradeFuncNo;
  
  public RequestPacket(SocketRequestBean paramSocketRequestBean)
  {
    this.mParam = paramSocketRequestBean.getParam();
    this.mHeader = paramSocketRequestBean.getHeader();
    if ((this.mHeader != null) && (this.mHeader.get("msgType") != null)) {}
    try
    {
      this.mMsgType = Integer.parseInt((String)this.mHeader.get("msgType"));
      this.mJsonFuncNo = ((String)this.mParam.get("funcno"));
      this.mSocketType = paramSocketRequestBean.getSocketType();
      if (this.mSocketType == SocketType.TRADE)
      {
        this.mTradeFuncNo = Integer.parseInt(this.mJsonFuncNo);
        this.mBranchId = Short.parseShort(this.mJsonFuncNo.substring(0, 1));
        this.mFlowNo = paramSocketRequestBean.getSequence();
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.mMsgType = 0;
        continue;
        if (this.mSocketType == SocketType.INFO)
        {
          this.mInfoFuncNo = Integer.parseInt(this.mJsonFuncNo);
          this.mBranchId = Short.parseShort(this.mJsonFuncNo.substring(0, 1));
        }
        else
        {
          this.mFunctionBean = ConfigManager.getInstance().getFunctionBean(this.mJsonFuncNo, this.mSocketType);
          String str = this.mFunctionBean.getByteFuncNo();
          this.mBranchId = Short.parseShort(str.substring(0, 1));
          this.mQuotationFuncNo = Short.parseShort(str);
        }
      }
    }
  }
  
  private byte[] buildByteArray(String paramString1, String paramString2, int paramInt)
  {
    byte[] arrayOfByte2 = new byte[1];
    byte[] arrayOfByte1;
    if (paramString1.equals("int")) {
      arrayOfByte1 = ByteUtil.intToBytes(Integer.parseInt(paramString2));
    }
    do
    {
      do
      {
        return arrayOfByte1;
        if (paramString1.equals("short")) {
          return ByteUtil.shortToBytes(Short.parseShort(paramString2));
        }
        if (paramString1.equals("long")) {
          return ByteUtil.longToBytes(Long.parseLong(paramString2));
        }
        if (paramString1.equals("float")) {
          return ByteUtil.floatToBytes(Float.parseFloat(paramString2));
        }
        if (paramString1.equals("double")) {
          return ByteUtil.doubleToBytes(Double.parseDouble(paramString2));
        }
        if (paramString1.equals("byte"))
        {
          paramString1 = new byte[paramInt];
          paramString1[0] = ((byte)Integer.parseInt(paramString2));
          return paramString1;
        }
        if (paramString1.equals("char"))
        {
          paramString1 = new byte[paramInt];
          System.arraycopy(paramString2.getBytes(), 0, paramString1, 0, paramString2.getBytes().length);
          return paramString1;
        }
        if (paramString1.equals("bool"))
        {
          paramString1 = new byte[paramInt];
          if (Boolean.parseBoolean(paramString2))
          {
            paramString1[0] = 1;
            return paramString1;
          }
          paramString1[0] = 0;
          return paramString1;
        }
        if (paramString1.equals("type")) {
          return buildTypeByteArray(paramString2, paramInt);
        }
        if (paramString1.equals("field")) {
          return buildFieldByteArray(paramString2, paramInt);
        }
        if (paramString1.equals("stocks")) {
          return buildStocksTypeByteArray(paramString2, paramInt);
        }
        arrayOfByte1 = arrayOfByte2;
      } while (paramString1.equals("stock"));
      if (paramString1.equals("kline")) {
        return buildKLineTypeByteArray(paramString2, paramInt);
      }
      arrayOfByte1 = arrayOfByte2;
    } while (!paramString1.equals("count"));
    return ByteUtil.intToBytes(Integer.parseInt(paramString2));
  }
  
  private byte[] buildFieldByteArray(String paramString, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramString = paramString.split(":");
    paramInt = 0;
    for (;;)
    {
      if (paramInt >= paramString.length) {
        return arrayOfByte;
      }
      int i = Integer.parseInt(paramString[paramInt]) - 1;
      int j = i / 8;
      arrayOfByte[j] = ((byte)(1 << 7 - i % 8 | arrayOfByte[j]));
      paramInt += 1;
    }
  }
  
  private byte[] buildKLineTypeByteArray(String paramString, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    if (paramString.equals("day")) {
      arrayOfByte = ByteUtil.intToBytes(1);
    }
    do
    {
      return arrayOfByte;
      if (paramString.equals("week")) {
        return ByteUtil.intToBytes(2);
      }
    } while (!paramString.equals("month"));
    return ByteUtil.intToBytes(3);
  }
  
  private byte[] buildStocksTypeByteArray(String paramString, int paramInt)
  {
    Object localObject = new byte[paramInt];
    String[] arrayOfString = paramString.split("\\|");
    paramString = (String)localObject;
    int i = 0;
    if (i >= arrayOfString.length) {
      return paramString;
    }
    localObject = arrayOfString[i].replace(":", "");
    if (i >= 1)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(((String)localObject).getBytes(), 0, arrayOfByte, 0, ((String)localObject).getBytes().length);
      paramString = ArrayUtil.addArray(paramString, arrayOfByte);
    }
    for (;;)
    {
      i += 1;
      break;
      paramString = new byte[paramInt];
      System.arraycopy(((String)localObject).getBytes(), 0, paramString, 0, ((String)localObject).getBytes().length);
    }
  }
  
  private byte[] buildTypeByteArray(String paramString, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramString = paramString.split(":");
    paramInt = 0;
    for (;;)
    {
      if (paramInt >= paramString.length) {
        return arrayOfByte;
      }
      int i = Integer.parseInt(paramString[paramInt]);
      int j = i / 8;
      arrayOfByte[j] = ((byte)(1 << 7 - i % 8 | arrayOfByte[j]));
      paramInt += 1;
    }
  }
  
  private byte[] formatInfoParam(HashMap<String, String> paramHashMap)
  {
    paramHashMap = paramHashMap.entrySet().iterator();
    Object localObject1 = new StringBuilder();
    for (;;)
    {
      if (!paramHashMap.hasNext())
      {
        paramHashMap = ((StringBuilder)localObject1).substring(0, ((StringBuilder)localObject1).length() - 1);
        localObject1 = paramHashMap.getBytes();
        Log.i("info request param = " + paramHashMap);
        return (byte[])localObject1;
      }
      Object localObject2 = (Map.Entry)paramHashMap.next();
      String str = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (String)((Map.Entry)localObject2).getValue();
      ((StringBuilder)localObject1).append(str).append("=").append((String)localObject2).append("&");
    }
  }
  
  private byte[] handlerTradeContent(int paramInt, String paramString)
  {
    byte[] arrayOfByte = new byte[0];
    if (paramInt == 0) {
      arrayOfByte = paramString.getBytes();
    }
    do
    {
      return arrayOfByte;
      if (paramInt == 1) {
        return AESUtil.encrypt(paramString.getBytes(), TradeSocketManager.getInstance().getAESKey().getBytes());
      }
      if (paramInt == 2) {
        return ZLibUtil.compress(paramString.getBytes());
      }
    } while (paramInt != 3);
    return ZLibUtil.compress(AESUtil.encrypt(paramString.getBytes(), TradeSocketManager.getInstance().getAESKey().getBytes()));
  }
  
  public int getFlowNo()
  {
    return this.mFlowNo;
  }
  
  public byte[] packingBody()
  {
    byte[] arrayOfByte = new byte[0];
    if (this.mSocketType == SocketType.TRADE)
    {
      Object localObject1 = new JSONObject(this.mParam).toString();
      try
      {
        Log.d("trade paramStr = " + (String)localObject1 + " msgType = " + this.mMsgType);
        localObject1 = handlerTradeContent(this.mMsgType, (String)localObject1);
        return (byte[])localObject1;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return arrayOfByte;
      }
    }
    if (this.mSocketType == SocketType.INFO) {
      return formatInfoParam(this.mParam);
    }
    ArrayList localArrayList = this.mFunctionBean.getInputs();
    int i = 0;
    if (i >= localArrayList.size()) {
      return arrayOfByte;
    }
    FunctionBean.InputBean localInputBean = (FunctionBean.InputBean)localArrayList.get(i);
    int j = localInputBean.getLength();
    String str2 = localInputBean.getType();
    Object localObject2 = localInputBean.getJsonName();
    String str1 = (String)this.mParam.get(localObject2);
    localObject2 = str1;
    if (str1 == null) {
      localObject2 = localInputBean.getDefaultValue();
    }
    if (i >= 1) {}
    for (arrayOfByte = ArrayUtil.addArray(arrayOfByte, buildByteArray(str2, (String)localObject2, j));; arrayOfByte = buildByteArray(str2, (String)localObject2, j))
    {
      i += 1;
      break;
    }
  }
  
  public byte[] packingHeader()
  {
    byte[] arrayOfByte1;
    byte[] arrayOfByte3;
    byte[] arrayOfByte4;
    label48:
    byte[] arrayOfByte5;
    byte[] arrayOfByte6;
    byte[] arrayOfByte7;
    byte[] arrayOfByte2;
    label93:
    byte[] arrayOfByte8;
    byte[] arrayOfByte9;
    byte[] arrayOfByte10;
    int i;
    if (SocketType.TRADE == this.mSocketType)
    {
      arrayOfByte1 = "TD".getBytes();
      arrayOfByte3 = ByteUtil.intToBytes(65536);
      arrayOfByte4 = new byte[1];
      if (this.mSocketType != SocketType.TRADE) {
        break label200;
      }
      arrayOfByte4[0] = ((byte)this.mMsgType);
      arrayOfByte5 = ByteUtil.intToBytes(this.mBodyLength);
      arrayOfByte6 = ByteUtil.intToBytes(this.mBodyLength);
      arrayOfByte7 = ByteUtil.shortToBytes(this.mBranchId);
      if (SocketType.TRADE != this.mSocketType) {
        break label208;
      }
      arrayOfByte2 = ByteUtil.intToBytes(this.mTradeFuncNo);
      arrayOfByte8 = ByteUtil.intToBytes(this.mFlowNo);
      arrayOfByte9 = ByteUtil.intToBytes(0);
      arrayOfByte10 = new byte[8];
      i = 0;
    }
    for (;;)
    {
      if (i >= arrayOfByte10.length)
      {
        return ArrayUtil.addArray(ArrayUtil.addArray(ArrayUtil.addArray(ArrayUtil.addArray(ArrayUtil.addArray(ArrayUtil.addArray(ArrayUtil.addArray(ArrayUtil.addArray(ArrayUtil.addArray(arrayOfByte1, arrayOfByte3), arrayOfByte4), arrayOfByte5), arrayOfByte6), arrayOfByte7), arrayOfByte2), arrayOfByte8), arrayOfByte9), arrayOfByte10);
        if (SocketType.INFO == this.mSocketType)
        {
          arrayOfByte1 = "TN".getBytes();
          break;
        }
        arrayOfByte1 = "TK".getBytes();
        break;
        label200:
        arrayOfByte4[0] = 0;
        break label48;
        label208:
        if (SocketType.INFO == this.mSocketType)
        {
          arrayOfByte2 = ByteUtil.intToBytes(this.mInfoFuncNo);
          break label93;
        }
        arrayOfByte2 = ByteUtil.shortToBytes(this.mQuotationFuncNo);
        break label93;
      }
      arrayOfByte10[i] = 0;
      i += 1;
    }
  }
  
  public void sendPacket(OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = packingBody();
    this.mBodyLength = arrayOfByte.length;
    arrayOfByte = ArrayUtil.addArray(packingHeader(), arrayOfByte);
    Log.d("send request packet " + this.mJsonFuncNo + " length = " + arrayOfByte.length + " body length = " + this.mBodyLength);
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.flush();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\packet\RequestPacket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */