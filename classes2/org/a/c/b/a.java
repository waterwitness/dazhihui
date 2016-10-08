package org.a.c.b;

import java.security.AccessController;
import java.security.Provider;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.a.a.be;
import org.a.a.h.c;

public final class a
  extends Provider
{
  public static String a = "BC";
  private static String b = "BouncyCastle Security Provider v1.46";
  private static final String[] c = { "AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "DESede", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Skipjack", "TEA", "Twofish", "VMPC", "VMPCKSA3", "XTEA" };
  private static final String[] d = { "EC" };
  
  public a()
  {
    super(a, 1.46D, b);
    AccessController.doPrivileged(new b(this));
  }
  
  private void a()
  {
    a("org.bouncycastle.jce.provider.symmetric.", c);
    a("org.bouncycastle.jce.provider.asymmetric.", d);
    put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
    put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
    put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
    put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
    put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
    put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
    put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
    put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
    put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
    put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
    put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
    put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
    put("KeyStore.BKS", "org.bouncycastle.jce.provider.JDKKeyStore");
    put("KeyStore.BouncyCastle", "org.bouncycastle.jce.provider.JDKKeyStore$BouncyCastleStore");
    put("KeyStore.PKCS12", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
    put("KeyStore.BCPKCS12", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
    put("KeyStore.PKCS12-DEF", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
    put("KeyStore.PKCS12-3DES-40RC2", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
    put("KeyStore.PKCS12-3DES-3DES", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore3DES");
    put("KeyStore.PKCS12-DEF-3DES-40RC2", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
    put("KeyStore.PKCS12-DEF-3DES-3DES", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore3DES");
    put("Alg.Alias.KeyStore.UBER", "BouncyCastle");
    put("Alg.Alias.KeyStore.BOUNCYCASTLE", "BouncyCastle");
    put("Alg.Alias.KeyStore.bouncycastle", "BouncyCastle");
    put("CertificateFactory.X.509", "org.bouncycastle.jce.provider.JDKX509CertificateFactory");
    put("Alg.Alias.CertificateFactory.X509", "X.509");
    put("AlgorithmParameterGenerator.DH", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DH");
    put("AlgorithmParameterGenerator.DSA", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DSA");
    put("AlgorithmParameterGenerator.GOST3410", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$GOST3410");
    put("AlgorithmParameterGenerator.ELGAMAL", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$ElGamal");
    put("AlgorithmParameterGenerator.DES", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DES");
    put("AlgorithmParameterGenerator.DESEDE", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DES");
    put("AlgorithmParameterGenerator." + c.B, "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DES");
    put("AlgorithmParameterGenerator." + org.a.a.g.a.e, "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DES");
    put("AlgorithmParameterGenerator.RC2", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$RC2");
    put("AlgorithmParameterGenerator.1.2.840.113549.3.2", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$RC2");
    put("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
    put("Alg.Alias.AlgorithmParameterGenerator.GOST-3410", "GOST3410");
    put("AlgorithmParameters.OAEP", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$OAEP");
    put("AlgorithmParameters.PSS", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$PSS");
    put("AlgorithmParameters.DH", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$DH");
    put("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
    put("AlgorithmParameters.DSA", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$DSA");
    put("AlgorithmParameters.ELGAMAL", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$ElGamal");
    put("AlgorithmParameters.IES", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$IES");
    put("AlgorithmParameters.PKCS12PBE", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$PKCS12PBE");
    put("AlgorithmParameters." + c.B, "org.bouncycastle.jce.provider.JDKAlgorithmParameters$IVAlgorithmParameters");
    put("AlgorithmParameters." + c.z, "org.bouncycastle.jce.provider.JDKAlgorithmParameters$PBKDF2");
    put("AlgorithmParameters.GOST3410", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$GOST3410");
    put("Alg.Alias.AlgorithmParameters.GOST-3410", "GOST3410");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC2", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2-CBC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC2-CBC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC2-CBC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH-CBC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.1", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.2", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.5", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWithSHAAnd3KeyTripleDES", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters." + org.a.a.a.a.l.e(), "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters." + org.a.a.a.a.m.e(), "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters." + org.a.a.a.a.n.e(), "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters." + org.a.a.a.a.o.e(), "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters." + org.a.a.a.a.p.e(), "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters." + org.a.a.a.a.q.e(), "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters." + c.h, "OAEP");
    put("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
    put("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
    put("Alg.Alias.AlgorithmParameters." + c.k, "PSS");
    put("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
    put("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
    put("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
    put("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
    put("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
    put("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
    put("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
    put("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
    put("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
    put("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
    put("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
    put("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
    put("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
    put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
    put("AlgorithmParameters.SHA1WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
    put("AlgorithmParameters.SHA224WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
    put("AlgorithmParameters.SHA256WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
    put("AlgorithmParameters.SHA384WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
    put("AlgorithmParameters.SHA512WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
    put("KeyAgreement.DH", "org.bouncycastle.jce.provider.JCEDHKeyAgreement");
    put("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
    put("Cipher.DES", "org.bouncycastle.jce.provider.JCEBlockCipher$DES");
    put("Cipher." + org.a.a.g.a.e, "org.bouncycastle.jce.provider.JCEBlockCipher$DESCBC");
    put("Cipher.RC2", "org.bouncycastle.jce.provider.JCEBlockCipher$RC2");
    put("Cipher.RC2WRAP", "org.bouncycastle.jce.provider.WrapCipherSpi$RC2Wrap");
    put("Cipher.1.2.840.113549.1.9.16.3.7", "org.bouncycastle.jce.provider.WrapCipherSpi$RC2Wrap");
    put("Cipher.1.2.840.113549.3.2", "org.bouncycastle.jce.provider.JCEBlockCipher$RC2CBC");
    put("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
    put("Cipher.GOST28147", "org.bouncycastle.jce.provider.JCEBlockCipher$GOST28147");
    put("Alg.Alias.Cipher.GOST", "GOST28147");
    put("Alg.Alias.Cipher.GOST-28147", "GOST28147");
    put("Cipher." + org.a.a.c.a.b, "org.bouncycastle.jce.provider.JCEBlockCipher$GOST28147cbc");
    put("Cipher.RSA", "org.bouncycastle.jce.provider.JCERSACipher$NoPadding");
    put("Cipher.RSA/RAW", "org.bouncycastle.jce.provider.JCERSACipher$NoPadding");
    put("Cipher.RSA/PKCS1", "org.bouncycastle.jce.provider.JCERSACipher$PKCS1v1_5Padding");
    put("Cipher.1.2.840.113549.1.1.1", "org.bouncycastle.jce.provider.JCERSACipher$PKCS1v1_5Padding");
    put("Cipher.2.5.8.1.1", "org.bouncycastle.jce.provider.JCERSACipher$PKCS1v1_5Padding");
    put("Cipher.RSA/1", "org.bouncycastle.jce.provider.JCERSACipher$PKCS1v1_5Padding_PrivateOnly");
    put("Cipher.RSA/2", "org.bouncycastle.jce.provider.JCERSACipher$PKCS1v1_5Padding_PublicOnly");
    put("Cipher.RSA/OAEP", "org.bouncycastle.jce.provider.JCERSACipher$OAEPPadding");
    put("Cipher." + c.h, "org.bouncycastle.jce.provider.JCERSACipher$OAEPPadding");
    put("Cipher.RSA/ISO9796-1", "org.bouncycastle.jce.provider.JCERSACipher$ISO9796d1Padding");
    put("Cipher.ECIES", "org.bouncycastle.jce.provider.JCEIESCipher$ECIES");
    put("Cipher.BrokenECIES", "org.bouncycastle.jce.provider.JCEIESCipher$BrokenECIES");
    put("Cipher.IES", "org.bouncycastle.jce.provider.JCEIESCipher$IES");
    put("Cipher.BrokenIES", "org.bouncycastle.jce.provider.JCEIESCipher$BrokenIES");
    put("Cipher.ELGAMAL", "org.bouncycastle.jce.provider.JCEElGamalCipher$NoPadding");
    put("Cipher.ELGAMAL/PKCS1", "org.bouncycastle.jce.provider.JCEElGamalCipher$PKCS1v1_5Padding");
    put("Alg.Alias.Cipher.RSA//RAW", "RSA");
    put("Alg.Alias.Cipher.RSA//NOPADDING", "RSA");
    put("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
    put("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
    put("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
    put("Alg.Alias.Cipher.ELGAMAL/ECB/PKCS1PADDING", "ELGAMAL/PKCS1");
    put("Alg.Alias.Cipher.ELGAMAL/NONE/PKCS1PADDING", "ELGAMAL/PKCS1");
    put("Alg.Alias.Cipher.ELGAMAL/NONE/NOPADDING", "ELGAMAL");
    put("Cipher.PBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndDES");
    put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
    put("Cipher.PBEWITHMD5ANDRC2", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndRC2");
    put("Cipher.PBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndDES");
    put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
    put("Cipher.PBEWITHSHA1ANDRC2", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndRC2");
    put("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAndDES3Key");
    put("Cipher.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHAAndDES3Key");
    put("Cipher.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndDES3Key");
    put("Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAndDES2Key");
    put("Cipher.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHAAndDES2Key");
    put("Cipher.PBEWITHSHAAND128BITRC2-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd128BitRC2");
    put("Cipher.PBEWITHSHAAND40BITRC2-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd40BitRC2");
    put("Cipher.PBEWITHSHAAND128BITRC4", "org.bouncycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd128BitRC4");
    put("Cipher.PBEWITHSHAAND40BITRC4", "org.bouncycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd40BitRC4");
    put("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
    put("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
    put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "Cipher.PBEWITHSHAAND128BITRC2-CBC");
    put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "Cipher.PBEWITHSHAAND40BITRC2-CBC");
    put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "Cipher.PBEWITHSHAAND128BITRC4");
    put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "Cipher.PBEWITHSHAAND40BITRC4");
    put("Alg.Alias.Cipher." + org.a.a.a.a.l.e(), "PBEWITHSHAAND128BITAES-CBC-BC");
    put("Alg.Alias.Cipher." + org.a.a.a.a.m.e(), "PBEWITHSHAAND192BITAES-CBC-BC");
    put("Alg.Alias.Cipher." + org.a.a.a.a.n.e(), "PBEWITHSHAAND256BITAES-CBC-BC");
    put("Alg.Alias.Cipher." + org.a.a.a.a.o.e(), "PBEWITHSHA256AND128BITAES-CBC-BC");
    put("Alg.Alias.Cipher." + org.a.a.a.a.p.e(), "PBEWITHSHA256AND192BITAES-CBC-BC");
    put("Alg.Alias.Cipher." + org.a.a.a.a.q.e(), "PBEWITHSHA256AND256BITAES-CBC-BC");
    put("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
    put("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
    put("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
    put("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
    put("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
    put("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
    put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
    put("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
    put("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
    put("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
    put("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
    put("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
    put("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
    put("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
    put("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
    put("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
    put("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
    put("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
    put("Cipher.PBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAndTwofish");
    put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
    put("Alg.Alias.Cipher." + c.s_, "PBEWITHMD2ANDDES");
    put("Alg.Alias.Cipher." + c.t, "PBEWITHMD2ANDRC2");
    put("Alg.Alias.Cipher." + c.u, "PBEWITHMD5ANDDES");
    put("Alg.Alias.Cipher." + c.v, "PBEWITHMD5ANDDES");
    put("Alg.Alias.Cipher." + c.w, "PBEWITHSHA1ANDDES");
    put("Alg.Alias.Cipher." + c.x, "PBEWITHSHA1ANDRC2");
    put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
    put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
    put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
    put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
    put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
    put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
    put("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
    put("KeyGenerator.DES", "org.bouncycastle.jce.provider.JCEKeyGenerator$DES");
    put("Alg.Alias.KeyGenerator." + org.a.a.g.a.e, "DES");
    put("KeyGenerator.RC2", "org.bouncycastle.jce.provider.JCEKeyGenerator$RC2");
    put("KeyGenerator.1.2.840.113549.3.2", "org.bouncycastle.jce.provider.JCEKeyGenerator$RC2");
    put("KeyGenerator.GOST28147", "org.bouncycastle.jce.provider.JCEKeyGenerator$GOST28147");
    put("Alg.Alias.KeyGenerator.GOST", "GOST28147");
    put("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
    put("Alg.Alias.KeyGenerator." + org.a.a.c.a.b, "GOST28147");
    put("KeyPairGenerator.RSA", "org.bouncycastle.jce.provider.JDKKeyPairGenerator$RSA");
    put("KeyPairGenerator.DH", "org.bouncycastle.jce.provider.JDKKeyPairGenerator$DH");
    put("KeyPairGenerator.DSA", "org.bouncycastle.jce.provider.JDKKeyPairGenerator$DSA");
    put("KeyPairGenerator.ELGAMAL", "org.bouncycastle.jce.provider.JDKKeyPairGenerator$ElGamal");
    put("Alg.Alias.KeyPairGenerator.1.2.840.113549.1.1.1", "RSA");
    put("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
    put("KeyPairGenerator.GOST3410", "org.bouncycastle.jce.provider.JDKKeyPairGenerator$GOST3410");
    put("Alg.Alias.KeyPairGenerator.GOST-3410", "GOST3410");
    put("Alg.Alias.KeyPairGenerator.GOST-3410-94", "GOST3410");
    put("KeyFactory.RSA", "org.bouncycastle.jce.provider.JDKKeyFactory$RSA");
    put("KeyFactory.DH", "org.bouncycastle.jce.provider.JDKKeyFactory$DH");
    put("KeyFactory.DSA", "org.bouncycastle.jce.provider.JDKKeyFactory$DSA");
    put("KeyFactory.ELGAMAL", "org.bouncycastle.jce.provider.JDKKeyFactory$ElGamal");
    put("KeyFactory.ElGamal", "org.bouncycastle.jce.provider.JDKKeyFactory$ElGamal");
    put("KeyFactory.X.509", "org.bouncycastle.jce.provider.JDKKeyFactory$X509");
    put("Alg.Alias.KeyFactory.1.2.840.113549.1.1.1", "RSA");
    put("Alg.Alias.KeyFactory.1.2.840.10040.4.1", "DSA");
    put("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
    put("KeyFactory.GOST3410", "org.bouncycastle.jce.provider.JDKKeyFactory$GOST3410");
    put("Alg.Alias.KeyFactory.GOST-3410", "GOST3410");
    put("Alg.Alias.KeyFactory.GOST-3410-94", "GOST3410");
    put("Alg.Alias.KeyFactory." + org.a.a.c.a.c, "GOST3410");
    put("AlgorithmParameters.DES", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$IVAlgorithmParameters");
    put("Alg.Alias.AlgorithmParameters." + org.a.a.g.a.e, "DES");
    put("AlgorithmParameters.DESEDE", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$IVAlgorithmParameters");
    put("AlgorithmParameters." + c.B, "org.bouncycastle.jce.provider.JDKAlgorithmParameters$IVAlgorithmParameters");
    put("AlgorithmParameters.RC2", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$RC2AlgorithmParameters");
    put("AlgorithmParameters.1.2.840.113549.3.2", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$RC2AlgorithmParameters");
    put("SecretKeyFactory.DES", "org.bouncycastle.jce.provider.JCESecretKeyFactory$DES");
    put("SecretKeyFactory.PBEWITHMD2ANDDES", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndDES");
    put("Alg.Alias.SecretKeyFactory." + c.s_, "PBEWITHMD2ANDDES");
    put("Alg.Alias.SecretKeyFactory." + c.t, "PBEWITHMD2ANDRC2");
    put("Alg.Alias.SecretKeyFactory." + c.u, "PBEWITHMD5ANDDES");
    put("Alg.Alias.SecretKeyFactory." + c.v, "PBEWITHMD5ANDDES");
    put("Alg.Alias.SecretKeyFactory." + c.w, "PBEWITHSHA1ANDDES");
    put("Alg.Alias.SecretKeyFactory." + c.x, "PBEWITHSHA1ANDRC2");
    put("SecretKeyFactory.PBEWITHMD2ANDRC2", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndRC2");
    put("SecretKeyFactory.PBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndDES");
    put("SecretKeyFactory.PBEWITHMD5ANDRC2", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndRC2");
    put("SecretKeyFactory.PBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndDES");
    put("SecretKeyFactory.PBEWITHSHA1ANDRC2", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndRC2");
    put("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES3Key");
    put("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES2Key");
    put("SecretKeyFactory.PBEWITHSHAAND128BITRC4", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC4");
    put("SecretKeyFactory.PBEWITHSHAAND40BITRC4", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC4");
    put("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC2");
    put("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC2");
    put("SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndTwofish");
    put("SecretKeyFactory.PBEWITHHMACRIPEMD160", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithRIPEMD160");
    put("SecretKeyFactory.PBEWITHHMACSHA1", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA");
    put("SecretKeyFactory.PBEWITHHMACTIGER", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithTiger");
    put("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And128BitAESCBCOpenSSL");
    put("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And192BitAESCBCOpenSSL");
    put("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And256BitAESCBCOpenSSL");
    put("Alg.Alias.SecretKeyFactory.PBE", "PBE/PKCS5");
    put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHMD5ANDDES", "PBE/PKCS5");
    put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHA1ANDDES", "PBE/PKCS5");
    put("Alg.Alias.SecretKeyFactory.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBE/PKCS12");
    put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBE/PKCS12");
    put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PBE/PKCS12");
    put("Alg.Alias.SecretKeyFactory.OLDPBEWITHSHAANDTWOFISH-CBC", "PBE/PKCS12");
    put("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
    put("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDRC2-CBC", "PBEWITHMD2ANDRC2");
    put("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
    put("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
    put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
    put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
    put("Alg.Alias.SecretKeyFactory." + c.s_, "PBEWITHMD2ANDDES");
    put("Alg.Alias.SecretKeyFactory." + c.t, "PBEWITHMD2ANDRC2");
    put("Alg.Alias.SecretKeyFactory." + c.u, "PBEWITHMD5ANDDES");
    put("Alg.Alias.SecretKeyFactory." + c.v, "PBEWITHMD5ANDRC2");
    put("Alg.Alias.SecretKeyFactory." + c.w, "PBEWITHSHA1ANDDES");
    put("Alg.Alias.SecretKeyFactory." + c.x, "PBEWITHSHA1ANDRC2");
    put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
    put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
    put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
    put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
    put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
    put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
    put("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
    put("Alg.Alias.SecretKeyFactory.1.3.14.3.2.26", "PBEWITHHMACSHA1");
    put("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
    put("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitAESBC");
    put("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd192BitAESBC");
    put("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd256BitAESBC");
    put("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And128BitAESBC");
    put("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And192BitAESBC");
    put("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And256BitAESBC");
    put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory." + org.a.a.a.a.l.e(), "PBEWITHSHAAND128BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory." + org.a.a.a.a.m.e(), "PBEWITHSHAAND192BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory." + org.a.a.a.a.n.e(), "PBEWITHSHAAND256BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory." + org.a.a.a.a.o.e(), "PBEWITHSHA256AND128BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory." + org.a.a.a.a.p.e(), "PBEWITHSHA256AND192BITAES-CBC-BC");
    put("Alg.Alias.SecretKeyFactory." + org.a.a.a.a.q.e(), "PBEWITHSHA256AND256BITAES-CBC-BC");
    b();
    c();
    d();
    put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
    put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
    put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
    put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
    put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
    put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
    put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
    put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
    put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
    put("Alg.Alias.CertStore.X509LDAP", "LDAP");
  }
  
  private void a(String paramString1, String paramString2, String paramString3)
  {
    String str = "HMAC" + paramString1;
    put("Mac." + str, paramString2);
    put("Alg.Alias.Mac.HMAC-" + paramString1, str);
    put("Alg.Alias.Mac.HMAC/" + paramString1, str);
    put("KeyGenerator." + str, paramString3);
    put("Alg.Alias.KeyGenerator.HMAC-" + paramString1, str);
    put("Alg.Alias.KeyGenerator.HMAC/" + paramString1, str);
  }
  
  private void a(String paramString1, String paramString2, String paramString3, be parambe)
  {
    String str1 = paramString1 + "WITH" + paramString2;
    String str2 = paramString1 + "with" + paramString2;
    String str3 = paramString1 + "With" + paramString2;
    paramString1 = paramString1 + "/" + paramString2;
    put("Signature." + str1, paramString3);
    put("Alg.Alias.Signature." + str2, str1);
    put("Alg.Alias.Signature." + str3, str1);
    put("Alg.Alias.Signature." + paramString1, str1);
    put("Alg.Alias.Signature." + parambe, str1);
    put("Alg.Alias.Signature.OID." + parambe, str1);
  }
  
  private void a(String paramString, be parambe)
  {
    paramString = "HMAC" + paramString;
    put("Alg.Alias.Mac." + parambe, paramString);
    put("Alg.Alias.KeyGenerator." + parambe, paramString);
  }
  
  private void a(String paramString, String[] paramArrayOfString)
  {
    int i = 0;
    if (i != paramArrayOfString.length) {
      for (Object localObject1 = null;; localObject1 = localObject2)
      {
        try
        {
          localObject2 = getClass().getClassLoader();
          if (localObject2 == null) {
            break label87;
          }
          localObject2 = ((ClassLoader)localObject2).loadClass(paramString + paramArrayOfString[i] + "$Mappings");
          localObject1 = localObject2;
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          Object localObject2;
          label87:
          for (;;) {}
        }
        if (localObject1 != null) {}
        try
        {
          a((Map)((Class)localObject1).newInstance());
          i += 1;
        }
        catch (Exception localException)
        {
          throw new InternalError("cannot create instance of " + paramString + paramArrayOfString[i] + "$Mappings : " + localException);
        }
        localObject2 = Class.forName(paramString + paramArrayOfString[i] + "$Mappings");
      }
    }
  }
  
  private void a(Map paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (containsKey(localObject)) {
        throw new IllegalStateException("duplicate provider key (" + localObject + ") found in " + paramMap.getClass().getName());
      }
      put(localObject, paramMap.get(localObject));
    }
  }
  
  private void b()
  {
    put("Mac.DESMAC", "org.bouncycastle.jce.provider.JCEMac$DES");
    put("Alg.Alias.Mac.DES", "DESMAC");
    put("Mac.DESMAC/CFB8", "org.bouncycastle.jce.provider.JCEMac$DESCFB8");
    put("Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8");
    put("Mac.DESWITHISO9797", "org.bouncycastle.jce.provider.JCEMac$DES9797Alg3");
    put("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
    put("Mac.ISO9797ALG3MAC", "org.bouncycastle.jce.provider.JCEMac$DES9797Alg3");
    put("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
    put("Mac.ISO9797ALG3WITHISO7816-4PADDING", "org.bouncycastle.jce.provider.JCEMac$DES9797Alg3with7816d4");
    put("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
    put("Mac.RC2MAC", "org.bouncycastle.jce.provider.JCEMac$RC2");
    put("Alg.Alias.Mac.RC2", "RC2MAC");
    put("Mac.RC2MAC/CFB8", "org.bouncycastle.jce.provider.JCEMac$RC2CFB8");
    put("Alg.Alias.Mac.RC2/CFB8", "RC2MAC/CFB8");
    put("Mac.GOST28147MAC", "org.bouncycastle.jce.provider.JCEMac$GOST28147");
    put("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
    put("Mac.OLDHMACSHA384", "org.bouncycastle.jce.provider.JCEMac$OldSHA384");
    put("Mac.OLDHMACSHA512", "org.bouncycastle.jce.provider.JCEMac$OldSHA512");
    a("MD2", "org.bouncycastle.jce.provider.JCEMac$MD2", "org.bouncycastle.jce.provider.JCEKeyGenerator$MD2HMAC");
    a("MD4", "org.bouncycastle.jce.provider.JCEMac$MD4", "org.bouncycastle.jce.provider.JCEKeyGenerator$MD4HMAC");
    a("MD5", "org.bouncycastle.jce.provider.JCEMac$MD5", "org.bouncycastle.jce.provider.JCEKeyGenerator$MD5HMAC");
    a("MD5", org.a.a.e.a.b);
    a("SHA1", "org.bouncycastle.jce.provider.JCEMac$SHA1", "org.bouncycastle.jce.provider.JCEKeyGenerator$HMACSHA1");
    a("SHA1", c.H);
    a("SHA1", org.a.a.e.a.c);
    a("SHA224", "org.bouncycastle.jce.provider.JCEMac$SHA224", "org.bouncycastle.jce.provider.JCEKeyGenerator$HMACSHA224");
    a("SHA224", c.I);
    a("SHA256", "org.bouncycastle.jce.provider.JCEMac$SHA256", "org.bouncycastle.jce.provider.JCEKeyGenerator$HMACSHA256");
    a("SHA256", c.J);
    a("SHA384", "org.bouncycastle.jce.provider.JCEMac$SHA384", "org.bouncycastle.jce.provider.JCEKeyGenerator$HMACSHA384");
    a("SHA384", c.K);
    a("SHA512", "org.bouncycastle.jce.provider.JCEMac$SHA512", "org.bouncycastle.jce.provider.JCEKeyGenerator$HMACSHA512");
    a("SHA512", c.L);
    a("RIPEMD128", "org.bouncycastle.jce.provider.JCEMac$RIPEMD128", "org.bouncycastle.jce.provider.JCEKeyGenerator$RIPEMD128HMAC");
    a("RIPEMD160", "org.bouncycastle.jce.provider.JCEMac$RIPEMD160", "org.bouncycastle.jce.provider.JCEKeyGenerator$RIPEMD160HMAC");
    a("RIPEMD160", org.a.a.e.a.e);
    a("TIGER", "org.bouncycastle.jce.provider.JCEMac$Tiger", "org.bouncycastle.jce.provider.JCEKeyGenerator$HMACTIGER");
    a("TIGER", org.a.a.e.a.d);
    put("Mac.PBEWITHHMACSHA", "org.bouncycastle.jce.provider.JCEMac$PBEWithSHA");
    put("Mac.PBEWITHHMACSHA1", "org.bouncycastle.jce.provider.JCEMac$PBEWithSHA");
    put("Mac.PBEWITHHMACRIPEMD160", "org.bouncycastle.jce.provider.JCEMac$PBEWithRIPEMD160");
    put("Alg.Alias.Mac.1.3.14.3.2.26", "PBEWITHHMACSHA");
  }
  
  private void c()
  {
    put("MessageDigest.SHA-1", "org.bouncycastle.jce.provider.JDKMessageDigest$SHA1");
    put("Alg.Alias.MessageDigest.SHA1", "SHA-1");
    put("Alg.Alias.MessageDigest.SHA", "SHA-1");
    put("Alg.Alias.MessageDigest." + org.a.a.g.a.i, "SHA-1");
    put("MessageDigest.SHA-224", "org.bouncycastle.jce.provider.JDKMessageDigest$SHA224");
    put("Alg.Alias.MessageDigest.SHA224", "SHA-224");
    put("Alg.Alias.MessageDigest." + org.a.a.f.a.e, "SHA-224");
    put("MessageDigest.SHA-256", "org.bouncycastle.jce.provider.JDKMessageDigest$SHA256");
    put("Alg.Alias.MessageDigest.SHA256", "SHA-256");
    put("Alg.Alias.MessageDigest." + org.a.a.f.a.b, "SHA-256");
    put("MessageDigest.SHA-384", "org.bouncycastle.jce.provider.JDKMessageDigest$SHA384");
    put("Alg.Alias.MessageDigest.SHA384", "SHA-384");
    put("Alg.Alias.MessageDigest." + org.a.a.f.a.c, "SHA-384");
    put("MessageDigest.SHA-512", "org.bouncycastle.jce.provider.JDKMessageDigest$SHA512");
    put("Alg.Alias.MessageDigest.SHA512", "SHA-512");
    put("Alg.Alias.MessageDigest." + org.a.a.f.a.d, "SHA-512");
    put("MessageDigest.MD2", "org.bouncycastle.jce.provider.JDKMessageDigest$MD2");
    put("Alg.Alias.MessageDigest." + c.E, "MD2");
    put("MessageDigest.MD4", "org.bouncycastle.jce.provider.JDKMessageDigest$MD4");
    put("Alg.Alias.MessageDigest." + c.F, "MD4");
    put("MessageDigest.MD5", "org.bouncycastle.jce.provider.JDKMessageDigest$MD5");
    put("Alg.Alias.MessageDigest." + c.G, "MD5");
    put("MessageDigest.RIPEMD128", "org.bouncycastle.jce.provider.JDKMessageDigest$RIPEMD128");
    put("Alg.Alias.MessageDigest." + org.a.a.i.a.c, "RIPEMD128");
    put("MessageDigest.RIPEMD160", "org.bouncycastle.jce.provider.JDKMessageDigest$RIPEMD160");
    put("Alg.Alias.MessageDigest." + org.a.a.i.a.b, "RIPEMD160");
    put("MessageDigest.RIPEMD256", "org.bouncycastle.jce.provider.JDKMessageDigest$RIPEMD256");
    put("Alg.Alias.MessageDigest." + org.a.a.i.a.d, "RIPEMD256");
    put("MessageDigest.RIPEMD320", "org.bouncycastle.jce.provider.JDKMessageDigest$RIPEMD320");
    put("MessageDigest.Tiger", "org.bouncycastle.jce.provider.JDKMessageDigest$Tiger");
    put("MessageDigest.WHIRLPOOL", "org.bouncycastle.jce.provider.JDKMessageDigest$Whirlpool");
    put("MessageDigest.GOST3411", "org.bouncycastle.jce.provider.JDKMessageDigest$GOST3411");
    put("Alg.Alias.MessageDigest.GOST", "GOST3411");
    put("Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
    put("Alg.Alias.MessageDigest." + org.a.a.c.a.a, "GOST3411");
  }
  
  private void d()
  {
    put("Signature.MD2WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$MD2WithRSAEncryption");
    put("Signature.MD4WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$MD4WithRSAEncryption");
    put("Signature.MD5WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$MD5WithRSAEncryption");
    put("Signature.SHA1WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$SHA1WithRSAEncryption");
    put("Signature.SHA224WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$SHA224WithRSAEncryption");
    put("Signature.SHA256WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$SHA256WithRSAEncryption");
    put("Signature.SHA384WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$SHA384WithRSAEncryption");
    put("Signature.SHA512WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$SHA512WithRSAEncryption");
    put("Signature.RIPEMD160WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$RIPEMD160WithRSAEncryption");
    put("Signature.RIPEMD128WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$RIPEMD128WithRSAEncryption");
    put("Signature.RIPEMD256WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$RIPEMD256WithRSAEncryption");
    put("Signature.DSA", "org.bouncycastle.jce.provider.JDKDSASigner$stdDSA");
    put("Signature.NONEWITHDSA", "org.bouncycastle.jce.provider.JDKDSASigner$noneDSA");
    put("Signature.SHA1withRSA/ISO9796-2", "org.bouncycastle.jce.provider.JDKISOSignature$SHA1WithRSAEncryption");
    put("Signature.MD5withRSA/ISO9796-2", "org.bouncycastle.jce.provider.JDKISOSignature$MD5WithRSAEncryption");
    put("Signature.RIPEMD160withRSA/ISO9796-2", "org.bouncycastle.jce.provider.JDKISOSignature$RIPEMD160WithRSAEncryption");
    put("Signature.RSASSA-PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$PSSwithRSA");
    put("Signature." + c.k, "org.bouncycastle.jce.provider.JDKPSSSigner$PSSwithRSA");
    put("Signature.SHA1withRSA/PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$SHA1withRSA");
    put("Signature.SHA224withRSA/PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$SHA224withRSA");
    put("Signature.SHA256withRSA/PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$SHA256withRSA");
    put("Signature.SHA384withRSA/PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$SHA384withRSA");
    put("Signature.SHA512withRSA/PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$SHA512withRSA");
    put("Signature.RSA", "org.bouncycastle.jce.provider.JDKDigestSignature$noneRSA");
    put("Signature.RAWRSASSA-PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$nonePSS");
    put("Alg.Alias.Signature.RAWDSA", "NONEWITHDSA");
    put("Alg.Alias.Signature.RAWRSA", "RSA");
    put("Alg.Alias.Signature.NONEWITHRSA", "RSA");
    put("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
    put("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
    put("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
    put("Alg.Alias.Signature.RSAPSS", "RSASSA-PSS");
    put("Alg.Alias.Signature.SHA1withRSAandMGF1", "SHA1withRSA/PSS");
    put("Alg.Alias.Signature.SHA224withRSAandMGF1", "SHA224withRSA/PSS");
    put("Alg.Alias.Signature.SHA256withRSAandMGF1", "SHA256withRSA/PSS");
    put("Alg.Alias.Signature.SHA384withRSAandMGF1", "SHA384withRSA/PSS");
    put("Alg.Alias.Signature.SHA512withRSAandMGF1", "SHA512withRSA/PSS");
    put("Alg.Alias.Signature.MD2withRSAEncryption", "MD2WithRSAEncryption");
    put("Alg.Alias.Signature.MD4withRSAEncryption", "MD4WithRSAEncryption");
    put("Alg.Alias.Signature.MD5withRSAEncryption", "MD5WithRSAEncryption");
    put("Alg.Alias.Signature.SHA1withRSAEncryption", "SHA1WithRSAEncryption");
    put("Alg.Alias.Signature.SHA224withRSAEncryption", "SHA224WithRSAEncryption");
    put("Alg.Alias.Signature.SHA256withRSAEncryption", "SHA256WithRSAEncryption");
    put("Alg.Alias.Signature.SHA384withRSAEncryption", "SHA384WithRSAEncryption");
    put("Alg.Alias.Signature.SHA512withRSAEncryption", "SHA512WithRSAEncryption");
    put("Alg.Alias.Signature.SHA256WithRSAEncryption", "SHA256WithRSAEncryption");
    put("Alg.Alias.Signature.SHA384WithRSAEncryption", "SHA384WithRSAEncryption");
    put("Alg.Alias.Signature.SHA512WithRSAEncryption", "SHA512WithRSAEncryption");
    put("Alg.Alias.Signature.SHA256WITHRSAENCRYPTION", "SHA256WithRSAEncryption");
    put("Alg.Alias.Signature.SHA384WITHRSAENCRYPTION", "SHA384WithRSAEncryption");
    put("Alg.Alias.Signature.SHA512WITHRSAENCRYPTION", "SHA512WithRSAEncryption");
    put("Alg.Alias.Signature.RIPEMD160withRSAEncryption", "RIPEMD160WithRSAEncryption");
    put("Alg.Alias.Signature." + c.i_, "MD2WithRSAEncryption");
    put("Alg.Alias.Signature.MD2WithRSA", "MD2WithRSAEncryption");
    put("Alg.Alias.Signature.MD2withRSA", "MD2WithRSAEncryption");
    put("Alg.Alias.Signature.MD2/RSA", "MD2WithRSAEncryption");
    put("Alg.Alias.Signature.MD5WithRSA", "MD5WithRSAEncryption");
    put("Alg.Alias.Signature.MD5withRSA", "MD5WithRSAEncryption");
    put("Alg.Alias.Signature.MD5/RSA", "MD5WithRSAEncryption");
    put("Alg.Alias.Signature." + c.e, "MD5WithRSAEncryption");
    put("Alg.Alias.Signature.MD4WithRSA", "MD4WithRSAEncryption");
    put("Alg.Alias.Signature.MD4withRSA", "MD4WithRSAEncryption");
    put("Alg.Alias.Signature.MD4/RSA", "MD4WithRSAEncryption");
    put("Alg.Alias.Signature." + c.d, "MD4WithRSAEncryption");
    put("Alg.Alias.Signature.SHA1WithRSA", "SHA1WithRSAEncryption");
    put("Alg.Alias.Signature.SHA1withRSA", "SHA1WithRSAEncryption");
    put("Alg.Alias.Signature.SHA224WithRSA", "SHA224WithRSAEncryption");
    put("Alg.Alias.Signature.SHA224withRSA", "SHA224WithRSAEncryption");
    put("Alg.Alias.Signature.SHA256WithRSA", "SHA256WithRSAEncryption");
    put("Alg.Alias.Signature.SHA256withRSA", "SHA256WithRSAEncryption");
    put("Alg.Alias.Signature.SHA384WithRSA", "SHA384WithRSAEncryption");
    put("Alg.Alias.Signature.SHA384withRSA", "SHA384WithRSAEncryption");
    put("Alg.Alias.Signature.SHA512WithRSA", "SHA512WithRSAEncryption");
    put("Alg.Alias.Signature.SHA512withRSA", "SHA512WithRSAEncryption");
    put("Alg.Alias.Signature.SHA1/RSA", "SHA1WithRSAEncryption");
    put("Alg.Alias.Signature.SHA-1/RSA", "SHA1WithRSAEncryption");
    put("Alg.Alias.Signature." + c.j_, "SHA1WithRSAEncryption");
    put("Alg.Alias.Signature." + c.p_, "SHA224WithRSAEncryption");
    put("Alg.Alias.Signature." + c.m_, "SHA256WithRSAEncryption");
    put("Alg.Alias.Signature." + c.n_, "SHA384WithRSAEncryption");
    put("Alg.Alias.Signature." + c.o_, "SHA512WithRSAEncryption");
    put("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.113549.1.1.1", "SHA1WithRSAEncryption");
    put("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.113549.1.1.5", "SHA1WithRSAEncryption");
    put("Alg.Alias.Signature.1.2.840.113549.2.5with1.2.840.113549.1.1.1", "MD5WithRSAEncryption");
    put("Alg.Alias.Signature.RIPEMD160WithRSA", "RIPEMD160WithRSAEncryption");
    put("Alg.Alias.Signature.RIPEMD160withRSA", "RIPEMD160WithRSAEncryption");
    put("Alg.Alias.Signature.RIPEMD128WithRSA", "RIPEMD128WithRSAEncryption");
    put("Alg.Alias.Signature.RIPEMD128withRSA", "RIPEMD128WithRSAEncryption");
    put("Alg.Alias.Signature.RIPEMD256WithRSA", "RIPEMD256WithRSAEncryption");
    put("Alg.Alias.Signature.RIPEMD256withRSA", "RIPEMD256WithRSAEncryption");
    put("Alg.Alias.Signature.RIPEMD-160/RSA", "RIPEMD160WithRSAEncryption");
    put("Alg.Alias.Signature.RMD160withRSA", "RIPEMD160WithRSAEncryption");
    put("Alg.Alias.Signature.RMD160/RSA", "RIPEMD160WithRSAEncryption");
    put("Alg.Alias.Signature.1.3.36.3.3.1.2", "RIPEMD160WithRSAEncryption");
    put("Alg.Alias.Signature.1.3.36.3.3.1.3", "RIPEMD128WithRSAEncryption");
    put("Alg.Alias.Signature.1.3.36.3.3.1.4", "RIPEMD256WithRSAEncryption");
    put("Alg.Alias.Signature." + org.a.a.g.a.k, "SHA1WithRSAEncryption");
    put("Alg.Alias.Signature.MD2WITHRSAENCRYPTION", "MD2WithRSAEncryption");
    put("Alg.Alias.Signature.MD5WITHRSAENCRYPTION", "MD5WithRSAEncryption");
    put("Alg.Alias.Signature.SHA1WITHRSAENCRYPTION", "SHA1WithRSAEncryption");
    put("Alg.Alias.Signature.RIPEMD160WITHRSAENCRYPTION", "RIPEMD160WithRSAEncryption");
    put("Alg.Alias.Signature.MD5WITHRSA", "MD5WithRSAEncryption");
    put("Alg.Alias.Signature.SHA1WITHRSA", "SHA1WithRSAEncryption");
    put("Alg.Alias.Signature.RIPEMD160WITHRSA", "RIPEMD160WithRSAEncryption");
    put("Alg.Alias.Signature.RMD160WITHRSA", "RIPEMD160WithRSAEncryption");
    put("Alg.Alias.Signature.RIPEMD160WITHRSA", "RIPEMD160WithRSAEncryption");
    a("SHA224", "DSA", "org.bouncycastle.jce.provider.JDKDSASigner$dsa224", org.a.a.f.a.C);
    a("SHA256", "DSA", "org.bouncycastle.jce.provider.JDKDSASigner$dsa256", org.a.a.f.a.D);
    a("SHA384", "DSA", "org.bouncycastle.jce.provider.JDKDSASigner$dsa384", org.a.a.f.a.E);
    a("SHA512", "DSA", "org.bouncycastle.jce.provider.JDKDSASigner$dsa512", org.a.a.f.a.F);
    put("Alg.Alias.Signature.SHA/DSA", "DSA");
    put("Alg.Alias.Signature.SHA1withDSA", "DSA");
    put("Alg.Alias.Signature.SHA1WITHDSA", "DSA");
    put("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.1", "DSA");
    put("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.3", "DSA");
    put("Alg.Alias.Signature.DSAwithSHA1", "DSA");
    put("Alg.Alias.Signature.DSAWITHSHA1", "DSA");
    put("Alg.Alias.Signature.SHA1WithDSA", "DSA");
    put("Alg.Alias.Signature.DSAWithSHA1", "DSA");
    put("Alg.Alias.Signature.1.2.840.10040.4.3", "DSA");
    put("Alg.Alias.Signature.MD5WithRSA/ISO9796-2", "MD5withRSA/ISO9796-2");
    put("Alg.Alias.Signature.SHA1WithRSA/ISO9796-2", "SHA1withRSA/ISO9796-2");
    put("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
    put("Signature.ECGOST3410", "org.bouncycastle.jce.provider.JDKGOST3410Signer$ecgost3410");
    put("Alg.Alias.Signature.ECGOST-3410", "ECGOST3410");
    put("Alg.Alias.Signature.GOST-3410-2001", "ECGOST3410");
    put("Alg.Alias.Signature.GOST3411withECGOST3410", "ECGOST3410");
    put("Alg.Alias.Signature.GOST3411WITHECGOST3410", "ECGOST3410");
    put("Alg.Alias.Signature.GOST3411WithECGOST3410", "ECGOST3410");
    put("Alg.Alias.Signature." + org.a.a.c.a.f, "ECGOST3410");
    put("Signature.GOST3410", "org.bouncycastle.jce.provider.JDKGOST3410Signer$gost3410");
    put("Alg.Alias.Signature.GOST-3410", "GOST3410");
    put("Alg.Alias.Signature.GOST-3410-94", "GOST3410");
    put("Alg.Alias.Signature.GOST3411withGOST3410", "GOST3410");
    put("Alg.Alias.Signature.GOST3411WITHGOST3410", "GOST3410");
    put("Alg.Alias.Signature.GOST3411WithGOST3410", "GOST3410");
    put("Alg.Alias.Signature." + org.a.a.c.a.e, "GOST3410");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\c\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */