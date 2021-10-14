package eu.crystal.BlogApiMongoDB.exceptions;

public class ArticleNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ArticleNotFoundException(Integer id) {
        super("Could not find article "+id);
    }
	
}
