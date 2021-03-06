import java.io.*;
import java.util.*;
/* Removing the system information leak vulnerability by printing only
generic (non-detailed) error messages */

class passwdAuth
{
    public static void main(String args[])
    {
        try
        {
            String logFileName = args[0];
            File f = new File(logFileName);
            boolean access_granted = false;
            String password = "";
            int integer = 5;

            if (args.length == 2)
            {
                System.out.println("Checking command-line password");
                password = password + args[1];
                if (password.equals("3dTAqb.7"))
                {
                    access_granted = true;
                    System.out.println("Password matches.");
                }
                else
                    System.out.println("Command-line password does not match");
            }//end if

            if (access_granted)
            {
                System.out.println("Access granted!");

                PrintWriter out = new PrintWriter(new
                        FileOutputStream(f, true));
                out.println();
                out.print("Updated...");
                out.println();
                out.flush();
                out.close();
            }//end if

        }//end try
        catch (Exception e)
        {
            System.out.println("an error has occured.");
            //e.printStackTrace();
        }
    }//end main
}//end class

/*
C:\Users\Coditas\Desktop>javac passwdAuth.java

C:\Users\Coditas\Desktop>java passwdAuth
Error: Could not find or load main class passwdAuth

C:\Users\Coditas\Desktop>javac passwdAuth.java

C:\Users\Coditas\Desktop>java passwdAuth
an error has occured.

C:\Users\Coditas\Desktop>java passwdAuth PasswdAuth 3dTAqb.7
Checking command-line password
Password matches.
Access granted!

C:\Users\Coditas\Desktop>java passwdAuth FileNewPw 3dTAqb.7
Checking command-line password
Password matches.
Access granted!


