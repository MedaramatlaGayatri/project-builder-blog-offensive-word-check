package utility;

import model.Blog;

//Create an Interface - public .
//Create two methods  and.
public interface OffensiveWordsInterface{
	boolean checkBlogTitle(Blog blog);
	boolean checkBlogDescription(Blog blog);
}