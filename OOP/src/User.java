public class User {

    String userName;
    int ID;
    int age;
    String color;

    User(String userName, int ID, int age, String color){
        this.userName = userName;
        this.ID = ID;
        this.age = age;
        this.color = color;
    }

    void kiss() {
        System.out.println(this.userName+" is kissing someone.");
    }

    void hug() {
        System.out.println(this.userName+" is hugging someone.");
    }

    void kiss(String userName) {
        System.out.println(this.userName+" is kissing "+userName+".");
    }

    void hug(String userName) {
        System.out.println(this.userName+" is hugging "+userName+".");
    }

}
