package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersonMain p = new PersonMain();
        System.out.println(p.FirstName);
        System.out.println(p.LastName);
        System.out.println(p.Age);
        System.out.println(p.Gender);
        System.out.println(p.Weight);
    }
    private static class PersonMain{
        String FirstName = "Mohan";
        String LastName = "Ramesh";
        int Age = 22;
        String Gender = "Male";
        float Weight = 70;

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public String getGender() {
            return Gender;
        }

        public void setGender(String gender) {
            Gender = gender;
        }

        public float getWeight() {
            return Weight;
        }

        public void setWeight(float weight) {
            Weight = weight;
        }
    }
}