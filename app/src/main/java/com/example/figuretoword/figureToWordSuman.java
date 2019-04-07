package com.example.figuretoword;

public class figureToWordSuman {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String conversion(){
            if (number >= 0 && number <= 999){
                if(number == 0){
                    return "zero";
                }else {
                    String first = figureToWord(this.number/100," HUNDRED ");
                    String second = figureToWord(this.number%100,"");
                    return first + second;
                }
            }else return "Number out of range.";
        }
    public String figureToWord(int num, String val){
        String ones[] = {"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
        String tens[] ={"","","TWENTY","THIRTY","FORTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
        if (num > 19){
            return tens[num/10]+ " " + ones[num%10];
        }else if (num > 0){
            return ones[num]+val;
        }else
            return ones[num];
    }
}


