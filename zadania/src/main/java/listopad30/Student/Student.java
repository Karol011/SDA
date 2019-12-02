package listopad30.Student;

public class Student implements Comparable {
    String imie;
    String nazwisko;
    int numerAlbumu;

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numerAlbumu=" + numerAlbumu +
                '}';
    }

    public Student(String imie, String nazwisko, int numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
    }

    @Override
    public int compareTo(Object o) {
        Student that = (Student) o;
        if (this.numerAlbumu > that.numerAlbumu) {//porownianie numerow albumu
            return 1;
        }
        if (this.numerAlbumu < that.numerAlbumu) {
            return -1;
        } else {//jezeli numery albumow sa takie same to porownaj nazwiska
            if (this.nazwisko.compareTo(that.nazwisko) > 0) {
                return 1;
            }
            if (this.nazwisko.compareTo(that.nazwisko) < 0) {
                return -1;
            } else {//jezeli nr albumu i naziwsko sa takie same to porownaj imiona
                return this.imie.compareTo(that.imie);
            }

        }
    }
}