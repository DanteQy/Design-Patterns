public class HiltGuard implements Blade{
   protected Blade guard;

   public HiltGuard(Blade guard){
      this.guard = guard;
   }

   public void apply(){
      guard.apply();
   }	
}
