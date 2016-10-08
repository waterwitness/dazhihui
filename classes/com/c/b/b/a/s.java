package com.c.b.b.a;

import com.c.b.a.a;
import com.c.b.f;

public final class s
{
  private static final int[] a = { 31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017 };
  private static final s[] b = f();
  private final int c;
  private final int[] d;
  private final u[] e;
  private final int f;
  
  private s(int paramInt, int[] paramArrayOfInt, u... paramVarArgs)
  {
    this.c = paramInt;
    this.d = paramArrayOfInt;
    this.e = paramVarArgs;
    int k = paramVarArgs[0].a();
    paramArrayOfInt = paramVarArgs[0].b();
    int m = paramArrayOfInt.length;
    int i = 0;
    paramInt = j;
    while (paramInt < m)
    {
      paramVarArgs = paramArrayOfInt[paramInt];
      j = paramVarArgs.a();
      i += (paramVarArgs.b() + k) * j;
      paramInt += 1;
    }
    this.f = i;
  }
  
  public static s a(int paramInt)
  {
    if (paramInt % 4 != 1) {
      throw f.a();
    }
    try
    {
      s locals = b((paramInt - 17) / 4);
      return locals;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw f.a();
    }
  }
  
  public static s b(int paramInt)
  {
    if ((paramInt < 1) || (paramInt > 40)) {
      throw new IllegalArgumentException();
    }
    return b[(paramInt - 1)];
  }
  
  static s c(int paramInt)
  {
    int i = 0;
    int j = Integer.MAX_VALUE;
    int m = 0;
    while (i < a.length)
    {
      int k = a[i];
      if (k == paramInt) {
        return b(i + 7);
      }
      int n = p.a(paramInt, k);
      k = j;
      if (n < j)
      {
        m = i + 7;
        k = n;
      }
      i += 1;
      j = k;
    }
    if (j <= 3) {
      return b(m);
    }
    return null;
  }
  
  private static s[] f()
  {
    Object localObject1 = new u(7, new t[] { new t(1, 19) });
    Object localObject2 = new u(10, new t[] { new t(1, 16) });
    Object localObject3 = new u(13, new t[] { new t(1, 13) });
    Object localObject4 = new u(17, new t[] { new t(1, 9) });
    localObject1 = new s(1, new int[0], new u[] { localObject1, localObject2, localObject3, localObject4 });
    localObject2 = new u(10, new t[] { new t(1, 34) });
    localObject3 = new u(16, new t[] { new t(1, 28) });
    localObject4 = new u(22, new t[] { new t(1, 22) });
    Object localObject5 = new u(28, new t[] { new t(1, 16) });
    localObject2 = new s(2, new int[] { 6, 18 }, new u[] { localObject2, localObject3, localObject4, localObject5 });
    localObject3 = new u(15, new t[] { new t(1, 55) });
    localObject4 = new u(26, new t[] { new t(1, 44) });
    localObject5 = new u(18, new t[] { new t(2, 17) });
    Object localObject6 = new u(22, new t[] { new t(2, 13) });
    localObject3 = new s(3, new int[] { 6, 22 }, new u[] { localObject3, localObject4, localObject5, localObject6 });
    localObject4 = new u(20, new t[] { new t(1, 80) });
    localObject5 = new u(18, new t[] { new t(2, 32) });
    localObject6 = new u(26, new t[] { new t(2, 24) });
    Object localObject7 = new u(16, new t[] { new t(4, 9) });
    localObject4 = new s(4, new int[] { 6, 26 }, new u[] { localObject4, localObject5, localObject6, localObject7 });
    localObject5 = new u(26, new t[] { new t(1, 108) });
    localObject6 = new u(24, new t[] { new t(2, 43) });
    localObject7 = new u(18, new t[] { new t(2, 15), new t(2, 16) });
    Object localObject8 = new u(22, new t[] { new t(2, 11), new t(2, 12) });
    localObject5 = new s(5, new int[] { 6, 30 }, new u[] { localObject5, localObject6, localObject7, localObject8 });
    localObject6 = new u(18, new t[] { new t(2, 68) });
    localObject7 = new u(16, new t[] { new t(4, 27) });
    localObject8 = new u(24, new t[] { new t(4, 19) });
    Object localObject9 = new u(28, new t[] { new t(4, 15) });
    localObject6 = new s(6, new int[] { 6, 34 }, new u[] { localObject6, localObject7, localObject8, localObject9 });
    localObject7 = new u(20, new t[] { new t(2, 78) });
    localObject8 = new u(18, new t[] { new t(4, 31) });
    localObject9 = new u(18, new t[] { new t(2, 14), new t(4, 15) });
    Object localObject10 = new u(26, new t[] { new t(4, 13), new t(1, 14) });
    localObject7 = new s(7, new int[] { 6, 22, 38 }, new u[] { localObject7, localObject8, localObject9, localObject10 });
    localObject8 = new u(24, new t[] { new t(2, 97) });
    localObject9 = new u(22, new t[] { new t(2, 38), new t(2, 39) });
    localObject10 = new u(22, new t[] { new t(4, 18), new t(2, 19) });
    Object localObject11 = new u(26, new t[] { new t(4, 14), new t(2, 15) });
    localObject8 = new s(8, new int[] { 6, 24, 42 }, new u[] { localObject8, localObject9, localObject10, localObject11 });
    localObject9 = new u(30, new t[] { new t(2, 116) });
    localObject10 = new u(22, new t[] { new t(3, 36), new t(2, 37) });
    localObject11 = new u(20, new t[] { new t(4, 16), new t(4, 17) });
    Object localObject12 = new u(24, new t[] { new t(4, 12), new t(4, 13) });
    localObject9 = new s(9, new int[] { 6, 26, 46 }, new u[] { localObject9, localObject10, localObject11, localObject12 });
    localObject10 = new u(18, new t[] { new t(2, 68), new t(2, 69) });
    localObject11 = new u(26, new t[] { new t(4, 43), new t(1, 44) });
    localObject12 = new u(24, new t[] { new t(6, 19), new t(2, 20) });
    Object localObject13 = new u(28, new t[] { new t(6, 15), new t(2, 16) });
    localObject10 = new s(10, new int[] { 6, 28, 50 }, new u[] { localObject10, localObject11, localObject12, localObject13 });
    localObject11 = new u(20, new t[] { new t(4, 81) });
    localObject12 = new u(30, new t[] { new t(1, 50), new t(4, 51) });
    localObject13 = new u(28, new t[] { new t(4, 22), new t(4, 23) });
    Object localObject14 = new u(24, new t[] { new t(3, 12), new t(8, 13) });
    localObject11 = new s(11, new int[] { 6, 30, 54 }, new u[] { localObject11, localObject12, localObject13, localObject14 });
    localObject12 = new u(24, new t[] { new t(2, 92), new t(2, 93) });
    localObject13 = new u(22, new t[] { new t(6, 36), new t(2, 37) });
    localObject14 = new u(26, new t[] { new t(4, 20), new t(6, 21) });
    Object localObject15 = new u(28, new t[] { new t(7, 14), new t(4, 15) });
    localObject12 = new s(12, new int[] { 6, 32, 58 }, new u[] { localObject12, localObject13, localObject14, localObject15 });
    localObject13 = new u(26, new t[] { new t(4, 107) });
    localObject14 = new u(22, new t[] { new t(8, 37), new t(1, 38) });
    localObject15 = new u(24, new t[] { new t(8, 20), new t(4, 21) });
    Object localObject16 = new u(22, new t[] { new t(12, 11), new t(4, 12) });
    localObject13 = new s(13, new int[] { 6, 34, 62 }, new u[] { localObject13, localObject14, localObject15, localObject16 });
    localObject14 = new u(30, new t[] { new t(3, 115), new t(1, 116) });
    localObject15 = new u(24, new t[] { new t(4, 40), new t(5, 41) });
    localObject16 = new u(20, new t[] { new t(11, 16), new t(5, 17) });
    Object localObject17 = new u(24, new t[] { new t(11, 12), new t(5, 13) });
    localObject14 = new s(14, new int[] { 6, 26, 46, 66 }, new u[] { localObject14, localObject15, localObject16, localObject17 });
    localObject15 = new u(22, new t[] { new t(5, 87), new t(1, 88) });
    localObject16 = new u(24, new t[] { new t(5, 41), new t(5, 42) });
    localObject17 = new u(30, new t[] { new t(5, 24), new t(7, 25) });
    Object localObject18 = new u(24, new t[] { new t(11, 12), new t(7, 13) });
    localObject15 = new s(15, new int[] { 6, 26, 48, 70 }, new u[] { localObject15, localObject16, localObject17, localObject18 });
    localObject16 = new u(24, new t[] { new t(5, 98), new t(1, 99) });
    localObject17 = new u(28, new t[] { new t(7, 45), new t(3, 46) });
    localObject18 = new u(24, new t[] { new t(15, 19), new t(2, 20) });
    Object localObject19 = new u(30, new t[] { new t(3, 15), new t(13, 16) });
    localObject16 = new s(16, new int[] { 6, 26, 50, 74 }, new u[] { localObject16, localObject17, localObject18, localObject19 });
    localObject17 = new u(28, new t[] { new t(1, 107), new t(5, 108) });
    localObject18 = new u(28, new t[] { new t(10, 46), new t(1, 47) });
    localObject19 = new u(28, new t[] { new t(1, 22), new t(15, 23) });
    Object localObject20 = new u(28, new t[] { new t(2, 14), new t(17, 15) });
    localObject17 = new s(17, new int[] { 6, 30, 54, 78 }, new u[] { localObject17, localObject18, localObject19, localObject20 });
    localObject18 = new u(30, new t[] { new t(5, 120), new t(1, 121) });
    localObject19 = new u(26, new t[] { new t(9, 43), new t(4, 44) });
    localObject20 = new u(28, new t[] { new t(17, 22), new t(1, 23) });
    Object localObject21 = new u(28, new t[] { new t(2, 14), new t(19, 15) });
    localObject18 = new s(18, new int[] { 6, 30, 56, 82 }, new u[] { localObject18, localObject19, localObject20, localObject21 });
    localObject19 = new u(28, new t[] { new t(3, 113), new t(4, 114) });
    localObject20 = new u(26, new t[] { new t(3, 44), new t(11, 45) });
    localObject21 = new u(26, new t[] { new t(17, 21), new t(4, 22) });
    Object localObject22 = new u(26, new t[] { new t(9, 13), new t(16, 14) });
    localObject19 = new s(19, new int[] { 6, 30, 58, 86 }, new u[] { localObject19, localObject20, localObject21, localObject22 });
    localObject20 = new u(28, new t[] { new t(3, 107), new t(5, 108) });
    localObject21 = new u(26, new t[] { new t(3, 41), new t(13, 42) });
    localObject22 = new u(30, new t[] { new t(15, 24), new t(5, 25) });
    Object localObject23 = new u(28, new t[] { new t(15, 15), new t(10, 16) });
    localObject20 = new s(20, new int[] { 6, 34, 62, 90 }, new u[] { localObject20, localObject21, localObject22, localObject23 });
    localObject21 = new u(28, new t[] { new t(4, 116), new t(4, 117) });
    localObject22 = new u(26, new t[] { new t(17, 42) });
    localObject23 = new u(28, new t[] { new t(17, 22), new t(6, 23) });
    Object localObject24 = new u(30, new t[] { new t(19, 16), new t(6, 17) });
    localObject21 = new s(21, new int[] { 6, 28, 50, 72, 94 }, new u[] { localObject21, localObject22, localObject23, localObject24 });
    localObject22 = new u(28, new t[] { new t(2, 111), new t(7, 112) });
    localObject23 = new u(28, new t[] { new t(17, 46) });
    localObject24 = new u(30, new t[] { new t(7, 24), new t(16, 25) });
    Object localObject25 = new u(24, new t[] { new t(34, 13) });
    localObject22 = new s(22, new int[] { 6, 26, 50, 74, 98 }, new u[] { localObject22, localObject23, localObject24, localObject25 });
    localObject23 = new u(30, new t[] { new t(4, 121), new t(5, 122) });
    localObject24 = new u(28, new t[] { new t(4, 47), new t(14, 48) });
    localObject25 = new u(30, new t[] { new t(11, 24), new t(14, 25) });
    Object localObject26 = new u(30, new t[] { new t(16, 15), new t(14, 16) });
    localObject23 = new s(23, new int[] { 6, 30, 54, 78, 102 }, new u[] { localObject23, localObject24, localObject25, localObject26 });
    localObject24 = new u(30, new t[] { new t(6, 117), new t(4, 118) });
    localObject25 = new u(28, new t[] { new t(6, 45), new t(14, 46) });
    localObject26 = new u(30, new t[] { new t(11, 24), new t(16, 25) });
    Object localObject27 = new u(30, new t[] { new t(30, 16), new t(2, 17) });
    localObject24 = new s(24, new int[] { 6, 28, 54, 80, 106 }, new u[] { localObject24, localObject25, localObject26, localObject27 });
    localObject25 = new u(26, new t[] { new t(8, 106), new t(4, 107) });
    localObject26 = new u(28, new t[] { new t(8, 47), new t(13, 48) });
    localObject27 = new u(30, new t[] { new t(7, 24), new t(22, 25) });
    Object localObject28 = new u(30, new t[] { new t(22, 15), new t(13, 16) });
    localObject25 = new s(25, new int[] { 6, 32, 58, 84, 110 }, new u[] { localObject25, localObject26, localObject27, localObject28 });
    localObject26 = new u(28, new t[] { new t(10, 114), new t(2, 115) });
    localObject27 = new u(28, new t[] { new t(19, 46), new t(4, 47) });
    localObject28 = new u(28, new t[] { new t(28, 22), new t(6, 23) });
    Object localObject29 = new u(30, new t[] { new t(33, 16), new t(4, 17) });
    localObject26 = new s(26, new int[] { 6, 30, 58, 86, 114 }, new u[] { localObject26, localObject27, localObject28, localObject29 });
    localObject27 = new u(30, new t[] { new t(8, 122), new t(4, 123) });
    localObject28 = new u(28, new t[] { new t(22, 45), new t(3, 46) });
    localObject29 = new u(30, new t[] { new t(8, 23), new t(26, 24) });
    Object localObject30 = new u(30, new t[] { new t(12, 15), new t(28, 16) });
    localObject27 = new s(27, new int[] { 6, 34, 62, 90, 118 }, new u[] { localObject27, localObject28, localObject29, localObject30 });
    localObject28 = new u(30, new t[] { new t(3, 117), new t(10, 118) });
    localObject29 = new u(28, new t[] { new t(3, 45), new t(23, 46) });
    localObject30 = new u(30, new t[] { new t(4, 24), new t(31, 25) });
    Object localObject31 = new u(30, new t[] { new t(11, 15), new t(31, 16) });
    localObject28 = new s(28, new int[] { 6, 26, 50, 74, 98, 122 }, new u[] { localObject28, localObject29, localObject30, localObject31 });
    localObject29 = new u(30, new t[] { new t(7, 116), new t(7, 117) });
    localObject30 = new u(28, new t[] { new t(21, 45), new t(7, 46) });
    localObject31 = new u(30, new t[] { new t(1, 23), new t(37, 24) });
    Object localObject32 = new u(30, new t[] { new t(19, 15), new t(26, 16) });
    localObject29 = new s(29, new int[] { 6, 30, 54, 78, 102, 126 }, new u[] { localObject29, localObject30, localObject31, localObject32 });
    localObject30 = new u(30, new t[] { new t(5, 115), new t(10, 116) });
    localObject31 = new u(28, new t[] { new t(19, 47), new t(10, 48) });
    localObject32 = new u(30, new t[] { new t(15, 24), new t(25, 25) });
    Object localObject33 = new u(30, new t[] { new t(23, 15), new t(25, 16) });
    localObject30 = new s(30, new int[] { 6, 26, 52, 78, 104, 130 }, new u[] { localObject30, localObject31, localObject32, localObject33 });
    localObject31 = new u(30, new t[] { new t(13, 115), new t(3, 116) });
    localObject32 = new u(28, new t[] { new t(2, 46), new t(29, 47) });
    localObject33 = new u(30, new t[] { new t(42, 24), new t(1, 25) });
    Object localObject34 = new u(30, new t[] { new t(23, 15), new t(28, 16) });
    localObject31 = new s(31, new int[] { 6, 30, 56, 82, 108, 134 }, new u[] { localObject31, localObject32, localObject33, localObject34 });
    localObject32 = new u(30, new t[] { new t(17, 115) });
    localObject33 = new u(28, new t[] { new t(10, 46), new t(23, 47) });
    localObject34 = new u(30, new t[] { new t(10, 24), new t(35, 25) });
    Object localObject35 = new u(30, new t[] { new t(19, 15), new t(35, 16) });
    localObject32 = new s(32, new int[] { 6, 34, 60, 86, 112, 138 }, new u[] { localObject32, localObject33, localObject34, localObject35 });
    localObject33 = new u(30, new t[] { new t(17, 115), new t(1, 116) });
    localObject34 = new u(28, new t[] { new t(14, 46), new t(21, 47) });
    localObject35 = new u(30, new t[] { new t(29, 24), new t(19, 25) });
    Object localObject36 = new u(30, new t[] { new t(11, 15), new t(46, 16) });
    localObject33 = new s(33, new int[] { 6, 30, 58, 86, 114, 142 }, new u[] { localObject33, localObject34, localObject35, localObject36 });
    localObject34 = new u(30, new t[] { new t(13, 115), new t(6, 116) });
    localObject35 = new u(28, new t[] { new t(14, 46), new t(23, 47) });
    localObject36 = new u(30, new t[] { new t(44, 24), new t(7, 25) });
    Object localObject37 = new u(30, new t[] { new t(59, 16), new t(1, 17) });
    localObject34 = new s(34, new int[] { 6, 34, 62, 90, 118, 146 }, new u[] { localObject34, localObject35, localObject36, localObject37 });
    localObject35 = new u(30, new t[] { new t(12, 121), new t(7, 122) });
    localObject36 = new u(28, new t[] { new t(12, 47), new t(26, 48) });
    localObject37 = new u(30, new t[] { new t(39, 24), new t(14, 25) });
    Object localObject38 = new u(30, new t[] { new t(22, 15), new t(41, 16) });
    localObject35 = new s(35, new int[] { 6, 30, 54, 78, 102, 126, 150 }, new u[] { localObject35, localObject36, localObject37, localObject38 });
    localObject36 = new u(30, new t[] { new t(6, 121), new t(14, 122) });
    localObject37 = new u(28, new t[] { new t(6, 47), new t(34, 48) });
    localObject38 = new u(30, new t[] { new t(46, 24), new t(10, 25) });
    Object localObject39 = new u(30, new t[] { new t(2, 15), new t(64, 16) });
    localObject36 = new s(36, new int[] { 6, 24, 50, 76, 102, 128, 154 }, new u[] { localObject36, localObject37, localObject38, localObject39 });
    localObject37 = new u(30, new t[] { new t(17, 122), new t(4, 123) });
    localObject38 = new u(28, new t[] { new t(29, 46), new t(14, 47) });
    localObject39 = new u(30, new t[] { new t(49, 24), new t(10, 25) });
    u localu1 = new u(30, new t[] { new t(24, 15), new t(46, 16) });
    localObject37 = new s(37, new int[] { 6, 28, 54, 80, 106, 132, 158 }, new u[] { localObject37, localObject38, localObject39, localu1 });
    localObject38 = new u(30, new t[] { new t(4, 122), new t(18, 123) });
    localObject39 = new u(28, new t[] { new t(13, 46), new t(32, 47) });
    localu1 = new u(30, new t[] { new t(48, 24), new t(14, 25) });
    u localu2 = new u(30, new t[] { new t(42, 15), new t(32, 16) });
    localObject38 = new s(38, new int[] { 6, 32, 58, 84, 110, 136, 162 }, new u[] { localObject38, localObject39, localu1, localu2 });
    localObject39 = new u(30, new t[] { new t(20, 117), new t(4, 118) });
    localu1 = new u(28, new t[] { new t(40, 47), new t(7, 48) });
    localu2 = new u(30, new t[] { new t(43, 24), new t(22, 25) });
    u localu3 = new u(30, new t[] { new t(10, 15), new t(67, 16) });
    localObject39 = new s(39, new int[] { 6, 26, 54, 82, 110, 138, 166 }, new u[] { localObject39, localu1, localu2, localu3 });
    localu1 = new u(30, new t[] { new t(19, 118), new t(6, 119) });
    localu2 = new u(28, new t[] { new t(18, 47), new t(31, 48) });
    localu3 = new u(30, new t[] { new t(34, 24), new t(34, 25) });
    u localu4 = new u(30, new t[] { new t(20, 15), new t(61, 16) });
    return new s[] { localObject1, localObject2, localObject3, localObject4, localObject5, localObject6, localObject7, localObject8, localObject9, localObject10, localObject11, localObject12, localObject13, localObject14, localObject15, localObject16, localObject17, localObject18, localObject19, localObject20, localObject21, localObject22, localObject23, localObject24, localObject25, localObject26, localObject27, localObject28, localObject29, localObject30, localObject31, localObject32, localObject33, localObject34, localObject35, localObject36, localObject37, localObject38, localObject39, new s(40, new int[] { 6, 30, 58, 86, 114, 142, 170 }, new u[] { localu1, localu2, localu3, localu4 }) };
  }
  
  public int a()
  {
    return this.c;
  }
  
  public u a(o paramo)
  {
    return this.e[paramo.ordinal()];
  }
  
  public int[] b()
  {
    return this.d;
  }
  
  public int c()
  {
    return this.f;
  }
  
  public int d()
  {
    return this.c * 4 + 17;
  }
  
  a e()
  {
    int k = d();
    a locala = new a(k);
    locala.a(0, 0, 9, 9);
    locala.a(k - 8, 0, 8, 9);
    locala.a(0, k - 8, 9, 8);
    int m = this.d.length;
    int i = 0;
    while (i < m)
    {
      int n = this.d[i];
      int j = 0;
      if (j < m)
      {
        if (((i == 0) && ((j == 0) || (j == m - 1))) || ((i == m - 1) && (j == 0))) {}
        for (;;)
        {
          j += 1;
          break;
          locala.a(this.d[j] - 2, n - 2, 5, 5);
        }
      }
      i += 1;
    }
    locala.a(6, 9, 1, k - 17);
    locala.a(9, 6, k - 17, 1);
    if (this.c > 6)
    {
      locala.a(k - 11, 0, 3, 6);
      locala.a(0, k - 11, 6, 3);
    }
    return locala;
  }
  
  public String toString()
  {
    return String.valueOf(this.c);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */