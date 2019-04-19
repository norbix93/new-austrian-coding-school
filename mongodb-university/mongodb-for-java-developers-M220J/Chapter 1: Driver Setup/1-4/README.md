Problem:

User Story

"As a user, I'd like to be able to search movies by cast members, genre, or perform a text search of the plot summary, full plot, and title."

Task

For this ticket, you will need to modify the method getMoviesByCast in MovieDao.java to allow the following movie search criteria:

cast: finds all movies that match the cast members of a movie
Already, MovieDao.java has implementation methods that is able to return results for two different types of movie search criteria:

text : getMoviesByText - performs a text search in the movies collection
genres: getMoviesByGenre - finds movies that include any of the wanted genres.
You just need to construct the query that retrieves the movies collection by cast.

A text index was created for you when you restored the collections with mongorestore, so these queries will be efficient once they are implemented.

Hint

Check the implementation of similar formats of search criteria - the cast query should similar.
MFlix Functionality

Once you complete this ticket, the UI will allow movie searches by criteria of the cast, movie genres, movie title, and plot summary.
