package com.d.a.c.d;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class at
{
  public static <T> List<T> a(T... paramVarArgs)
  {
    return Collections.unmodifiableList(Arrays.asList((Object[])paramVarArgs.clone()));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */