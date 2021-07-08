/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePatternVideoPlayer;

/**
 *
 * @author mjoha
 */
public class VideoPlayerContext {
    
    private State beginningState;
    private State playingState;
    private State pausedByState;
    private State finishedState;
    
    private State currentState;
    
    public VideoPlayerContext(){
    beginningState = new BeginningState();
    playingState = new PlayingState();
    pausedByState = new PausedByState();
    finishedState = new FinishedState();
    currentState = beginningState;
    
    }
    
    public void pressPlay(){
        currentState.pressPlay(this);
    }
    
    public void pressPause(){
        currentState.pressPause(this);
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getPause() {
        System.out.println("The video is paused");
        return pausedByState;
    }
    
    public State getPlay() {
        System.out.println("The video is playing");
        return playingState;
    }

    public State getBeginning() {
        System.out.println("The video is beginning");
        return beginningState;
    }

    public State getFinished() {
        System.out.println("The video has finished");
        return finishedState;
    }
    
    
    
}
