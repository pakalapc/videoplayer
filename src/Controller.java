import dataAccess.FetchData;
import dataAccess.QueryLogic;
import model.Channel;
import model.PlayList;
import model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

/**
 * The Controller class helps to control the flow of this application
 *
 * @author Chandni
 */
public class Controller {

    /**
     * This method is used to display the results of Query4
     *
     * @param qL This is the first parameter to showResult4 method
     * @return void
     */
    void showResult4(QueryLogic qL){

        System.out.println("Channel along with the videos are : ");
        HashMap<Channel,ArrayList<Video>> result4 = qL.sql4();

        for(Map.Entry m:result4.entrySet()){
            Channel c = (Channel) m.getKey();
            System.out.print(c.getChannelName() +" : ");
            ArrayList<Video> list = (ArrayList<Video>)m.getValue();
            StringBuilder s = new StringBuilder();
            s.append("{");
            for(Video v : list )
                s.append(v.getVideoName() + ",");
            s.deleteCharAt(s.length()-1);
            s.append("}");
            System.out.println(s.toString());
        }
    }

    /**
     * This method is used to display the results of Query5
     *
     * @param qL This is the first parameter to showResult5 method
     * @return void
     */
    void showResult5(QueryLogic qL) {
        HashMap<Channel,Integer> result5 = qL.sql5();
        Channel maxChannel = null , minChannel = null;
        if(result5.size() != 2)
            System.out.println("Query 5 could not be executed");
        else{
            int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
            int count = 0;
            int index=1;

            for(Map.Entry m:result5.entrySet()){
                Channel c = (Channel) m.getKey();
                count = (int) m.getValue();
                if(count > max) {
                    max = count;
                    maxChannel = c;
                }
                if(count < min) {
                    min = count;
                    minChannel = c;
                }
            }
            System.out.println();
            System.out.println("Channel with minimum video Count is " + minChannel.getChannelName() +
                    " with video counts " + min);
            System.out.println("Channel with maximum video Count is " + maxChannel.getChannelName() +
                    " with video counts " + max);
            System.out.println();
        }
    }

    /**
     * This method is used to display the results of Query6
     *
     * @param qL This is the first parameter to showResult6 method
     * @return void
     */
    void showResult6(QueryLogic qL) {
        System.out.println("PlayList along with the videos are : ");
        HashMap<PlayList,ArrayList<Video>> result6 = qL.sql6();

        for(Map.Entry m:result6.entrySet()){
            PlayList p = (PlayList) m.getKey();
            System.out.print(p.getPlayListName() + " : ");

            ArrayList<Video> list = (ArrayList<Video>)m.getValue();
            StringBuilder s = new StringBuilder();
            s.append("{");
            for(Video v : list )
                s.append(v.getVideoName() + ",");
            s.deleteCharAt(s.length()-1);
            s.append("}");
            System.out.println(s.toString());

        }
    }

    /**
     * This method is used to retrieve database records and
     * perform queries 4,5,6 on them.
     *
     * @param database_name This is the first parameter to showResult6 method
     * @param database_user_name This is the second parameter to showResult6 method
     * @param database_password  This is the third parameter to showResult6 method
     * @return void
     */
    public  void applogic(String database_name, String database_user_name, String database_password) {

        //getting the data and formulating the query
        QueryLogic qL = new QueryLogic();
        qL.getBasicRows(database_name, database_user_name,database_password);

        //call the queries
        showResult4(qL);
        showResult5(qL);
        showResult6(qL);
    }

}
