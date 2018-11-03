package com.example.menga.sorting;

public class heapSort {
    private heap tree = new heap();
    public String sort(String x){
        String temp = "";
        for(int i =0;i<x.length();i++){
            if(x.substring(i,i+1).equals(" ")){
                tree.add(Integer.parseInt(temp));
            }
            else{
                temp+=x.substring(i,i+1);
            }
        }
        while()
    }
}
