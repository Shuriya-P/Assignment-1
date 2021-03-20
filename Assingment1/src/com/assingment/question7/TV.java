package com.assingment.question7;

class TV extends Electronics{
    private int channel = 5; 
    
    public void setChannel(int c){
        this.channel = c;
    }
    
    public int getChannel(){
        return channel;
    }
    
    @Override
    void reset (){
        setChannel(0);
    }
}
