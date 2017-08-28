package model;

/**
 * The Video class is analogous to the video table of videoplayer database
 *
 * @author Chandni
 */
public class Video {

    private int videoID;
    private String videoName;
    private int categoryID;

    /**
     * This is a Constructor to Video class
     *
     * @param videoID This is the first parameter to constructor
     * @param videoName This is the second parameter to constructor
     * @param categoryID This is the third parameter to constructor
     */
    public Video(int videoID,String videoName,int categoryID ){
        this.videoID = videoID;
        this.videoName = videoName;
        this.categoryID = categoryID;
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
     * This method is used to set video_id
     *
     * @param video_id This is the first parameter to setVideoID method
     * @return
     */
    public void setVideoID(int video_id) {
        this.videoID = video_id;
    }

    /**
     * This method is used to get video name
     *
     * @param
     * @return int This returns the video name
     */
    public String getVideoName() {
        return videoName;
    }

    /**
     * This method is used to set videoName
     *
     * @param videoName This is the first parameter to setVideoID method
     * @return
     */
    public void setVideoName(String videoName) {
        this.videoName = videoName;
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
     * This method is used to set the category id
     *
     * @param categoryID This is the first parameter to setCategoryID method
     * @return
     */
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

}
