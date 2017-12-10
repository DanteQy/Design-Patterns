public class CrossguardHilt extends HiltGuard {

   public CrossguardHilt(Blade guard) {
      super(guard);		
   }

   @Override
   public void apply() {
      guard.apply();	       
      setColor(guard);
   }

   private void setColor(Blade guard){
      System.out.println("Guard color: Golden cross");
   }
}