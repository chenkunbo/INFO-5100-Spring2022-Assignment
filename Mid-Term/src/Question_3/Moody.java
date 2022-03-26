package Question_3;

public abstract class Moody implements Psychiatrist{

    private String Mood;

    public String getMood() {
        return Mood;
    }

    public Moody(String Mood){
        this.Mood = Mood;
    }

    public void ExpressFeelings(){

    }

    public void queryMood(){
        System.out.println(this.getClass() + " : " + this.getMood() + "I feel Happy(or Sad) today!!");
    }



}


