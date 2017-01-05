package com.greenfox;
import com.greenfox.model.Post;

import com.greenfox.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by rudolfps on 2017.01.04..
 */
@SpringBootApplication
	public class RedditApp implements CommandLineRunner{

		@Autowired
		private PostRepository repository;

		public static void main(String[] args) {
			SpringApplication.run(RedditApp.class, args);
		}

		@Override
		public void run(String... args) throws Exception {
			repository.deleteAll();


			repository.save(new Post("10 Historical Misconceptions That Are Actually True", "MARK OLIVER", "http://listverse.com/2017/01/05/10-historical-misconceptions-that-are-actually-true/" ));
			repository.save(new Post("Top 10 Scandalous Freemason Secrets", "ANONYMOUS", "http://listverse.com/2012/11/21/top-10-scandalous-freemason-secrets/" ));
			repository.save(new Post("Top 10 Hidden Images Found In Cartoons", "LISTVERSE STAFF", "http://listverse.com/2009/05/10/top-10-hidden-images-found-in-cartoons/" ));
			repository.save(new Post("10 Craziest Living Things Swallowed By Sharks", "JANE TAYLOR ", "http://listverse.com/2017/01/04/10-craziest-living-things-swallowed-by-sharks/" ));
			repository.save(new Post("10 Truly Disgusting Facts About Ancient Greek Life", "MARK OLIVER", "http://listverse.com/2017/01/03/10-disgusting-facts-about-ancient-greek-life/" ));
		}

}

