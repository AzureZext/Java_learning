package Java_learning;
public class phraseOmatic {
    public static void main(String[] args){
        String[] wordListOne = {
            "agnostic",
            "voice activated",
            "haptically driven",
            "agent based",
            "functional",
            "reactive",
            "strongly typed",
            "opinionated",
            "extensible",
            "AI enabled"
        };

        String[] wordListTwo = {
            "loosely coupled",
            "six sigma",
            "asynchronous",
            "pub-sub",
            "IoT",            
            "cloud",
            "event driven",
            "cloud native",
            "service oriented",
            "containerized",
            "serverless",
            "distributed ledger",
            "microservices"
        };

        String[] wordListThree = {
            "framework",
            "library",
            "DSL",
            "REST API",
            "repository",
            "pipeline",
            "service mesh",
            "architecture",
            "perspective",
            "design",
            "orientation"
        };

        int len1 = wordListOne.length;
        int len2 = wordListTwo.length;
        int len3 = wordListThree.length;

        java.util.Random random = new java.util.Random();

        int rnum1 = random.nextInt(len1);
        int rnum2 = random.nextInt(len2);
        int rnum3 = random.nextInt(len3);

        String phrase =  wordListOne[rnum1] + " " +  wordListTwo[rnum2] + " " +  wordListThree[rnum3];
        System.out.println("What we need is a " +  phrase);

    }
}
