package com.c.a.b.a;

import com.c.a.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;

public final class y
{
  public static final com.c.a.al<StringBuffer> A = new ah();
  public static final com.c.a.am B = a(StringBuffer.class, A);
  public static final com.c.a.al<URL> C = new ai();
  public static final com.c.a.am D = a(URL.class, C);
  public static final com.c.a.al<URI> E = new aj();
  public static final com.c.a.am F = a(URI.class, E);
  public static final com.c.a.al<InetAddress> G = new al();
  public static final com.c.a.am H = b(InetAddress.class, G);
  public static final com.c.a.al<UUID> I = new am();
  public static final com.c.a.am J = a(UUID.class, I);
  public static final com.c.a.am K = new an();
  public static final com.c.a.al<Calendar> L = new ap();
  public static final com.c.a.am M = b(Calendar.class, GregorianCalendar.class, L);
  public static final com.c.a.al<Locale> N = new aq();
  public static final com.c.a.am O = a(Locale.class, N);
  public static final com.c.a.al<w> P = new ar();
  public static final com.c.a.am Q = b(w.class, P);
  public static final com.c.a.am R = a();
  public static final com.c.a.al<Class> a = new z();
  public static final com.c.a.am b = a(Class.class, a);
  public static final com.c.a.al<BitSet> c = new ak();
  public static final com.c.a.am d = a(BitSet.class, c);
  public static final com.c.a.al<Boolean> e = new av();
  public static final com.c.a.al<Boolean> f = new az();
  public static final com.c.a.am g = a(Boolean.TYPE, Boolean.class, e);
  public static final com.c.a.al<Number> h = new ba();
  public static final com.c.a.am i = a(Byte.TYPE, Byte.class, h);
  public static final com.c.a.al<Number> j = new bb();
  public static final com.c.a.am k = a(Short.TYPE, Short.class, j);
  public static final com.c.a.al<Number> l = new bc();
  public static final com.c.a.am m = a(Integer.TYPE, Integer.class, l);
  public static final com.c.a.al<Number> n = new bd();
  public static final com.c.a.al<Number> o = new be();
  public static final com.c.a.al<Number> p = new aa();
  public static final com.c.a.al<Number> q = new ab();
  public static final com.c.a.am r = a(Number.class, q);
  public static final com.c.a.al<Character> s = new ac();
  public static final com.c.a.am t = a(Character.TYPE, Character.class, s);
  public static final com.c.a.al<String> u = new ad();
  public static final com.c.a.al<BigDecimal> v = new ae();
  public static final com.c.a.al<BigInteger> w = new af();
  public static final com.c.a.am x = a(String.class, u);
  public static final com.c.a.al<StringBuilder> y = new ag();
  public static final com.c.a.am z = a(StringBuilder.class, y);
  
  public static com.c.a.am a()
  {
    return new as();
  }
  
  public static <TT> com.c.a.am a(Class<TT> paramClass, com.c.a.al<TT> paramal)
  {
    return new at(paramClass, paramal);
  }
  
  public static <TT> com.c.a.am a(Class<TT> paramClass1, Class<TT> paramClass2, com.c.a.al<? super TT> paramal)
  {
    return new au(paramClass1, paramClass2, paramal);
  }
  
  public static <TT> com.c.a.am b(Class<TT> paramClass, com.c.a.al<TT> paramal)
  {
    return new ax(paramClass, paramal);
  }
  
  public static <TT> com.c.a.am b(Class<TT> paramClass, Class<? extends TT> paramClass1, com.c.a.al<? super TT> paramal)
  {
    return new aw(paramClass, paramClass1, paramal);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */