package com.android.thinkive.framework.network.socket;

import com.android.thinkive.framework.network.packet.handler.RequestPacketHandler;
import com.android.thinkive.framework.util.ArrayUtil;
import com.android.thinkive.framework.util.ByteUtil;
import com.android.thinkive.framework.util.Log;
import java.nio.ByteBuffer;
import org.json.JSONObject;

public class IOHandler
{
  private int dataLen;
  private int flowNo;
  private int funNo;
  private int msgType;
  private int origDataLen;
  private int receivedLength;
  private int responseCode;
  
  private JSONObject parseBodyData(ByteBuffer paramByteBuffer, SocketRequestBean paramSocketRequestBean)
  {
    JSONObject localJSONObject = new JSONObject();
    RequestPacketHandler localRequestPacketHandler = new RequestPacketHandler(paramSocketRequestBean);
    if (localRequestPacketHandler != null) {
      try
      {
        if (paramSocketRequestBean.getSocketType() == SocketType.TRADE) {
          return localRequestPacketHandler.parseTradeData(paramByteBuffer, this.dataLen, this.msgType);
        }
        if (paramSocketRequestBean.getSocketType() == SocketType.INFO) {
          return localRequestPacketHandler.parseInfoData(paramByteBuffer, this.dataLen, this.msgType);
        }
        paramByteBuffer = localRequestPacketHandler.parse(paramByteBuffer, this.dataLen, this.msgType);
        return paramByteBuffer;
      }
      catch (Exception paramByteBuffer)
      {
        paramByteBuffer.printStackTrace();
        paramSocketRequestBean.getListener().onErrorResponse(new SocketException("数据解析异常!", SocketException.ExceptionType.DATA));
        localJSONObject = null;
      }
    }
    return localJSONObject;
  }
  
  private void parseHeaderData(byte[] paramArrayOfByte, String paramString)
  {
    if ("TD".equals(paramString)) {
      parseTDHeaderData(paramArrayOfByte);
    }
    do
    {
      return;
      if ("TK".equals(paramString))
      {
        parseTKHeaderData(paramArrayOfByte);
        return;
      }
    } while (!"TN".equals(paramString));
    parseTNHeaderData(paramArrayOfByte);
  }
  
  private void parseTDHeaderData(byte[] paramArrayOfByte)
  {
    this.msgType = ArrayUtil.cutArray(paramArrayOfByte, 4, 5)[0];
    this.dataLen = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 5, 9));
    this.origDataLen = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 9, 13));
    this.funNo = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 15, 19));
    this.flowNo = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 19, 23));
    this.responseCode = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 23, 27));
    Log.e("td packet funNo = " + this.funNo + " msgType = " + this.msgType + " dataLen = " + this.dataLen + " origDataLen = " + this.origDataLen + " responseCode = " + this.responseCode + " flowNo = " + this.flowNo);
  }
  
  private void parseTKHeaderData(byte[] paramArrayOfByte)
  {
    this.msgType = ArrayUtil.cutArray(paramArrayOfByte, 4, 5)[0];
    this.dataLen = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 5, 9));
    this.origDataLen = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 9, 13));
    this.funNo = ByteUtil.bytesToShort(ArrayUtil.cutArray(paramArrayOfByte, 15, 17));
    this.flowNo = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 17, 21));
    this.responseCode = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 21, 25));
    Log.e("tk packet funNo = " + this.funNo + " msgType = " + this.msgType + " dataLen = " + this.dataLen + " origDataLen = " + this.origDataLen + " responseCode = " + this.responseCode + " flowNo = " + this.flowNo);
  }
  
  private void parseTNHeaderData(byte[] paramArrayOfByte)
  {
    this.msgType = ArrayUtil.cutArray(paramArrayOfByte, 4, 5)[0];
    this.dataLen = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 5, 9));
    this.origDataLen = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 9, 13));
    this.funNo = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 15, 19));
    this.flowNo = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 19, 23));
    this.responseCode = ByteUtil.bytesToInt(ArrayUtil.cutArray(paramArrayOfByte, 23, 27));
    Log.e("tn packet funNo = " + this.funNo + " msgType = " + this.msgType + " dataLen = " + this.dataLen + " origDataLen = " + this.origDataLen + " responseCode = " + this.responseCode + " flowNo = " + this.flowNo);
  }
  
  public int getFlowNo()
  {
    return this.flowNo;
  }
  
  public int getFunNo()
  {
    return this.funNo;
  }
  
  public int getMsgType()
  {
    return this.msgType;
  }
  
  public int getResponseCode()
  {
    return this.responseCode;
  }
  
  public JSONObject handerBody(ByteBuffer paramByteBuffer, SocketRequestBean paramSocketRequestBean)
  {
    return parseBodyData(paramByteBuffer, paramSocketRequestBean);
  }
  
  public int handerHeader(byte[] paramArrayOfByte, String paramString)
  {
    parseHeaderData(paramArrayOfByte, paramString);
    return this.dataLen;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\socket\IOHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */