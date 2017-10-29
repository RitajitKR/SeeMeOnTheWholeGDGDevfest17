/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smontw;

/**
 *
 * @author user
 */
import java.io.*;
public class read {

    private static final String FILENAME = "E:rwriteml.txt";

    public String reader(int sn) {

        BufferedReader br = null;
        FileReader fr = null;
        String aa="";
        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;
            String s="";

            while ((sCurrentLine = br.readLine()) != null) {
                
                s=s+sCurrentLine;
                
                
                
            }
            s=s+"$";
            int c=0;
            int p1=0;
            int p2=0;
            for (int x=1;x<s.length();x++)
            {
                //aa=aa+s.charAt(x));
                if(s.charAt(x)=='$')
                {
                    ++c;System.out.println(c);
                    if(c==sn) {p2=x;System.out.println(p2);break;}
                    p1=x; 
                }
                
            }
            aa=s.substring(p1+1,p2);

            //System.out.println("the Output: " + aa);
            
        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
        return aa;
    }

}