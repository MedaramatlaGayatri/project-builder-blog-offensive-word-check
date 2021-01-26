package utility;

import java.util.ArrayList;
import java.util.Arrays;

import model.Blog;

/*Create a class called  which  and also .*
2.*Implement  method.*
3.*The checkBlog(Blog blog) method in turn should invoke  and .*
4.*The checkBlog method should return true if there are no offensive words otherwise it should return false.*
5.*You need to use the google offensive word list which is located in your project directory under resources - full-list-of-bad-words_text-file_2018_07_30.txt*
6.*Use it for your reference of bad words.*
7.*Select 25 offensive words from the file and store it in an array.*
8.*You can compare the offensive words with the array and return the output
*The checkBlogTitle(Blog blog) should check if the blog title contains any offensive words.*
2.*Return true if there are no offensive words else false if it contains any offensive words.*
3.*You can use the array created in Progression - 3 to check if title contains any offensive words.*
4.*Return true if there are no offensive words.*

*/
public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{

	ArrayList<String> badWords= new ArrayList<String>( Arrays.asList("apeshit","ar5e", "areola","areole"
			,"aria"
			, "arrse"
			, "arse"
			, "arsehole"
			, "aryan"
			, "ass"
			, "ass fuck"
			, "ass fuck"
			, "ass hole"
			, "assbag"
			, "assbandit"
			, "assbang"
			, "assbanged"
			, "assbanger"
			, "assbangs"
			, "assbite"
			, "assclown"
			, "asscock"
			, "asscracker"
			, "asses"
			, "assface"
			, "assfaces"
			, "assfuck"
			, "assfucker"
			, "ass-fucker"
			, "assfukka"
			, "assgoblin"
			, "assh0le") );
	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		String[] title = blog.getBlogTitle().split(" ");
		for(int i = 0;i < title.length;i++) {
			if(badWords.contains(title[i])) {
				return false;
			}
		}
		return true;
	}

	//@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		String[] descript = blog.getBlogDescription().split(" ");
		for(int i = 0;i < descript.length;i++) {
			if(badWords.contains(descript[i])) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		if(checkBlogTitle(blog) && checkBlogDescription(blog)) {
			return true;
		}
		else
		return false;
	}
	
}