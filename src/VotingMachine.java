public class VotingMachine {

    private int votesForLabour;
    private int votesForConservative;

    public void voteForLabour(){
        votesForLabour++;
    }

    public void voteForConservative(){
        votesForConservative++;
    }

    public void randomVoteForLabour(){
        votesForLabour= (int) (votesForLabour+Math.random()*10+1);
    }

    public void randomVoteForConservative(){
        votesForConservative= (int) (votesForConservative+Math.random()*10+1);
    }

    public int getvotesForLabour(){
        return votesForLabour;
    }

    public int getvotesForConservative(){
        return votesForConservative;
    }

    public void clearMachineState(){
        votesForLabour=0;
        votesForConservative=0;
    }
}
