/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class EmailValidation {

    public static void main(String[] args) {
        System.out.println(checkEmailValidityNew);
    }

    public boolean checkEmailValidityNew(String email) {
        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");

        if (atpos > 1 && (dotpos - atpos) > 2 && dotpos < email.length() - 2) {
            return true;

        } else {
            return false;
        }

    }
}
