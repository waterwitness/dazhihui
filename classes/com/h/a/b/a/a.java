package com.h.a.b.a;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

class a
  implements XmlSerializer
{
  private static final String[] a;
  private final char[] b = new char[' '];
  private int c;
  private Writer d;
  private OutputStream e;
  private CharsetEncoder f;
  private ByteBuffer g = ByteBuffer.allocate(8192);
  private boolean h;
  
  static
  {
    String[] arrayOfString = new String[64];
    arrayOfString[34] = "&quot;";
    arrayOfString[38] = "&amp;";
    arrayOfString[60] = "&lt;";
    arrayOfString[62] = "&gt;";
    a = arrayOfString;
  }
  
  private void a()
  {
    int i = this.g.position();
    if (i > 0)
    {
      this.g.flip();
      this.e.write(this.g.array(), 0, i);
      this.g.clear();
    }
  }
  
  private void a(char paramChar)
  {
    int j = this.c;
    int i = j;
    if (j >= 8191)
    {
      flush();
      i = this.c;
    }
    this.b[i] = paramChar;
    this.c = (i + 1);
  }
  
  private void a(String paramString)
  {
    a(paramString, 0, paramString.length());
  }
  
  private void a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt2 > 8192)
    {
      j = paramInt1 + paramInt2;
      if (paramInt1 >= j) {
        return;
      }
      i = paramInt1 + 8192;
      if (i < j) {}
      for (paramInt2 = 8192;; paramInt2 = j - paramInt1)
      {
        a(paramString, paramInt1, paramInt2);
        paramInt1 = i;
        break;
      }
    }
    int j = this.c;
    int i = j;
    if (j + paramInt2 > 8192)
    {
      flush();
      i = this.c;
    }
    paramString.getChars(paramInt1, paramInt1 + paramInt2, this.b, i);
    this.c = (i + paramInt2);
  }
  
  private void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramInt2 > 8192)
    {
      j = paramInt1 + paramInt2;
      if (paramInt1 >= j) {
        return;
      }
      i = paramInt1 + 8192;
      if (i < j) {}
      for (paramInt2 = 8192;; paramInt2 = j - paramInt1)
      {
        a(paramArrayOfChar, paramInt1, paramInt2);
        paramInt1 = i;
        break;
      }
    }
    int j = this.c;
    int i = j;
    if (j + paramInt2 > 8192)
    {
      flush();
      i = this.c;
    }
    System.arraycopy(paramArrayOfChar, paramInt1, this.b, i, paramInt2);
    this.c = (i + paramInt2);
  }
  
  private void b(String paramString)
  {
    int j = 0;
    int m = paramString.length();
    int n = (char)a.length;
    String[] arrayOfString = a;
    int i = 0;
    if (i >= m)
    {
      if (j < i) {
        a(paramString, j, i - j);
      }
      return;
    }
    int k = paramString.charAt(i);
    if (k >= n) {
      k = j;
    }
    for (;;)
    {
      i += 1;
      j = k;
      break;
      String str = arrayOfString[k];
      k = j;
      if (str != null)
      {
        if (j < i) {
          a(paramString, j, i - j);
        }
        k = i + 1;
        a(str);
      }
    }
  }
  
  private void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int m = (char)a.length;
    String[] arrayOfString = a;
    int j = paramInt1;
    int i = paramInt1;
    int k = i;
    if (k >= paramInt1 + paramInt2)
    {
      if (j < k) {
        a(paramArrayOfChar, j, k - j);
      }
      return;
    }
    i = paramArrayOfChar[k];
    if (i >= m) {
      i = j;
    }
    for (;;)
    {
      k += 1;
      j = i;
      i = k;
      break;
      String str = arrayOfString[i];
      i = j;
      if (str != null)
      {
        if (j < k) {
          a(paramArrayOfChar, j, k - j);
        }
        i = k + 1;
        a(str);
      }
    }
  }
  
  public XmlSerializer attribute(String paramString1, String paramString2, String paramString3)
  {
    a(' ');
    if (paramString1 != null)
    {
      a(paramString1);
      a(':');
    }
    a(paramString2);
    a("=\"");
    b(paramString3);
    a('"');
    return this;
  }
  
  public void cdsect(String paramString)
  {
    throw new UnsupportedOperationException();
  }
  
  public void comment(String paramString)
  {
    throw new UnsupportedOperationException();
  }
  
  public void docdecl(String paramString)
  {
    throw new UnsupportedOperationException();
  }
  
  public void endDocument()
  {
    flush();
  }
  
  public XmlSerializer endTag(String paramString1, String paramString2)
  {
    if (this.h) {
      a(" />\n");
    }
    for (;;)
    {
      this.h = false;
      return this;
      a("</");
      if (paramString1 != null)
      {
        a(paramString1);
        a(':');
      }
      a(paramString2);
      a(">\n");
    }
  }
  
  public void entityRef(String paramString)
  {
    throw new UnsupportedOperationException();
  }
  
  public void flush()
  {
    if (this.c > 0)
    {
      if (this.e == null) {
        break label105;
      }
      CharBuffer localCharBuffer = CharBuffer.wrap(this.b, 0, this.c);
      for (CoderResult localCoderResult = this.f.encode(localCharBuffer, this.g, true);; localCoderResult = this.f.encode(localCharBuffer, this.g, true))
      {
        if (localCoderResult.isError()) {
          throw new IOException(localCoderResult.toString());
        }
        if (!localCoderResult.isOverflow()) {
          break;
        }
        a();
      }
      a();
      this.e.flush();
    }
    for (;;)
    {
      this.c = 0;
      return;
      label105:
      this.d.write(this.b, 0, this.c);
      this.d.flush();
    }
  }
  
  public int getDepth()
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean getFeature(String paramString)
  {
    throw new UnsupportedOperationException();
  }
  
  public String getName()
  {
    throw new UnsupportedOperationException();
  }
  
  public String getNamespace()
  {
    throw new UnsupportedOperationException();
  }
  
  public String getPrefix(String paramString, boolean paramBoolean)
  {
    throw new UnsupportedOperationException();
  }
  
  public Object getProperty(String paramString)
  {
    throw new UnsupportedOperationException();
  }
  
  public void ignorableWhitespace(String paramString)
  {
    throw new UnsupportedOperationException();
  }
  
  public void processingInstruction(String paramString)
  {
    throw new UnsupportedOperationException();
  }
  
  public void setFeature(String paramString, boolean paramBoolean)
  {
    if (paramString.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public void setOutput(OutputStream paramOutputStream, String paramString)
  {
    if (paramOutputStream == null) {
      throw new IllegalArgumentException();
    }
    try
    {
      this.f = Charset.forName(paramString).newEncoder();
      this.e = paramOutputStream;
      return;
    }
    catch (IllegalCharsetNameException paramOutputStream)
    {
      throw ((UnsupportedEncodingException)new UnsupportedEncodingException(paramString).initCause(paramOutputStream));
    }
    catch (UnsupportedCharsetException paramOutputStream)
    {
      throw ((UnsupportedEncodingException)new UnsupportedEncodingException(paramString).initCause(paramOutputStream));
    }
  }
  
  public void setOutput(Writer paramWriter)
  {
    this.d = paramWriter;
  }
  
  public void setPrefix(String paramString1, String paramString2)
  {
    throw new UnsupportedOperationException();
  }
  
  public void setProperty(String paramString, Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public void startDocument(String paramString, Boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
    if (paramBoolean.booleanValue()) {}
    for (paramString = "yes";; paramString = "no")
    {
      a(paramString + "' ?>\n");
      return;
    }
  }
  
  public XmlSerializer startTag(String paramString1, String paramString2)
  {
    if (this.h) {
      a(">\n");
    }
    a('<');
    if (paramString1 != null)
    {
      a(paramString1);
      a(':');
    }
    a(paramString2);
    this.h = true;
    return this;
  }
  
  public XmlSerializer text(String paramString)
  {
    if (this.h)
    {
      a(">");
      this.h = false;
    }
    b(paramString);
    return this;
  }
  
  public XmlSerializer text(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.h)
    {
      a(">");
      this.h = false;
    }
    b(paramArrayOfChar, paramInt1, paramInt2);
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\h\a\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */