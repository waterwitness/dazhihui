import android.graphics.Color;
import android.widget.Button;

final class u
  implements Runnable
{
  u(t paramt, Button paramButton) {}
  
  public final void run()
  {
    this.a.setText("取消排队");
    this.a.setBackgroundColor(Color.parseColor("#009BE7"));
    this.a.setClickable(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */