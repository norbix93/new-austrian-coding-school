package at.nacs.twitter_board.controller;

import at.nacs.twitter_board.TweetRepository;
import at.nacs.twitter_board.model.Tweet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TweetManager {

    private final TweetRepository repository;

    public Tweet save(Tweet newTweet) {
        newTweet.setTimestamp(LocalDateTime.now());
        return repository.save(newTweet);
    }

    public List<Tweet> findAllStartingFromLatest() {
        return repository.findAllByOrderByTimestamp();
    }

    public List<Tweet> findAllByUserStartingFromLatest(String user) {
        return repository.findAllByUserOrderByTimestampDesc(user);
    }

    public int like(String id) {
        Tweet toLike = repository.findTweetById(id);
        return toLike.getLikes() + 1;
    }

    public Tweet comment(String id) {
        Tweet toComment = repository.findTweetById(id);
        List<String> comments = toComment.getComments();
        comments.add(comment);
        id.setComments(comments);
        Tweet commented = id;
        return commented;
    }
}
