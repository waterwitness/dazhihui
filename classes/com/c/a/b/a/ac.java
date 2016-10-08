package com.c.a.b.a;

import com.c.a.ae;
import com.c.a.al;
import com.c.a.d.a;
import com.c.a.d.c;
import com.c.a.d.d;

final class ac
  extends al<Character>
{
  public Character a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    parama = parama.h();
    if (parama.length() != 1) {
      throw new ae("Expecting character, got: " + parama);
    }
    return Character.valueOf(parama.charAt(0));
  }
  
  public void a(d paramd, Character paramCharacter)
  {
    if (paramCharacter == null) {}
    for (paramCharacter = null;; paramCharacter = String.valueOf(paramCharacter))
    {
      paramd.b(paramCharacter);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */