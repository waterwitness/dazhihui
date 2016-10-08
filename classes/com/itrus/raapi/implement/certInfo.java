package com.itrus.raapi.implement;

public class certInfo
{
  public String CSP;
  public String CommonName;
  public String GetEncodedCert;
  public String Issuer;
  public String KeyContainer;
  public int KeyUsage;
  public String PublicKey;
  public String SerialNumber;
  public String Subject;
  public String ValidFrom;
  public String ValidTo;
  public String Verify;
  
  public String toString()
  {
    return "certInfo [CommonName=" + this.CommonName + ", Subject=" + this.Subject + ", Issuer=" + this.Issuer + ", CSP=" + this.CSP + ", KeyContainer=" + this.KeyContainer + ", SerialNumber=" + this.SerialNumber + ", ValidFrom=" + this.ValidFrom + ", ValidTo=" + this.ValidTo + ", KeyUsage=" + this.KeyUsage + ", GetEncodedCert=" + this.GetEncodedCert + ", Verify=" + this.Verify + ", PublicKey=" + this.PublicKey + "]";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\itrus\raapi\implement\certInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */