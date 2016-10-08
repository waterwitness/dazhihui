package com.tencent.av;

import android.util.Log;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;
import com.tencent.imsdk.av.MultiVideoTinyId;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PingUtil
  implements Runnable
{
  private static final String tag = "av.PingUtil";
  PingUtil.ʻ callback;
  DatagramChannel channel;
  InetAddress client;
  byte[] data;
  private String identifer = "";
  int interval;
  List<PingUtil.ʼ> pingResults = new ArrayList();
  int pkgNum;
  List<ServerInfo> server = new ArrayList();
  Map<Integer, Calendar> timeRecord = new HashMap();
  int timeout;
  
  public PingUtil(List<ServerInfo> paramList, InetAddress paramInetAddress, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, PingUtil.ʻ paramʻ)
  {
    this.server = paramList;
    this.data = paramArrayOfByte;
    this.interval = paramInt1;
    this.pkgNum = paramInt2;
    this.timeout = paramInt3;
    this.callback = paramʻ;
    this.client = paramInetAddress;
  }
  
  public PingUtil(byte[] paramArrayOfByte, PingUtil.ʻ paramʻ)
  {
    try
    {
      byte[] arrayOfByte1 = new byte[4];
      ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte.length);
      localByteBuffer.put(paramArrayOfByte);
      localByteBuffer.position(0);
      int i = localByteBuffer.getShort();
      int j = localByteBuffer.getInt();
      localByteBuffer.getShort();
      Log.d("av.PingUtil", "subcmd:" + i + "|retcode:" + j);
      localByteBuffer.position(18);
      localByteBuffer.get();
      localByteBuffer.get(arrayOfByte1);
      paramArrayOfByte = InetAddress.getByAddress(arrayOfByte1);
      localByteBuffer.get();
      localByteBuffer.getShort();
      localByteBuffer.getShort();
      int k = localByteBuffer.getInt();
      int m = localByteBuffer.getInt();
      int n = localByteBuffer.getInt();
      i = localByteBuffer.getInt();
      if (i > localByteBuffer.remaining()) {
        return;
      }
      byte[] arrayOfByte2 = new byte[i];
      localByteBuffer.get(arrayOfByte2);
      localByteBuffer.get();
      int i1 = localByteBuffer.get();
      ArrayList localArrayList = new ArrayList();
      i = 0;
      while (i < i1)
      {
        ServerInfo localServerInfo = new ServerInfo();
        j = 3;
        while (j >= 0)
        {
          arrayOfByte1[j] = localByteBuffer.get();
          j -= 1;
        }
        localServerInfo.ip = InetAddress.getByAddress(arrayOfByte1);
        localServerInfo.port = localByteBuffer.getShort();
        localServerInfo.idc = localByteBuffer.get();
        localServerInfo.isp = localByteBuffer.get();
        localArrayList.add(localServerInfo);
        i += 1;
      }
      localByteBuffer.clear();
      this.server = localArrayList;
      this.data = arrayOfByte2;
      this.interval = k;
      this.pkgNum = n;
      this.timeout = m;
      this.callback = paramʻ;
      this.client = paramArrayOfByte;
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
  }
  
  private byte[] getLongConnUdtDataHeadV2(short paramShort1, short paramShort2)
  {
    Object localObject = IMMsfCoreProxy.get().getMsfUserInfo(this.identifer);
    if (localObject != null) {}
    for (long l = ((IMMsfUserInfo)localObject).getTinyid();; l = 0L)
    {
      localObject = ByteBuffer.allocate(41);
      int i = IMMsfCoreProxy.get().random.nextInt();
      ((ByteBuffer)localObject).putShort(paramShort1);
      ((ByteBuffer)localObject).putInt(i);
      ((ByteBuffer)localObject).putShort(paramShort2);
      ((ByteBuffer)localObject).putLong(l);
      ((ByteBuffer)localObject).putInt(0);
      ((ByteBuffer)localObject).putInt(0);
      ((ByteBuffer)localObject).putShort((short)0);
      ((ByteBuffer)localObject).putLong(0L);
      ((ByteBuffer)localObject).put((byte)0);
      ((ByteBuffer)localObject).putInt(i);
      ((ByteBuffer)localObject).putShort((short)0);
      this.timeRecord.put(Integer.valueOf(i), Calendar.getInstance());
      return ((ByteBuffer)localObject).array();
    }
  }
  
  private void reportToServer()
  {
    Object localObject = ByteBuffer.allocate(this.pingResults.size() * 30 + 19 + 2 + 2);
    int i = IMMsfCoreProxy.get().getSdkAppId();
    int j = this.interval;
    byte b = (byte)this.pingResults.size();
    ((ByteBuffer)localObject).clear();
    ((ByteBuffer)localObject).put((byte)2).put((byte)1).putShort((short)7).putShort((short)6).putInt(i).putInt(1373272373).putInt(j).put(b);
    Iterator localIterator = this.pingResults.iterator();
    while (localIterator.hasNext())
    {
      PingUtil.ʼ localʼ = (PingUtil.ʼ)localIterator.next();
      ((ByteBuffer)localObject).put(localʼ.a.ip.getAddress());
      ((ByteBuffer)localObject).putShort(localʼ.a.port);
      ((ByteBuffer)localObject).put(localʼ.a.idc);
      ((ByteBuffer)localObject).put(localʼ.a.isp);
      ((ByteBuffer)localObject).put(this.client.getAddress());
      ((ByteBuffer)localObject).putInt(this.pkgNum);
      ((ByteBuffer)localObject).putInt(localʼ.d);
      ((ByteBuffer)localObject).putInt(localʼ.b);
      ((ByteBuffer)localObject).putInt(0);
      ((ByteBuffer)localObject).putShort((short)0);
    }
    ((ByteBuffer)localObject).putShort((short)0);
    ((ByteBuffer)localObject).putShort((short)0);
    localObject = NetworkUtil.formReq(this.identifer, 210, 0, "", ((ByteBuffer)localObject).array());
    MultiVideoTinyId.get().requestMultiVideoInfo((byte[])localObject, new ʼ(this));
  }
  
  private void send()
  {
    int i = 0;
    while (i < this.pkgNum)
    {
      byte[] arrayOfByte = GetPingPackage(this.data);
      ByteBuffer localByteBuffer = ByteBuffer.allocate(arrayOfByte.length);
      localByteBuffer.put(arrayOfByte);
      localByteBuffer.flip();
      this.channel.write(localByteBuffer);
      localByteBuffer.clear();
      Thread.sleep(this.interval);
      i += 1;
    }
  }
  
  public byte[] GetPingPackage(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length + 46 + 1;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.put((byte)2);
    localByteBuffer.put(getLongConnUdtDataHeadV2((short)i, (short)469));
    localByteBuffer.putInt(paramArrayOfByte.length);
    localByteBuffer.put(paramArrayOfByte);
    localByteBuffer.put((byte)3);
    return localByteBuffer.array();
  }
  
  public void logResult()
  {
    Iterator localIterator = this.pingResults.iterator();
    while (localIterator.hasNext())
    {
      PingUtil.ʼ localʼ = (PingUtil.ʼ)localIterator.next();
      QLog.e("av.PingUtil", 1, "serverIp:" + localʼ.a.ip.toString() + " useTime:" + localʼ.b + " totalPkg:" + localʼ.c + " receivePkg:" + localʼ.d);
    }
  }
  
  public void run()
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = this.server.iterator();
        if (!localIterator.hasNext()) {
          continue;
        }
        ServerInfo localServerInfo = (ServerInfo)localIterator.next();
        localObject2 = new ArrayList();
        Object localObject3 = Selector.open();
        this.channel = DatagramChannel.open();
        this.channel.connect(new InetSocketAddress(localServerInfo.ip, localServerInfo.port));
        this.channel.configureBlocking(false);
        this.channel.register((Selector)localObject3, 1);
        new Thread(new ʻ(this, (Selector)localObject3, (List)localObject2)).start();
        send();
        i = 0;
        if ((i < this.timeout / 100) && (((List)localObject2).size() != this.pkgNum))
        {
          Thread.sleep(100L);
          i += 1;
          continue;
        }
        ((Selector)localObject3).close();
        l2 = 0L;
        l1 = 0L;
        localObject2 = ((List)localObject2).iterator();
        if (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Long)((Iterator)localObject2).next();
          if (((Long)localObject3).longValue() >= this.timeout) {
            continue;
          }
          l2 += 1L;
          l1 += ((Long)localObject3).longValue();
          continue;
        }
        localObject2 = new PingUtil.ʼ(this);
        ((PingUtil.ʼ)localObject2).a = localServerInfo;
        ((PingUtil.ʼ)localObject2).d = ((int)l2);
        ((PingUtil.ʼ)localObject2).c = this.pkgNum;
        if (l2 != 0L) {
          continue;
        }
        i = Integer.MAX_VALUE;
      }
      catch (IOException localIOException)
      {
        Object localObject2;
        long l2;
        long l1;
        localIOException.printStackTrace();
        return;
        int i = (int)(l1 / l2);
        continue;
        logResult();
        reportToServer();
        if (this.callback == null) {
          continue;
        }
        Object localObject1 = this.callback;
        localObject1 = this.pingResults;
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
      ((PingUtil.ʼ)localObject2).b = i;
      this.pingResults.add(localObject2);
    }
  }
  
  public void setIdentifer(String paramString)
  {
    this.identifer = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\PingUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */