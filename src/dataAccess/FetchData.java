package dataAccess;

import model.Category;
import model.Channel;
import model.PlayList;
import model.Video;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * The FetchData class is used to retrieve data records from the database
 *
 * @author Chandni
 */
public class FetchData {

    static private Connection conn;

    /**
     * This method is used to establish connection with the database
     *
     * @param database_name This is the first parameter to getConnection method
     * @param database_user_name This is the second parameter to getConnection method
     * @param database_password  This is the third parameter to getConnection method
     * @return void
     */
   public void getConnection(String database_name,
                             String database_user_name,
                             String database_password){

        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" +
                    database_name + "?user=" + database_user_name + "&password=" +
                    database_password + "&useSSL=false");

        }catch(SQLException ex) {
            ex.printStackTrace();
        }
       if(conn == null)
       {
           System.err.println("Unable to connect to MySQL database");
           return;
       }
        return;
    }

    /**
     * This method is used to close connection to the database
     *
     * @param
     * @return void
     */
   public void closeConnection(){
        try {
            conn.close();
        }
        catch(SQLException ex){

        }
   }

    /**
     * This method is used to retrieve data from Channel Table
     *
     * @param
     * @return HashMap<Integer,ArrayList<Channel>> This returns the records of Channel table
     */
   HashMap<Integer,ArrayList<Channel>> getChannelData(){
       HashMap<Integer,ArrayList<Channel>> channelTable = new HashMap<Integer,ArrayList<Channel>>();

       try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from Channel;");
            ArrayList<Channel> channelObject;
            while(rs.next()) {

                int channel_id = rs.getInt("channelID");
                String channel_name = rs.getString("channelName");
                int videoID = rs.getInt("videoID");
                int categoryID = rs.getInt("categoryID");

                Channel ch = new Channel(channel_id,channel_name,videoID,categoryID);
                if(! channelTable.containsKey(channel_id)){
                    channelObject = new ArrayList<Channel>();
                    channelObject.add(ch);
                    channelTable.put(channel_id,channelObject);
                }else{
                    channelObject = channelTable.get(channel_id);
                    channelObject.add(ch);
                    channelTable.put(channel_id,channelObject);
                }
            }

            s.close();
       }catch (Exception e){

       }
        return channelTable;
    }

   /**
    * This method is used to retrieve data from Category Table
    *
    * @param
    * @return HashMap<Integer, Category> This returns the records of Category table
    */
   HashMap<Integer, Category> getCategoryData(){
        HashMap<Integer,Category> categoryTable = new HashMap<Integer,Category>();
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from Category;");

            while(rs.next()) {

                int cat_id = rs.getInt("id");
                String cat_name = rs.getString("categoryName");

                Category ch = new Category(cat_id,cat_name);
                categoryTable.put(cat_id,ch);
            }

            s.close();
        }catch (Exception e){

        }
        return categoryTable;
    }

    /**
     * This method is used to retrieve data from PlayList Table
     *
     * @param
     * @return HashMap<Integer,ArrayList<PlayList>> This returns the records of PlayList table
     */
   HashMap<Integer,ArrayList<PlayList>> getPlayListTable(){

        HashMap<Integer,ArrayList<PlayList>> playListTable = new HashMap<Integer,ArrayList<PlayList>>();
        ArrayList<PlayList> playListObject = new ArrayList<PlayList>();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from PlayList;");

            while(rs.next()) {

                int id = rs.getInt("id");
                int playListId = rs.getInt("playListID");
                String playListName = rs.getString("playListName");
                int videoId = rs.getInt("videoID");
                int channelId = rs.getInt("channelID");

                PlayList ch = new PlayList(id,playListId,playListName,videoId,channelId);
                if(! playListTable.containsKey( playListId)){
                    playListObject = new ArrayList<PlayList>();
                    playListObject.add(ch);
                    playListTable.put( playListId,playListObject);
                }else{
                    playListObject  = playListTable.get( playListId);
                    playListObject .add(ch);
                    playListTable.put( playListId,playListObject );
                }
            }

            s.close();
        }catch (Exception e){

        }
        return playListTable;
    }

    /**
     * This method is used to retrieve data from Video Table
     *
     * @param
     * @return HashMap<Integer, Video> This returns the records of Video table
     */
   HashMap<Integer, Video> getVideoTable(){

        HashMap<Integer,Video> videoTable = new HashMap<Integer,Video>();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from Video");

            while(rs.next()) {

                int video_id = rs.getInt("id");
                String VideoName = rs.getString("VideoName");
                int categoryID = rs.getInt("categoryID");

                Video ch = new Video(video_id,VideoName,categoryID);
                videoTable.put(video_id,ch);
            }

            s.close();
        }catch (Exception e){

        }
        return videoTable;
    }
}
