package week9.exercise5;

public class Film {

    private String title;
    private Double score;
    private Integer vote_count;
    private Integer runtime;
    private Integer budget;
    private String revenue;

    public Film(String title, Double score, Integer vote_count, Integer runtime, Integer budget, String revenue) {
        this.title = title;
        this.score = score;
        this.vote_count = vote_count;
        this.runtime = runtime;
        this.budget = budget;
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getVote_count() {
        return vote_count;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Integer getBudget() {
        return budget;
    }

    public String getRevenue() {
        return revenue;
    }
}
