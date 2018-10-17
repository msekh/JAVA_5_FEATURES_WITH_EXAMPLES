package ENUM_EX;

import java.util.HashMap;
import java.util.Map;

enum Books{
	HARRY_POTTER ("Harry Potter"),
    THE_SOULFORGE ("The Soulforge"),
    GAME_OF_THRONES ("Game of Thrones"),
    DRAGONLANCE ("Dragonlance");

    private static final Map<String, Books> fromString = new HashMap<>();
    static {
        for (Books book : values()) {
            fromString.put(book.toString(), book);
        }
    }

    private  String representation;

    Books(String representation) {
        this.representation = representation;
    }

    @Override
    public String toString() {
        return representation;
    }

    public static Books fromToString(String rep) {
        return fromString.get(rep);
    }
}
public class EnumUsingStringTest {
public static void main(String args[]) {
	Books [] b=Books.values();
	for(Books book : b) {
	//System.out.println(book.toString());
	System.out.println(Books.fromToString(book.toString()));
	}
}
}
