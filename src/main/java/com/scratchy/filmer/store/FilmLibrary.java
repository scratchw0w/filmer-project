package com.scratchy.filmer.store;

import com.scratchy.filmer.entity.Film;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FilmLibrary {

    private static final List<Film> actionList;
    private static final List<Film> adventureList;
    private static final List<Film> dramaList;
    private static final List<Film> comedyList;
    private static final List<Film> crimeList;
    private static final List<Film> fantasyList;
    private static final List<Film> horrorList;
    private static final List<Film> historicalList;
    private static final List<Film> mysteryList;
    private static final List<Film> philosophicalList;
    private static final List<Film> romanceList;
    private static final List<Film> satireList;
    private static final List<Film> socialList;
    private static final List<Film> thrillerList;
    private static final List<Film> westernList;

    static {
        actionList = new ArrayList<>(Arrays.asList(
                new Film("The Lord of the Rings: The Two Towers","Peter Jackson", 2002, 8.7, Arrays.asList("Elijah Wood", "Ian McKellen", "Viggo Mortensen", "Orlando Bloom"), "action"),
                new Film("Star Wars: Episode IV - A New Hope", "George Lucas", 1977, 8.6, Arrays.asList(" Mark Hamill", "Harrison Ford", "Carrie Fisher", "Alec Guinness"), "action"),
                new Film("Seven Samurai", "Akira Kurosawa", 1954, 8.6, Arrays.asList("Toshirô Mifune", "Takashi Shimura", "Keiko Tsushima", "Yukiko Shimazaki"), "action"),
                new Film("Léon: The Professional", "Luc Besson", 1994, 8.5, Arrays.asList("Jean Reno", "Gary Oldman", "Natalie Portman", "Danny Aiello"), "action"),
                new Film("Dangal", "Nitesh Tiwari",2016, 8.4, Arrays.asList("Aamir Khan", "Sakshi Tanwar", "Fatima Sana Shaikh", "Sanya Malhotra"), "action"),
                new Film("The Matrix", "Lana Wachowski", 1999, 8.7, Arrays.asList("Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss", "Hugo Weaving"), "action"),
                new Film("Spider-Man: Into the Spider-Verse",  "Bob Persichetti", 2018, 8.4, Arrays.asList("Shameik Moore", "Jake Johnson", "Hailee Steinfeld", "Mahershala Ali"), "action"),
                new Film("Avengers: Endgame", "Anthony Russo", 2019, 8.4, Arrays.asList("Robert Downey Jr.", "Chris Evans", "Mark Ruffalo", "Chris Hemsworth"), "action"),
                new Film("The Dark Knight Rises", "Christopher Nolan", 2012, 8.4, Arrays.asList("Christian Bale", "Tom Hardy", "Anne Hathaway", "Gary Oldman"), "action"),
                new Film("Gladiator", "Ridley Scott", 2000, 8.5, Arrays.asList(" Russell Crowe", "Joaquin Phoenix", "Connie Nielsen", "Oliver Reed"), "action"),
                new Film("Oldboy", "Chan-wook Park", 2003, 8.4, Arrays.asList("Min-sik Choi", "Ji-Tae Yoo", "Hye-jeong Kang", "Dae-han Ji"), "action"),
                new Film("Raiders of the Lost Ark", "Steven Spielberg", 1981, 8.4, Arrays.asList("Harrison Ford", "Karen Allen", "Paul Freeman", "John Rhys-Davies"), "action"),
                new Film("Aliens", "James Cameron", 1986, 8.3, Arrays.asList("Sigourney Weaver", "Michael Biehn", "Carrie Henn", "Paul Reiser"), "action"),
                new Film("Gangs of Wasseypur", "Anurag Kashyap", 2012, 8.2, Arrays.asList("Manoj Bajpayee", "Richa Chadha", "Nawazuddin Siddiqui", "Tigmanshu Dhulia"), "action"),
                new Film("Lock, Stock and Two Smoking Barrels", "Guy Ritchie", 1998, 8.2, Arrays.asList("Jason Flemyng", "Dexter Fletcher", "Nick Moran", "Jason Statham"), "action"),
                new Film("Warrior", "Gavin O'Connor", 2011, 8.2, Arrays.asList("Tom Hardy", "Nick Nolte", "Joel Edgerton", "Jennifer Morrison"), "action"),
                new Film("V for Vendetta", "James McTeigue", 2005, 8.2, Arrays.asList("Hugo Weaving", "Natalie Portman", "Rupert Graves", "Stephen Rea"), "action"),
                new Film("Star Wars: Episode VI - Return of the Jedi", "Richard Marquand", 1983, 8.3, Arrays.asList("Mark Hamill", "Harrison Ford", "Carrie Fisher", "Billy Dee Williams"), "action"),
                new Film("Batman Begins", "Christopher Nolan", 2005, 8.2, Arrays.asList("Christian Bale", "Michael Caine", "Ken Watanabe", "Liam Neeson"), "action"),
                new Film("The Dark Knight", "Christopher Nolan", 2008,  9.0, Arrays.asList("Christian Bale", "Heath Ledger", "Aaron Eckhart", "Michael Caine"), "action"),
                new Film("Indiana Jones and the Last Crusade", "Steven Spielberg", 1989, 8.2, Arrays.asList("Harrison Ford", "Sean Connery", "Alison Doody", "Denholm Elliott"), "action"),
                new Film("Die Hard", "John McTiernan", 1988, 8.2, Arrays.asList("Bruce Willis", "Alan Rickman", "Bonnie Bedelia", "Reginald VelJohnson"), "action"),
                new Film("Ran", "Akira Kurosawa", 1985, 8.2, Arrays.asList("Tatsuya Nakadai", "Akira Terao", "Jinpachi Nezu", "Daisuke Ryû"), "action")));

        adventureList = new ArrayList<>(Arrays.asList(
                new Film("Interstellar", "Christopher Nolan", 2014, 8.6, Arrays.asList("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain", "Mackenzie Foy"), "adventure"),
                new Film("Spirited Away", "Hayao Miyazaki", 2001, 8.6, Arrays.asList("Daveigh Chase", "Suzanne Pleshette", "Miyu Irino", "Rumi Hiiragi"), "adventure"),
                new Film("The Lion King", "Roger Allers", 1994, 8.5, Arrays.asList("Matthew Broderick", "Jeremy Irons", "James Earl Jones", "Whoopi Goldberg"), "adventure"),
                new Film("Back to the Future", "Robert Zemeckis", 1985, 8.5, Arrays.asList("Michael J. Fox", "Christopher Lloyd", "Lea Thompson", "Crispin Glover"), "adventure"),
                new Film("Avengers: Infinity War", "Joe Russo", 2018, 8.4, Arrays.asList("Robert Downey Jr.", "Chris Hemsworth", "Mark Ruffalo", "Chris Evans"), "adventure"),
                new Film("Coco", "Lee Unkrich", 2017, 8.4, Arrays.asList("Anthony Gonzalez", "Gael García Bernal", "Benjamin Bratt", "Alanna Ubach"), "adventure"),
                new Film("The Great Escape", "John Sturges", 1963, 8.2, Arrays.asList("Steve McQueen", "James Garner", "Richard Attenborough", "Charles Bronson"), "adventure"),
                new Film("2001: A Space Odyssey", "Stanley Kubrick", 1968, 8.3, Arrays.asList("Keir Dullea", "Gary Lockwood", "William Sylvester", "Daniel Richter"), "adventure"),
                new Film("WALL-E", "Andrew Stanton", 2008, 8.4, Arrays.asList("Ben Burtt", "Elissa Knight", "Jeff Garlin", "Fred Willard"), "adventure"),
                new Film("Princess Mononoke", "Hayao Miyazaki", 1997, 8.4, Arrays.asList("Yôji Matsuda", "Yuriko Ishida", "Yûko Tanaka", "Billy Crudup"), "adventure"),
                new Film("Toy Story 3", "Lee Unkrich", 2010, 8.3, Arrays.asList("Tom Hanks", "Tim Allen", "Joan Cusack", "Ned Beatty"), "adventure"),
                new Film("Inglourious Basterds", "Quentin Tarantino", 2009, 8.3, Arrays.asList("Brad Pitt", "Diane Kruger", "Eli Roth", "Mélanie Laurent"), "adventure"),
                new Film("Aliens", "James Cameron", 1986, 8.3, Arrays.asList("Sigourney Weaver", "Michael Biehn", "Carrie Henn", "Paul Reiser"), "adventure"),
                new Film("Star Wars: Episode VI - Return of the Jedi", "Richard Marquand", 1983, 8.3, Arrays.asList("Mark Hamill", "Harrison Ford", "Carrie Fisher", "Billy Dee Williams"), "adventure"),
                new Film("Das Boot", "Wolfgang Petersen", 1981, 8.3, Arrays.asList("Jürgen Prochnow", "Herbert Grönemeyer", "Klaus Wennemann", "Hubertus Bengsch"), "adventure"),
                new Film("Lawrence of Arabia", "David Lean", 1962, 8.3, Arrays.asList("Peter O'Toole", "Alec Guinness", "Anthony Quinn", "Jack Hawkins"), "adventure"),
                new Film("North by Northwest", "Alfred Hitchcock", 1959, 8.3, Arrays.asList("Cary Grant", "Eva Marie Saint", "James Mason", "Jessie Royce Landis"), "adventure"),
                new Film("Klaus", "Sergio Pablos", 2019, 8.2, Arrays.asList("Jason Schwartzman", "J.K. Simmons", "Rashida Jones", "Will Sasso"), "adventure"),
                new Film("Up", "Pete Docter", 2009, 8.2, Arrays.asList("Edward Asner", "Jordan Nagai", "John Ratzenberger", "Christopher Plummer"), "adventure"),
                new Film("Monty Python and the Holy Grail", "Terry Gilliam", 1975, 8.2, Arrays.asList("Graham Chapman", "John Cleese", "Eric Idle", "Terry Gilliam"), "adventure"),
                new Film("Howl's Moving Castle", "Hayao Miyazaki", 2004, 8.2, Arrays.asList("Chieko Baishô", "Takuya Kimura", "Tatsuya Gashûin", "Akihiro Miwa"), "adventure"),
                new Film("The Treasure of the Sierra Madre", "John Huston", 1948, 8.2, Arrays.asList("Humphrey Bogart", "Walter Huston", "Tim Holt", "Bruce Bennett"), "adventure"),
                new Film("Toy Story", "John Lasseter", 1995, 8.3, Arrays.asList("Tom Hanks", "Tim Allen", "Don Rickles", "Jim Varney"), "adventure")));

        dramaList = new ArrayList<>(Arrays.asList(
                new Film("The Godfather: Part II", "Francis Ford Coppola", 1974, 9.0, Arrays.asList("Al Pacino", "Robert De Niro", "Robert Duvall", "Diane Keaton"), "drama"),
                new Film("Fight Club", "David Fincher", 1999, 8.8, Arrays.asList("Brad Pitt", "Edward Norton", "Meat Loaf", "Zach Grenier"), "drama"),
                new Film("Forrest Gump", "Robert Zemeckis", 1994, 8.8, Arrays.asList("Tom Hanks", "Robin Wright", "Gary Sinise", "Sally Field"), "drama"),
                new Film("One Flew Over the Cuckoo's Nest", "Milos Forman", 1975, 8.7, Arrays.asList("Jack Nicholson", "Louise Fletcher", "Will Sampson", "Michael Berryman"), "drama"),
                new Film("Saving Private Ryan", "Steven Spielberg", 1998, 8.6, Arrays.asList("Tom Hanks", "Matt Damon", "Tom Sizemore", "Edward Burns"), "drama"),
                new Film("It's a Wonderful Life", "Frank Capra", 1946, 8.6, Arrays.asList("James Stewart", "Donna Reed", "Lionel Barrymore", "Thomas Mitchell"), "drama"),
                new Film("Whiplash", "Damien Chazelle", 2014, 8.5, Arrays.asList("Miles Teller", "J.K. Simmons", "Melissa Benoist", "Paul Reiser"), "drama"),
                new Film("1917", "Sam Mendes", 2019, 8.3, Arrays.asList("Dean-Charles Chapman", "George MacKay", "Daniel Mays", "Colin Firth"), "drama"),
                new Film("The Prestige", "Christopher Nolan", 2006, 8.5, Arrays.asList("Christian Bale", "Hugh Jackman", "Scarlett Johansson", "Michael Caine"), "drama"),
                new Film("American History X", "Tony Kaye", 1998, 8.5, Arrays.asList("Edward Norton", "Edward Furlong", "Beverly D'Angelo", "Jennifer Lien"), "drama"),
                new Film("Cinema Paradiso", "Giuseppe Tornatore", 1988, 8.5, Arrays.asList("Philippe Noiret", "Enzo Cannavale", "Antonella Attili", "Isa Danieli"), "drama"),
                new Film("The Shawshank Redemption", "Frank Darabont", 1994, 9.3, Arrays.asList("Tim Robbins", "Morgan Freeman", "Bob Gunton", "William Sadler"), "drama"),
                new Film("Grave of the Fireflies", "Isao Takahata", 1988, 8.5, Arrays.asList("Tsutomu Tatsumi", "Ayano Shiraishi", "Akemi Yamaguchi", "Yoshiko Shinohara"), "drama"),
                new Film("Anand", "Hrishikesh Mukherjee", 1971, 8.5, Arrays.asList("Rajesh Khanna", "Amitabh Bachchan", "Sumita Sanyal", "Ramesh Deo"), "drama"),
                new Film("Titanic", "James Cameron", 1997, 7.8, Arrays.asList("Leonardo DiCaprio", "Kate Winslet", "Billy Zane"), "drama"),
                new Film("Casablanca", "Michael Curtiz", 1942, 8.5, Arrays.asList("Humphrey Bogart", "Ingrid Bergman", "Paul Henreid", "Claude Rains"), "drama"),
                new Film("Capernaum", "Nadine Labaki", 2018, 8.4, Arrays.asList("Zain Al Rafeea", "Yordanos Shiferaw", "Boluwatife Treasure Bankole", "Kawsar Al Haddad"), "drama"),
                new Film("Your Name", "Makoto Shinkai", 2016, 8.4, Arrays.asList("Ryûnosuke Kamiki", "Mone Kamishiraishi", "Ryô Narita", "Aoi Yûki"), "drama"),
                new Film("The Lives of Others", "Florian Henckel von Donnersmarck", 2006, 8.4, Arrays.asList("Ulrich Mühe", "Martina Gedeck", "Sebastian Koch", "Ulrich Tukur"), "drama"),
                new Film("The Shining", "Stanley Kubrick", 1980, 8.4, Arrays.asList("Jack Nicholson", "Shelley Duvall", "Danny Lloyd", "Scatman Crothers"), "drama"),
                new Film("Apocalypse Now", "Francis Ford Coppola", 1979, 8.4, Arrays.asList("Martin Sheen", "Marlon Brando", "Robert Duvall", "Frederic Forrest"), "drama"),
                new Film("Paths of Glory", "Stanley Kubrick", 1957, 8.4, Arrays.asList("Kirk Douglas", "Ralph Meeker", "Adolphe Menjou", "George Macready"), "drama"),
                new Film("Sunset Blvd.", "Billy Wilder", 1950, 8.4, Arrays.asList("William Holden", "Gloria Swanson", "Erich von Stroheim", "Nancy Olson"), "drama")));

        comedyList = new ArrayList<>(Arrays.asList(
                new Film("Parasite", "Bong Joon Ho", 2019, 8.6, Arrays.asList("Kang-ho Song, Sun-kyun Lee, Yeo-jeong Jo, Woo-sik Choi".split(", ")), "comedy"),
                new Film("Life Is Beautiful", "Roberto Benigni", 1997, 8.6, Arrays.asList("Roberto Benigni, Nicoletta Braschi, Giorgio Cantarini, Giustino Durano".split(", ")), "comedy"),
                new Film("The Truman Show", "Peter Weir", 1998, 8.1, Arrays.asList("Jim Carrey, Ed Harris, Laura Linney, Noah Emmerich".split(", ")), "comedy"),
                new Film("The Intouchables", "Olivier Nakache", 2011, 8.5, Arrays.asList("François Cluzet, Omar Sy, Anne Le Ny, Audrey Fleurot".split(", ")), "comedy"),
                new Film("Modern Times", "Charles Chaplin", 1936, 8.5, Arrays.asList("Charles Chaplin, Paulette Goddard, Henry Bergman, Tiny Sandford".split(", ")), "comedy"),
                new Film("3 Idiots", "Rajkumar Hirani", 2009, 8.4, Arrays.asList("Aamir Khan, Madhavan, Mona Singh, Sharman Joshi".split(", ")), "comedy"),
                new Film("Dr. Strangelove or..", "Stanley Kubrick", 1964, 8.4, Arrays.asList("Peter Sellers, George C. Scott, Sterling Hayden, Keenan Wynn".split(", ")), "comedy"),
                new Film("The Great Dictator", "Charles Chaplin", 1940, 8.4, Arrays.asList("Charles Chaplin, Paulette Goddard, Jack Oakie, Reginald Gardiner".split(", ")), "comedy"),
                new Film("Amélie", "Jean-Pierre Jeunet", 2001, 8.3, Arrays.asList("Audrey Tautou, Mathieu Kassovitz, Rufus, Lorella Cravotta".split(", ")), "comedy"),
                new Film("Snatch", "Guy Ritchie", 2000, 8.3, Arrays.asList("Jason Statham, Brad Pitt, Benicio Del Toro, Dennis Farina".split(", ")), "comedy"),
                new Film("The Sting", "George Roy Hill", 1973, 8.3, Arrays.asList("Paul Newman, Robert Redford, Robert Shaw, Charles Durning".split(", ")), "comedy"),
                new Film("The Big Lebowski", "Joel Coen", 1998, 8.1, Arrays.asList("Jeff Bridges, John Goodman, Julianne Moore, Steve Buscemi".split(", ")), "comedy"),
                new Film("The Apartment", "Billy Wilder", 1960, 8.3, Arrays.asList("Jack Lemmon, Shirley MacLaine, Fred MacMurray, Ray Walston".split(", ")), "comedy"),
                new Film("Singin' in the Rain", "Stanley Donen", 1952, 8.3, Arrays.asList("Gene Kelly, Donald O'Connor, Debbie Reynolds, Jean Hagen".split(", ")), "comedy"),
                new Film("The Kid", "Charles Chaplin", 1921, 8.3, Arrays.asList("Charles Chaplin, Edna Purviance, Jackie Coogan, Carl Miller".split(", ")), "comedy"),
                new Film("Three Billboards Outside Ebbing, Missouri", "Martin McDonagh", 2017, 8.2, Arrays.asList("Frances McDormand, Woody Harrelson, Sam Rockwell, Caleb Landry Jones".split(", ")), "comedy"),
                new Film("To Be or Not to Be", "Ernst Lubitsch", 1942, 8.2, Arrays.asList("Carole Lombard, Jack Benny, Robert Stack, Felix Bressart".split(", ")), "comedy"),
                new Film("City Lights", "Charles Chaplin", 1931, 8.5, Arrays.asList("Charles Chaplin, Virginia Cherrill, Florence Lee, Harry Myers".split(", ")), "comedy"),
                new Film("Wild Tales", "Damián Szifron", 2014, 8.1, Arrays.asList("Darío Grandinetti, María Marull, Mónica Villa, Diego Starosta".split(", ")), "comedy"),
                new Film("The Grand Budapest Hotel", "Wes Anderson", 2014, 8.1, Arrays.asList("Ralph Fiennes, F. Murray Abraham, Mathieu Amalric, Adrien Brody".split(", ")), "comedy"),
                new Film("Mary and Max", "Adam Elliot", 2009, 8.1, Arrays.asList("Toni Collette, Philip Seymour Hoffman, Eric Bana, Barry Humphries".split(", ")), "comedy"),
                new Film("Munna Bhai M.B.B.S.", "Rajkumar Hirani", 2003, 8.1, Arrays.asList("Sanjay Dutt, Arshad Warsi, Gracy Singh, Sunil Dutt".split(", ")), "comedy"),
                new Film("Dead Poets Society", "Peter Weir", 1989, 8.1, Arrays.asList("Robin Williams, Robert Sean Leonard, Ethan Hawke, Josh Charles".split(", ")), "comedy")));

        crimeList = new ArrayList<>(Arrays.asList(
                new Film("The Departed", "Martin Scorsese", 2006, 8.5, Arrays.asList("Leonardo DiCaprio, Matt Damon, Jack Nicholson, Mark Wahlberg".split(", ")), "crime"),
                new Film("12 Angry Men", "Sidney Lumet", 1957, 8.9, Arrays.asList("Henry Fonda, Lee J. Cobb, Martin Balsam, John Fiedler".split(", ")), "crime"),
                new Film("Pulp Fiction", "Quentin Tarantino", 1994, 8.9, Arrays.asList("John Travolta, Uma Thurman, Samuel L. Jackson, Bruce Willis".split(", ")), "crime"),
                new Film("City of God", "Fernando Meirelles", 2002, 8.6, Arrays.asList("Alexandre Rodrigues, Leandro Firmino, Matheus Nachtergaele, Phellipe Haagensen".split(", ")), "crime"),
                new Film("The Usual Suspects", "Bryan Singer", 1995, 8.5, Arrays.asList("Kevin Spacey, Gabriel Byrne, Chazz Palminteri, Stephen Baldwin".split(", ")), "crime"),
                new Film("Joker", "Todd Phillips", 2019, 8.5, Arrays.asList("Joaquin Phoenix, Robert De Niro, Zazie Beetz, Frances Conroy".split(", ")), "crime"),
                new Film("Se7en", "David Fincher", 1995, 8.6, Arrays.asList("Morgan Freeman, Brad Pitt, Kevin Spacey, Andrew Kevin Walker".split(", ")), "crime"),
                new Film("Once Upon a Time in America", "Sergio Leone", 1984, 8.4, Arrays.asList("Robert De Niro, James Woods, Elizabeth McGovern, Treat Williams".split(", ")), "crime"),
                new Film("High and Low", "Akira Kurosawa", 1963, 8.4, Arrays.asList("Toshirô Mifune, Yutaka Sada, Tatsuya Nakadai, Kyôko Kagawa".split(", ")), "crime"),
                new Film("The Green Mile", "Frank Darabont", 1999, 8.6, Arrays.asList("Tom Hanks, Michael Clarke Duncan, David Morse, Bonnie Hunt".split(", ")), "crime"),
                new Film("Witness for the Prosecution", "Billy Wilder", 1957, 8.4, Arrays.asList("Tyrone Power, Marlene Dietrich, Charles Laughton, Elsa Lanchester".split(", ")), "crime"),
                new Film("The Godfather", "Francis Ford Coppola", 1972, 9.2, Arrays.asList("Marlon Brando, Al Pacino, James Caan, Diane Keaton".split(", ")), "crime"),
                new Film("Andhadhun", "Sriram Raghavan", 2018, 8.3, Arrays.asList("Ayushmann Khurrana, Tabu, Radhika Apte, Anil Dhawan".split(", ")), "crime"),
                new Film("The Bandit", "Yavuz Turgul", 1996, 8.3, Arrays.asList("Sener Sen, Ugur Yücel, Sermin Hürmeriç, Yesim Salkim".split(", ")), "crime"),
                new Film("The Silence of the Lambs", "Jonathan Demme", 1991, 8.6, Arrays.asList("Jodie Foster, Anthony Hopkins, Lawrence A. Bonney, Kasi Lemmons".split(", ")), "crime"),
                new Film("Reservoir Dogs", "Quentin Tarantino", 1992, 8.3, Arrays.asList("Harvey Keitel, Tim Roth, Michael Madsen, Chris Penn".split(", ")), "crime"),
                new Film("Scarface", "Brian De Palma", 1983, 8.3, Arrays.asList("Al Pacino, Michelle Pfeiffer, Steven Bauer, Mary Elizabeth Mastrantonio".split(", ")), "crime"),
                new Film("Taxi Driver", "Martin Scorsese", 1976, 8.3, Arrays.asList("Robert De Niro, Jodie Foster, Cybill Shepherd, Albert Brooks".split(", ")), "crime"),
                new Film("A Clockwork Orange", "Stanley Kubrick", 1971, 8.3, Arrays.asList("Malcolm McDowell, Patrick Magee, Michael Bates, Warren Clarke".split(", ")), "crime"),
                new Film("Double Indemnity", "Billy Wilder", 1944, 8.3, Arrays.asList("Fred MacMurray, Barbara Stanwyck, Edward G. Robinson, Byron Barr".split(", ")), "crime"),
                new Film("M", "Fritz Lang", 1931, 8.3, Arrays.asList("Peter Lorre, Ellen Widmann, Inge Landgut, Otto Wernicke".split(", ")), "crime"),
                new Film("Drishyam", "Nishikant Kamat", 2015, 8.2, Arrays.asList("Ajay Devgn, Shriya Saran, Tabu, Rajat Kapoor".split(", ")), "crime"),
                new Film("L.A. Confidential", "Curtis Hanson", 1997, 8.2, Arrays.asList("Kevin Spacey, Russell Crowe, Guy Pearce, Kim Basinger".split(", ")), "crime")));

        fantasyList = new ArrayList<>(Arrays.asList(
                new Film("The Old Guard", "Gina Prince-Bythewood", 2020, 6.7, Arrays.asList("Charlize Theron, KiKi Layne, Matthias Schoenaerts, Marwan Kenzari".split(", ")), "fantasy"),
                new Film("Black Is King", "Emmanuel Adjei", 2020, 5.4, Arrays.asList("Folajomi 'FJ' Akinmurele, Aweng Ade-Chuol, Isaak Adoyi, Adut Akech".split(", ")), "fantasy"),
                new Film("Palm Springs", "Max Barbakow", 2020, 7.5, Arrays.asList("Andy Samberg, Cristin Milioti, J.K. Simmons, Peter Gallagher".split(", ")), "fantasy"),
                new Film("Twilight", "Catherine Hardwicke", 2008, 5.2, Arrays.asList("Kristen Stewart, Robert Pattinson, Billy Burke, Sarah Clarke".split(", ")), "fantasy"),
                new Film("Thor: Ragnarok", "Taika Waititi", 2017, 7.9, Arrays.asList("Chris Hemsworth, Tom Hiddleston, Cate Blanchett, Mark Ruffalo".split(", ")), "fantasy"),
                new Film("Coma", "Nikita Argunov", 2019, 6.3, Arrays.asList("Rinal Mukhametov, Lyubov Aksyonova, Anton Pampushnyy, Milos Bikovic".split(", ")), "fantasy"),
                new Film("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", 2001, 8.8, Arrays.asList("Elijah Wood, Ian McKellen, Orlando Bloom, Sean Bean".split(", ")), "fantasy"),
                new Film("Scott Pilgrim vs. the World", "Edgar Wright", 2010, 7.5, Arrays.asList("Michael Cera, Mary Elizabeth Winstead, Kieran Culkin, Anna Kendrick".split(", ")), "fantasy"),
                new Film("The Mask", "Chuck Russell", 1994, 6.9, Arrays.asList("Jim Carrey, Cameron Diaz, Peter Riegert, Peter Greene".split(", ")), "fantasy"),
                new Film("Beetlejuice", "Tim Burton", 1988, 7.5, Arrays.asList("Alec Baldwin, Geena Davis, Michael Keaton, Annie McEnroe".split(", ")), "fantasy"),
                new Film("The Princess Bride", "Rob Reiner", 1987, 8.1, Arrays.asList("Cary Elwes, Mandy Patinkin, Robin Wright, Chris Sarandon".split(", ")), "fantasy"),
                new Film("Ghostbusters", "Ivan Reitman", 1984, 7.8, Arrays.asList(" Bill Murray, Dan Aykroyd, Sigourney Weaver, Harold Ramis".split(", ")), "fantasy"),
                new Film("Suicide Squad", "David Ayer", 2016, 6.0, Arrays.asList(" Will Smith, Jared Leto, Margot Robbie, Viola Davis".split(", ")), "fantasy"),
                new Film("Pirates of the Caribbean: The Curse of the Black Pearl", "Gore Verbinski", 2003, 8.0, Arrays.asList("Johnny Depp, Geoffrey Rush, Orlando Bloom, Keira Knightley".split(", ")), "fantasy"),
                new Film("Harry Potter and the Goblet of Fire", "Mike Newell", 2005, 7.7, Arrays.asList("Daniel Radcliffe, Emma Watson, Rupert Grint, Eric Sykes".split(", ")), "fantasy"),
                new Film("Avatar", "James Cameron", 2009, 7.8, Arrays.asList("Sam Worthington, Zoe Saldana, Sigourney Weaver, Michelle Rodriguez".split(", ")), "fantasy"),
                new Film("The NeverEnding Story", "Wolfgang Petersen", 1984, 7.4, Arrays.asList("Noah Hathaway, Barret Oliver, Tami Stronach, Gerald McRaney".split(", ")), "fantasy"),
                new Film("Gods of Egypt", "Alex Proyas", 2016, 5.5, Arrays.asList("Brenton Thwaites, Nikolaj Coster-Waldau, Gerard Butler, Chadwick Boseman".split(", ")), "fantasy"),
                new Film("The Mortal Instruments: City of Bones", "Harald Zwart", 2013, 5.9, Arrays.asList("Lily Collins, Jamie Campbell Bower, Robert Sheehan, Jemima West".split(", ")), "fantasy"),
                new Film("Pinocchio", "Matteo Garrone", 2019, 6.3, Arrays.asList("Federico Ielapi, Roberto Benigni, Rocco Papaleo, Massimo Ceccherini".split(", ")), "fantasy"),
                new Film("Toy Story 4", "Josh Cooley", 2019, 7.8, Arrays.asList("Tom Hanks, Tim Allen, Annie Potts, Tony Hale".split(", ")), "fantasy"),
                new Film("Charlie and the Chocolate Factory", "Tim Burton", 2005, 6.6, Arrays.asList("Johnny Depp, Freddie Highmore, David Kelly, Helena Bonham Carter".split(", ")), "fantasy"),
                new Film("Midnight in Paris", "Woody Allen", 2011, 7.7, Arrays.asList("Owen Wilson, Rachel McAdams, Kathy Bates, Kurt Fuller".split(", ")), "fantasy")));

        horrorList = new ArrayList<>(Arrays.asList(
                new Film("The Wailing", "Hong-jin Na", 2016, 7.4, Arrays.asList("Jun Kunimura, Jung-min Hwang, Do-won Kwak, Woo-hee Chun".split(", ")), "horror"),
                new Film("Let the Right One In", "Tomas Alfredson", 2008, 7.9, Arrays.asList("Kåre Hedebrant, Lina Leandersson, Per Ragnar, Henrik Dahl".split(", ")), "horror"),
                new Film("The Conjuring", "James Wan", 2013, 7.5, Arrays.asList("Patrick Wilson, Vera Farmiga, Ron Livingston, Lili Taylor".split(", ")), "horror"),
                new Film("Pitch Black", "David Twohy", 2000, 7.1, Arrays.asList("Radha Mitchell, Cole Hauser, Vin Diesel, Keith David".split(", ")), "horror"),
                new Film("A Quiet Place", "John Krasinski", 2018, 7.5, Arrays.asList("Emily Blunt, John Krasinski, Millicent Simmonds, Noah Jupe".split(", ")), "horror"),
                new Film("The Witch", "Robert Eggers", 2015, 6.9, Arrays.asList("Anya Taylor-Joy, Ralph Ineson, Kate Dickie, Julian Richings".split(", ")), "horror"),
                new Film("The Descent", "Neil Marshall", 2005, 7.2, Arrays.asList("Shauna Macdonald, Natalie Mendoza, Alex Reid, Saskia Mulder".split(", ")), "horror"),
                new Film("It Follows", "David Robert Mitchell", 2014, 6.8, Arrays.asList("Maika Monroe, Keir Gilchrist, Olivia Luccardi, Lili Sepe".split(", ")), "horror"),
                new Film("Saw", "James Wan", 2004, 7.6, Arrays.asList("Cary Elwes, Leigh Whannell, Danny Glover, Ken Leung".split(", ")), "horror"),
                new Film("Eden Lake", "James Watkins", 2008, 6.8, Arrays.asList("Kelly Reilly, Michael Fassbender, Tara Ellis, Jack O'Connell".split(", ")), "horror"),
                new Film("Split", "M. Night Shyamalan", 2016, 7.3, Arrays.asList("James McAvoy, Anya Taylor-Joy, Haley Lu Richardson, Jessica Sula".split(", ")), "horror"),
                new Film("The Devil's Rejects", "Rob Zombie", 2005, 6.8, Arrays.asList("Sid Haig, Sheri Moon Zombie, Bill Moseley, William Forsythe".split(", ")), "horror"),
                new Film("Trollhunter", "André Øvredal", 2010, 7, Arrays.asList("Otto Jespersen, Robert Stoltenberg, Knut Nærum, Glenn Erland Tosterud".split(", ")), "horror"),
                new Film("Shutter", "Banjong Pisanthanakun", 2004, 7.1, Arrays.asList("Ananda Everingham, Natthaweeranuch Thongmee, Achita Sikamana, Unnop Chanpaibool".split(", ")), "horror"),
                new Film("It", "Andy Muschietti", 2017, 7.3, Arrays.asList("Bill Skarsgård, Jaeden Martell, Finn Wolfhard, Sophia Lillis".split(", ")), "horror"),
                new Film("The Others", "Alejandro Amenábar", 2001, 7.6, Arrays.asList("Nicole Kidman, Christopher Eccleston, Fionnula Flanagan, Alakina Mann".split(", ")), "horror"),
                new Film("Drag Me to Hell", "Sam Raimi", 2009, 6.5, Arrays.asList("Alison Lohman, Justin Long, Ruth Livier, Lorna Raver".split(", ")), "horror"),
                new Film("Silent Hill", "Christophe Gans", 2006, 6.5, Arrays.asList("Radha Mitchell, Laurie Holden, Sean Bean, Deborah Kara Unger".split(", ")), "horror"),
                new Film("1408", "Mikael Håfström", 2007, 6.8, Arrays.asList("John Cusack, Samuel L. Jackson, Mary McCormack, Tony Shalhoub".split(", ")), "horror"),
                new Film("Pulse", "Kiyoshi Kurosawa", 2001, 6.5, Arrays.asList("Haruhiko Katô, Kumiko Asô, Koyuki, Kurume Arisaka".split(", ")), "horror"),
                new Film("The Autopsy of Jane Doe", "André Øvredal", 2016, 6.8, Arrays.asList("Brian Cox, Emile Hirsch, Ophelia Lovibond, Michael McElhatton".split(", ")), "horror"),
                new Film("Baskin", "Can Evrenol", 2015, 5.8, Arrays.asList("Mehmet Cerrahoglu, Görkem Kasal, Ergun Kuyucu, Muharrem Bayrak".split(", ")), "horror")));

        historicalList = new ArrayList<>(Arrays.asList(
                new Film("Greyhound", "Aaron Schneider", 2020, 7.1, Arrays.asList("Tom Hanks, Elisabeth Shue, Stephen Graham, Matt Helm".split(", ")), "historical"),
                new Film("The Outpost", "Rod Lurie", 2020, 6.7, Arrays.asList(" Scott Eastwood, Caleb Landry Jones, Orlando Bloom, Jack Kesy".split(", ")), "historical"),
                new Film("Tombstone", "George P. Cosmatos", 1993, 7.8, Arrays.asList("Kurt Russell, Val Kilmer, Sam Elliott, Bill Paxton".split(", ")), "historical"),
                new Film("Schindler's List", "Steven Spielberg", 1993, 8.9, Arrays.asList("Liam Neeson, Ralph Fiennes, Ben Kingsley, Caroline Goodall".split(", ")), "historical"),
                new Film("Troy", "Wolfgang Petersen", 2004, 7.2, Arrays.asList("Brad Pitt, Eric Bana, Orlando Bloom, Julian Glover".split(", ")), "historical"),
                new Film("The King", "David Michôd", 2019, 7.2, Arrays.asList("Tom Glynn-Carney, Gábor Czap, Tom Fisher, Edward Ashley".split(", ")), "historical"),
                new Film("Braveheart", "1995", 1995, 8.3, Arrays.asList("Mel Gibson, Sophie Marceau, Patrick McGoohan, Angus Macfadyen".split(", ")), "historical"),
                new Film("The Big Short", "Adam McKay", 2015, 7.8, Arrays.asList("Christian Bale, Steve Carell, Ryan Gosling, Brad Pitt".split(", ")), "historical"),
                new Film("Gone with the Wind", "Victor Fleming", 1939, 8.1, Arrays.asList("Clark Gable, Vivien Leigh, Thomas Mitchell, Barbara O'Neil".split(", ")), "historical"),
                new Film("The Great Escape", "John Sturges", 1963, 8.2, Arrays.asList("Steve McQueen, James Garner, Richard Attenborough, Charles Bronson".split(", ")), "historical"),
                new Film("12 Years a Slave", "Steve McQueen", 2013, 8.1, Arrays.asList("Chiwetel Ejiofor, Michael Kenneth Williams, Michael Fassbender, Brad Pitt".split(", ")), "historical"),
                new Film("The Favourite", "Yorgos Lanthimos", 2018, 7.5, Arrays.asList("Olivia Colman, Emma Stone, Rachel Weisz, Nicholas Hoult".split(", ")), "historical"),
                new Film("The Patriot", "Roland Emmerich", 2000, 7.2, Arrays.asList("Mel Gibson, Heath Ledger, Joely Richardson, Jason Isaacs".split(", ")), "historical"),
                new Film("First Man", "Damien Chazelle", 2018, 7.3, Arrays.asList("Ryan Gosling, Claire Foy, Jason Clarke, Kyle Chandler".split(", ")), "historical"),
                new Film("Public Enemies", "Michael Mann", 2009, 7.0, Arrays.asList("Christian Bale, Johnny Depp, Christian Stolte, Jason Clarke".split(", ")), "historical"),
                new Film("Judy", "Rupert Goold", 2019, 6.9, Arrays.asList("Renée Zellweger, Jessie Buckley, Finn Wittrock, Rufus Sewell".split(", ")), "historical"),
                new Film("The Assassination of Jesse James by the Coward Robert Ford", "Andrew Dominik", 2007, 7.5, Arrays.asList("Brad Pitt, Casey Affleck, Sam Shepard, Mary-Louise Parker".split(", ")), "historical"),
                new Film("Amadeus", "Milos Forman", 1984, 8.3, Arrays.asList("F. Murray Abraham, Tom Hulce, Elizabeth Berridge, Roy Dotrice".split(", ")), "historical"),
                new Film("Downfall", "Oliver Hirschbiegel", 2004, 8.2, Arrays.asList("Bruno Ganz, Alexandra Maria Lara, Ulrich Matthes, Juliane Köhler".split(", ")), "historical"),
                new Film("Lawrence of Arabia", "David Lean", 1962, 8.3, Arrays.asList("Peter O'Toole, Alec Guinness, Anthony Quinn, Jack Hawkins".split(", ")), "historical"),
                new Film("The Current War: Director's Cut", "Alfonso Gomez-Rejon", 2017, 6.5, Arrays.asList("Benedict Cumberbatch, Oliver Powell, Sophia Ally, Tuppence Middleton".split(", ")), "historical"),
                new Film("Mary Queen of Scots", "Josie Rourke", 2018, 6.3, Arrays.asList("Saoirse Ronan, Margot Robbie, Jack Lowden, Joe Alwyn".split(", ")), "historical"),
                new Film("The King's Speech", "Tom Hooper", 2010, 8.0, Arrays.asList("Colin Firth, Geoffrey Rush, Helena Bonham Carter, Derek Jacobi".split(", ")), "historical")));

        mysteryList = new ArrayList<>(Arrays.asList(
                new Film("Rear Window", "Alfred Hitchcock", 1954, 8.4, Arrays.asList("James Stewart, Grace Kelly, Wendell Corey, Thelma Ritter".split(", ")), "mystery"),
                new Film("Shutter Island", "Martin Scorsese", 2010, 8.2, Arrays.asList("Leonardo DiCaprio, Emily Mortimer, Mark Ruffalo, Ben Kingsley".split(", ")), "mystery"),
                new Film("The Invisible Guest", "Oriol Paulo", 2016, 8.1, Arrays.asList("Mario Casas, Ana Wagener, Jose Coronado, Bárbara Lennie".split(", ")), "mystery"),
                new Film("Memento", "Christopher Nolan", 2000, 8.4, Arrays.asList("Guy Pearce, Carrie-Anne Moss, Joe Pantoliano, Mark Boone Junior".split(", ")), "mystery"),
                new Film("Gone Girl", "David Fincher", 2014, 8.1, Arrays.asList("Ben Affleck, Rosamund Pike, Neil Patrick Harris, Tyler Perry".split(", ")), "mystery"),
                new Film("Prisoners", "Denis Villeneuve", 2013, 8.1, Arrays.asList("Hugh Jackman, Jake Gyllenhaal, Viola Davis, Melissa Leo".split(", ")), "mystery"),
                new Film("12 Monkeys", "Terry Gilliam", 1995, 8.0, Arrays.asList("Bruce Willis, Madeleine Stowe, Brad Pitt, Joseph Melito".split(", ")), "mystery"),
                new Film("Memories of Murder", "Bong Joon Ho", 2003, 8.1, Arrays.asList("Kang-ho Song, Sang-kyung Kim, Roe-ha Kim, Jae-ho Song".split(", ")), "mystery"),
                new Film("The Sixth Sense", "M. Night Shyamalan", 1999, 8.1, Arrays.asList("Bruce Willis, Haley Joel Osment, Toni Collette, Olivia Williams".split(", ")), "mystery"),
                new Film("Vertigo", "Alfred Hitchcock", 1958, 8.3, Arrays.asList("James Stewart, Kim Novak, Barbara Bel Geddes, Tom Helmore".split(", ")), "mystery"),
                new Film("Three Colors: Red", "Krzysztof Kieslowski", 1994, 8.1, Arrays.asList("Irène Jacob, Jean-Louis Trintignant, Frédérique Feder, Jean-Pierre Lorit".split(", ")), "mystery"),
                new Film("The Thing", "John Carpenter", 1982, 8.1, Arrays.asList("Kurt Russell, Wilford Brimley, Keith David, Richard Masur".split(", ")), "mystery"),
                new Film("Solaris", "Andrei Tarkovsky", 1972, 8.1, Arrays.asList("Natalya Bondarchuk, Donatas Banionis, Jüri Järvet, Vladislav Dvorzhetskiy".split(", ")), "mystery"),
                new Film("The Third Man", "Carol Reed", 1949, 8.1, Arrays.asList("Orson Welles, Joseph Cotten, Alida Valli, Trevor Howard".split(", ")), "mystery"),
                new Film("Blade Runner 2049", "Denis Villeneuve", 2017, 8.0, Arrays.asList("Harrison Ford, Ryan Gosling, Ana de Armas, Dave Bautista".split(", ")), "mystery"),
                new Film("About Elly", "Asghar Farhadi", 2009, 8.0, Arrays.asList("Golshifteh Farahani, Shahab Hosseini, Taraneh Alidoosti, Merila Zare'i".split(", ")), "mystery"),
                new Film("The Bourne Ultimatum", "Paul Greengrass", 2007, 8.0, Arrays.asList("Matt Damon, Edgar Ramírez, Joan Allen, Julia Stiles".split(", ")), "mystery"),
                new Film("Donnie Darko", "Richard Kelly", 2001, 8.0, Arrays.asList("Jake Gyllenhaal, Jena Malone, Mary McDonnell, Holmes Osborne".split(", ")), "mystery"),
                new Film("The Secret in Their Eyes", "Juan José Campanella", 2009, 8.2, Arrays.asList("Ricardo Darín, Soledad Villamil, Pablo Rago, Carla Quevedo".split(", ")), "mystery"),
                new Film("Mulholland Drive", "David Lynch", 2001, 8.0, Arrays.asList("Naomi Watts, Laura Harring, Justin Theroux, Jeanne Bates".split(", ")), "mystery"),
                new Film("Talvar", "Meghna Gulzar", 2015, 8.2, Arrays.asList("Irrfan Khan, Konkona Sen Sharma, Neeraj Kabi, Sohum Shah".split(", ")), "mystery"),
                new Film("Sleuth", "Joseph L. Mankiewicz", 1972, 8.0, Arrays.asList("Laurence Olivier, Michael Caine, Alec Cawthorne, John Matthews".split(", ")), "mystery"),
                new Film("Arrival", "Denis Villeneuve", 2016, 7.9, Arrays.asList("Amy Adams, Jeremy Renner, Forest Whitaker, Michael Stuhlbarg".split(", ")), "mystery")));

        philosophicalList = new ArrayList<>(Arrays.asList(
                new Film("Waking Life", "Richard Linklater", 2001, 7.8, Arrays.asList("Ethan Hawke, Trevor Jack Brooks, Lorelei Linklater, Wiley Wiggins".split(", ")), "philosophical"),
                new Film("The Meaning of Life", "Terry Jones", 1983, 7.5, Arrays.asList("John Cleese, Terry Gilliam, Eric Idle, Terry Jones".split(", ")), "philosophical"),
                new Film("Eternal Sunshine of the Spotless Mind", "Michel Gondry", 2004, 8.3, Arrays.asList("Jim Carrey, Kate Winslet, Tom Wilkinson, Gerry Robert Byrne".split(", ")), "philosophical"),
                new Film("Donnie Darko", "Richard Kelly", 2001, 8, Arrays.asList("Jake Gyllenhaal, Jena Malone, Mary McDonnell, Holmes Osborne".split(", ")), "philosophical"),
                new Film("Requiem for a Dream", "Darren Aronofsky", 2000, 8.3, Arrays.asList("Ellen Burstyn, Jared Leto, Jennifer Connelly, Marlon Wayans".split(", ")), "philosophical"),
                new Film("The Man from Earth", "Richard Schenkman", 2007, 7.9, Arrays.asList("David Lee Smith, Tony Todd, John Billingsley, Ellen Crawford".split(", ")), "philosophical"),
                new Film("Another Earth", "Mike Cahill", 2011, 7, Arrays.asList("Brit Marling, William Mapother, Matthew-Lee Erlbach, DJ Flava".split(", ")), "philosophical"),
                new Film("Lost in Translation", "Sofia Coppola", 2003, 7.7, Arrays.asList("Bill Murray, Scarlett Johansson, Giovanni Ribisi, Anna Faris".split(", ")), "philosophical"),
                new Film("The Butterfly Effect", "Eric Bress", 2004, 7.6, Arrays.asList("Ashton Kutcher, Amy Smart, Melora Walters, Elden Henson".split(", ")), "philosophical"),
                new Film("Being There", "Hal Ashby", 1979, 8, Arrays.asList("Peter Sellers, Shirley MacLaine, Melvyn Douglas, Jack Warden".split(", ")), "philosophical"),
                new Film("1984", "Michael Radford", 1984, 7.1, Arrays.asList("John Hurt, Richard Burton, Suzanna Hamilton, Cyril Cusack".split(", ")), "philosophical"),
                new Film("Being John Malkovich", "Spike Jonze", 1999, 7.7, Arrays.asList("John Cusack, Cameron Diaz, Catherine Keener, John Malkovich".split(", ")), "philosophical"),
                new Film("The Place Beyond the Pines", "Derek Cianfrance", 2012, 7.3, Arrays.asList("Ryan Gosling, Bradley Cooper, Eva Mendes, Craig Van Hook".split(", ")), "philosophical"),
                new Film("Garden State", "Zach Braff", 2004, 7.4, Arrays.asList("Zach Braff, Peter Sarsgaard, Natalie Portman, Ian Holm".split(", ")), "philosophical"),
                new Film("The Fountain", "Darren Aronofsky", 2006, 7.2, Arrays.asList("Hugh Jackman, Rachel Weisz, Sean Patrick Thomas, Ellen Burstyn".split(", ")), "philosophical"),
                new Film("A Scanner Darkly", "Richard Linklater", 2006, 7.1, Arrays.asList("Keanu Reeves, Winona Ryder, Robert Downey Jr., Rory Cochrane".split(", ")), "philosophical"),
                new Film("Detachment", "Tony Kaye", 2011, 7.7, Arrays.asList("Adrien Brody, Christina Hendricks, Marcia Gay Harden, Lucy Liu".split(", ")), "philosophical"),
                new Film("Stranger Than Fiction", "Marc Forster", 2006, 7.5, Arrays.asList("Will Ferrell, Emma Thompson, Dustin Hoffman, Queen Latifah".split(", ")), "philosophical"),
                new Film("An Interview with God", "Perry Lang", 2018, 5.7, Arrays.asList("Brenton Thwaites, David Strathairn, Yael Grobglas".split(", ")), "philosophical"),
                new Film("The Seventh Seal", "Ingmar Bergman", 1957, 8.2, Arrays.asList("Max von Sydow, Gunnar Björnstrand, Bengt Ekerot, Nils Poppe".split(", ")), "philosophical"),
                new Film("American Beauty", "Sam Mendes", 1999, 8.3, Arrays.asList("Kevin Spacey, Annette Bening, Thora Birch, Wes Bentley".split(", ")), "philosophical"),
                new Film("Punch-Drunk Love", "Paul Thomas Anderson", 2002, 7.3, Arrays.asList("Adam Sandler, Emily Watson, Philip Seymour Hoffman, Jason Andrews".split(", ")), "philosophical"),
                new Film("The Box", "Richard Kelly", 2009, 5.6, Arrays.asList("Cameron Diaz, James Marsden, Frank Langella, James Rebhorn".split(", ")), "philosophical")));

        romanceList = new ArrayList<>(Arrays.asList(
                new Film("Dil Bechara", "Mukesh Chhabra", 2020, 8.9, Arrays.asList("Sushant Singh Rajput, Sanjana Sanghi, Sahil Vaid, Saswata Chatterjee".split(", ")), "romance"),
                new Film("Modern Times", "Charles Chaplin", 1936, 8.5, Arrays.asList("Charles Chaplin, Paulette Goddard, Henry Bergman, Tiny Sandford".split(", ")), "romance"),
                new Film("Good Will Hunting", "Gus Van Sant", 1997, 8.3, Arrays.asList("Robin Williams, Matt Damon, Ben Affleck, Stellan Skarsgård".split(", ")), "romance"),
                new Film("Singin' in the Rain", "Stanley Donen", 1952, 8.3, Arrays.asList("Gene Kelly, Donald O'Connor, Debbie Reynolds, Jean Hagen".split(", ")), "romance"),
                new Film("A Silent Voice: The Movie", "Naoko Yamada", 2016, 8.2, Arrays.asList("Miyu Irino, Saori Hayami, Aoi Yûki, Kenshô Ono".split(", ")), "romance"),
                new Film("The Secret in Their Eyes", "Juan José Campanella", 2009, 8.2, Arrays.asList("Ricardo Darín, Soledad Villamil, Pablo Rago, Carla Quevedo".split(", ")), "romance"),
                new Film("Portrait of a Lady on Fire", "Céline Sciamma", 2019, 8.1, Arrays.asList("Noémie Merlant, Adèle Haenel, Luàna Bajrami, Valeria Golino".split(", ")), "romance"),
                new Film("The Handmaiden", "Chan-wook Park", 2016, 8.1, Arrays.asList("Min-hee Kim, Jung-woo Ha, Jin-woong Cho, So-Ri Moon".split(", ")), "romance"),
                new Film("The Legend of 1900", "Giuseppe Tornatore", 1998, 8.1, Arrays.asList("Tim Roth, Pruitt Taylor Vince, Mélanie Thierry, Bill Nunn".split(", ")), "romance"),
                new Film("In the Mood for Love", "Kar-Wai Wong", 2000, 8.1, Arrays.asList("Tony Chiu-Wai Leung, Maggie Cheung, Ping Lam Siu, Tung Cho 'Joe' Cheung".split(", ")), "romance"),
                new Film("Before Sunrise", "Richard Linklater", 1995, 8.1, Arrays.asList("Ethan Hawke, Julie Delpy, Andrea Eckert, Hanno Pöschl".split(", ")), "romance"),
                new Film("The Princess Bride", "Rob Reiner", 1987, 8.1, Arrays.asList("Cary Elwes, Mandy Patinkin, Robin Wright, Chris Sarandon".split(", ")), "romance"),
                new Film("The Red Shoes", "Michael Powell", 1948, 8.1, Arrays.asList("Anton Walbrook, Marius Goring, Moira Shearer, Robert Helpmann".split(", ")), "romance"),
                new Film("City Lights", "Charles Chaplin", 1931, 8.5, Arrays.asList("Charles Chaplin, Virginia Cherrill, Florence Lee, Harry Myers".split(", ")), "romance"),
                new Film("Gone with the Wind", "Victor Fleming", 1939, 8.1, Arrays.asList("Clark Gable, Vivien Leigh, Thomas Mitchell, Barbara O'Neil".split(", ")), "romance"),
                new Film("It Happened One Night", "Frank Capra",1934, 8.1, Arrays.asList("Clark Gable, Claudette Colbert, Walter Connolly, Roscoe Karns".split(", ")), "romance"),
                new Film("Some Like It Hot", "Billy Wilder", 1959, 8.2, Arrays.asList("Marilyn Monroe, Tony Curtis, Jack Lemmon, George Raft".split(", ")), "romance"),
                new Film("Marriage Story", "Noah Baumbach", 2019, 8.0, Arrays.asList(" Adam Driver, Scarlett Johansson, Julia Greer, Azhy Robertson".split(", ")), "romance"),
                new Film("La La Land", "Damien Chazelle", 2016, 8.0, Arrays.asList("Ryan Gosling, Emma Stone, Rosemarie DeWitt, J.K. Simmons".split(", ")), "romance"),
                new Film("Her", "Spike Jonze", 2013, 8.0, Arrays.asList("Joaquin Phoenix, Amy Adams, Scarlett Johansson, Rooney Mara".split(", ")), "romance"),
                new Film("Dev.D", "Anurag Kashyap", 2009, 8.0, Arrays.asList("Abhay Deol, Mahie Gill, Kalki Koechlin, Dibyendu Bhattacharya".split(", ")), "romance"),
                new Film("3-Iron", "Ki-duk Kim", 2004, 8.0, Arrays.asList("Seung-Yun Lee, Hee Jae, Hyuk-ho Kwon, Jeong-ho Choi".split(", ")), "romance"),
                new Film("Before Sunset", "Richard Linklater", 2004, 8.0, Arrays.asList("Ethan Hawke, Julie Delpy, Vernon Dobtcheff, Louise Lemoine Torrès".split(", ")), "romance")));

        satireList = new ArrayList<>(Arrays.asList(
                new Film("Jojo Rabbit", "Taika Waititi", 2019, 7.9, Arrays.asList("Roman Griffin Davis, Thomasin McKenzie, Scarlett Johansson, Taika Waititi".split(", ")), "satire"),
                new Film("Ready or Not", "Matt Bettinelli-Olpin", 2019, 6.8, Arrays.asList("Samara Weaving, Adam Brody, Mark O'Brien, Henry Czerny".split(", ")), "satire"),
                new Film("Deadpool", "Tim Miller", 2016, 8.0, Arrays.asList("Ryan Reynolds, Morena Baccarin, T.J. Miller, Ed Skrein".split(", ")), "satire"),
                new Film("Dodgeball", "Rawson Marshall Thurber", 2004, 6.7, Arrays.asList("Ben Stiller, Christine Taylor, Vince Vaughn, Rip Torn".split(", ")), "satire"),
                new Film("American Psycho", "Mary Harron", 2000, 7.6, Arrays.asList("Christian Bale, Justin Theroux, Josh Lucas, Bill Sage".split(", ")), "satire"),
                new Film("Game Night", "John Francis Daley", 2018, 6.9, Arrays.asList("Jason Bateman, Rachel McAdams, Kyle Chandler, Sharon Horgan".split(", ")), "satire"),
                new Film("Coming to America", "John Landis", 1988, 7.0, Arrays.asList("Eddie Murphy, Paul Bates, Garcelle Beauvais, Feather".split(", ")), "satire"),
                new Film("Vice", "Adam McKay", 2018, 7.2, Arrays.asList(" Christian Bale, Amy Adams, Steve Carell, Sam Rockwell".split(", ")), "satire"),
                new Film("Galaxy Quest", "Dean Parisot", 1999, 7.3, Arrays.asList("Tim Allen, Sigourney Weaver, Alan Rickman, Tony Shalhoub".split(", ")), "satire"),
                new Film("Shrek", "Andrew Adamson", 2001, 7.8, Arrays.asList("Mike Myers, Eddie Murphy, Cameron Diaz, John Lithgow".split(", ")), "satire"),
                new Film("Men in Black", "Barry Sonnenfeld", 1997, 7.3, Arrays.asList("Tommy Lee Jones, Will Smith, Linda Fiorentino, Vincent D'Onofrio".split(", ")), "satire"),
                new Film("Tropic Thunder", "Ben Stiller", 2008, 7.0, Arrays.asList("Ben Stiller, Jack Black, Robert Downey Jr., Jeff Kahn".split(", ")), "satire"),
                new Film("Sorry to Bother You", "Boots Riley", 2018, 6.9, Arrays.asList("LaKeith Stanfield, Tessa Thompson, Jermaine Fowler, Omari Hardwick".split(", ")), "satire"),
                new Film("The Devil Wears Prada", "David Frankel", 2006, 6.9, Arrays.asList("Anne Hathaway, Meryl Streep, Adrian Grenier, Emily Blunt".split(", ")), "satire"),
                new Film("Blazing Saddles", "Mel Brooks", 1974, 7.7, Arrays.asList("Cleavon Little, Gene Wilder, Slim Pickens, Harvey Korman".split(", ")), "satire"),
                new Film("Mars Attacks!", "Tim Burton", 1996, 6.3, Arrays.asList("Jack Nicholson, Pierce Brosnan, Sarah Jessica Parker, Annette Bening".split(", ")), "satire"),
                new Film("Napoleon Dynamite", "Jared Hess", 2004, 6.9, Arrays.asList("Jon Heder, Efren Ramirez, Jon Gries, Aaron Ruell".split(", ")), "satire"),
                new Film("The Big Lebowski", "Joel Coen", 1998, 8.1, Arrays.asList("Jeff Bridges, John Goodman, Julianne Moore, Steve Buscemi".split(", ")), "satire"),
                new Film("Who Framed Roger Rabbit", "Robert Zemeckis", 1988, 7.7, Arrays.asList("Bob Hoskins, Christopher Lloyd, Joanna Cassidy, Charles Fleischer".split(", ")), "satire"),
                new Film("Heathers", "Michael Lehmann", 1989, 7.2, Arrays.asList("Winona Ryder, Christian Slater, Shannen Doherty, Lisanne Falk".split(", ")), "satire"),
                new Film("The Graduate", "Mike Nichols", 1967, 8.0, Arrays.asList("Dustin Hoffman, Anne Bancroft, Katharine Ross, William Daniels".split(", ")), "satire"),
                new Film("Easy A", "Will Gluck", 2010, 7.0, Arrays.asList("Emma Stone, Amanda Bynes, Penn Badgley, Dan Byrd".split(", ")), "satire"),
                new Film("The World's End", "Edgar Wright", 2013, 7.0, Arrays.asList("Simon Pegg, Nick Frost, Martin Freeman, Rosamund Pike".split(", ")), "satire")));

        socialList = new ArrayList<>(Arrays.asList(
                new Film("The Platform", "Galder Gaztelu-Urrutia", 2019, 7.0, Arrays.asList("Ivan Massagué, Zorion Eguileor, Antonia San Juan, Emilio Buale".split(", ")), "social"),
                new Film("Loving", "Jeff Nichols", 2016, 7.0, Arrays.asList("Ruth Negga, Joel Edgerton, Will Dalton, Dean Mumford".split(", ")), "social"),
                new Film("Prison Song", "Darnell Martin", 2001, 6.2, Arrays.asList("Danny Hoch, Elvis Costello, Q-Tip, Eric McCollum".split(", ")), "social"),
                new Film("Bol", "Shoaib Mansoor", 2011, 8.3, Arrays.asList("Humaima Malik, Manzar Sehbai, Shafqat Cheema, Iman Ali".split(", ")), "social"),
                new Film("The Merchant of Four Seasons", "Rainer Werner Fassbinder", 1972, 7.4, Arrays.asList("Hans Hirschmüller, Irm Hermann, Hanna Schygulla, Klaus Löwitsch".split(", ")), "social"),
                new Film("Damini", "Rajkumar Santoshi", 1993, 7.8, Arrays.asList("Meenakshi Sheshadri, Rishi Kapoor, Sunny Deol, Amrish Puri".split(", ")), "social"),
                new Film("Cotton Wool", "Nicholas Connor", 2017, 8.5, Arrays.asList("Leanne Best, Crissy Rock, Kate Rutter, Max Vento".split(", ")), "social"),
                new Film("96 Minutes", "Aimee Lagos", 2011, 5.7, Arrays.asList("Brittany Snow, Evan Ross, Sharon Conley, Justin Martin".split(", ")), "social"),
                new Film("They Don't Wear Black Tie", "Leon Hirszman", 1981, 8.1, Arrays.asList("Gianfrancesco Guarnieri, Fernanda Montenegro, Carlos Alberto Riccelli, Bete Mendes".split(", ")), "social"),
                new Film("Law and Disorder", "Ivan Passer", 1974, 6.4, Arrays.asList("Carroll O'Connor, Ernest Borgnine, Ann Wedgeworth, Anita Dangler".split(", ")), "social"),
                new Film("Laman", "Maryo J. de los Reyes", 2002, 7.8, Arrays.asList("Albert Martinez, Elizabeth Oropesa, Yul Servo, Lolita De Leon".split(", ")), "social"),
                new Film("Daybreak", "Gentian Koçi", 2017, 6.7, Arrays.asList("Ornela Kapetani, Suzana Prifti, Kasem Hoxha, Hermes Kasimati".split(", ")), "social"),
                new Film("Five Pillars", "Jon Rosling", 2015, 6.6, Arrays.asList("Tom Bott, Aaron Jeffcoate, Adam Probets, Charlie Glossop".split(", ")), "social"),
                new Film("The Way Out", "Petr Václav", 2014, 6.4, Arrays.asList("Klaudia Dudová, David Istok, Milan Cifra, Zdenek Godla".split(", ")), "social"),
                new Film("To Stay Alive", "Dariush Mehrjui", 2002, 6.5, Arrays.asList("Neda Aghaei, Masoumeh Bakhshi, Mohammad Habibian, Ghader Heydari".split(", ")), "social"),
                new Film("Innocents", "Peter Kosminsky", 2000, 7.0, Arrays.asList("Tim Pigott-Smith, Emma Cunniffe, Aden Gillett, Madhav Sharma".split(", ")), "social"),
                new Film("Night Shadows", "Nasser Bakhti", 2006, 7.1, Arrays.asList("Hicham Alhayat, Gaspard Boesch, Diarra Damanta, Martin Huber".split(", ")), "social"),
                new Film("Breaking Bad", "Vince Gilligan", 2008, 9.5, Arrays.asList("Bryan Cranston, Aaron Paul, Anna Gunn, Betsy Brandt".split(", ")), "social"),
                new Film("Greyhound", "Aaron Schneider", 2020, 7.1, Arrays.asList("Tom Hanks, Elisabeth Shue, Stephen Graham, Matt Helm".split(", ")), "social"),
                new Film("Once Upon a Time... In Hollywood", "Quentin Tarantino", 2019, 7.7, Arrays.asList("Leonardo DiCaprio, Brad Pitt, Margot Robbie, Emile Hirsch".split(", ")), "social"),
                new Film("After", "Jenny Gage", 2019, 5.4, Arrays.asList("Josephine Langford, Hero Fiennes Tiffin, Khadijha Red Thunder, Dylan Arnold".split(", ")), "social"),
                new Film("Stand by Me", "Rob Reiner", 1986, 8.1, Arrays.asList("Wil Wheaton, River Phoenix, Corey Feldman, Jerry O'Connell".split(", ")), "social"),
                new Film("The Outsiders", "Francis Ford Coppola", 1983, 7.1, Arrays.asList("C. Thomas Howell, Matt Dillon, Ralph Macchio, Patrick Swayze".split(", ")), "social")));

        thrillerList = new ArrayList<>(Arrays.asList(
                new Film("Gangs of Wasseypur", "Anurag Kashyap", 2012, 8.2, Arrays.asList("Manoj Bajpayee, Richa Chadha, Nawazuddin Siddiqui, Tigmanshu Dhulia".split(", ")), "thriller"),
                new Film("The Secret in Their Eyes", "Juan José Campanella", 2009, 8.2, Arrays.asList("Ricardo Darín, Soledad Villamil, Pablo Rago, Carla Quevedo".split(", ")), "thriller"),
                new Film("Heat", "Michael Mann", 1995, 8.2, Arrays.asList("Al Pacino, Robert De Niro, Val Kilmer, Jon Voight".split(", ")), "thriller"),
                new Film("Chinatown", "Roman Polanski", 1974, 8.2, Arrays.asList("Jack Nicholson, Faye Dunaway, John Huston, Perry Lopez".split(", ")), "thriller"),
                new Film("The Invisible Guest", "Oriol Paulo", 2016, 8.1, Arrays.asList("Mario Casas, Ana Wagener, Jose Coronado, Bárbara Lennie".split(", ")), "thriller"),
                new Film("The Handmaiden", "Chan-wook Park", 2016, 8.1, Arrays.asList("Min-hee Kim, Jung-woo Ha, Jin-woong Cho, So-Ri Moon".split(", ")), "thriller"),
                new Film("Logan", "James Mangold", 2017, 8.1, Arrays.asList("Hugh Jackman, Patrick Stewart, Dafne Keen, Boyd Holbrook".split(", ")), "thriller"),
                new Film("Room", "Lenny Abrahamson", 2015, 8.1, Arrays.asList("Brie Larson, Jacob Tremblay, Sean Bridgers, Wendy Crewson".split(", ")), "thriller"),
                new Film("Wild Tales", "Damián Szifron", 2014, 8.1, Arrays.asList("Darío Grandinetti, María Marull, Mónica Villa, Diego Starosta".split(", ")), "thriller"),
                new Film("Gone Girl", "David Fincher", 2014, 8.1, Arrays.asList("Ben Affleck, Rosamund Pike, Neil Patrick Harris, Tyler Perry".split(", ")), "thriller"),
                new Film("Mad Max: Fury Road", "George Miller", 2015, 8.1, Arrays.asList("Tom Hardy, Charlize Theron, Nicholas Hoult, Zoë Kravitz".split(", ")), "thriller"),
                new Film("No Country for Old Men", "Ethan Coen", 2007, 8.1, Arrays.asList("Tommy Lee Jones, Javier Bardem, Josh Brolin, Woody Harrelson".split(", ")), "thriller"),
                new Film("Amores Perros", "Alejandro G. Iñárritu", 2000, 8.1, Arrays.asList("Emilio Echevarría, Gael García Bernal, Goya Toledo, Álvaro Guerrero".split(", ")), "thriller"),
                new Film("The Sixth Sense", "M. Night Shyamalan", 1999, 8.1, Arrays.asList("Bruce Willis, Haley Joel Osment, Toni Collette, Olivia Williams".split(", ")), "thriller"),
                new Film("Fargo", "Ethan Coen", 1996, 8.1, Arrays.asList("William H. Macy, Frances McDormand, Steve Buscemi, Peter Stormare".split(", ")), "thriller"),
                new Film("Blade Runner", "Ridley Scott", 1982, 8.1, Arrays.asList("Harrison Ford, Rutger Hauer, Sean Young, Edward James Olmos".split(", ")), "thriller"),
                new Film("The Wages of Fear", "Henri-Georges Clouzot", 1953, 8.1, Arrays.asList("Yves Montand, Charles Vanel, Peter van Eyck, Folco Lulli".split(", ")), "thriller"),
                new Film("Rebecca", "Alfred Hitchcock", 1940, 8.1, Arrays.asList("Laurence Olivier, Joan Fontaine, George Sanders, Judith Anderson".split(", ")), "thriller"),
                new Film("The Third Man", "Carol Reed", 1949, 8.1, Arrays.asList("Orson Welles, Joseph Cotten, Alida Valli, Trevor Howard".split(", ")), "thriller"),
                new Film("Kill Bill: Vol. 1", "Quentin Tarantino", 2003, 8.1, Arrays.asList("Uma Thurman, David Carradine, Daryl Hannah, Michael Madsen".split(", ")), "thriller"),
                new Film("Jurassic Park", "Steven Spielberg", 1993, 8.1, Arrays.asList("Sam Neill, Laura Dern, Jeff Goldblum, Richard Attenborough".split(", ")), "thriller"),
                new Film("Persona", "Ingmar Bergman", 1966, 8.1, Arrays.asList("Bibi Andersson, Liv Ullmann, Margaretha Krook, Gunnar Björnstrand".split(", ")), "thriller"),
                new Film("On the Waterfront", "Elia Kazan", 1954, 8.1, Arrays.asList("Marlon Brando, Karl Malden, Lee J. Cobb, Rod Steiger".split(", ")), "thriller")));

        westernList = new ArrayList<>(Arrays.asList(
                new Film("Tombstone", "Kevin Jarre", 1993, 7.8, Arrays.asList("Kurt Russell, Val Kilmer, Sam Elliott, Bill Paxton".split(", ")), "western"),
                new Film("Django Unchained", "Quentin Tarantino", 2012, 8.4, Arrays.asList("Jamie Foxx, Christoph Waltz, Leonardo DiCaprio, Kerry Washington".split(", ")), "western"),
                new Film("The Good, the Bad and the Ugly", "Sergio Leone", 1966, 8.8, Arrays.asList("Clint Eastwood, Eli Wallach, Lee Van Cleef, Aldo Giuffrè".split(", ")), "western"),
                new Film("The Hateful Eight", "Quentin Tarantino", 2015, 7.8, Arrays.asList("Samuel L. Jackson, Kurt Russell, Jennifer Jason Leigh, Walton Goggins".split(", ")), "western"),
                new Film("3:10 to Yuma", "James Mangold", 2007, 7.7, Arrays.asList("Russell Crowe, Christian Bale, Ben Foster, Logan Lerman".split(", ")), "western"),
                new Film("Hell or High Water", "David Mackenzie", 2016, 7.6, Arrays.asList("Chris Pine, Ben Foster, Jeff Bridges, Gil Birmingham".split(", ")), "western"),
                new Film("Once Upon a Time in the West", "Sergio Leone", 1968, 8.5, Arrays.asList("Henry Fonda, Charles Bronson, Claudia Cardinale, Jason Robards".split(", ")), "western"),
                new Film("City Slickers", "Ron Underwood", 1991, 6.8, Arrays.asList("Billy Crystal, Jack Palance, Daniel Stern, Bruno Kirby".split(", ")), "western"),
                new Film("The Ballad of Buster Scruggs", "Joel Coen", 2018, 7.3, Arrays.asList("Tim Blake Nelson, Willie Watson, Clancy Brown, Danny McCarthy".split(", ")), "western"),
                new Film("Unforgiven", "Clint Eastwood", 1992, 8.2, Arrays.asList("Clint Eastwood, Gene Hackman, Morgan Freeman, Richard Harris".split(", ")), "western"),
                new Film("Legends of the Fall", "Edward Zwick", 1994, 7.5, Arrays.asList("Brad Pitt, Anthony Hopkins, Aidan Quinn, Julia Ormond".split(", ")), "western"),
                new Film("Blazing Saddles", "Mel Brooks", 1974, 7.7, Arrays.asList("Cleavon Little, Gene Wilder, Slim Pickens, Harvey Korman".split(", ")), "western"),
                new Film("True Grit", "Ethan Coen", 2010, 7.6, Arrays.asList("Jeff Bridges, Matt Damon, Hailee Steinfeld, Josh Brolin".split(", ")), "western"),
                new Film("The Magnificent Seven", "Antoine Fuqua", 2016, 6.9, Arrays.asList("Denzel Washington, Chris Pratt, Ethan Hawke, Vincent D'Onofrio".split(", ")), "western"),
                new Film("The Assassination of Jesse James by the Coward Robert Ford", "Andrew Dominik", 2007, 7.5, Arrays.asList("Brad Pitt, Casey Affleck, Sam Shepard, Mary-Louise Parker".split(", ")), "western"),
                new Film("Dances with Wolves", "Kevin Costner", 1990, 8.0, Arrays.asList("Kevin Costner, Mary McDonnell, Graham Greene, Rodney A. Grant".split(", ")), "western"),
                new Film("Hostiles", "Scott Cooper", 2017, 7.2, Arrays.asList("Scott Shepherd, Rosamund Pike, Ava Cooper, Stella Cooper".split(", ")), "western"),
                new Film("The Revenant", "Alejandro G. Iñárritu", 2015, 8.0, Arrays.asList("Leonardo DiCaprio, Tom Hardy, Will Poulter, Domhnall Gleeson".split(", ")), "western"),
                new Film("True History of the Kelly Gang", "Justin Kurzel", 2019, 6.1, Arrays.asList("George MacKay, Essie Davis, Nicholas Hoult, Ben Corbett".split(", ")), "western"),
                new Film("Bone Tomahawk", "S. Craig Zahler", 2015, 7.1, Arrays.asList("Kurt Russell, Patrick Wilson, Matthew Fox, Richard Jenkins".split(", ")), "western"),
                new Film("The Quick and the Dead", "Sam Raimi", 1995, 6.4, Arrays.asList("Sharon Stone, Gene Hackman, Russell Crowe, Leonardo DiCaprio".split(", ")), "western"),
                new Film("The Dark Tower", "Nikolaj Arcel", 2017, 5.6, Arrays.asList("Idris Elba, Matthew McConaughey, Tom Taylor, Dennis Haysbert".split(", ")), "western"),
                new Film("The Mask of Zorro", "Martin Campbell", 1998, 6.7, Arrays.asList("Antonio Banderas, Anthony Hopkins, Catherine Zeta-Jones, José María de Tavira".split(", ")), "western")));
    }

    public static List<Film> getActionList() {
        return actionList;
    }

    public static List<Film> getAdventureList() {
        return adventureList;
    }

    public static List<Film> getDramaList() {
        return dramaList;
    }

    public static List<Film> getComedyList() {
        return comedyList;
    }

    public static List<Film> getCrimeList() {
        return crimeList;
    }

    public static List<Film> getFantasyList() {
        return fantasyList;
    }

    public static List<Film> getHorrorList() {
        return horrorList;
    }

    public static List<Film> getHistoricalList() {
        return historicalList;
    }

    public static List<Film> getMysteryList() {
        return mysteryList;
    }

    public static List<Film> getPhilosophicalList() {
        return philosophicalList;
    }

    public static List<Film> getRomanceList() {
        return romanceList;
    }

    public static List<Film> getSatireList() {
        return satireList;
    }

    public static List<Film> getSocialList() {
        return socialList;
    }

    public static List<Film> getThrillerList() {
        return thrillerList;
    }

    public static List<Film> getWesternList() {
        return westernList;
    }
}