package test;
import model.PlayList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Chandni on 8/28/2017.
 */

public class TestPlaylist {
    PlayList playList;

    @Before
    public void createObject(){
        playList = new PlayList(1,2,"playlist_name", 3, 4);
    }

    @Test
    public void testGetId(){
        assertEquals(1,playList.getId());
    }

    @Test
    public void testGetPlayListId(){
        assertEquals(2,playList.getPlayListId());
    }

    @Test
    public void testGetPlayListName(){
        assertEquals("playlist_name", playList.getPlayListName());
    }

    @Test
    public void testGetVideoId(){
        assertEquals(3, playList.getVideoId());
    }

    @Test
    public void testGetChannelId(){
        assertEquals(4, playList.getChannelId());
    }

    @Test
    public void testSetId(){
        playList.setId(11);
        assertEquals(11,playList.getId());
    }

    @Test
    public void testSetPlayListId(){
        playList.setPlayListId(21);
        assertEquals(21, playList.getPlayListId());
    }

    @Test
    public void testSetPlayListName(){
        playList.setPlayListName("new-name");
        assertEquals("new-name", playList.getPlayListName());
    }

    @Test
    public void testSetVideoId(){
        playList.setVideoId(41);
        assertEquals(41, playList.getVideoId());
    }

    @Test
    public void testGeSChannelId(){
        playList.setChannelId(100);
        assertEquals(100, playList.getChannelId());

    }
}
