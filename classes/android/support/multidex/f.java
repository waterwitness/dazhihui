package android.support.multidex;

import java.io.File;
import java.io.FileFilter;

final class f
  implements FileFilter
{
  f(String paramString) {}
  
  public boolean accept(File paramFile)
  {
    return !paramFile.getName().startsWith(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\multidex\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */