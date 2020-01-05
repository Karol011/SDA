package Inne.Wyjatki.RollerCoster;

 class InsufficientHeightException extends  RuntimeException{//przy dziedziczeniu po RunTimeException nie wymaga try i catch
     InsufficientHeightException(String errorMessage) {
        super(errorMessage);                                    //bez tego nie bedzie wiadomosci z errorem
    }

}
