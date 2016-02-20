/**
 * Created by baddi on 20-2-2016.
 */
//Test2 (mijn github)
public class Student {

        private int idNummer;
        private int age;
        private String name;

        public int getIdNummer() {
            return idNummer;
        }

        public void setIdNummer(int idNummer) {
            this.idNummer = idNummer;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public Student(int idNummer, String name, int age) {
            this.idNummer = idNummer;
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student gegevens: " +
                    "\nIdNummer:" + idNummer +
                    "\nAge: " + age +
                    "\nName:" + name +"."
                    ;
        }
    }


