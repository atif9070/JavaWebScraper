package abc;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class abcd {
	public static void main(String[] args)
	{
		
		
		try {
			Document doc= Jsoup.connect("https://www.imdb.com/list/ls055386972/").userAgent("Chrome/71.0").get();
			Elements temp = doc.select("div.lister-item-content");
			
			int i=0;
			for(Element movieList:temp)
			{
				i++;
				System.out.println(i+" "+ movieList.getElementsByTag("a").first().text() );
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}