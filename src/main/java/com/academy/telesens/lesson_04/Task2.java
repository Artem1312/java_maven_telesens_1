package com.academy.telesens.lesson_04;

public class Task2 {
    public static void main(String[] args) {
        String[] tracks={"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};

        for(int i=0;i<tracks.length;i++){
            //System.out.println(tracks[i]);
            int num = tracks[i].indexOf("_");
            //System.out.println(num);
            String index = tracks[i].substring(num+1);
            //System.out.println(index);
            int id = Integer.parseInt(index);
            //System.out.println(id);
            if(id>=10 && id<=15){
                System.out.println(tracks[i]);
            }
        }
    }
}
