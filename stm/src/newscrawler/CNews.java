package newscrawler;

import java.sql.Connection;

public class CNews extends NewsPaper{

    public CNews(Connection con) {
        super("http://lankacnews.com/sinhala/news/",
                "h3", "div.date", "div.description",
                0, 95000, "cnews_out.txt", con, "c_news");
    }
}
