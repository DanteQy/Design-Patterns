//Wrapper to match the square peg to hex/round hole
class SquarePegAdapter {
    //As said before the wrapper must work with an instance of the adapted class.
    private final SquarePeg sq;
    
    //constructor
    public SquarePegAdapter(double w) {
        sq = new SquarePeg(w);
    }

    // interface for the round hole
    public void fit(RoundHole roundHole) {
        double amount = roundHole.getRadius() * Math.sqrt(2);
        
        if (amount < sq.getWidth() ) {
            if((amount - sq.getWidth()> 0.5)){
                System.out.println("SquarePeg and Round is loose by"+(amount - sq.getWidth()));
            } else {
                System.out.println("SquarePeg and Round fit");
            }
             
        } else {
            System.out.println("SquarePeg and Round doesn't fit"+(amount - sq.getWidth()));
        }
    }
    
    // interface for the hexagonal hole
    public void fit(HexagonalHole hexHole) {
        // The adapter/wrapper class delegates to the legacy object
        double amount = hexHole.getWidth();
        
        if (amount < sq.getWidth() ) {
            if(amount - sq.getWidth()> 0.5){
                System.out.println("SquarePeg and Hexagonal is loose by"+(amount - sq.getWidth()));
            } else {
                System.out.println("SquarePeg and Hexagonal fit");
            }
        } else {
        System.out.println("SquarePeg and Hexagonal doesn't fit"+(amount - sq.getWidth()));
        }
    }
}