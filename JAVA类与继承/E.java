
class ScoreException extends Exception {

    int m;

    ScoreException(int m){

        this.m = m;

    }

    int getMess(){

        return m;
    }

}

class Teacher {

    public int giveScore(int score) throws ScoreException {

        if(score > 100|| score< 0)

            throw new ScoreException(score);

        System.out.println("This line print");
        
        return score;

    }

}

public class E {

    public static void main(String args[]){

        Teacher t = new Teacher();

        int m = 0,n = 0;

        try {  m = t.giveScore(199);

            m = t.giveScore(69);

        }

        catch(ScoreException e){

            n = e.getMess();

        }

        System.out.printf("%d:%d",m,n);

    }

}

