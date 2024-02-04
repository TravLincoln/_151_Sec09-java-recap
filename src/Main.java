import java.util.*;

public class Main {
    public static void main(String[] args) {

        Utility utility = new Utility();


        utility.can.setName("Professor Mohite");
        utility.can.getCandidateName();
        utility.printCandidateInfo();

        utility.vote.setName("Tim Cook");
        utility.vote.getVoterName();
        utility.printVoterInfo();
    }
    public static class Candidate {
        final int candidateId = 0;
        private static String name = "Travis Lincoln";

        String firstName;

        String lastName;
        String party;

        public void printName(){
            System.out.println("Candidate name is "+ getCandidateName());
        }



        public String getCandidateName(){
            return name.toUpperCase();
        }

        public void setName(String name){
            this.name = name;
        }


    }

    public static class Voter {
        final int voterId = 0;
        private static String name = "Travis Lincoln";

        String firstName;

        String lastName;

        String party;

        public void printName(){
            System.out.println("Voter name is "+ getVoterName());
        }



        public String getVoterName() {
            return name.toUpperCase();
        }

        public void setName(String name){
            this.name = "travis lincoln";
        }


    }

    public static class Utility{
        Voter vote = new Voter();

        public void printVoterInfo() {
            vote.printName();
        }


        Candidate can = new Candidate();

        public void printCandidateInfo() {
            can.printName();
        }


    }
}