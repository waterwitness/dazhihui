package tencent.tls.tools;

public class cryptor
{
  public static byte[] decrypt(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null)) {
      return null;
    }
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte1, paramInt1, arrayOfByte, 0, paramInt2);
    paramArrayOfByte1 = new byte[paramArrayOfByte2.length];
    System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte1, 0, paramArrayOfByte2.length);
    return new CryptorImpl().decrypt(arrayOfByte, paramArrayOfByte1);
  }
  
  public static byte[] encrypt(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null)) {
      return null;
    }
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte1, paramInt1, arrayOfByte, 0, paramInt2);
    paramArrayOfByte1 = new byte[paramArrayOfByte2.length];
    System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte1, 0, paramArrayOfByte2.length);
    return new CryptorImpl().encrypt(arrayOfByte, paramArrayOfByte1);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tools\cryptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */