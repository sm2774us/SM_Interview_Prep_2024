package com.codility.lessons.Barclays2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Package {

    static class Packet {
        float weight;
        int price;
    }

    Map<Integer,Packet> packets;
    int weight;
	
    //packing process
    public String packingSolution(int maxWeight, float[] weights, int[] prices) {
        float tempWeight1 = 0;
        int tempPrice1 = 0;
        String result = "";
        for (int i=0; i<weights.length; i++) {
            float tempWeight2 = weights[i];
			int tempPrice2 = prices[i];
			// get packet from inner loop
            float tempWeight4 = weights[i];
			int tempPrice4 = prices[i];
			// for other combinations in the inner loop
            String tempResult2 = ""+(i+1)+",";
			String tempResult4 = tempResult2;
            int iterate=1;
			//will iterate other combinations
            for (int j=i+iterate; j<weights.length; ) {
                float tempWeight3 = weights[j];
                if (tempWeight3+tempWeight2 <= maxWeight) {
                    tempWeight2 += tempWeight3;
                    tempPrice2 += prices[j];
                    tempResult2 += (j+1)+",";
                }
                j++;
                if (j<weights.length) { //to pack after break and to compare if pack has last index
                    continue;
                }
                if (tempPrice4<tempPrice2 || (tempPrice4==tempPrice2 && tempWeight4>tempWeight2)) {
                    tempPrice4 = tempPrice2;
                    tempWeight4 = tempWeight2;
                    tempResult4 = tempResult2;
                }
                iterate++;
                j = i + iterate;
                tempResult2 = (i+1) + ",";
                tempWeight2 = weights[i];
                tempPrice2 = prices[i];
            }
            if ( tempPrice1<tempPrice4 || (tempPrice1==tempPrice4 && tempWeight1>tempWeight4) ) {
                tempPrice1 = tempPrice4;
                tempWeight1 = tempWeight4;
                result = tempResult4.substring(0,tempResult4.length()-1);
            }
        }
        if (result.length()>0) {
            System.out.println(result);
			return result;
        } else{
            System.out.println("-");
			return "-";
        }
    }
	
    public static void main(String args[]) throws Exception{
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line=br.readLine();
            Package pack=new Package();
            while(line!=null && line.length()>12){
                pack.packets=new HashMap<Integer,Packet>();
                int index=line.indexOf(":");
                pack.weight=Integer.parseInt(line.substring(0,index-1));
                //boolean check = false;
                if (pack.weight<=100) {
                    line=line.substring(index+3,line.length());
                    if (pack.init(line) && pack.packets.size()<=15) {
                        pack.packing();
                    } else {
                        System.out.println("-");
                    }
                }
                line=br.readLine();
            }
        }
    }

    //packing process
    public void packing() {
        float tempWeight1 = 0;
        int tempPrice1 = 0;
        String result = "";
        List<Integer> key = new ArrayList<>(packets.keySet());
        for (int i=0; i<key.size(); i++) {
            Packet p = packets.get(key.get(i));
            float tempWeight2 = p.weight;
			int tempPrice2 = p.price;
			// get packet from inner loop
            float tempWeight4 = p.weight;
			int tempPrice4 = p.price;
			// for other combinations in the inner loop
            String tempResult2 = ""+key.get(i)+",";
			String tempResult4 = tempResult2;
            int iterate=1;
			//will iterate other combinations
            for (int j=i+iterate; j<key.size(); ) {
                float tempWeight3 = packets.get(key.get(j)).weight;
                if (tempWeight3+tempWeight2 <= weight) {
                    tempWeight2 += tempWeight3;
                    tempPrice2 += packets.get(key.get(j)).price;
                    tempResult2 += key.get(j)+",";
                }
                j++;
                if (j<key.size()) { //to pack after break and to compare if pack has last index
                    continue;
                }
                if (tempPrice4<tempPrice2 || (tempPrice4==tempPrice2 && tempWeight4>tempWeight2)) {
                    tempPrice4 = tempPrice2;
                    tempWeight4 = tempWeight2;
                    tempResult4 = tempResult2;
                }
                iterate++;
                j = i + iterate;
                tempResult2 = key.get(i) + ",";
                tempWeight2 = p.weight;
                tempPrice2 = p.price;
            }
            if ( tempPrice1<tempPrice4 || (tempPrice1==tempPrice4 && tempWeight1>tempWeight4) ) {
                tempPrice1 = tempPrice4;
                tempWeight1 = tempWeight4;
                result = tempResult4.substring(0,tempResult4.length()-1);
            }
        }
        if (result.length()>0) {
            System.out.println(result);
        } else{
            System.out.println("-");
        }
    }
	
    //intializing
    private boolean init(String line) {
        int index1 = line.indexOf(",");
        int index2 = line.indexOf(",$");
        int index3 = line.indexOf(")");
        Packet p = new Packet();
        p.weight = Float.parseFloat(line.substring(index1+1,index2));
        p.price = Integer.parseInt(line.substring(index2+2,index3));
        if (p.price>100 || p.weight>100) {
            return false;
        }
        if (p.weight <= weight) {
            index1 = Integer.parseInt(line.substring(0,index1));
            packets.put(index1,p);
        }
        if (index3+1 != line.length()) {
            line = line.substring(index3+3,line.length());
            return init(line);
        }
        return true;
    }
}
