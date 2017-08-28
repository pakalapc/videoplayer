package dataAccess;

import model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * The QueryLogic class is used to perform queries 4,5,6 on the data
 *
 * @author Chandni
 */
public class QueryLogic {

    private HashMap<Integer,ArrayList<Channel>> channelTable;
    private HashMap<Integer,Category> categoryTable;
    private HashMap<Integer,ArrayList<PlayList>> playListTable;
    private HashMap<Integer,Video> videoTable;

    /**
     * This method is used to obtain the table data into appropriate
     * data structures
     *
     * @param database_name This is the first parameter to getBasicRows method
     * @param database_user_name This is the second parameter to getBasicRows method
     * @param database_password  This is the third parameter to getBasicRows method
     * @return void
     */
    public void getBasicRows(String database_name,
                             String database_user_name,
                             String database_password) {
        //open database connection
        FetchData fd = new FetchData();
        fd.getConnection(database_name, database_user_name, database_password);

        //get data from database
        channelTable = fd.getChannelData();
        categoryTable = fd.getCategoryData();
        playListTable = fd.getPlayListTable();
        videoTable = fd.getVideoTable();

        //close connection with database
        fd.closeConnection();

    }

    /**
     * This method is used to perform query 4
     *
     * @param
     * @return HashMap<Channel,ArrayList<Video>> This returns the result of the query
     */
    public HashMap<Channel,ArrayList<Video>> sql4(){

        HashMap<Channel,ArrayList<Video>> query4 = new HashMap<Channel,ArrayList<Video>>();

        for(Integer channel_id : channelTable.keySet()){

            Channel ch = new Channel(
                    channel_id,
                    channelTable.get(channel_id ).get(0).getChannelName(),
                    0,channelTable.get(channel_id ).get(0).getCategoryID()
            );
            ArrayList<Video> videos = new ArrayList<>();

            for(int i=0; i < channelTable.get(channel_id).size(); i++){
                videos.add(videoTable.get(channelTable.get(channel_id).get(i).getVideoID()));
            }
            query4.put(ch,videos);
        }
        return query4;
    }

    /**
     * This method is used to perform query 5
     *
     * @param
     * @return HashMap<Channel,Integer> This returns the result of the query
     */
    public HashMap<Channel,Integer> sql5(){

        HashMap<Channel,Integer> query5 = new HashMap<Channel,Integer>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max_id = 0,min_id = 0;

        for(Integer channel_id : channelTable.keySet()){
            int count = channelTable.get(channel_id).size();
            if(count > max){
                max = count;
                max_id = channel_id;
            }
            if(count < min){
                min = count;
                min_id = channel_id;
            }
        }
        Channel maxChannel = new Channel(max_id,channelTable.get(max_id ).get(0).getChannelName(),
                0,channelTable.get(max_id).get(0).getCategoryID());
        Channel minChannel = new Channel(min_id,channelTable.get(min_id ).get(0).getChannelName(),
                0,channelTable.get(min_id).get(0).getCategoryID());

        query5.put(maxChannel,max);
        query5.put(minChannel,min);
        return query5;
    }

    /**
     * This method is used to perform query 6
     *
     * @param
     * @return HashMap<PlayList,ArrayList<Video>> This returns the result of the query
     */
    public HashMap<PlayList,ArrayList<Video>> sql6(){

        HashMap<PlayList,ArrayList<Video>> query6 = new HashMap<PlayList,ArrayList<Video>>();

        for(Integer playList_id : playListTable.keySet()){

            PlayList p = new PlayList(playList_id,playList_id,
                    playListTable.get(playList_id).get(0).getPlayListName(),
                    playListTable.get(playList_id).get(0).getChannelId(),
                    playListTable.get(playList_id).get(0).getVideoId());
            ArrayList<Video> videos = new ArrayList<>();

            for(int i=0; i <  playListTable.get(playList_id).size(); i++){
                videos.add(videoTable.get(playListTable.get(playList_id).get(i).getVideoId()));
            }
            query6.put(p,videos);
        }

        return query6;
    }

}
