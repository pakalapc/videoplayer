package test;

import model.Video;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Chandni on 8/28/2017.
 */
public class TestVideo {
    Video video;

    @Before
    public void createObject(){
        video = new Video(1, "test_video_name", 2);
    }

    @Test
    public void testGetVideoId(){
        assertEquals(1,video.getVideoID());
    }

    @Test
    public void testGetVideoName(){
        assertEquals("test_video_name",video.getVideoName());
    }

    @Test
    public void testGetCategoryId() {
        assertEquals(2, video.getCategoryID());
    }

    @Test
    public void testSetVideoId(){
        video.setCategoryID(5);
        assertEquals(5,video.getCategoryID());
    }

    @Test
    public void testSetVideoName(){
        video.setVideoName("new_name");
        assertEquals("new_name", video.getVideoName());
    }

    @Test
    public void testSetCategoryId(){
        video.setCategoryID(10);
        assertEquals(10, video.getCategoryID());
    }
}
