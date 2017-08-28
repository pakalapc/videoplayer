package test;
import model.Channel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Chandni on 8/28/2017.
 */
public class TestChannel {

    Channel channel;

    @Before
    public void createObject(){
        channel = new Channel(1,"channel_name", 3, 4);
    }

    @Test
    public void testGetChannelId(){
        assertEquals(1, channel.getChannelID());
    }

    @Test
    public void testGetChannelName(){
        assertEquals("channel_name", channel.getChannelName());
    }

    @Test
    public void testGetVideoId(){
        assertEquals(3, channel.getVideoID());
    }

    @Test
    public void testGetCategoryId(){
        assertEquals(4, channel.getCategoryID());
    }

    @Test
    public void testSetChannelId(){
        channel.setChannelID(10);
        assertEquals(10, channel.getChannelID());
    }

    @Test
    public void testSetChannelName(){
        channel.setChannelName("new_name");
        assertEquals("new_name", channel.getChannelName());
    }

    @Test
    public void testSetVideoId(){
        channel.setVideoID(5);
        assertEquals(5, channel.getVideoID());
    }

    @Test
    public void testSetCategoryId(){
        channel.setCategoryID(100);
        assertEquals(100, channel.getCategoryID());
    }

}
