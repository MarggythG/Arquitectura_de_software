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
public class FinishedState implements State{

    @Override
    public void pressPlay(VideoPlayerContext videoPlayerContext) {
        //System.out.println("Press play");
        videoPlayerContext.setState(videoPlayerContext.getFinished());
    }

    @Override
    public void pressPause(VideoPlayerContext videoPlayerContext) {
        System.out.println("The video has ended");
    }
    
}
