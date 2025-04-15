/*
* File: Store.java
* Author: Mihucza Gergő
* Copyright: 2025, Mihucza Gergő
* Group: Szoft II-2-N
* Date: 2021-04-14
* Github: https://github.com/MihuczaGergo/
* Licenc: MIT
*/

package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Store {
    public static void saveResults(String results) {
        try {
            trySaveResults(results);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void trySaveResults(String results) throws IOException {
        FileWriter fw = new FileWriter("results.txt");
        fw.write(results);
        fw.close();
    }
}