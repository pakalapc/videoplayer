package model;

/**
 * The Channel class is analogous to the channel table of videoplayer database
 *
 * @author Chandni
 */
public class Channel {

    private int channelID;
    private String channelName;
    private int videoID;
    private int categoryID;

    /**
     * This is a Constructor to Channel class
     *
     * @param channelId This is the first parameter to constructor
     * @param channelName This is the second parameter to constructor
     * @param videoID This is the third parameter to constructor
     * @param categoryID This is the fourth parameter to constructor
     * @return
     */
    public Channel(int channelId,String channelName,int videoID,int categoryID){
        this.channelID = channelId;
        this.channelName = channelName;
        this.videoID = videoID;
        this.categoryID = categoryID;
    }

    /**
     * This method is used to get channel id
     *
     * @param
     * @return int This returns the channel id
     */
    public int getChannelID() {
        return channelID;
    }

    /**
     * This method is used to set channel_id
     *
     * @param channel_id This is the first parameter to setChannelID method
     * @return int This returns the channel id
     */
    public void setChannelID(int channel_id) {
        this.channelID = channel_id;
    }

    /**
     * This method is used to get channel name
     *
     * @param
     * @return String This returns the channel name
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * This method is used to set channel name
     *
     * @param channel_name This is the first parameter to setChannelName method
     * @return
     */
    public void setChannelName(String channel_name) {
        this.channelName = channel_name;
    }

    /**
     * This method is used to get video ID
     *
     * @param
     * @return int This returns the video id
     */
    public int getVideoID() {
        return videoID;
    }

    /**
     * This method is used to set video id
     *
     * @param videoID This is the first parameter to setVideoID method
     * @return
     */
    public void setVideoID(int videoID) {
        this.videoID = videoID;
    }

    /**
     * This method is used to get category id
     *
     * @param
     * @return String This returns the category id
     */
    public int getCategoryID() {
        return categoryID;
    }

    /**
     * This method is used to set category id
     *
     * @param categoryID This is the first parameter to setCategoryID method
     * @return
     */
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

}




