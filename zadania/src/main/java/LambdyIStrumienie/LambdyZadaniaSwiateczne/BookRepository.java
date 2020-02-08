package LambdyIStrumienie.LambdyZadaniaSwiateczne;

import java.util.Optional;

public interface BookRepository {
    Optional<Book> findByTitle(String title);

}
