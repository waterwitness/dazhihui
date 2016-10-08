package com.android.thinkive.framework.network.packet;

import java.io.OutputStream;

public abstract interface IPacket
{
  public abstract int getFlowNo();
  
  public abstract byte[] packingBody();
  
  public abstract byte[] packingHeader();
  
  public abstract void sendPacket(OutputStream paramOutputStream);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\packet\IPacket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */