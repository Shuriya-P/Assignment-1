package com.assingment.question7;
class Radio extends Electronics{
    private double frequency = 1.1; 
    
    public void setFrequency (double f){
        this.frequency = f;
    }
    
    public double getFrequency(){
        return frequency;
    }
    
    @Override
    public void reset () {    
        setFrequency(0.0);
    }
}    