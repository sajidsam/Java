package org.example.chapter10.Payroll_System_10;


public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String first, String last, String ssn,
                       double wagePerPiece, int numberOfPieces) {
        super(first, last, ssn);
        setWage(wagePerPiece);
        setPieces(numberOfPieces);
    }

    public void setWage(double wagePerPiece) {
        if (wagePerPiece >= 0.0)
            wage = wagePerPiece;
        else
            throw new IllegalArgumentException("Wage must be >= 0.0");
    }

    public double getWage() {
        return wage;
    }

    public void setPieces(int numberOfPieces) {
        if (numberOfPieces >= 0)
            pieces = numberOfPieces;
        else
            throw new IllegalArgumentException("Pieces must be >= 0");
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public double earnings() {
        return getWage() * getPieces();
    }

    @Override
    public String toString() {
        return String.format("piece worker: %s\nwage per piece: $%,.2f; pieces produced: %d",
                super.toString(), getWage(), getPieces());
    }
}
