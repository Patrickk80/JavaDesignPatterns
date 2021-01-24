package structural.proxy;

import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterServiceImpl implements TwitterService {

  private static final String TWITTER_CONSUMER_KEY = "78dUOk5e9P8sDiRKyMNny45Qe";
  private static final String TWITTER_SECRET_KEY = "gnhpOier9ZFyaqRFj4Y9kOaAmDgr5FWq6N5kWHWJv0Usr5coGC";
  private static final String TWITTER_ACCESS_TOKEN = "50037705-nGn9g4mPYwkUSQCkEGb287nl7BK2ljRhX7uyC4HKI";
  private static final String TWITTER_ACCESS_TOKEN_SECRET = "sAi0r85hmsrQrlp6CIXcWHKkSxQSjGel1im51sEz3MjVW";

  @Override
  public String getTimeline(String screenName) {

    ConfigurationBuilder cb = new ConfigurationBuilder();
    cb.setDebugEnabled(true)
        .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
        .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
        .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
        .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
    TwitterFactory tf = new TwitterFactory(cb.build());
    Twitter twitter = tf.getInstance();
    StringBuilder builder = new StringBuilder();
    try {
      Query query = new Query(screenName);
      QueryResult result;
      do {
        result = twitter.search(query);
        List<Status> tweets = result.getTweets();
        for (Status tweet : tweets) {
          builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
          builder.append("\n");
        }
      } while ((query = result.nextQuery()) != null);

    } catch (TwitterException te) {
      te.printStackTrace();
      System.out.println("Failed to search tweets: " + te.getMessage());
    }
    return builder.toString();
  }

  @Override
  public void postToTimeLine(String screenName, String message) {
    System.out.println(message);
  }
}