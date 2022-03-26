package Question_3;

public class Happy extends Moody{
    private String happy;

    public Happy(String happy, String Mood){
        super(Mood);
        this.happy = happy;
    }

    public String getHappy() {
        return happy;
    }

    @Override
    public String getMood() {
        return super.getMood();
    }

    public void ExpressFeelings(){
        System.out.println("I feel happy today!");
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString(){
        String message = "Subject laughs a lot";
        return message;
    }


    @Override
    public void examine(String Mood) {

    }

    @Override
    public void observe(String Mood) {

    }
}
