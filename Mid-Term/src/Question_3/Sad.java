package Question_3;

import static java.lang.System.*;

public class Sad extends Moody{
    private String sad;

    public Sad(String sad, String Mood){
        super(Mood);
        this.sad = sad;
    }

    public String getSad() {
        return sad;
    }

    @Override
    public String getMood() {
        return super.getMood();
    }

    public void ExpressFeelings(){
        System.out.println("I feel sad today!");
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString(){
        String message = "Subject cries a lot";
        return message;
    }


}
