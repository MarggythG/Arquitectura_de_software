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
public class Main {
    
    public static void main(String[] args) {
        
        VideoPlayerContext videoPlayer = new VideoPlayerContext();
        videoPlayer.setState(new BeginningState());
        videoPlayer.pressPlay();
        videoPlayer.setState(new PlayingState());
        videoPlayer.pressPlay();
        videoPlayer.setState(new PausedByState());
        videoPlayer.pressPause();
        videoPlayer.setState(new FinishedState());
        videoPlayer.getPlay();
        
    }
    
}
