package no.priv.gulbrandsen.idna2008compatibility;

import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.ibm.icu.text.IDNA;


public class Main {
    public static void main(String[] args) {
        int codePoint = 128;
        while(codePoint < 262144) {
            String uName;
            if(codePoint < 65536) {
                uName = Character.toString((char)codePoint++);
            } else {
                char[] chars = Character.toChars(codePoint++);
                uName = Character.toString(chars[0]) +
                    Character.toString(chars[1]);
            }
            try {
                IDNA.convertIDNToASCII(uName, IDNA.DEFAULT);
                System.out.println("idn2 '" + uName + "' > /dev/null || echo "
                                   + String.format("U+%04x", codePoint));
            } catch(Exception e) {
            }
        }
    }
}
