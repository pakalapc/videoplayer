package test;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import model.Category;

/**
 * Created by Chandni on 8/27/2017.
 */
public class TestCategory {

    Category category;

    @Before
    public void createObject(){
        category = new Category(1, "test_category_name");
    }

    @Test
    public void testGetCategoryId(){
        assertEquals(1,category.getCategoryId());
    }

    @Test
    public void testGetCategoryName(){
        assertEquals("test_category_name",category.getCategoryName());
    }

    @Test
    public void testSetCategoryId(){
        category.setCategoryId(2);
        assertEquals(2,category.getCategoryId());
    }

    @Test
    public void testSetCategoryName(){
        category.setCategoryName("new_name");
        assertEquals("new_name",category.getCategoryName());
    }
}
