package test;

import model.Category;
import model.Channel;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Chandni on 8/28/2017.
 */
public class TestFetchData {

    Connection conn;

    @Before
    public void createObject(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoplayer" +
                     "?user=root" + "&password=Scpd=8912!CS" +
                     "&useSSL=false");

        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void testgetChannelData(){
        String query = "INSERT INTO Channel VALUES (4,1,\"My\",1);";
        try{
            PreparedStatement st = conn.prepareStatement(query);
            st.executeUpdate();
            st.close();

            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from Channel where channelID = 4;");
            int channel_id = 0;
            while(rs.next()) {

                channel_id = rs.getInt("channelID");
                String channel_name = rs.getString("channelName");
                int videoID = rs.getInt("videoID");
                int categoryID = rs.getInt("categoryID");
            }

            s.close();
            assertEquals(4,channel_id);
        }catch(Exception e){

        }

    }

    @Test
    public void testgetCategoryData(){
        String query = "INSERT INTO Category VALUES (4,\"Lite\");";
        try{
            PreparedStatement st = conn.prepareStatement(query);
            st.executeUpdate();
            st.close();

            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from Category where id = 4;");
            int cat_id = 0;
            while(rs.next()) {

                cat_id = rs.getInt("id");
                String cat_name = rs.getString("categoryName");
            }

            s.close();
            assertEquals(4,cat_id);
        }catch(Exception e){

        }
    }

    @Test
    public void testgetPlayListData(){
        String query = "INSERT INTO PlayList VALUES (7,1,\"PD\",1);";
        try{
            PreparedStatement st = conn.prepareStatement(query);
            st.executeUpdate();
            st.close();

            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from Channel where channelID = 4;");
            int id = 0;
            while(rs.next()) {

                id = rs.getInt("id");
                int playListId = rs.getInt("playListID");
                String playListName = rs.getString("playListName");
                int videoId = rs.getInt("videoID");
                int channelId = rs.getInt("channelID");
            }

            s.close();
            assertEquals(4,id);
        }catch(Exception e){

        }
    }

    @Test
    public void testgetVideoData(){
        String query = "INSERT INTO Video VALUES (5,\"E\",2);";
        try{
            PreparedStatement st = conn.prepareStatement(query);
            st.executeUpdate();
            st.close();

            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from Video where id = 5;");
            int video_id = 0;
            while(rs.next()) {

                video_id = rs.getInt("id");
                String VideoName = rs.getString("VideoName");
                int categoryID = rs.getInt("categoryID");
            }

            s.close();
            assertEquals(5,video_id);
        }catch(Exception e){

        }
    }


}
