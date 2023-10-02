public class Bob {
    public static void main(String[] args) {
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//He answers 'Whatever.' to anything else.
//Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

        String question = "Hey Bob. Would you like to go outside and take in the wonderful scenery Earth has to offer us?";
        System.out.println(question);
        String bobsResponse = "Sure.";
        System.out.println(bobsResponse);
        String yelling = "Bob! I don't appreciate the tone of your message!";
        System.out.println(yelling);
        String bobsResponseTwo = "Whoa, chill out!";
        System.out.println(bobsResponseTwo);
        String empty = "";
        System.out.println(empty);
        String bobsResponseThree = "Fine. Be that way!";
        System.out.println(bobsResponseThree);
        String whatever = "Whatever, Bob. Do you homie. I'ma go make appreciate what life has to offer.";
        System.out.println(whatever);
        String bobsSorryResponse = "Whatever.";
        System.out.println(bobsSorryResponse);
    }
}
