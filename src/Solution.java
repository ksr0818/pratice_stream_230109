import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        Member coding = new Member("coding", "Female", 25);
        Member hacker = new Member("hacker", "Male", 30);
        Member ingi = new Member("ingi", "Male", 32);
        List<Member> members = Arrays.asList(coding, hacker, ingi);

        Double result;

        if(!members.contains("Male") || members.size()==0) result = 0.0;

        result = members.stream()
                .filter(member -> member.getGender().equals("Male"))
                .mapToDouble(member -> member.getAge())
                .average()
                .getAsDouble();
        // .orElse(0.0);

        System.out.println(result);
    }

    Member coding = new Member("coding", "Female", 25);
    Member hacker = new Member("hacker", "Male", 30);
    Member ingi = new Member("ingi", "Male", 32);
    List<Member> members = Arrays.asList(coding, hacker, ingi);

    public double computeAverageOfMaleMember(List<Member> members) {
        //구현된 Member 클래스의 getName(), getGender(), getAge() 메소드로 해당 Member 클래스의 name, gender, age를 확인할 수 있습니다.
        //TODO..

        if(!members.contains("Male") || members.size()==0) return 0.0;

        Double result = members.stream()
                .filter(member -> member.getGender().equals("Male"))
                .mapToDouble(member -> member.getAge())
                .average()
                .getAsDouble();
        // .orElse(0.0);

        return result;

    }
}

 class Member {
    String name;
    String gender;
    int age;

    public Member(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
