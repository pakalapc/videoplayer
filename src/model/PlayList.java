package model;

/**
 * The PlayList class is analogous to the playlist table of videoplayer database
 *
 * @author Chandni
 */
public class PlayList {

    private int id;
    private int playListId;
    private String playListName;
    private int videoId;
    private int channelId;

    /**
     * This is a Constructor to PlayList class
     *
     * @param id This is the first parameter to constructor
     * @param playListId This is the second parameter to constructor
     * @param playListName is the third parameter to constructor
     * @param videoId This is the fourth parameter to constructor
     * @param channelId This is the fifth parameter to constructor
     * @return
     */
    public PlayList(int id,int playListId,String playListName,int videoId,int channelId){
        this.id = id;
        this.playListId = playListId;
        this.playListName = playListName;
        this.videoId = videoId;
        this.channelId = channelId;
    }

    /**
     * This method is used to get id
     *
     * @param
     * @return int This returns the id
     */
    public int getId() {
        return id;
    }

    /**
     * This method is used to set id
     *
     * @param id This is the first parameter to setId method
     * @return
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * This method is used to get PlayListid
     *
     * @param
     * @return int This returns the PlayListid
     */
    public int getPlayListId() {
        return playListId;
    }

    /**
     * This method is used to set PlayListid
     *
     * @param playListId This is the first parameter to setId method
     * @return
     */
    public void setPlayListId(int playListId) {
        this.playListId = playListId;
    }

    /**
     * This method is used to set PlayListid
     *
     * @param
     * @return String This is used to return the play list name
     */
    public String getPlayListName() {
        return playListName;
    }

    /**
     * This method is used to set playListName
     *
     * @param playListName This is the first parameter to setId method
     * @return
     */
    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    /**
     * This method is used to get VideoId
     *
     * @param
     * @return int This returns the VideoId
     */
    public int getVideoId() {
        return videoId;
    }

    /**
     * This method is used to set videoId
     *
     * @param videoId This is the first parameter to setVideoId method
     * @return
     */
    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    /**
     * This method is used to get channelId
     *
     * @param
     * @return int This returns the channelId
     */
    public int getChannelId() {
        return channelId;
    }

    /**
     * This method is used to set ChannelId
     *
     * @param channelId This is the first parameter to setChannelId method
     * @return
     */
    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

}