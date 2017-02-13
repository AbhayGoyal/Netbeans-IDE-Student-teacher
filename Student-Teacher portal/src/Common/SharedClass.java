/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author Abhay Goyal
 */
public class SharedClass {
    
        public  static String LoginName;

        public static void setLoginName(String LoginName) {
            SharedClass.LoginName = LoginName;
        }

        public static String getLoginName() {
            return LoginName;
        }
        
}
