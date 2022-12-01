public class PieceWorker extends Employee {

    private double wage;
    private int num_pieces;
    
    
    
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int num_pieces) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0){
            throw new IllegalArgumentException("Wage per piece must be >= 0");
        }

        if (num_pieces < 0.0){
            throw new IllegalArgumentException("Pieces produced must be >= 0");
        }
        this.wage = wage;
        this.num_pieces = num_pieces;
    }


    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        if (wage < 0.0){
            throw new IllegalArgumentException("Wage per piece must be >= 0");
        }

        this.wage = wage;
    }
    public int getNum_pieces() {
        return num_pieces;
    }
    public void setNum_pieces(int num_pieces) {
        if (num_pieces < 0.0){
            throw new IllegalArgumentException("Pieces produced must be >= 0");
        }

        this.num_pieces = num_pieces;
    }

    @Override
    public double earnings() {
        return getWage() * getNum_pieces();
    }


    @Override
    public String toString() {
        return String.format("piece worker: %s%n%s: $%,.2f; %s: %d", 
        super.toString(), "wage per piece", getWage(),                     
        "pieces produced", getNum_pieces());     
    }

    

    
    
}
