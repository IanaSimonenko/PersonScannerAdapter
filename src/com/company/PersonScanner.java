package com.company;

/**
 * Created by anasimonenko1 on 22.08.17.
 */
import java.io.IOException;

public interface PersonScanner {
    Person read() throws IOException;

    void close() throws IOException;
}
