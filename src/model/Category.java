package model;

/**
 * The Category class is analogous to the category table of videoplayer database
 *
 * @author Chandni
 */
public class Category {

    private int categoryId;
    private String categoryName;

    /**
     * This is a Constructor to Category class
     *
     * @param categoryId This is the first parameter to constructor
     * @param categoryName This is the second parameter to constructor
     */
    public Category(int categoryId,String categoryName){
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    /**
     * This method is used to get category id
     *
     * @param
     * @return int This returns the category id
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * This method is used to set the category id
     *
     * @param categoryId This is the first parameter to setCategoryId method
     * @return
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method is used to get category name
     *
     * @param
     * @return String This returns the category name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method is used to set category name
     *
     * @param categoryName This is the first parameter to setCategoryName method
     * @return
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
