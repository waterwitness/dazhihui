package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.InputStream;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public final class RawHeaders
{
  private static final Comparator<String> FIELD_NAME_COMPARATOR = new RawHeaders.1();
  private int httpMinorVersion = 1;
  private final List<String> namesAndValues = new ArrayList(20);
  private String requestLine;
  private int responseCode = -1;
  private String responseMessage;
  private String statusLine;
  
  public RawHeaders() {}
  
  public RawHeaders(RawHeaders paramRawHeaders)
  {
    this.namesAndValues.addAll(paramRawHeaders.namesAndValues);
    this.requestLine = paramRawHeaders.requestLine;
    this.statusLine = paramRawHeaders.statusLine;
    this.httpMinorVersion = paramRawHeaders.httpMinorVersion;
    this.responseCode = paramRawHeaders.responseCode;
    this.responseMessage = paramRawHeaders.responseMessage;
  }
  
  private void addLenient(String paramString1, String paramString2)
  {
    this.namesAndValues.add(paramString1);
    this.namesAndValues.add(paramString2.trim());
  }
  
  public static RawHeaders fromBytes(InputStream paramInputStream)
  {
    RawHeaders localRawHeaders;
    do
    {
      localRawHeaders = new RawHeaders();
      localRawHeaders.setStatusLine(Util.readAsciiLine(paramInputStream));
      readHeaders(paramInputStream, localRawHeaders);
    } while (localRawHeaders.getResponseCode() == 100);
    return localRawHeaders;
  }
  
  public static RawHeaders fromMultimap(Map<String, List<String>> paramMap, boolean paramBoolean)
  {
    if (!paramBoolean) {
      throw new UnsupportedOperationException();
    }
    RawHeaders localRawHeaders = new RawHeaders();
    paramMap = paramMap.entrySet().iterator();
    for (;;)
    {
      if (!paramMap.hasNext()) {
        return localRawHeaders;
      }
      Object localObject = (Map.Entry)paramMap.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (List)((Map.Entry)localObject).getValue();
      if (str != null)
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          localRawHeaders.addLenient(str, (String)((Iterator)localObject).next());
        }
      }
      else if (!((List)localObject).isEmpty())
      {
        localRawHeaders.setStatusLine((String)((List)localObject).get(((List)localObject).size() - 1));
      }
    }
  }
  
  public static RawHeaders fromNameValueBlock(List<String> paramList)
  {
    Object localObject2 = null;
    if (paramList.size() % 2 != 0) {
      throw new IllegalArgumentException("Unexpected name value block: " + paramList);
    }
    RawHeaders localRawHeaders = new RawHeaders();
    int i = 0;
    Object localObject1 = null;
    String str2;
    String str3;
    int j;
    for (;;)
    {
      if (i >= paramList.size())
      {
        if (localObject1 != null) {
          break label227;
        }
        throw new ProtocolException("Expected ':status' header not present");
      }
      str2 = (String)paramList.get(i);
      str3 = (String)paramList.get(i + 1);
      j = 0;
      if (j < str3.length()) {
        break;
      }
      i += 2;
    }
    int m = str3.indexOf(0, j);
    int k = m;
    if (m == -1) {
      k = str3.length();
    }
    String str1 = str3.substring(j, k);
    if (":status".equals(str2)) {
      localObject1 = str1;
    }
    for (;;)
    {
      j = k + 1;
      break;
      if (":version".equals(str2))
      {
        localObject2 = str1;
      }
      else
      {
        localRawHeaders.namesAndValues.add(str2);
        localRawHeaders.namesAndValues.add(str1);
      }
    }
    label227:
    if (localObject2 == null) {
      throw new ProtocolException("Expected ':version' header not present");
    }
    localRawHeaders.setStatusLine(localObject2 + " " + (String)localObject1);
    return localRawHeaders;
  }
  
  public static void readHeaders(InputStream paramInputStream, RawHeaders paramRawHeaders)
  {
    for (;;)
    {
      String str = Util.readAsciiLine(paramInputStream);
      if (str.length() == 0) {
        return;
      }
      paramRawHeaders.addLine(str);
    }
  }
  
  public void add(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      throw new IllegalArgumentException("fieldname == null");
    }
    if (paramString2 == null) {
      throw new IllegalArgumentException("value == null");
    }
    if ((paramString1.length() == 0) || (paramString1.indexOf(0) != -1) || (paramString2.indexOf(0) != -1)) {
      throw new IllegalArgumentException("Unexpected header: " + paramString1 + ": " + paramString2);
    }
    addLenient(paramString1, paramString2);
  }
  
  public void addAll(String paramString, List<String> paramList)
  {
    paramList = paramList.iterator();
    for (;;)
    {
      if (!paramList.hasNext()) {
        return;
      }
      add(paramString, (String)paramList.next());
    }
  }
  
  public void addLine(String paramString)
  {
    int i = paramString.indexOf(":", 1);
    if (i != -1)
    {
      addLenient(paramString.substring(0, i), paramString.substring(i + 1));
      return;
    }
    if (paramString.startsWith(":"))
    {
      addLenient("", paramString.substring(1));
      return;
    }
    addLenient("", paramString);
  }
  
  public void addSpdyRequestHeaders(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    add(":method", paramString1);
    add(":scheme", paramString5);
    add(":path", paramString2);
    add(":version", paramString3);
    add(":host", paramString4);
  }
  
  public String get(String paramString)
  {
    int i = this.namesAndValues.size() - 2;
    for (;;)
    {
      if (i < 0) {
        return null;
      }
      if (paramString.equalsIgnoreCase((String)this.namesAndValues.get(i))) {
        return (String)this.namesAndValues.get(i + 1);
      }
      i -= 2;
    }
  }
  
  public RawHeaders getAll(Set<String> paramSet)
  {
    RawHeaders localRawHeaders = new RawHeaders();
    int i = 0;
    for (;;)
    {
      if (i >= this.namesAndValues.size()) {
        return localRawHeaders;
      }
      String str = (String)this.namesAndValues.get(i);
      if (paramSet.contains(str)) {
        localRawHeaders.add(str, (String)this.namesAndValues.get(i + 1));
      }
      i += 2;
    }
  }
  
  public String getFieldName(int paramInt)
  {
    paramInt *= 2;
    if ((paramInt < 0) || (paramInt >= this.namesAndValues.size())) {
      return null;
    }
    return (String)this.namesAndValues.get(paramInt);
  }
  
  public int getHttpMinorVersion()
  {
    if (this.httpMinorVersion != -1) {
      return this.httpMinorVersion;
    }
    return 1;
  }
  
  public int getResponseCode()
  {
    return this.responseCode;
  }
  
  public String getResponseMessage()
  {
    return this.responseMessage;
  }
  
  public String getStatusLine()
  {
    return this.statusLine;
  }
  
  public String getValue(int paramInt)
  {
    paramInt = paramInt * 2 + 1;
    if ((paramInt < 0) || (paramInt >= this.namesAndValues.size())) {
      return null;
    }
    return (String)this.namesAndValues.get(paramInt);
  }
  
  public int length()
  {
    return this.namesAndValues.size() / 2;
  }
  
  public Set<String> names()
  {
    TreeSet localTreeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
    int i = 0;
    for (;;)
    {
      if (i >= length()) {
        return Collections.unmodifiableSet(localTreeSet);
      }
      localTreeSet.add(getFieldName(i));
      i += 1;
    }
  }
  
  public void removeAll(String paramString)
  {
    int i = 0;
    for (;;)
    {
      if (i >= this.namesAndValues.size()) {
        return;
      }
      if (paramString.equalsIgnoreCase((String)this.namesAndValues.get(i)))
      {
        this.namesAndValues.remove(i);
        this.namesAndValues.remove(i);
      }
      i += 2;
    }
  }
  
  public void set(String paramString1, String paramString2)
  {
    removeAll(paramString1);
    add(paramString1, paramString2);
  }
  
  public void setRequestLine(String paramString)
  {
    this.requestLine = paramString.trim();
  }
  
  public void setStatusLine(String paramString)
  {
    if (this.responseMessage != null) {
      throw new IllegalStateException("statusLine is already set");
    }
    if (paramString.length() > 13) {}
    for (int i = 1; (!paramString.startsWith("HTTP/1.")) || (paramString.length() < 12) || (paramString.charAt(8) != ' ') || ((i != 0) && (paramString.charAt(12) != ' ')); i = 0) {
      throw new ProtocolException("Unexpected status line: " + paramString);
    }
    int j = paramString.charAt(7) - '0';
    if ((j < 0) || (j > 9)) {
      throw new ProtocolException("Unexpected status line: " + paramString);
    }
    for (;;)
    {
      try
      {
        int k = Integer.parseInt(paramString.substring(9, 12));
        if (i != 0)
        {
          String str1 = paramString.substring(13);
          this.responseMessage = str1;
          this.responseCode = k;
          this.statusLine = paramString;
          this.httpMinorVersion = j;
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new ProtocolException("Unexpected status line: " + paramString);
      }
      String str2 = "";
    }
  }
  
  public byte[] toBytes()
  {
    StringBuilder localStringBuilder = new StringBuilder(256);
    localStringBuilder.append(this.requestLine).append("\r\n");
    int i = 0;
    for (;;)
    {
      if (i >= this.namesAndValues.size())
      {
        localStringBuilder.append("\r\n");
        return localStringBuilder.toString().getBytes("ISO-8859-1");
      }
      localStringBuilder.append((String)this.namesAndValues.get(i)).append(": ").append((String)this.namesAndValues.get(i + 1)).append("\r\n");
      i += 2;
    }
  }
  
  public Map<String, List<String>> toMultimap(boolean paramBoolean)
  {
    TreeMap localTreeMap = new TreeMap(FIELD_NAME_COMPARATOR);
    int i = 0;
    if (i >= this.namesAndValues.size())
    {
      if ((!paramBoolean) || (this.statusLine == null)) {
        break label163;
      }
      localTreeMap.put(null, Collections.unmodifiableList(Collections.singletonList(this.statusLine)));
    }
    for (;;)
    {
      return Collections.unmodifiableMap(localTreeMap);
      String str1 = (String)this.namesAndValues.get(i);
      String str2 = (String)this.namesAndValues.get(i + 1);
      ArrayList localArrayList = new ArrayList();
      List localList = (List)localTreeMap.get(str1);
      if (localList != null) {
        localArrayList.addAll(localList);
      }
      localArrayList.add(str2);
      localTreeMap.put(str1, Collections.unmodifiableList(localArrayList));
      i += 2;
      break;
      label163:
      if (this.requestLine != null) {
        localTreeMap.put(null, Collections.unmodifiableList(Collections.singletonList(this.requestLine)));
      }
    }
  }
  
  public List<String> toNameValueBlock()
  {
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i >= this.namesAndValues.size()) {
      return localArrayList;
    }
    String str1 = ((String)this.namesAndValues.get(i)).toLowerCase(Locale.US);
    String str2 = (String)this.namesAndValues.get(i + 1);
    if ((str1.equals("connection")) || (str1.equals("host")) || (str1.equals("keep-alive")) || (str1.equals("proxy-connection")) || (str1.equals("transfer-encoding"))) {}
    label250:
    for (;;)
    {
      i += 2;
      break;
      if (localHashSet.add(str1))
      {
        localArrayList.add(str1);
        localArrayList.add(str2);
      }
      else
      {
        int j = 0;
        for (;;)
        {
          if (j >= localArrayList.size()) {
            break label250;
          }
          if (str1.equals(localArrayList.get(j)))
          {
            localArrayList.set(j + 1, (String)localArrayList.get(j + 1) + "\000" + str2);
            break;
          }
          j += 2;
        }
      }
    }
  }
  
  public List<String> values(String paramString)
  {
    Object localObject1 = null;
    int i = 0;
    for (;;)
    {
      if (i >= length())
      {
        if (localObject1 == null) {
          break;
        }
        return Collections.unmodifiableList((List)localObject1);
      }
      Object localObject2 = localObject1;
      if (paramString.equalsIgnoreCase(getFieldName(i)))
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new ArrayList(2);
        }
        ((List)localObject2).add(getValue(i));
      }
      i += 1;
      localObject1 = localObject2;
    }
    return Collections.emptyList();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\RawHeaders.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */