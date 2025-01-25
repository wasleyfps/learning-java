package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        try {
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }

        try {
            mayThrowException();
        } catch (SQLException | FileNotFoundException e) {
            System.out.println("");
            e.printStackTrace();
        } catch (Exception e) {
            e = new RuntimeException();
            e.printStackTrace();
        }
    }

    private static void mayThrowException() throws SQLException, FileNotFoundException {
        throw new RuntimeException();
    }
}
