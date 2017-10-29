/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smontw;

/**
 *
 * @author user
 * 
 */
import java.util.*;
import java.io.*;

public class stores {
    private static final String FILENAME = "E:rwriteml.txt";
    public void calkeep(int a,int j,int x,int b, int c,int d,int f, int g, int h,int i)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        BufferedWriter bw = null;
        FileWriter fw = null;

        int marks,wm=0;// marks varibles (acadamics)
        int edur,emed, emark,we=0,rw=0;//varibles for Extra curricular
        int sdur,smark,smed,rep,ws=0;//Sport varibles
        //int invest,iw,wi=0;//investment weightage
        int acad=0;
        double final_mark=0;
        
        // Extra curricular
        edur=0;
        rw=0;
        emark=0;
        sdur=0;
        smed=0;
        smark=0;
        rep=0;
        emed=0;

        edur=a;
        rw=x;
        sdur=b;
        smed=c;
        rep=d;
        emed=j;
        acad=f+g+h+i;
        if (edur>8)
        {
            emark=10;// basix=c mark that has been given(arbtary)
        }
        else if(edur>4)
        {
            emark=7;// basix=c mark that has been given(arbtary)
        }
        else if(edur>2)
        {
            emark=5;// basix=c mark that has been given(arbtary)
        }
        //Sports
        if (sdur>8)
        {
            smark=10;// basix=c mark that has been given(arbtary)
        }
        else if(sdur>4)
        {
            smark=7;// basix=c mark that has been given(arbtary)
        }
        else if(edur>2)
        {
            smark=5;// basix=c mark that has been given(arbtary)
        }
        
        //Count Medal
        if (smed>5)
        {
            smark=smark+20;
        }
        else if (smed>3)
        {
            smark=smark+10;
        }
        //count emed
        if (emed>8)
        {
            emark=emark+25;
        }
        else if (emed>5)
        {
            emark=emark+20;
        }
        //Representation
        if(rep==3)
        {
            smark=smark+10;
        }
        else if(rep==2)
        {
            smark=smark+7;
        }
        else if(rep==1) 
        {
            smark=smark+5; 
        }
        
        int i7=smark+emark;
        double w1=0.6; double w2=0.4;
        final_mark=(acad*w1+i7*w2);
        try {

            //String content = "First Student #"+emark+"#"+smark+"$";//String to be written into the file
            
            String data = "$#"+i7+"#"+acad+"#"+final_mark;
            File file = new File(FILENAME);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            bw.write(data);

            System.out.println("Done");
        } catch (IOException e) {

            e.printStackTrace();
      }

         finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }
}
