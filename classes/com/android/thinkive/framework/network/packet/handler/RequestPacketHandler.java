package com.android.thinkive.framework.network.packet.handler;

import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.config.FieldBean;
import com.android.thinkive.framework.config.FunctionBean;
import com.android.thinkive.framework.config.FunctionBean.OutPutBean;
import com.android.thinkive.framework.config.FunctionBean.OutSetBean;
import com.android.thinkive.framework.network.socket.SocketRequestBean;
import com.android.thinkive.framework.network.socket.SocketType;
import com.android.thinkive.framework.network.socket.TradeSocketManager;
import com.android.thinkive.framework.util.AESUtil;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.ZLibUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class RequestPacketHandler
{
  private boolean isStockIndex;
  private int mCount;
  private String[] mFieldParamArray;
  private String mFunNo;
  private FunctionBean mFunctionBean;
  private HashMap<String, Integer> mIndexMap;
  private HashMap<String, String> mParam;
  private ArrayList<String> mResponseFieldList;
  private SocketRequestBean mSocketRequestBean;
  private int mStart;
  
  public RequestPacketHandler(SocketRequestBean paramSocketRequestBean)
  {
    this.mParam = paramSocketRequestBean.getParam();
    this.mSocketRequestBean = paramSocketRequestBean;
    this.mFunNo = ((String)this.mParam.get("funcno"));
    if ((paramSocketRequestBean.getSocketType() != SocketType.TRADE) && (paramSocketRequestBean.getSocketType() != SocketType.INFO))
    {
      this.mFunctionBean = ConfigManager.getInstance().getFunctionBean(this.mFunNo, paramSocketRequestBean.getSocketType());
      this.mIndexMap = new HashMap();
      this.isStockIndex = this.mFunctionBean.isStockIndex();
    }
  }
  
  private void buildIndexMap(ArrayList<String> paramArrayList)
  {
    int i = 0;
    for (;;)
    {
      if (i >= this.mFieldParamArray.length) {
        return;
      }
      this.mIndexMap.put(this.mFieldParamArray[i], Integer.valueOf(i));
      i += 1;
    }
  }
  
  private void buildJsonArray(JSONArray paramJSONArray, String paramString1, ByteBuffer paramByteBuffer, int paramInt, String paramString2)
  {
    int i = ((Integer)this.mIndexMap.get(paramString2)).intValue();
    if (paramString1.equals("int")) {
      paramJSONArray.put(i, paramByteBuffer.getInt());
    }
    do
    {
      return;
      if (paramString1.equals("short"))
      {
        paramJSONArray.put(i, paramByteBuffer.getShort());
        return;
      }
      if (paramString1.equals("long"))
      {
        paramJSONArray.put(i, paramByteBuffer.getLong());
        return;
      }
      if (paramString1.equals("float"))
      {
        paramJSONArray.put(i, paramByteBuffer.getFloat());
        return;
      }
      if (paramString1.equals("double"))
      {
        paramJSONArray.put(i, paramByteBuffer.getDouble());
        return;
      }
      if (paramString1.equals("byte"))
      {
        paramString1 = new byte[paramInt];
        paramByteBuffer.get(paramString1);
        paramJSONArray.put(i, paramString1[0]);
        return;
      }
      if (paramString1.equals("char"))
      {
        paramString1 = new byte[paramInt];
        paramByteBuffer.get(paramString1);
        paramJSONArray.put(i, new String(paramString1, "GBK").trim());
        return;
      }
      if (paramString1.equals("bool"))
      {
        paramString1 = new byte[paramInt];
        paramByteBuffer.get(paramString1);
        if (paramString1[0] >= 1) {}
        for (boolean bool = true;; bool = false)
        {
          paramJSONArray.put(i, bool);
          return;
        }
      }
    } while (!paramString1.equals("stock"));
    paramString1 = new byte[paramInt];
    paramByteBuffer.get(paramString1);
    paramString1 = new StringBuffer(new String(paramString1, "UTF-8"));
    paramString1.insert(2, ":");
    paramJSONArray.put(i, paramString1.toString());
  }
  
  private void buildJsonArray(JSONArray paramJSONArray, String paramString, ByteBuffer paramByteBuffer, int paramInt, boolean paramBoolean)
  {
    boolean bool = true;
    if (paramString.equals("int"))
    {
      paramInt = paramByteBuffer.getInt();
      if (paramBoolean) {
        paramJSONArray.put(getUnsignedInt(paramInt));
      }
    }
    do
    {
      return;
      paramJSONArray.put(paramInt);
      return;
      if (paramString.equals("short"))
      {
        paramJSONArray.put(paramByteBuffer.getShort());
        return;
      }
      if (paramString.equals("long"))
      {
        paramJSONArray.put(paramByteBuffer.getLong());
        return;
      }
      if (paramString.equals("float"))
      {
        paramJSONArray.put(paramByteBuffer.getFloat());
        return;
      }
      if (paramString.equals("double"))
      {
        paramJSONArray.put(paramByteBuffer.getDouble());
        return;
      }
      if (paramString.equals("byte"))
      {
        paramString = new byte[paramInt];
        paramByteBuffer.get(paramString);
        paramJSONArray.put(paramString[0]);
        return;
      }
      if (paramString.equals("char"))
      {
        paramString = new byte[paramInt];
        paramByteBuffer.get(paramString);
        paramJSONArray.put(new String(paramString, "GBK").trim());
        return;
      }
      if (paramString.equals("bool"))
      {
        paramString = new byte[paramInt];
        paramByteBuffer.get(paramString);
        if (paramString[0] >= 1) {}
        for (paramBoolean = bool;; paramBoolean = false)
        {
          paramJSONArray.put(paramBoolean);
          return;
        }
      }
    } while (!paramString.equals("stock"));
    paramString = new byte[paramInt];
    paramByteBuffer.get(paramString);
    paramString = new StringBuffer(new String(paramString, "UTF-8"));
    paramString.insert(2, ":");
    paramJSONArray.put(paramString.toString());
  }
  
  private void buildJsonObject(JSONObject paramJSONObject, String paramString1, String paramString2, ByteBuffer paramByteBuffer, int paramInt, boolean paramBoolean)
  {
    boolean bool = true;
    if (paramString2.equals("int"))
    {
      paramInt = paramByteBuffer.getInt();
      if (paramBoolean) {
        paramJSONObject.put(paramString1, getUnsignedInt(paramInt));
      }
    }
    do
    {
      return;
      paramJSONObject.put(paramString1, paramInt);
      return;
      if (paramString2.equals("short"))
      {
        paramJSONObject.put(paramString1, paramByteBuffer.getShort());
        return;
      }
      if (paramString2.equals("long"))
      {
        paramJSONObject.put(paramString1, paramByteBuffer.getLong());
        return;
      }
      if (paramString2.equals("float"))
      {
        paramJSONObject.put(paramString1, paramByteBuffer.getFloat());
        return;
      }
      if (paramString2.equals("double"))
      {
        paramJSONObject.put(paramString1, paramByteBuffer.getDouble());
        return;
      }
      if (paramString2.equals("byte"))
      {
        paramString2 = new byte[paramInt];
        paramByteBuffer.get(paramString2);
        paramJSONObject.put(paramString1, paramString2[0]);
        return;
      }
      if (paramString2.equals("char"))
      {
        paramString2 = new byte[paramInt];
        paramByteBuffer.get(paramString2);
        paramJSONObject.put(paramString1, new String(paramString2, "GBK").trim());
        return;
      }
      if (paramString2.equals("bool"))
      {
        paramString2 = new byte[paramInt];
        paramByteBuffer.get(paramString2);
        if (paramString2[0] >= 1) {}
        for (paramBoolean = bool;; paramBoolean = false)
        {
          paramJSONObject.put(paramString1, paramBoolean);
          return;
        }
      }
    } while (!paramString2.equals("stock"));
    paramString2 = new byte[paramInt];
    paramByteBuffer.get(paramString2);
    paramString2 = new StringBuffer(new String(paramString2, "UTF-8"));
    paramString2.insert(2, ":");
    paramJSONObject.put(paramString1, paramString2.toString());
  }
  
  private long getUnsignedInt(int paramInt)
  {
    return paramInt & 0xFFFFFFFF;
  }
  
  private int getUnsignedShort(short paramShort)
  {
    return 0xFFFF & paramShort;
  }
  
  private void initJsonArray(JSONArray paramJSONArray, String[] paramArrayOfString)
  {
    int j = paramArrayOfString.length;
    int i = 0;
    if (i >= j) {
      return;
    }
    String str = paramArrayOfString[i];
    str = ConfigManager.getInstance().getFieldBean(str, this.mSocketRequestBean.getSocketType()).getType();
    if ("char".equals(str)) {
      paramJSONArray.put("-");
    }
    for (;;)
    {
      i += 1;
      break;
      if ("bool".equals(str)) {
        paramJSONArray.put(false);
      } else {
        paramJSONArray.put("0");
      }
    }
  }
  
  private ArrayList<String> parseFieldBytes(byte[] paramArrayOfByte)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i >= paramArrayOfByte.length) {
      return localArrayList;
    }
    int j = 7;
    for (;;)
    {
      if (j < 0)
      {
        i += 1;
        break;
      }
      if ((paramArrayOfByte[i] >> j & 0x1) == 1) {
        localArrayList.add(String.valueOf(i * 8 + (7 - j) + 1));
      }
      j -= 1;
    }
  }
  
  private void parseOutSet(ByteBuffer paramByteBuffer, ArrayList<FunctionBean.OutSetBean> paramArrayList, JSONObject paramJSONObject)
  {
    int i = 0;
    if (i >= paramArrayList.size()) {
      return;
    }
    Object localObject1 = (FunctionBean.OutSetBean)paramArrayList.get(i);
    Object localObject2 = ((FunctionBean.OutSetBean)localObject1).getType();
    int j = ((FunctionBean.OutSetBean)localObject1).getLength();
    localObject1 = ((FunctionBean.OutSetBean)localObject1).getName();
    if (((String)localObject2).equals("count")) {
      this.mCount = paramByteBuffer.getInt();
    }
    for (;;)
    {
      this.mStart += j;
      i += 1;
      break;
      if (((String)localObject2).equals("field"))
      {
        localObject1 = new byte[j];
        paramByteBuffer.get((byte[])localObject1);
        this.mResponseFieldList = parseFieldBytes((byte[])localObject1);
      }
      else
      {
        if (((String)localObject2).equals("bool"))
        {
          localObject2 = new byte[j];
          paramByteBuffer.get((byte[])localObject2);
          if (localObject2[0] >= 1) {}
          for (boolean bool = true;; bool = false)
          {
            paramJSONObject.put((String)localObject1, bool);
            break;
          }
        }
        if ((((String)localObject1).equals("StockKey")) && (((String)localObject2).equals("char")))
        {
          paramByteBuffer.get(new byte[j]);
        }
        else if (((String)localObject2).equals("int"))
        {
          paramJSONObject.put((String)localObject1, paramByteBuffer.getInt());
        }
        else if (((String)localObject2).equals("short"))
        {
          paramJSONObject.put((String)localObject1, paramByteBuffer.getShort());
        }
        else if (((String)localObject2).equals("long"))
        {
          paramJSONObject.put((String)localObject1, paramByteBuffer.getLong());
        }
        else if (((String)localObject2).equals("float"))
        {
          paramJSONObject.put((String)localObject1, paramByteBuffer.getFloat());
        }
        else if (((String)localObject2).equals("double"))
        {
          paramJSONObject.put((String)localObject1, paramByteBuffer.getDouble());
        }
        else if (((String)localObject2).equals("byte"))
        {
          localObject2 = new byte[j];
          paramByteBuffer.get((byte[])localObject2);
          paramJSONObject.put((String)localObject1, localObject2[0]);
        }
        else if (((String)localObject2).equals("char"))
        {
          localObject2 = new byte[j];
          paramByteBuffer.get((byte[])localObject2);
          paramJSONObject.put((String)localObject1, new String((byte[])localObject2, "GBK").trim());
        }
        else if (((String)localObject2).equals("stock"))
        {
          localObject2 = new byte[j];
          paramByteBuffer.get((byte[])localObject2);
          localObject2 = new StringBuffer(new String((byte[])localObject2, "UTF-8"));
          ((StringBuffer)localObject2).insert(2, ":");
          paramJSONObject.put((String)localObject1, ((StringBuffer)localObject2).toString());
        }
      }
    }
  }
  
  public JSONObject parse(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    Object localObject3 = this.mFunctionBean.getOutsets();
    JSONObject localJSONObject = new JSONObject();
    Object localObject1;
    if (paramInt2 == 2)
    {
      localObject1 = new byte[paramInt1];
      paramByteBuffer.get((byte[])localObject1);
      paramByteBuffer = ByteBuffer.wrap(ZLibUtil.decompress((byte[])localObject1));
      paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }
    for (;;)
    {
      parseOutSet(paramByteBuffer, (ArrayList)localObject3, localJSONObject);
      localObject1 = new JSONArray();
      Object localObject2 = this.mFunctionBean.getOutPuts();
      Log.d("response " + this.mFunNo + " count = " + this.mCount);
      if (this.mResponseFieldList != null)
      {
        this.mFieldParamArray = ((String)this.mParam.get("field")).split(":");
        buildIndexMap(this.mResponseFieldList);
        Log.d("request field str = " + (String)this.mParam.get("field"));
        Log.e("response field str = " + this.mResponseFieldList);
      }
      Object localObject4;
      Object localObject5;
      if (((ArrayList)localObject3).size() > 0)
      {
        paramInt1 = 0;
        if (paramInt1 >= this.mCount)
        {
          localJSONObject.put("errorInfo", "");
          localJSONObject.put("errorNo", "0");
          localJSONObject.put("results", localObject1);
          return localJSONObject;
        }
        localObject3 = new JSONArray();
        localObject4 = new JSONObject();
        if (this.mResponseFieldList != null)
        {
          initJsonArray((JSONArray)localObject3, this.mFieldParamArray);
          localObject5 = this.mResponseFieldList.iterator();
          label307:
          if (!((Iterator)localObject5).hasNext())
          {
            if (this.mFunctionBean.getMode() != 1) {
              break label543;
            }
            ((JSONArray)localObject1).put(localObject4);
          }
        }
        for (;;)
        {
          paramInt1 += 1;
          break;
          Object localObject6 = (String)((Iterator)localObject5).next();
          Object localObject7 = ConfigManager.getInstance().getFieldBean((String)localObject6, this.mSocketRequestBean.getSocketType());
          int i = ((FieldBean)localObject7).getLength();
          paramInt2 = i;
          if (this.isStockIndex)
          {
            paramInt2 = i;
            if (((String)localObject6).equals("24")) {
              paramInt2 = 11;
            }
          }
          buildJsonArray((JSONArray)localObject3, ((FieldBean)localObject7).getType(), paramByteBuffer, paramInt2, (String)localObject6);
          this.mStart += paramInt2;
          break label307;
          localObject5 = ((ArrayList)localObject2).iterator();
          label441:
          boolean bool;
          if (((Iterator)localObject5).hasNext())
          {
            localObject6 = (FunctionBean.OutPutBean)((Iterator)localObject5).next();
            paramInt2 = ((FunctionBean.OutPutBean)localObject6).getLength();
            localObject7 = ((FunctionBean.OutPutBean)localObject6).getType();
            String str = ((FunctionBean.OutPutBean)localObject6).getJsonName();
            bool = ((FunctionBean.OutPutBean)localObject6).isUnsign();
            if (this.mFunctionBean.getMode() != 1) {
              break label528;
            }
            buildJsonObject((JSONObject)localObject4, str, (String)localObject7, paramByteBuffer, paramInt2, bool);
          }
          for (;;)
          {
            this.mStart += paramInt2;
            break label441;
            break;
            label528:
            buildJsonArray((JSONArray)localObject3, (String)localObject7, paramByteBuffer, paramInt2, bool);
          }
          label543:
          ((JSONArray)localObject1).put(localObject3);
        }
      }
      localObject3 = new JSONArray();
      localObject2 = ((ArrayList)localObject2).iterator();
      for (;;)
      {
        if (!((Iterator)localObject2).hasNext())
        {
          ((JSONArray)localObject1).put(localObject3);
          break;
        }
        localObject4 = (FunctionBean.OutPutBean)((Iterator)localObject2).next();
        paramInt1 = ((FunctionBean.OutPutBean)localObject4).getLength();
        localObject5 = ((FunctionBean.OutPutBean)localObject4).getType();
        ((FunctionBean.OutPutBean)localObject4).getJsonName();
        buildJsonArray((JSONArray)localObject3, (String)localObject5, paramByteBuffer, paramInt1, ((FunctionBean.OutPutBean)localObject4).isUnsign());
      }
    }
  }
  
  public JSONObject parseInfoData(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    JSONObject localJSONObject = null;
    byte[] arrayOfByte = new byte[paramInt1];
    paramByteBuffer.get(arrayOfByte);
    paramByteBuffer = "";
    if (paramInt2 == 0)
    {
      paramByteBuffer = new String(arrayOfByte, "GBK");
      localJSONObject = new JSONObject(paramByteBuffer.trim());
    }
    for (;;)
    {
      Log.i("msgType = " + paramInt2 + " info response  = " + paramByteBuffer.trim());
      return localJSONObject;
      if (paramInt2 == 1)
      {
        paramByteBuffer = new String(ZLibUtil.decompress(arrayOfByte), "GBK");
        localJSONObject = new JSONObject(paramByteBuffer.trim());
      }
    }
  }
  
  public JSONObject parseTradeData(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    JSONObject localJSONObject = null;
    byte[] arrayOfByte = new byte[paramInt1];
    paramByteBuffer.get(arrayOfByte);
    paramByteBuffer = "";
    if (paramInt2 == 0)
    {
      paramByteBuffer = new String(arrayOfByte, "GBK");
      localJSONObject = new JSONObject(paramByteBuffer.trim());
    }
    for (;;)
    {
      Log.i("msgType = " + paramInt2 + " decrypt trade response  = " + paramByteBuffer.trim());
      return localJSONObject;
      if (paramInt2 == 1)
      {
        paramByteBuffer = new String(AESUtil.decrypt(arrayOfByte, TradeSocketManager.getInstance().getAESKey().getBytes()), "GBK");
        localJSONObject = new JSONObject(paramByteBuffer.trim());
      }
      else if (paramInt2 == 2)
      {
        paramByteBuffer = new String(ZLibUtil.decompress(arrayOfByte), "GBK");
        localJSONObject = new JSONObject(paramByteBuffer.trim());
      }
      else if (paramInt2 == 3)
      {
        paramByteBuffer = new String(AESUtil.decrypt(ZLibUtil.decompress(arrayOfByte), TradeSocketManager.getInstance().getAESKey().getBytes()), "GBK");
        localJSONObject = new JSONObject(paramByteBuffer.trim());
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\packet\handler\RequestPacketHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */