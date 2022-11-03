package vacheron.springframework.spring5w.bootstrap;


import vacheron.springframework.spring5w.domain.Author;
import vacheron.springframework.spring5w.domain.Book;
import vacheron.springframework.spring5w.domain.Publisher;
import vacheron.springframework.spring5w.repositories.AuthorRepository;
import vacheron.springframework.spring5w.repositories.BookRepository;
import vacheron.springframework.spring5w.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //shows that this is a spring managed component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");
        Publisher pub = new Publisher();
        pub.setName("SFG Publishing");
        pub.setCity("St Petersburg");
        pub.setState("FL");
        publisherRepository.save(pub);
        System.out.println("Publisher Count: " + publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(pub);
        pub.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(pub);

        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(pub);
        pub.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(pub);


        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + pub.getBooks().size());
    }
}
