package at.nacs.twitter_board;

import at.nacs.twitter_board.model.Tweet;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TweetRepository extends MongoRepository<Tweet, String> {

    Tweet save(Tweet newTweet);

    List<Tweet> findAllByOrderByTimestamp();

    List<Tweet> findAllByUserOrderByTimestampDesc(String user);

    Tweet like(Tweet selectedTweet);

    Tweet findTweetById(String id);

    Tweet comment(String id);
}
