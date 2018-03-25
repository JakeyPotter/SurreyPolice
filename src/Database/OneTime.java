/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author Jack
 */
public class OneTime {
        public static String generatePassword() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                     + "0123456789";
                     

        final int PW_LENGTH = 10;
        Random rnd = new SecureRandom();
        StringBuilder pass = new StringBuilder();
        for (int i = 0; i < PW_LENGTH; i++)
            pass.append(chars.charAt(rnd.nextInt(chars.length())));
        return pass.toString();
    }
}
