package Question_3;

public abstract class Moody extends Psychiatrist{

    private String Mood;

    public Moody() {

    }

    public String getMood() {
        return Mood;
    }

    public Moody(String Mood){
        this.Mood = Mood;
    }

    public void ExpressFeelings(){

    }

    public void queryMood(){
        System.out.println(this.getClass() + " : " + this.getMood() + "How are you feeling today?");
    }



}


