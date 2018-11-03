package com.example.menga.sorting;

public class heap {
    private int[] arr = new int[20];
    private int size=0;
    public void add(int x){
        if(size==0){
            arr[1]=x;
        }
        arr[size+1]=x;
        size++;
    }
    public int getLeft(int node){
        return arr[node*2];
    }
    public int getRight(int node){
        return arr[node*2+1];
    }
    public int removeMin(){
        int result = arr[1];
        arr[1]=arr[size];
        arr[size]=0;
        int position = 1;
        while((arr[position]<arr[position*2])||(arr[position]<arr[position*2+1])){
            if(arr[position]<arr[position*2]&&arr[position]<arr[position*2+1]){
                if(arr[position*2]<arr[position*2+1]){
                    int temp = arr[position*2];
                    arr[position*2]=arr[position];
                    arr[position]=temp;
                }
                else{
                    int temp = arr[position*2+1];
                    arr[position*2+1] = arr[position];
                    arr[position]=temp;
                }
            }
            if(arr[position]<arr[position*2]){

            }
        }
        size--;
        return arr[1];
    }
    public int getSize(){return size;}
}
