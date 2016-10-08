package tencent.tls.request;

public class TransReqContext
{
  public byte[] _body;
  public int _subcmd = 0;
  public int _type = 0;
  public long _uin = 0L;
  public Object listener = null;
  
  public TransReqContext(Object paramObject)
  {
    this.listener = paramObject;
  }
  
  public byte[] get_body()
  {
    return this._body;
  }
  
  public int get_subcmd()
  {
    return this._subcmd;
  }
  
  public long get_uin()
  {
    return this._uin;
  }
  
  public boolean is_register_req()
  {
    return this._type == 1;
  }
  
  public void set_body(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      this._body = new byte[0];
      return;
    }
    this._body = paramArrayOfByte;
  }
  
  public void set_register_req()
  {
    this._type = 1;
  }
  
  public void set_subcmd(int paramInt)
  {
    this._subcmd = paramInt;
  }
  
  public void set_uin(long paramLong)
  {
    this._uin = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\TransReqContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */