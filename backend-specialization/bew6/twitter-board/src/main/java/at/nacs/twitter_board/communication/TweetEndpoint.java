package at.nacs.twitter_board.communication;

import at.nacs.twitter_board.controller.TweetManager;
import at.nacs.twitter_board.model.Tweet;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tweets")
public class TweetEndpoint {

    private final TweetManager manager;

    @GetMapping
    List<Tweet> getAllByTime() {
        return manager.findAllStartingFromLatest();
    }

    @GetMapping("/user/{user}")
    List<Tweet> getAllByUserByTime(@RequestBody String user) {
        return manager.findAllByUserStartingFromLatest(user);
    }

    @PostMapping
    Tweet save(@RequestBody Tweet tweet) {
        return manager.save(tweet);
    }

    @PutMapping("/{id}/likes")
    int like(@RequestBody String id) {
        return manager.like(id);
    }
    @PutMapping("/{id}/comments")
    Tweet comment(@RequestBody String id){
        manager.comment(id)
    }

}
