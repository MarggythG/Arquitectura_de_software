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
public interface State {
    //reciben el videoplayer
    public void pressPlay(VideoPlayerContext videoPlayerContext);
    public void pressPause(VideoPlayerContext videoPlayerContext);

    
}
