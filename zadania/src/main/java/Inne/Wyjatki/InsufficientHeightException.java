package Inne.Wyjatki;

public class InsufficientHeightException extends  RuntimeException{//przy dziedziczeniu po RunTimeException nie wymaga try i catch
    public InsufficientHeightException(String errorMessage) {
        super(errorMessage);
    }

}
