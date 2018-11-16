package com.swcompsci;

public class LoopingMediaLib
{
    public static void main(String[] args)
    {
        String songInfo = MediaFile.readString();
       /* for (int i = 0; i <14; i++)
        {

            System.out.println(MediaFile.readString());
        }*/
       while (songInfo != null)
       {
           System.out.println(songInfo);
           songInfo = MediaFile.readString();
       }
    }
}
