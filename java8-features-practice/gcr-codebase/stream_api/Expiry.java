package stream_api;

import java.time.LocalDate;
import java.util.*;

class Member {
    String name;
    LocalDate expiry;

    Member(String n, LocalDate e){
        name=n; expiry=e;
    }
}

public class Expiry {
    public static void main(String[] args) {

        List<Member> members = List.of(
            new Member("A", LocalDate.now().plusDays(10)),
            new Member("B", LocalDate.now().plusDays(40))
        );

        LocalDate limit = LocalDate.now().plusDays(30);
        
        members.stream().filter(x->x.expiry.isBefore(limit))
						.forEach(m->System.out.println(m.name));

        
    }
}
