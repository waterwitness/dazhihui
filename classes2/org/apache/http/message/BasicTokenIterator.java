package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.ParseException;
import org.apache.http.TokenIterator;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
public class BasicTokenIterator
  implements TokenIterator
{
  public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
  protected String currentHeader;
  protected String currentToken;
  protected final HeaderIterator headerIt;
  protected int searchPos;
  
  public BasicTokenIterator(HeaderIterator paramHeaderIterator)
  {
    this.headerIt = ((HeaderIterator)Args.notNull(paramHeaderIterator, "Header iterator"));
    this.searchPos = findNext(-1);
  }
  
  protected String createToken(String paramString, int paramInt1, int paramInt2)
  {
    return paramString.substring(paramInt1, paramInt2);
  }
  
  protected int findNext(int paramInt)
  {
    if (paramInt < 0)
    {
      if (!this.headerIt.hasNext()) {
        return -1;
      }
      this.currentHeader = this.headerIt.nextHeader().getValue();
    }
    for (paramInt = 0;; paramInt = findTokenSeparator(paramInt))
    {
      paramInt = findTokenStart(paramInt);
      if (paramInt >= 0) {
        break;
      }
      this.currentToken = null;
      return -1;
    }
    int i = findTokenEnd(paramInt);
    this.currentToken = createToken(this.currentHeader, paramInt, i);
    return i;
  }
  
  protected int findTokenEnd(int paramInt)
  {
    Args.notNegative(paramInt, "Search position");
    int i = this.currentHeader.length();
    paramInt += 1;
    while ((paramInt < i) && (isTokenChar(this.currentHeader.charAt(paramInt)))) {
      paramInt += 1;
    }
    return paramInt;
  }
  
  protected int findTokenSeparator(int paramInt)
  {
    paramInt = Args.notNegative(paramInt, "Search position");
    int i = 0;
    int j = this.currentHeader.length();
    while ((i == 0) && (paramInt < j))
    {
      char c = this.currentHeader.charAt(paramInt);
      if (isTokenSeparator(c))
      {
        i = 1;
      }
      else if (isWhitespace(c))
      {
        paramInt += 1;
      }
      else
      {
        if (isTokenChar(c)) {
          throw new ParseException("Tokens without separator (pos " + paramInt + "): " + this.currentHeader);
        }
        throw new ParseException("Invalid character after token (pos " + paramInt + "): " + this.currentHeader);
      }
    }
    return paramInt;
  }
  
  protected int findTokenStart(int paramInt)
  {
    int i = Args.notNegative(paramInt, "Search position");
    paramInt = 0;
    if ((paramInt == 0) && (this.currentHeader != null))
    {
      int j = this.currentHeader.length();
      while ((paramInt == 0) && (i < j))
      {
        char c = this.currentHeader.charAt(i);
        if ((isTokenSeparator(c)) || (isWhitespace(c))) {
          i += 1;
        } else if (isTokenChar(this.currentHeader.charAt(i))) {
          paramInt = 1;
        } else {
          throw new ParseException("Invalid character before token (pos " + i + "): " + this.currentHeader);
        }
      }
      j = i;
      if (paramInt == 0)
      {
        if (!this.headerIt.hasNext()) {
          break label176;
        }
        this.currentHeader = this.headerIt.nextHeader().getValue();
      }
      for (j = 0;; j = i)
      {
        i = j;
        break;
        label176:
        this.currentHeader = null;
      }
    }
    if (paramInt != 0) {
      return i;
    }
    return -1;
  }
  
  public boolean hasNext()
  {
    return this.currentToken != null;
  }
  
  protected boolean isHttpSeparator(char paramChar)
  {
    return " ,;=()<>@:\\\"/[]?{}\t".indexOf(paramChar) >= 0;
  }
  
  protected boolean isTokenChar(char paramChar)
  {
    if (Character.isLetterOrDigit(paramChar)) {}
    do
    {
      return true;
      if (Character.isISOControl(paramChar)) {
        return false;
      }
    } while (!isHttpSeparator(paramChar));
    return false;
  }
  
  protected boolean isTokenSeparator(char paramChar)
  {
    return paramChar == ',';
  }
  
  protected boolean isWhitespace(char paramChar)
  {
    return (paramChar == '\t') || (Character.isSpaceChar(paramChar));
  }
  
  public final Object next()
  {
    return nextToken();
  }
  
  public String nextToken()
  {
    if (this.currentToken == null) {
      throw new NoSuchElementException("Iteration already finished.");
    }
    String str = this.currentToken;
    this.searchPos = findNext(this.searchPos);
    return str;
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Removing tokens is not supported.");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\message\BasicTokenIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */